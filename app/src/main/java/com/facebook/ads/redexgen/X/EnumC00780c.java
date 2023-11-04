package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0c */
/* loaded from: assets/audience_network.dex */
public enum EnumC00780c {
    A09(A00(103, 5, 27)),
    A07(A00(90, 5, 74)),
    A03(A00(54, 8, 22)),
    A08(A00(95, 8, 13)),
    A04(A00(62, 10, 107)),
    A06(A00(81, 9, 102)),
    A05(A00(72, 9, 56));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 17, 2, 31, 5, 3, 21, 28, 23, 0, 31, 12, 27, 10, 17, 1, 26, 23, airhockey.J_DISCONNECT, 99, 124, 111, airhockey.J_WAIT, 125, airhockey.J_BACK, 119, airhockey.J_ERROR, 22, 1, 30, 13, 4, 27, 22, 23, 29, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, 109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, 78, 82, 95, airhockey.P_GAME_MYWIN, 95, 92, 82, 91, 92, airhockey.P_GAME_MYSCORE, 78, 79, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, airhockey.P_GAME_STANDBY, 86, 75, 81, 87, 65, airhockey.P_GAME_MYLOSE, 61, 42, 53, 6, 49, 32, 59, 43, 48, 61, airhockey.J_INVITE, airhockey.J_WAIT, 102, 85, 99, airhockey.J_ENEMYWIN, airhockey.J_GAME_ENEMYEXIT, 109, 111, 48, 39, 56, 11, 34, 61, 48, 49, 59, 17, 21, 25, 31, 29, 79, 83, 94, airhockey.P_GAME_BREAKBALLCOUNT, 94, 93, 83, 90, 95, 64, 77, 76, airhockey.P_GAME_BREAKBALLCOUNT};
    }

    static {
        A01();
    }

    EnumC00780c(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
