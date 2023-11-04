package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rx */
/* loaded from: assets/audience_network.dex */
public class C0756Rx implements InterfaceC0557Kd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K1 A01;
    public final /* synthetic */ AbstractC0753Ru A02;

    public C0756Rx(AbstractC0753Ru abstractC0753Ru, int i, K1 k1) {
        this.A02 = abstractC0753Ru;
        this.A00 = i;
        this.A01 = k1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void AAa() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void ACC(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
