package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gp */
/* loaded from: assets/audience_network.dex */
public final class C0470Gp extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{94, airhockey.P_GAME_SELECTMAP, -86, -61, -70, -51, -59, -70, -72, -55, -70, -71, airhockey.J_ERROR};
    }

    public C0470Gp(Throwable th) {
        super(A00(2, 11, 64) + th.getClass().getSimpleName() + A00(0, 2, 15) + th.getMessage(), th);
    }
}
