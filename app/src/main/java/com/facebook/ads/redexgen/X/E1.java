package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public class E1 extends PO {
    public final /* synthetic */ C5R A00;

    public E1(C5R c5r) {
        this.A00 = c5r;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(AnonymousClass72 anonymousClass72) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewVideoRenderer mediaViewVideoRenderer2;
        MediaViewVideoRenderer mediaViewVideoRenderer3;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onCompleted();
        mediaViewVideoRenderer2 = this.A00.A00;
        if (IK.A1C(mediaViewVideoRenderer2.getContext())) {
            mediaViewVideoRenderer3 = this.A00.A00;
            mediaViewVideoRenderer3.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
