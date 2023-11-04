package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RC extends K1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RA A02;

    public RC(RA ra, int i, int i2) {
        this.A02 = ra;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C8U c8u;
        c8u = this.A02.A0B;
        c8u.A02(new M0(this.A00, this.A01));
    }
}
