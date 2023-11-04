package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class B6 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{47, 7, 6, 11, 3, airhockey.P_NATION, 6, 13, 7, 17, airhockey.P_NATION, 12, 13, 22, airhockey.P_NATION, 17, 23, 18, 18, 13, 16, 22, airhockey.P_NATION, 23, 23, 11, 6, 88, airhockey.P_NATION};
    }

    public B6(UUID uuid) {
        super(A00(0, 29, 29) + uuid);
    }
}
