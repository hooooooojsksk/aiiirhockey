package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.aE */
/* loaded from: assets/audience_network.dex */
public class C0974aE extends K1 {
    public final /* synthetic */ C0973aD A00;
    public final /* synthetic */ C02908v A01;

    public C0974aE(C0973aD c0973aD, C02908v c02908v) {
        this.A00 = c0973aD;
        this.A01 = c02908v;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        QA qa;
        QA qa2;
        QA qa3;
        this.A00.A00.A09();
        qa = this.A00.A00.A0A;
        if (qa != null) {
            C02908v c02908v = this.A01;
            qa2 = this.A00.A00.A0A;
            c02908v.setAdViewabilityChecker(qa2);
            qa3 = this.A00.A00.A0A;
            qa3.A0U();
        }
    }
}
