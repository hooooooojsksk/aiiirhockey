package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* loaded from: assets/audience_network.dex */
public class YG extends AbstractRunnableC0543Jo {
    public final /* synthetic */ YF A00;

    public YG(YF yf) {
        this.A00 = yf;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0543Jo
    public final void A01() {
        C5A c5a;
        C5A c5a2;
        C5A c5a3;
        c5a = this.A00.A01;
        if (c5a.A06() != null) {
            c5a2 = this.A00.A01;
            AdListener A06 = c5a2.A06();
            c5a3 = this.A00.A01;
            A06.onLoggingImpression(c5a3.A07());
        }
    }
}
