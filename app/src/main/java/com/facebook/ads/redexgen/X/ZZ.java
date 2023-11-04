package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public class ZZ extends K1 {
    public final /* synthetic */ C0969a9 A00;
    public final /* synthetic */ C01171q A01;
    public final /* synthetic */ C0425Es A02;

    public ZZ(C0425Es c0425Es, C01171q c01171q, C0969a9 c0969a9) {
        this.A02 = c0425Es;
        this.A01 = c01171q;
        this.A00 = c0969a9;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.A00 = null;
        JA A00 = JA.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4c(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
