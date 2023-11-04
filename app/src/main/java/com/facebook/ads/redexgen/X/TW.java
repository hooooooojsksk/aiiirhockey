package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class TW extends K1 {
    public final /* synthetic */ C0558Ke A00;

    public TW(C0558Ke c0558Ke) {
        this.A00 = c0558Ke;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        Handler handler;
        long j;
        if (this.A00.A06()) {
            this.A00.A02();
            handler = this.A00.A05;
            j = this.A00.A02;
            handler.postDelayed(this, j);
        }
    }
}
