package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S4 extends K1 {
    public static byte[] A01;
    public final /* synthetic */ OE A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{5, 58, 55, 54, 60, airhockey.J_SAVEDGAME_SAVE, 61, 54, 37, 54, 33, airhockey.J_SAVEDGAME_SAVE, 32, 39, 50, 33, 39, 54, 55, airhockey.J_SAVEDGAME_SAVE, 35, 63, 50, 42, 58, 61, 52};
    }

    public S4(OE oe) {
        this.A00 = oe;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        boolean z;
        z = this.A00.A04;
        if (!z) {
            this.A00.A0I(A00(0, 27, 122));
        }
    }
}
