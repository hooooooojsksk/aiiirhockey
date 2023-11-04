package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8X */
/* loaded from: assets/audience_network.dex */
public final class C8X {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8Z A00(C0886Xb c0886Xb) {
        try {
            return new X2(c0886Xb);
        } catch (IOException e) {
            c0886Xb.A07().A9C(A02(0, 15, 89), C02627s.A2J, new C02637t(e));
            return new X5();
        }
    }

    public static C0396Dp A01(C0886Xb c0886Xb) {
        return new C0396Dp(c0886Xb);
    }
}
