package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6i */
/* loaded from: assets/audience_network.dex */
public class C02336i extends LE {
    public final /* synthetic */ C0545Jq A00;

    public C02336i(C0545Jq c0545Jq) {
        this.A00 = c0545Jq;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(LJ lj) {
        RA ra;
        Handler handler;
        ra = this.A00.A01;
        if (ra == null || lj.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new PV(this));
    }
}
