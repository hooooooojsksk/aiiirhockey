package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zb */
/* loaded from: assets/audience_network.dex */
public class C0935Zb extends K1 {
    public final /* synthetic */ AbstractC0934Za A00;
    public final /* synthetic */ JA A01;

    public C0935Zb(AbstractC0934Za abstractC0934Za, JA ja) {
        this.A00 = abstractC0934Za;
        this.A01 = ja;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        this.A00.A0B.A0E().A4c(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
