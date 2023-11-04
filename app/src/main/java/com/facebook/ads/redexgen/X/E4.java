package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class E4 extends AbstractC0623Mt {
    public final /* synthetic */ C5R A00;

    public E4(C5R c5r) {
        this.A00 = c5r;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(NC nc) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            C0799Tp.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
