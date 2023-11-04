package com.mobirix.airhockey;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.mobirix.admob.MobirixAdMob;
import com.mobirix.door.callShop;
import com.mobirix.payment.PaymentManager;
import com.mobirix.payment.PurchaseListener;
import com.mobirix.util.AgreeManager;
import com.mobirix.util.GdprManager;
import com.mobirix.util.MoreManager;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import org.cocos2dx.lib.Cocos2dxHelper;

/* loaded from: classes2.dex */
public class airhockey extends Cocos2dxActivity {
    private static final String ADREWARD_UNIT_ID = "ca-app-pub-8300681586157286/7116250536";
    public static final boolean DEBUG_ON = false;
    private static final int GOOGLE_MARKET = 4;
    static final int INTMESSAGE_LEN = 14;
    public static final byte J_ACHIEVEMENTCALLBACK = 120;
    public static final byte J_BACK = 113;
    public static final byte J_DISCONNECT = 116;
    public static final byte J_ENEMYLOSE = 104;
    public static final byte J_ENEMYWIN = 103;
    public static final byte J_ERROR = 117;
    public static final byte J_GAME_BREAKBALLCOUNT = 99;
    public static final byte J_GAME_DISCONNECT = 108;
    public static final byte J_GAME_ENEMYEXIT = 107;
    public static final byte J_GAME_EXIT = 106;
    public static final byte J_GAME_REMATCH = 105;
    public static final byte J_GAME_STANDBY = 101;
    public static final byte J_GOO = 112;
    public static final byte J_INVITE = 110;
    public static final byte J_NATION = 98;
    public static final byte J_ONREWARDED = 100;
    public static final byte J_PURCHASE = 122;
    public static final byte J_REWARD = 118;
    public static final byte J_REWARDED_ADLOADED = 99;
    public static final byte J_SAVEDGAME_RELOAD = 114;
    public static final byte J_SAVEDGAME_SAVE = 115;
    public static final byte J_SDKVER = 97;
    public static final byte J_WAIT = 121;
    static final int MESSAGE_LEN = 13;
    public static final int MSG_ACCEPT_INVITE = 64;
    public static final int MSG_ACHIEVEMENTS_RECODE = 79;
    public static final int MSG_ACHIEVEMENTS_VIEW = 71;
    public static final int MSG_ADREWARD_SHOW = 86;
    public static final int MSG_CHARGE = 51;
    public static final int MSG_DISCONNECT = 66;
    public static final int MSG_EXIT = 52;
    public static final int MSG_EXITWATINGROOM = 30;
    public static final int MSG_FACEBOOK_LINK = 90;
    public static final int MSG_FULLAD = 84;
    public static final int MSG_GAME_BREAKBALLCOUNT = 25;
    public static final int MSG_GAME_EXIT = 31;
    public static final int MSG_GAME_MULTILOSE = 27;
    public static final int MSG_GAME_MULTIWIN = 26;
    public static final int MSG_GAME_REMATCH = 28;
    public static final int MSG_GAME_STANDBY = 24;
    public static final int MSG_GMOBIRIXLINK = 104;
    public static final int MSG_GOOLOGIN = 40;
    public static final int MSG_GOOLOGOUT = 41;
    public static final int MSG_GOPUZZLE = 95;
    public static final int MSG_HELP = 94;
    public static final int MSG_HIDEAD = 83;
    public static final int MSG_HIDEMIDAD = 81;
    public static final int MSG_INVITATION_VIEW = 61;
    public static final int MSG_INVITEFRIEND_VIEW = 60;
    public static final int MSG_LEADERBOARD_VIEW = 70;
    public static final int MSG_LEADERRECORD_EASYRANKING = 75;
    public static final int MSG_LEADERRECORD_GETSTARRANKING = 74;
    public static final int MSG_LEADERRECORD_HARDRANKING = 77;
    public static final int MSG_LEADERRECORD_NORMALRANKING = 76;
    public static final int MSG_LEADERRECORD_STAGERANKING = 73;
    public static final int MSG_LEADERRECORD_VERYHARDRANKING = 78;
    public static final int MSG_MOREGAMES = 103;
    public static final int MSG_MULTIGAME = 20;
    public static final int MSG_NATION = 21;
    public static final int MSG_RECOMMAND = 101;
    public static final int MSG_REVIEW = 102;
    public static final int MSG_REWORD = 53;
    public static final int MSG_SAVEDGAME_LOAD = 43;
    public static final int MSG_SAVEDGAME_SAVE = 42;
    public static final int MSG_SELECTMAP = 23;
    public static final int MSG_SHARELINK = 92;
    public static final int MSG_SHOWAD = 82;
    public static final int MSG_SHOWMIDAD = 80;
    public static final int MSG_TOAST = 93;
    public static final int MSG_VER = 122;
    public static final int MSG_VIEW_GAMEEXIT = 115;
    public static final int MSG_WINLOSECOUNT = 22;
    public static final int MSG_YOUTUBE_LINK = 91;
    private static final String MY_AD_UNIT_ID = "ca-app-pub-8300681586157286/4158563712";
    private static final String MY_INTERAD_UNIT_ID = "ca-app-pub-8300681586157286/8261460251";
    private static final String MY_MIDAD_UNIT_ID = "ca-app-pub-8300681586157286/9957685308";
    static final int NETWORK_ERROR = 9001;
    public static final byte P_GAME_BREAKBALLCOUNT = 70;
    public static final byte P_GAME_EXIT = 74;
    public static final byte P_GAME_MYLOSE = 72;
    public static final byte P_GAME_MYSCORE = 67;
    public static final byte P_GAME_MYWIN = 71;
    public static final byte P_GAME_REMATCH = 73;
    public static final byte P_GAME_SELECTMAP = 68;
    public static final byte P_GAME_STANDBY = 69;
    public static final byte P_NATION = 66;
    static final int RC_INVITATION_INBOX = 10001;
    static final int RC_REQUEST = 10003;
    static final int RC_SELECT_PLAYERS = 10000;
    static final int RC_WAITING_ROOM = 10002;
    static final int RE_ACHIEVEMENTS = 2001;
    static final int RE_LEADERBOARD = 2000;
    private static final int TEST_MODE = 0;
    private static final int T_STORE = 1;
    public static airhockey mAct;
    public AgreeManager agrManager;
    public GdprManager gdprManager;
    public googlePlayServiceHelper mGooglePlayHelper;
    public int m_nNationKind;
    public MoreManager moreManager;
    private static final String TAG = "Cocos2dxActivity";
    public static String mStrUUID = null;
    static ProgressDialog waitDialog = null;
    public static String[] ITEM_CODE = {"airhockey_coin_3000", "airhockey_coin_5000", "airhockey_coin_10000", "airhockey_coin_30000", "airhockey_coin_50000", "airhockey_coin_100000"};
    public static int m_nMarketKind = 4;
    public String mstrPid = null;
    public String mStrToast = null;
    public String[] mStrSaveGamePath = new String[4];
    public String[] mStrSaveGameIndex = new String[4];
    String mPackageName = "";
    public String m_strLanguage = null;
    public Toast m_ToastMsg = null;
    public final int SAVEDGAMEKIND_RESULT = 0;
    public final int SAVEDGAMEKIND_ETC = 1;
    MobirixAdMob myAdmob = null;
    public String mIncomingInvitationId = null;
    boolean m_bQuickStartGame = true;
    public final int achievement_nice_challenge = 0;
    public final int achievement_fifty_more = 1;
    public final int achievement_so_easy = 2;
    public final int achievement_it_easy = 3;
    public final int achievement_little_tough = 4;
    public final int achievement_i_am_the_best = 5;
    public final int achievement_perfect_clear = 6;
    public final int achievement_star_picnic = 7;
    public final int achievement_star_tour = 8;
    public final int achievement_milky_way = 9;
    public String strContry = "";
    private int m_nMultiWinCount = 0;
    private int m_nMultiLoseCount = 0;
    String mRoomId = null;
    public byte[] mSigninNextAction = new byte[4];
    public byte[] mJniMsg = new byte[13];
    public byte[] mRecvMsg = new byte[13];
    public final int NATIONKIND_ENG = 0;
    public final int NATIONKIND_KR = 1;
    public final int NATIONKIND_JP = 2;
    public final int NATIONKIND_ZH_TW = 3;
    public final int NATIONKIND_ES = 4;
    public final int NATIONKIND_RU = 5;
    public final int NATIONKIND_PT = 6;
    public final int NATIONKIND_DE = 7;
    public final int NATIONKIND_FR = 8;
    public final int NATIONKIND_ZH_CN = 9;
    public final int NATIONKIND_IT = 10;
    public final int NATIONKIND_TH = 11;
    public final int NATIONKIND_IN = 12;
    public final int NATIONKIND_VI = 13;
    public final int NATIONKIND_HI = 14;
    public final int NATIONKIND_TR = 15;
    private boolean mResolvingConnectionFailure = false;
    private boolean mAutoStartSignInflow = true;
    private boolean mSignInClicked = false;
    private String GAMEID = "1306";
    public final String FREE_GAME = "0";
    public MyHandler mHandler = new MyHandler(this);

    public static native void doneAchievementList(String str);

    public static native void doneCountryCode(int i);

    public static native void doneEnemyBlockPos(String str);

    public static native void doneGooPlayEnemyName(String str);

    public static native void doneGooPlayEnemyNation(String str);

    public static native void doneGooPlayMessage(byte[] bArr);

    public static native void doneGooPlayNation(String str);

    public static native void doneInappList(String str);

    public static native void doneIntMessage(byte b, int i, int i2, int i3);

    public static native void doneLangageCode(int i);

    public static native void doneVerCode(int i);

    public static void my_debug(String str) {
    }

    static {
        try {
            System.loadLibrary("MyGame");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* loaded from: classes2.dex */
    public class MyHandler extends Handler {
        private final WeakReference<airhockey> mActivity;

        public MyHandler(airhockey airhockeyVar) {
            airhockey.this = r1;
            this.mActivity = new WeakReference<>(airhockeyVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mActivity.get() != null) {
                super.handleMessage(message);
                airhockey.my_debug("handleMessage =" + message.what + "," + message.arg1 + "," + message.arg2);
                try {
                    int i = message.what;
                    if (i == 40) {
                        airhockey.this.mGooglePlayHelper.startSignInIntent();
                    } else if (i == 41) {
                        airhockey.this.mGooglePlayHelper.signOut();
                    } else if (i == 70) {
                        if (airhockey.this.mGooglePlayHelper.m_bConnected && airhockey.this.mGooglePlayHelper.isSignedIn()) {
                            airhockey.this.mGooglePlayHelper.showLeaderboard();
                            return;
                        }
                        airhockey.this.mGooglePlayHelper.mSigninNextAction[0] = airhockey.P_GAME_BREAKBALLCOUNT;
                        airhockey.mAct.showWaitDialog();
                        airhockey.this.mGooglePlayHelper.startSignInIntent();
                    } else if (i == 71) {
                        if (airhockey.this.mGooglePlayHelper.m_bConnected && airhockey.this.mGooglePlayHelper.isSignedIn()) {
                            airhockey.this.mGooglePlayHelper.showAchievement();
                            return;
                        }
                        airhockey.this.mGooglePlayHelper.mSigninNextAction[0] = airhockey.P_GAME_MYWIN;
                        airhockey.mAct.showWaitDialog();
                        airhockey.this.mGooglePlayHelper.startSignInIntent();
                    } else if (i == 86) {
                        airhockey.mAct.myAdmob.showRewardAd();
                    } else if (i != 122) {
                        switch (i) {
                            case 51:
                                PaymentManager paymentManager = PaymentManager.getInstance(airhockey.mAct);
                                airhockey airhockeyVar = airhockey.mAct;
                                paymentManager.purchase(airhockey.ITEM_CODE[message.arg1]);
                                return;
                            case 52:
                                if (airhockey.this.myAdmob != null) {
                                    airhockey.this.myAdmob.destroy();
                                    return;
                                }
                                return;
                            case 53:
                                airhockey.doReward(airhockey.mStrUUID);
                                return;
                            default:
                                switch (i) {
                                    case 73:
                                        airhockey.this.mGooglePlayHelper.submitLeaderboard(airhockey.mAct.getString(R.string.leaderboard_stage_mode_ranking), message.arg1);
                                        return;
                                    case 74:
                                        airhockey.this.mGooglePlayHelper.submitLeaderboard(airhockey.mAct.getString(R.string.leaderboard_star_ranking), message.arg1);
                                        return;
                                    case 75:
                                        airhockey.this.mGooglePlayHelper.submitLeaderboard(airhockey.mAct.getString(R.string.leaderboard_easy_mode_ranking), message.arg1);
                                        return;
                                    case 76:
                                        airhockey.this.mGooglePlayHelper.submitLeaderboard(airhockey.mAct.getString(R.string.leaderboard_normal_mode_ranking), message.arg1);
                                        return;
                                    case 77:
                                        airhockey.this.mGooglePlayHelper.submitLeaderboard(airhockey.mAct.getString(R.string.leaderboard_hard_mode_ranking), message.arg1);
                                        return;
                                    case 78:
                                        airhockey.this.mGooglePlayHelper.submitLeaderboard(airhockey.mAct.getString(R.string.leaderboard_very_hard_mode_ranking), message.arg1);
                                        return;
                                    case 79:
                                        switch (message.arg1) {
                                            case 0:
                                                airhockey.this.mGooglePlayHelper.unlockAchievement(airhockey.mAct.getString(R.string.achievement_nice_challenge));
                                                return;
                                            case 1:
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_fifty_more), message.arg2);
                                                return;
                                            case 2:
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_so_easy), message.arg2);
                                                return;
                                            case 3:
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_it_easy), message.arg2);
                                                return;
                                            case 4:
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_little_tough), message.arg2);
                                                return;
                                            case 5:
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_i_am_the_best), message.arg2);
                                                return;
                                            case 6:
                                                airhockey.this.mGooglePlayHelper.unlockAchievement(airhockey.mAct.getString(R.string.achievement_perfect_clear));
                                                return;
                                            case 7:
                                            case 8:
                                            case 9:
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_star_picnic), message.arg2);
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_star_tour), message.arg2);
                                                airhockey.this.mGooglePlayHelper.incrementAchievement(airhockey.mAct.getString(R.string.achievement_milky_way), message.arg2);
                                                return;
                                            default:
                                                return;
                                        }
                                    case 80:
                                        airhockey.showmidAd();
                                        return;
                                    case 81:
                                        airhockey.hidemidAd();
                                        return;
                                    case 82:
                                        airhockey.showAd();
                                        return;
                                    case 83:
                                        airhockey.hideAd();
                                        return;
                                    case 84:
                                        airhockey.doFullAdOn();
                                        return;
                                    default:
                                        switch (i) {
                                            case 90:
                                                airhockey.mAct.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/mobirixplayen")));
                                                return;
                                            case 91:
                                                airhockey.goMobirixYouTube();
                                                return;
                                            case 92:
                                                try {
                                                    Intent intent = new Intent("android.intent.action.SEND");
                                                    intent.setType(HTTP.PLAIN_TEXT_TYPE);
                                                    intent.putExtra("android.intent.extra.SUBJECT", airhockey.mAct.getString(R.string.app_name));
                                                    intent.putExtra("android.intent.extra.TEXT", "\n\nhttps://play.google.com/store/apps/details?id=" + airhockey.mAct.getPackageName() + "\n");
                                                    if (airhockey.this.m_strLanguage.equals("ja")) {
                                                        airhockey.mAct.startActivity(Intent.createChooser(intent, "共有"));
                                                    } else {
                                                        airhockey.mAct.startActivity(Intent.createChooser(intent, "Share via"));
                                                    }
                                                    return;
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                    return;
                                                }
                                            case 93:
                                                if (airhockey.mAct.m_ToastMsg != null) {
                                                    airhockey.mAct.m_ToastMsg.cancel();
                                                }
                                                airhockey.mAct.m_ToastMsg = Toast.makeText(airhockey.mAct, airhockey.mAct.mStrToast, 0);
                                                airhockey.mAct.m_ToastMsg.show();
                                                return;
                                            case 94:
                                                airhockey.mAct.m_strLanguage = Locale.getDefault().getLanguage();
                                                airhockey.mAct.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(airhockey.mAct.m_strLanguage.equals("ko") ? "https://mobirix.zendesk.com/hc/ko" : "https://mobirix.zendesk.com/hc/en-us")));
                                                return;
                                            case 95:
                                                airhockey.mAct.startActivity(callShop.shopProductGoogle("com.mobirix.swipebrick"));
                                                return;
                                            default:
                                                switch (i) {
                                                    case 101:
                                                    case 104:
                                                        airhockey.mAct.startActivity(airhockey.shopDeveloperSiteGoogle(airhockey.mAct));
                                                        return;
                                                    case 102:
                                                        airhockey.mAct.startActivity(callShop.shopProductGoogle(airhockey.this.getPackageName()));
                                                        return;
                                                    case 103:
                                                        int i2 = airhockey.m_nMarketKind;
                                                        if (i2 == 1) {
                                                            airhockey.mAct.startActivity(callShop.shopProductSK(airhockey.mAct, airhockey.mAct.mstrPid));
                                                            return;
                                                        } else if (i2 != 4) {
                                                            return;
                                                        } else {
                                                            airhockey.mAct.startActivity(callShop.shopProductGoogle(airhockey.mAct.mstrPid));
                                                            return;
                                                        }
                                                    default:
                                                        return;
                                                }
                                        }
                                }
                        }
                    } else {
                        airhockey.doneVerCode(airhockey.mAct.getPackageManager().getPackageInfo(airhockey.mAct.getPackageName(), 128).versionCode);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            this.strContry = ((TelephonyManager) getSystemService("phone")).getNetworkCountryIso();
            mAct = this;
            GdprManager gdprManager = new GdprManager();
            this.gdprManager = gdprManager;
            gdprManager.init(this);
            PaymentManager.getInstance(mAct).initialize(new BillingClientStateListener() { // from class: com.mobirix.airhockey.airhockey.1
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    if (billingResult.getResponseCode() == 0) {
                        PaymentManager.getInstance(airhockey.mAct).resetmSkuIdList(Arrays.asList(airhockey.ITEM_CODE));
                        PaymentManager.getInstance(airhockey.mAct).queryPurchases();
                        PaymentManager.getInstance(airhockey.mAct).querySubPurchases();
                        PaymentManager.getInstance(airhockey.mAct).getSkuDetailsAsync();
                    }
                }
            }, new ProductDetailsResponseListener() { // from class: com.mobirix.airhockey.airhockey.2
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
                    String str;
                    if (billingResult.getResponseCode() == 0 && list != null) {
                        int length = airhockey.ITEM_CODE.length + 1;
                        String[] strArr = new String[length];
                        int i = 0;
                        while (true) {
                            str = "";
                            if (i >= length) {
                                break;
                            }
                            strArr[i] = "";
                            i++;
                        }
                        for (ProductDetails productDetails : list) {
                            String productId = productDetails.getProductId();
                            if (productDetails.getProductType().equals("inapp") && productDetails.getOneTimePurchaseOfferDetails() != null) {
                                String formattedPrice = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= airhockey.ITEM_CODE.length) {
                                        break;
                                    } else if (productId.equals(airhockey.ITEM_CODE[i2])) {
                                        strArr[i2] = formattedPrice;
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        for (int i3 = 0; i3 < airhockey.ITEM_CODE.length + 1; i3++) {
                            str = i3 == 0 ? strArr[i3] : str + "|" + strArr[i3];
                        }
                        airhockey.my_debug("strtempPrice " + str);
                        airhockey.my_debug("strChargePrice " + strArr);
                        airhockey.doneInappList(str);
                    }
                }
            }, new PurchaseListener() { // from class: com.mobirix.airhockey.airhockey.3
                @Override // com.mobirix.payment.PurchaseListener
                public void onFail() {
                }

                @Override // com.mobirix.payment.PurchaseListener
                public void onSuccess(Purchase purchase) {
                    for (String str : purchase.getProducts()) {
                        int i = 0;
                        while (true) {
                            if (i >= airhockey.ITEM_CODE.length) {
                                break;
                            } else if (str.equals(airhockey.ITEM_CODE[i])) {
                                airhockey.chargeResult(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            });
            this.mGooglePlayHelper = new googlePlayServiceHelper();
            googlePlayServiceHelper.init(false);
            this.mGooglePlayHelper.mGoogleSignInClient = GoogleSignIn.getClient((Activity) this, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).requestServerAuthCode(getString(R.string.default_web_client_id)).build());
            if (this.strContry.length() == 0) {
                doneGooPlayNation(new String("zz"));
            } else {
                doneGooPlayNation(this.strContry);
            }
            if (this.strContry.equals("kr")) {
                doneCountryCode(1);
            } else if (this.strContry.equals("jp")) {
                doneCountryCode(2);
            } else {
                doneCountryCode(0);
            }
            String language = Locale.getDefault().getLanguage();
            this.m_strLanguage = language;
            if (language.equals("ko")) {
                doneLangageCode(1);
            } else if (this.m_strLanguage.equals("ja")) {
                doneLangageCode(2);
            } else if (this.m_strLanguage.equals("zh")) {
                if (Locale.getDefault().toString().equals("zh_CN")) {
                    doneLangageCode(9);
                } else if (Locale.getDefault().toString().contains("Hans")) {
                    doneLangageCode(9);
                } else {
                    doneLangageCode(3);
                }
            } else if (this.m_strLanguage.equals("es")) {
                doneLangageCode(4);
            } else if (this.m_strLanguage.equals("ru")) {
                doneLangageCode(5);
            } else if (this.m_strLanguage.equals("pt")) {
                doneLangageCode(6);
            } else if (this.m_strLanguage.equals("de")) {
                doneLangageCode(7);
            } else if (this.m_strLanguage.equals("fr")) {
                doneLangageCode(8);
            } else if (this.m_strLanguage.equals("it")) {
                doneLangageCode(10);
            } else if (this.m_strLanguage.equals("th")) {
                doneLangageCode(11);
            } else if (this.m_strLanguage.equals("in")) {
                doneLangageCode(12);
            } else if (this.m_strLanguage.equals("vi")) {
                doneLangageCode(13);
            } else if (this.m_strLanguage.equals("hi")) {
                doneLangageCode(14);
            } else if (this.m_strLanguage.equals("tr")) {
                doneLangageCode(15);
            } else {
                doneLangageCode(0);
            }
            byte[] bArr = this.mJniMsg;
            bArr[0] = J_SDKVER;
            bArr[1] = (byte) Cocos2dxHelper.getSDKVersion();
            doneGooPlayMessage(this.mJniMsg);
            keepScreenOn();
            this.mPackageName = getApplication().getPackageName();
            MoreManager moreManager = new MoreManager();
            this.moreManager = moreManager;
            moreManager.init(this, "AOS_PACKAGE", "webp", 1);
            AgreeManager agreeManager = new AgreeManager();
            this.agrManager = agreeManager;
            agreeManager.init(this);
            MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.mobirix.airhockey.airhockey.4
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    try {
                        airhockey.this.myAdmob = new MobirixAdMob(airhockey.mAct);
                        airhockey.this.myAdmob.createBannerAd(AdSize.BANNER, 49, airhockey.MY_AD_UNIT_ID, 130, 1280);
                        airhockey.this.myAdmob.createMiddleAd(AdSize.MEDIUM_RECTANGLE, 49, airhockey.MY_MIDAD_UNIT_ID);
                        airhockey.this.myAdmob.createFullAd(airhockey.MY_INTERAD_UNIT_ID);
                        airhockey.this.myAdmob.createRewardAd(airhockey.ADREWARD_UNIT_ID, new MobirixAdMob.adReawrdListenerCallback() { // from class: com.mobirix.airhockey.airhockey.4.1
                            @Override // com.mobirix.admob.MobirixAdMob.adReawrdListenerCallback
                            public void onRewarded(int i) {
                                airhockey.mAct.mJniMsg[0] = airhockey.J_ONREWARDED;
                                airhockey.mAct.mJniMsg[1] = (byte) i;
                                airhockey airhockeyVar = airhockey.mAct;
                                airhockey.doneGooPlayMessage(airhockey.mAct.mJniMsg);
                            }

                            @Override // com.mobirix.admob.MobirixAdMob.adReawrdListenerCallback
                            public void onRewardedVideoAdLoaded() {
                                airhockey.mAct.mJniMsg[0] = 99;
                                airhockey airhockeyVar = airhockey.mAct;
                                airhockey.doneGooPlayMessage(airhockey.mAct.mJniMsg);
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onResume() {
        my_debug("onResume1~~~~~~~~~~~~~~~~~~~~~~~~~~");
        super.onResume();
        if (getCurrentFocus() != Cocos2dxGLSurfaceView.getInstance()) {
            Cocos2dxGLSurfaceView.getInstance().requestFocus();
        }
        MobirixAdMob mobirixAdMob = this.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.resume();
        }
        googlePlayServiceHelper googleplayservicehelper = this.mGooglePlayHelper;
        if (googleplayservicehelper != null) {
            googleplayservicehelper.onResume();
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onPause() {
        my_debug("onPause1~~~~~~~~~~~~~~~~~~~~~~~~~~");
        MobirixAdMob mobirixAdMob = this.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.pause();
        }
        super.onPause();
        googlePlayServiceHelper googleplayservicehelper = this.mGooglePlayHelper;
        if (googleplayservicehelper != null) {
            googleplayservicehelper.onPause();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        my_debug("onStop5~~~~~~~~~~~~~~~~~~~~~~~~~~");
        byte[] bArr = this.mJniMsg;
        bArr[0] = J_GAME_EXIT;
        doneGooPlayMessage(bArr);
        dissmissWaitDialog();
        super.onStop();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onDestroy() {
        MobirixAdMob mobirixAdMob = this.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.destroy();
        }
        if (PaymentManager.bInitialized) {
            PaymentManager.getInstance(mAct).destroy();
        }
        super.onDestroy();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        my_debug("request = " + i + "response = " + i2 + "data =" + intent);
        super.onActivityResult(i, i2, intent);
        this.mGooglePlayHelper.onActivityResult(i, i2, intent);
    }

    public static void showAd() {
        MobirixAdMob mobirixAdMob = mAct.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.bannerOnlyView(true);
        }
    }

    public static void hideAd() {
        MobirixAdMob mobirixAdMob = mAct.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.bannerOnlyView(false);
        }
    }

    public static void showmidAd() {
        MobirixAdMob mobirixAdMob = mAct.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.admobsView(false, true, false);
        }
    }

    public static void hidemidAd() {
        MobirixAdMob mobirixAdMob = mAct.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.admobsView(false, false, false);
        }
    }

    public static void doFullAdOn() {
        MobirixAdMob mobirixAdMob = mAct.myAdmob;
        if (mobirixAdMob != null) {
            mobirixAdMob.fullOnlyView();
        }
    }

    void keepScreenOn() {
        getWindow().addFlags(128);
    }

    void stopKeepingScreenOn() {
        getWindow().clearFlags(128);
    }

    public void showWaitDialog() {
        if (waitDialog != null) {
            return;
        }
        mAct.runOnUiThread(new Runnable() { // from class: com.mobirix.airhockey.airhockey.5
            @Override // java.lang.Runnable
            public void run() {
                airhockey.waitDialog = ProgressDialog.show(airhockey.mAct, "", airhockey.mAct.getResources().getString(R.string.please_wait), true);
            }
        });
    }

    public void dissmissWaitDialog() {
        if (waitDialog == null) {
            return;
        }
        mAct.runOnUiThread(new Runnable() { // from class: com.mobirix.airhockey.airhockey.6
            @Override // java.lang.Runnable
            public void run() {
                airhockey.mAct.runOnUiThread(new Runnable() { // from class: com.mobirix.airhockey.airhockey.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (airhockey.waitDialog != null && airhockey.waitDialog.isShowing()) {
                            airhockey.waitDialog.dismiss();
                        }
                        airhockey.waitDialog = null;
                    }
                });
            }
        });
    }

    public static final Intent shopDeveloperSiteGoogle(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/dev?id=4864673505117639552"));
            if (intent.resolveActivity(mAct.getPackageManager()) == null) {
                return null;
            }
            return intent;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void doReward(final String str) {
        new Thread(new Runnable() { // from class: com.mobirix.airhockey.airhockey.7
            @Override // java.lang.Runnable
            public void run() {
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        String str2 = "idx=" + URLEncoder.encode(str, "UTF-8") + "&gameid=" + URLEncoder.encode(airhockey.mAct.GAMEID, "UTF-8");
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("http://uu22rr33iuerwol0ciure.kr:33364/MobirixGameData/GameReward.aspx").openConnection();
                        try {
                            httpURLConnection2.setConnectTimeout(5000);
                            httpURLConnection2.setReadTimeout(5000);
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setDoInput(true);
                            httpURLConnection2.setUseCaches(false);
                            httpURLConnection2.setDefaultUseCaches(false);
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                            dataOutputStream.write(str2.getBytes("UTF-8"));
                            dataOutputStream.flush();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), "UTF-8"));
                            String readLine = bufferedReader.readLine();
                            dataOutputStream.close();
                            bufferedReader.close();
                            int parseInt = Integer.parseInt(readLine);
                            if (parseInt > 0) {
                                airhockey.doneIntMessage(airhockey.J_REWARD, parseInt, 0, 0);
                            } else {
                                airhockey.doneIntMessage(airhockey.J_REWARD, -1, 0, 0);
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (Exception unused) {
                            httpURLConnection = httpURLConnection2;
                            airhockey.doneIntMessage(airhockey.J_REWARD, -1, 0, 0);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused2) {
                }
            }
        }).start();
    }

    public void purError(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setNeutralButton("OK", (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    public static void chargeResult(int i) {
        doneIntMessage(J_PURCHASE, i, 0, 0);
    }

    public static void goMobirixYouTube() {
        googlePlayServiceHelper.handler.post(new Runnable() { // from class: com.mobirix.airhockey.airhockey.8
            @Override // java.lang.Runnable
            public void run() {
                if (airhockey.mAct.getPackageManager().getLaunchIntentForPackage("com.google.android.youtube") != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setPackage("com.google.android.youtube");
                        intent.setData(Uri.parse("https://www.youtube.com/user/mobirix1"));
                        airhockey.mAct.startActivity(intent);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        airhockey.mAct.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/user/mobirix1")));
                        return;
                    }
                }
                airhockey.mAct.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/user/mobirix1")));
            }
        });
    }
}
