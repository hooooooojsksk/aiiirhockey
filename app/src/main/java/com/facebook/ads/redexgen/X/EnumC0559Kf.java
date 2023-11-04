package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kf */
/* loaded from: assets/audience_network.dex */
public enum EnumC0559Kf {
    A05(0),
    A06(1),
    A04(2);
    
    public static byte[] A01;
    public static String[] A02 = {"D", "C", "8vWlkexf09f1piT", "bgKjpA4PjvHZdywoorD", "7PPvca8DkKgRdh14PD5p9M98ffpM", "UMv18", "Efwwh", "kVnW00famwT2UvCG2iLw1Nw0GuoWmmQs"};
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "i";
        strArr[0] = "v";
        A01 = new byte[]{airhockey.J_ERROR, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, 99, airhockey.J_PURCHASE, airhockey.J_SDKVER, airhockey.J_ONREWARDED, airhockey.J_SDKVER, 96, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SDKVER, airhockey.P_GAME_SELECTMAP, 95, airhockey.P_GAME_MYSCORE, 94, 94, airhockey.P_GAME_STANDBY, 84, 85};
    }

    static {
        A01();
    }

    EnumC0559Kf(int i) {
        this.A00 = i;
    }
}
