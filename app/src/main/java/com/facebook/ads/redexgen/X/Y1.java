package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Y1 extends AbstractRunnableC0543Jo {
    public final /* synthetic */ Y0 A00;

    public Y1(Y0 y0) {
        this.A00 = y0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0543Jo
    public final void A01() {
        C5W c5w;
        C5W c5w2;
        c5w = this.A00.A01.A00;
        if (c5w.A00() != null) {
            c5w2 = this.A00.A01.A00;
            c5w2.A00().onAdsLoaded();
        }
    }
}
