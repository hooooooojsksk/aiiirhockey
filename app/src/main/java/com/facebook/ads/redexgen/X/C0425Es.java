package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Es */
/* loaded from: assets/audience_network.dex */
public final class C0425Es extends AbstractC0934Za {
    public C0425Es(C0887Xc c0887Xc, C01161p c01161p) {
        super(c0887Xc, c01161p);
    }

    private InterfaceC00980x A00(Runnable runnable) {
        return new ZY(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0L() {
        C0969a9 interstitialAdapter = (C0969a9) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0N(InterfaceC00880n interfaceC00880n, C8A c8a, AnonymousClass88 anonymousClass88, C01171q c01171q) {
        C0969a9 c0969a9 = (C0969a9) interfaceC00880n;
        ZZ zz = new ZZ(this, c01171q, c0969a9);
        A0E().postDelayed(zz, c8a.A05().A05());
        c0969a9.A0A(this.A0B, A00(zz), c01171q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    /* renamed from: A0V */
    public final AbstractC0952Zs A0F() {
        return ((C0969a9) this.A01).A09();
    }
}
