package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.46 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass46 {
    public static byte[] A06;
    public static String[] A07 = {"xh4Y4QcmM1wa5ldyXwFix7", "nmU7", "oStcn17TrhEMCT80qINsWqFBzeEgJkSk", "ejnuP30nVsgr2lyZF", "TwVj4lrjiRaSjHpnKGXYnUPcFE6raeBX", "wQpR2en2jkfHgW4", "pxsGGNitIZPjAkQbFzIWarOMOhpj3cU0", "7"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC01934r A04;
    public AbstractC01934r A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 94);
            if (A07[0].length() == 11) {
                throw new RuntimeException();
            }
            A07[4] = "AHVWCXL94tyjuu8jVJzYXjJpXDntUCwP";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-52, -64, 6, 18, 15, 13, -8, -35, -103, -115, -45, -33, -36, -38, -58, -86, -18, -30, 48, 39, 57, 10, 49, 46, 38, 39, 52, -1, -77, -89, -5, -10, -33, -60, -70, -82, 2, -3, -25, -53, -52, -15, -22, -9, -16, -18, -46, -9, -17, -8, 4, -8, -11, -19, -47, -8, -11, -19, -18, -5, -58};
    }

    static {
        A01();
    }

    public AnonymousClass46(AbstractC01934r abstractC01934r, AbstractC01934r abstractC01934r2) {
        this.A05 = abstractC01934r;
        this.A04 = abstractC01934r2;
    }

    public AnonymousClass46(AbstractC01934r abstractC01934r, AbstractC01934r abstractC01934r2, int i, int i2, int i3, int i4) {
        this(abstractC01934r, abstractC01934r2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        return A00(40, 21, 43) + this.A05 + A00(16, 12, 100) + this.A04 + A00(0, 8, 66) + this.A00 + A00(8, 8, 15) + this.A01 + A00(28, 6, 41) + this.A02 + A00(34, 6, 48) + this.A03 + '}';
    }
}
