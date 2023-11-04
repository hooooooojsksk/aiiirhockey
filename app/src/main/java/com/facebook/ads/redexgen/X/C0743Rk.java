package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rk */
/* loaded from: assets/audience_network.dex */
public class C0743Rk extends K1 {
    public static byte[] A02;
    public final /* synthetic */ C7J A00;
    public final /* synthetic */ C02456y A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public C0743Rk(C7J c7j, C02456y c02456y) {
        this.A00 = c7j;
        this.A01 = c02456y;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        RA ra;
        RA ra2;
        ra = this.A00.A0B;
        if (ra.getState() == Q7.A02) {
            ra2 = this.A00.A0B;
            if (ra2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
