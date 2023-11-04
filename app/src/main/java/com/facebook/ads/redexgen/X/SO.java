package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SO implements InterfaceC0557Kd {
    public final /* synthetic */ AnonymousClass93 A00;

    public SO(AnonymousClass93 anonymousClass93) {
        this.A00 = anonymousClass93;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void AAa() {
        AbstractC0586Li abstractC0586Li;
        AbstractC0586Li abstractC0586Li2;
        this.A00.A07 = false;
        abstractC0586Li = this.A00.A04;
        if (abstractC0586Li != null) {
            abstractC0586Li2 = this.A00.A04;
            abstractC0586Li2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void ACC(float f) {
        AbstractC0586Li abstractC0586Li;
        AbstractC0586Li abstractC0586Li2;
        abstractC0586Li = this.A00.A04;
        if (abstractC0586Li != null) {
            abstractC0586Li2 = this.A00.A04;
            float percentage = 100.0f * (1.0f - (f / ((float) this.A00.getAdInfo().A0G().A00())));
            abstractC0586Li2.setProgressImmediate(percentage);
        }
    }
}
