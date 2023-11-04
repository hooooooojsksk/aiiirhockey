package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RF extends K1 {
    public final /* synthetic */ PB A00;

    public RF(PB pb) {
        this.A00 = pb;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        RA ra;
        AbstractC0663Oi abstractC0663Oi;
        NY ny;
        PO po;
        ra = this.A00.A02;
        C8U<C8V, C8T> eventBus = ra.getEventBus();
        abstractC0663Oi = this.A00.A04;
        ny = this.A00.A05;
        po = this.A00.A03;
        eventBus.A04(abstractC0663Oi, ny, po);
    }
}
