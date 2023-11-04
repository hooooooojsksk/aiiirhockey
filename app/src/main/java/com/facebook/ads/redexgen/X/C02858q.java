package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.8q */
/* loaded from: assets/audience_network.dex */
public class C02858q {
    public final int A00;
    public final C02828n A01;

    public C02858q(int i, C02828n c02828n) {
        this.A00 = i;
        this.A01 = c02828n;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C8e A02(int i, byte[] bArr, int i2, int[] iArr, int i3) throws IOException {
        return this.A01.A06(i, bArr, i2, iArr, i3);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
