package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kl */
/* loaded from: assets/audience_network.dex */
public final class C0563Kl {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{airhockey.J_GAME_DISCONNECT, 78, 65, 8, 91, 15, 75, airhockey.P_GAME_EXIT, 91, airhockey.P_GAME_EXIT, 93, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, 65, airhockey.P_GAME_EXIT, 15, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, 15, 78, 95, 95, 15, airhockey.P_GAME_BREAKBALLCOUNT, 92, 15, airhockey.J_PURCHASE, 65, airhockey.P_GAME_BREAKBALLCOUNT, 91, 86, 1, 24, 34, airhockey.J_BACK, 4, 63, 56, 37, 40, airhockey.J_BACK, 48, 33, 33, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, airhockey.J_REWARD, airhockey.J_PURCHASE, airhockey.J_ACHIEVEMENTCALLBACK, 59, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, airhockey.J_REWARD, airhockey.J_GOO, 119, airhockey.J_PURCHASE, airhockey.J_PURCHASE, 126, 59, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_DISCONNECT, airhockey.J_REWARD, airhockey.J_SDKVER, 59, airhockey.P_GAME_MYWIN, airhockey.J_GOO, airhockey.J_DISCONNECT, airhockey.J_REWARD, airhockey.J_SDKVER, 84, airhockey.J_REWARD, airhockey.J_SDKVER, 124, 99, 124, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, 4, 8, 10, airhockey.P_GAME_REMATCH, 18, 9, 14, 19, 30, 84, 3, airhockey.P_GAME_REMATCH, 23, 11, 6, 30, 2, 21, airhockey.P_GAME_REMATCH, 50, 9, 14, 19, 30, 55, 11, 6, 30, 2, 21, 38, 4, 19, 14, 17, 14, 19, 30};
    }

    static {
        A01();
        A01 = C0563Kl.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(C7N c7n) {
        boolean z = false;
        try {
            PackageManager packageManager = c7n.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c7n.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 62).equals(activityInfoArr[i].name);
                    if (!activityDeclared) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c7n.A04().A8f();
            if (activityDeclared3) {
                String str = A00(32, 14, 8) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (c7n.A04().A8f()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
