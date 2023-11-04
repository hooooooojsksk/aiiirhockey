package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zd */
/* loaded from: assets/audience_network.dex */
public class C0937Zd extends K1 {
    public static byte[] A03;
    public final /* synthetic */ C0970aA A00;
    public final /* synthetic */ C01171q A01;
    public final /* synthetic */ C0426Et A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C0937Zd(C0426Et c0426Et, C01171q c01171q, C0970aA c0970aA) {
        this.A02 = c0426Et;
        this.A01 = c01171q;
        this.A00 = c0970aA;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.AAv(new JA(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
