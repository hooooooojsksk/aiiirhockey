package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Y2 extends AbstractRunnableC0543Jo {
    public final /* synthetic */ C0910Xz A00;
    public final /* synthetic */ JA A01;

    public Y2(C0910Xz c0910Xz, JA ja) {
        this.A00 = c0910Xz;
        this.A01 = ja;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0543Jo
    public final void A01() {
        C5W c5w;
        C5W c5w2;
        c5w = this.A00.A00;
        if (c5w.A00() != null) {
            c5w2 = this.A00.A00;
            c5w2.A00().onAdError(KW.A00(this.A01));
        }
    }
}
