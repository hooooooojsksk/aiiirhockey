package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum IS {
    A02,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{airhockey.J_NATION, airhockey.J_GAME_STANDBY, 92, 90, 92, airhockey.J_SDKVER, 84, 95, -49, -47, -66, -49, -63, -51, -47, -63, -54, -48, airhockey.J_PURCHASE, 109, airhockey.J_GAME_REMATCH, 123, airhockey.J_GAME_STANDBY, 102, 109, airhockey.J_GOO, 109, airhockey.J_ACHIEVEMENTCALLBACK, 125};
    }

    static {
        A01();
    }
}
