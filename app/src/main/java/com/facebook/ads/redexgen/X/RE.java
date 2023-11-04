package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class RE extends K1 {
    public final /* synthetic */ RA A00;

    public RE(RA ra) {
        this.A00 = ra;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        boolean z;
        C8U c8u;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c8u = this.A00.A0B;
            c8u.A02(new PP(this.A00.getCurrentPositionInMillis()) { // from class: com.facebook.ads.redexgen.X.6y
            });
            handler = this.A00.A07;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}
