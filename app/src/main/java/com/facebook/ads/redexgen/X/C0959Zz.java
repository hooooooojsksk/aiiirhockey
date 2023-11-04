package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zz */
/* loaded from: assets/audience_network.dex */
public class C0959Zz extends K1 {
    public static byte[] A01;
    public final /* synthetic */ C0958Zy A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C0959Zz(C0958Zy c0958Zy) {
        this.A00 = c0958Zy;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C0887Xc c0887Xc;
        N0 n0;
        C0960a0 c0960a0;
        c0887Xc = this.A00.A02;
        c0887Xc.A0E().AFy();
        n0 = this.A00.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(0, 11, 35));
        c0960a0 = this.A00.A00;
        sb.append(c0960a0.A03());
        n0.loadUrl(sb.toString());
    }
}
