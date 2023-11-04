package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public enum KA {
    A04(0),
    A0C(1),
    A07(2),
    A0A(3),
    A08(4),
    A0B(5),
    A03(6),
    A09(7),
    A05(8),
    A06(9);
    
    public static byte[] A01;
    public int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{85, 93, 64, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, 79, 81, 83, airhockey.P_GAME_SELECTMAP, 89, airhockey.P_GAME_BREAKBALLCOUNT, 89, airhockey.P_GAME_SELECTMAP, 89, 85, airhockey.P_GAME_MYSCORE, 79, airhockey.P_NATION, 85, 86, 92, 85, 83, airhockey.P_GAME_SELECTMAP, 89, 95, 94, 38, 36, 47, 36, 51, 40, 34, 62, 36, 51, 51, 46, 51, 102, airhockey.J_GAME_ENEMYEXIT, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_NATION, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_INVITE, airhockey.J_ERROR, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 99, 24, 27, 37, 40, 60, 39, 42, 33, 44, 59, 54, 47, 38, 60, 39, 45, 54, 59, 44, 47, 37, 44, 42, 61, 32, 38, 39, 59, 58, 42, 52, 54, 33, 60, 35, 60, 33, 44, 42, 38, 48, 39, 35, 60, 54, 48, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 82, 65, 76, 88, airhockey.P_GAME_MYSCORE, 78, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, 95, 82, 75, airhockey.P_NATION, 88, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, 82, 76, 93, airhockey.P_GAME_SELECTMAP, 63, 60, 32, 33, 49, 34, 47, 59, 32, 45, 38, 43, 60, 49, 40, 33, 59, 32, 42, 49, 60, 43, 40, 34, 43, 45, 58, 39, 33, 32, 91, 90, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 64, 91, 91, 92, 91, 82, airhockey.P_GAME_EXIT, 65, 84, airhockey.P_GAME_BREAKBALLCOUNT, 94, airhockey.P_GAME_BREAKBALLCOUNT, 102, 125, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, 119, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_SDKVER, 126, airhockey.J_SDKVER, 124, airhockey.J_SDKVER, 109, 123, 119, airhockey.J_PURCHASE, 109, airhockey.J_INVITE, airhockey.J_ONREWARDED, 109, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, 102, airhockey.P_GAME_MYLOSE, 83, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 89, airhockey.P_GAME_STANDBY, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 82, airhockey.P_GAME_MYSCORE, 94, 82};
    }

    static {
        A01();
    }

    KA(int i) {
        this.A00 = i;
    }
}
