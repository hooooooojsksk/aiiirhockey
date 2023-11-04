package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TK implements C5D {
    public final /* synthetic */ TH A00;

    public TK(TH th) {
        this.A00 = th;
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final boolean A8b() {
        C0775Sq c0775Sq;
        C0775Sq c0775Sq2;
        c0775Sq = this.A00.A0B;
        if (c0775Sq.canGoBack()) {
            c0775Sq2 = this.A00.A0B;
            c0775Sq2.goBack();
            return true;
        }
        return false;
    }
}
