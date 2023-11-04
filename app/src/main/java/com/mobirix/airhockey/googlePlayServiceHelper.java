package com.mobirix.airhockey;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class googlePlayServiceHelper {
    public static final int RC_INVITATION_INBOX = 4183;
    public static final int RC_INVITEFRIEND_INBOX = 4182;
    public static final int RC_SIGN_IN = 4181;
    public static final int RC_UNUSED = 4180;
    public static final int RC_WAITING_ROOM = 4184;
    public static Handler handler = new Handler();
    public static FirebaseAnalytics mFirebaseAnalytics = null;
    private static boolean m_bMatchingUI = false;
    public GoogleSignInClient mGoogleSignInClient = null;
    private GoogleSignInAccount mSignedInAccount = null;
    private AchievementsClient mAchievementsClient = null;
    private LeaderboardsClient mLeaderboardsClient = null;
    String mMyId = null;
    String mIncomingInvitationId = null;
    public boolean m_bConnected = false;
    public byte[] mSigninNextAction = new byte[4];

    public static byte[] IntToBytes(int i) {
        byte[] bArr = {(byte) (bArr[0] | ((byte) (((-16777216) & i) >> 24))), (byte) (bArr[1] | ((byte) ((16711680 & i) >> 16))), (byte) (bArr[2] | ((byte) ((65280 & i) >> 8))), (byte) (((byte) (i & 255)) | bArr[3])};
        return bArr;
    }

    public void onPause() {
    }

    public void onResume() {
        signInSilently();
    }

    public static void init(boolean z) {
        m_bMatchingUI = z;
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(airhockey.mAct);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        airhockey airhockeyVar = airhockey.mAct;
        airhockey.my_debug("onActivityResult2 =" + i + " , " + i2);
        switch (i) {
            case RC_UNUSED /* 4180 */:
            case RC_INVITEFRIEND_INBOX /* 4182 */:
            case RC_INVITATION_INBOX /* 4183 */:
            case RC_WAITING_ROOM /* 4184 */:
                return true;
            case RC_SIGN_IN /* 4181 */:
                try {
                    onSignInSucceeded(GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class));
                    return true;
                } catch (ApiException e) {
                    String message = e.getMessage();
                    if (message == null || message.isEmpty()) {
                        message = airhockey.mAct.getString(R.string.signin_other_error);
                    }
                    onSignOutSucceeded();
                    new AlertDialog.Builder(airhockey.mAct).setMessage(message).setNeutralButton(17039370, (DialogInterface.OnClickListener) null).show();
                    return true;
                }
            default:
                return false;
        }
    }

    public boolean isSignedIn() {
        return GoogleSignIn.getLastSignedInAccount(airhockey.mAct) != null;
    }

    public void startSignInIntent() {
        if (this.mGoogleSignInClient != null) {
            airhockey.mAct.startActivityForResult(this.mGoogleSignInClient.getSignInIntent(), RC_SIGN_IN);
        }
    }

    public void signOut() {
        airhockey airhockeyVar = airhockey.mAct;
        airhockey.my_debug("signOut() 1");
        if (this.mGoogleSignInClient != null) {
            airhockey airhockeyVar2 = airhockey.mAct;
            airhockey.my_debug("signOut() 2");
            this.mGoogleSignInClient.signOut().addOnCompleteListener(airhockey.mAct, new OnCompleteListener<Void>() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Void> task) {
                    airhockey airhockeyVar3 = airhockey.mAct;
                    airhockey.my_debug("signOut() 3");
                    if (task.isSuccessful()) {
                        airhockey airhockeyVar4 = airhockey.mAct;
                        airhockey.my_debug("signOut(): success");
                    } else {
                        airhockey airhockeyVar5 = airhockey.mAct;
                        airhockey.my_debug("signOut() failed!");
                    }
                    googlePlayServiceHelper.this.onSignOutSucceeded();
                }
            });
        }
    }

    public void signInSilently() {
        GoogleSignInClient googleSignInClient = this.mGoogleSignInClient;
        if (googleSignInClient != null) {
            googleSignInClient.silentSignIn().addOnCompleteListener(airhockey.mAct, new OnCompleteListener<GoogleSignInAccount>() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<GoogleSignInAccount> task) {
                    if (task.isSuccessful()) {
                        airhockey airhockeyVar = airhockey.mAct;
                        airhockey.my_debug("signInSilently// onSignInSucceeded~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        googlePlayServiceHelper.this.onSignInSucceeded(task.getResult());
                        return;
                    }
                    airhockey airhockeyVar2 = airhockey.mAct;
                    airhockey.my_debug("signInSilently// onSignOutSucceeded~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    googlePlayServiceHelper.this.onSignOutSucceeded();
                }
            });
        }
    }

    public void onSignInSucceeded(GoogleSignInAccount googleSignInAccount) {
        airhockey airhockeyVar = airhockey.mAct;
        airhockey.my_debug("onConnected(): connected to Google APIs");
        airhockey airhockeyVar2 = airhockey.mAct;
        airhockey.my_debug("onSignInSucceeded =====");
        byte[] bArr = {airhockey.J_GOO, 1};
        airhockey airhockeyVar3 = airhockey.mAct;
        airhockey airhockeyVar4 = airhockey.mAct;
        airhockey.doneGooPlayMessage(bArr);
        this.m_bConnected = true;
        airhockey.mAct.dissmissWaitDialog();
        if (this.mSignedInAccount != googleSignInAccount) {
            this.mSignedInAccount = googleSignInAccount;
            this.mAchievementsClient = Games.getAchievementsClient((Activity) airhockey.mAct, googleSignInAccount);
            this.mLeaderboardsClient = Games.getLeaderboardsClient((Activity) airhockey.mAct, googleSignInAccount);
            this.mAchievementsClient.load(true).addOnSuccessListener(new OnSuccessListener<AnnotatedData<AchievementBuffer>>() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.3
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AnnotatedData<AchievementBuffer> annotatedData) {
                    AchievementBuffer achievementBuffer = annotatedData.get();
                    Iterator<Achievement> it = achievementBuffer.iterator();
                    int i = 0;
                    String str = "";
                    while (it.hasNext()) {
                        it.next();
                        Achievement achievement = achievementBuffer.get(i);
                        if (i == 0) {
                            str = String.valueOf(achievement.getState());
                        } else {
                            str = str + "|" + String.valueOf(achievement.getState());
                        }
                        i++;
                        airhockey airhockeyVar5 = airhockey.mAct;
                        airhockey.my_debug("strAchievementList:" + str);
                    }
                    airhockey airhockeyVar6 = airhockey.mAct;
                    airhockey.doneAchievementList(str);
                }
            });
            if (this.mSigninNextAction[0] != 0) {
                airhockey.mAct.mHandler.sendMessage(Message.obtain(airhockey.mAct.mHandler, this.mSigninNextAction[0]));
            }
            this.mSigninNextAction[0] = 0;
        }
    }

    public void onSignOutSucceeded() {
        airhockey airhockeyVar = airhockey.mAct;
        airhockey.my_debug("onSignOutSucceeded =====");
        this.m_bConnected = false;
        this.mSignedInAccount = null;
        this.mAchievementsClient = null;
        this.mLeaderboardsClient = null;
        this.mSigninNextAction[0] = 0;
        byte[] bArr = {airhockey.J_GOO, 0};
        airhockey airhockeyVar2 = airhockey.mAct;
        airhockey airhockeyVar3 = airhockey.mAct;
        airhockey.doneGooPlayMessage(bArr);
        airhockey.mAct.dissmissWaitDialog();
    }

    public void showLeaderboard() {
        this.mLeaderboardsClient.getAllLeaderboardsIntent().addOnSuccessListener(new OnSuccessListener<Intent>() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.4
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Intent intent) {
                airhockey.mAct.startActivityForResult(intent, googlePlayServiceHelper.RC_UNUSED);
            }
        }).addOnFailureListener(createFailureListener("leaderboards error"));
    }

    public void submitLeaderboard(String str, int i) {
        this.mLeaderboardsClient.submitScore(str, i);
    }

    public void showAchievement() {
        this.mAchievementsClient.getAchievementsIntent().addOnSuccessListener(new OnSuccessListener<Intent>() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.5
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Intent intent) {
                airhockey.mAct.startActivityForResult(intent, googlePlayServiceHelper.RC_UNUSED);
            }
        }).addOnFailureListener(createFailureListener("achievements error"));
    }

    public void unlockAchievement(String str) {
        this.mAchievementsClient.unlock(str);
    }

    public void incrementAchievement(String str, int i) {
        this.mAchievementsClient.increment(str, i);
    }

    public void handleException(Exception exc, String str) {
        if ((exc instanceof ApiException ? ((ApiException) exc).getStatusCode() : 0) != 0) {
            airhockey airhockeyVar = airhockey.mAct;
        }
    }

    private OnFailureListener createFailureListener(final String str) {
        return new OnFailureListener() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.6
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                googlePlayServiceHelper.this.handleException(exc, str);
            }
        };
    }

    void ReciveIntMessage(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 1, bArr2, 0, 4);
        int ByteToInt = ByteToInt(bArr2);
        System.arraycopy(bArr, 5, bArr2, 0, 4);
        int ByteToInt2 = ByteToInt(bArr2);
        System.arraycopy(bArr, 9, bArr2, 0, 4);
        int ByteToInt3 = ByteToInt(bArr2);
        airhockey airhockeyVar = airhockey.mAct;
        airhockey.doneIntMessage(bArr[0], ByteToInt, ByteToInt2, ByteToInt3);
    }

    public static int ByteToInt(byte[] bArr) {
        return ((bArr[0] & UByte.MAX_VALUE) << 24) + ((bArr[1] & UByte.MAX_VALUE) << 16) + ((bArr[2] & UByte.MAX_VALUE) << 8) + ((bArr[3] & UByte.MAX_VALUE) << 0);
    }

    public void setAnalytics(String str) {
        mFirebaseAnalytics.setCurrentScreen(airhockey.mAct, str, null);
    }

    public static void doToastMessage(final String str) {
        airhockey.mAct.runOnUiThread(new Runnable() { // from class: com.mobirix.airhockey.googlePlayServiceHelper.7
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(airhockey.mAct, str, 1).show();
            }
        });
    }

    public void errorProc() {
        airhockey airhockeyVar = airhockey.mAct;
        byte[] bArr = new byte[13];
        airhockey airhockeyVar2 = airhockey.mAct;
        bArr[0] = airhockey.J_ERROR;
        airhockey airhockeyVar3 = airhockey.mAct;
        airhockey.doneGooPlayMessage(bArr);
        showGameError();
    }

    void showGameError() {
        Toast.makeText(airhockey.mAct, "An error occurred while starting the game. Please try again.", 1).show();
    }
}
