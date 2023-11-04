package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bj */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0352Bj {
    public final InterfaceC0351Bh A00;

    public abstract void A0B(C0483Hc c0483Hc, long j) throws C9Y;

    public abstract boolean A0C(C0483Hc c0483Hc) throws C9Y;

    public AbstractC0352Bj(InterfaceC0351Bh interfaceC0351Bh) {
        this.A00 = interfaceC0351Bh;
    }

    public final void A00(C0483Hc c0483Hc, long j) throws C9Y {
        if (A0C(c0483Hc)) {
            A0B(c0483Hc, j);
        }
    }
}
