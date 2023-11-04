package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* loaded from: assets/audience_network.dex */
public class SZ extends K1 {
    public final /* synthetic */ NM A00;

    public SZ(NM nm) {
        this.A00 = nm;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            NM nm = this.A00;
            i = nm.A07;
            nm.postDelayed(this, i);
            return;
        }
        this.A00.setPressed(true);
        NM nm2 = this.A00;
        runnable = nm2.A09;
        nm2.postOnAnimationDelayed(runnable, 250L);
    }
}
