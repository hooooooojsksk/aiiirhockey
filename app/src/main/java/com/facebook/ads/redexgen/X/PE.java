package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum PE {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-85, -80, -95, airhockey.J_BACK, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, -47, -62, -42, -44, -58, -46, -50, -61, -37, 119, airhockey.J_GAME_EXIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, -82, -90, -92, -85, -63, -74, -70, -78, -93, -100, -101, -93, -94, -109, -63, -76, -80, -62, -84, -83, -73, -80, -54, -76, -72, -69, -67, -80, -66, -66, -76, -70, -71};
    }

    static {
        A01();
    }

    PE(int i) {
        this.A00 = i;
    }
}
