package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* loaded from: assets/audience_network.dex */
public class SY extends K1 {
    public final /* synthetic */ NM A00;

    public SY(NM nm) {
        this.A00 = nm;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        NM nm = this.A00;
        runnable = nm.A08;
        i = this.A00.A07;
        nm.postOnAnimationDelayed(runnable, i);
    }
}
