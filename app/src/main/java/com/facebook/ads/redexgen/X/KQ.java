package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KQ extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-44, -4, -4, -12, -7, -14, -83, -35, -7, -18, 6, -83, -10, 0, -83, -5, -4, 1, -83, -10, -5, 0, 1, -18, -7, -7, -14, -15};
    }

    public KQ() {
        super(A00(0, 28, 37));
    }
}
