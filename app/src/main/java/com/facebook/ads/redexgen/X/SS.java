package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SS extends K1 {
    public static byte[] A02;
    public final /* synthetic */ C0633Nd A00;
    public final /* synthetic */ C02456y A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-96, -45, -60, -60, -61, -48, -57, -52, -59, 126, -57, -52, -62, -61, -60, -57, -52, -57, -46, -61, -54, -41};
    }

    public SS(C0633Nd c0633Nd, C02456y c02456y) {
        this.A00 = c0633Nd;
        this.A01 = c02456y;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        RA ra;
        RA ra2;
        InterfaceC0657Ob interfaceC0657Ob;
        ra = this.A00.A0P;
        if (ra.getState() == Q7.A02) {
            ra2 = this.A00.A0P;
            if (ra2.getCurrentPositionInMillis() == A00()) {
                interfaceC0657Ob = this.A00.A0M;
                interfaceC0657Ob.ACz(A00(0, 22, 75));
            }
        }
    }
}
