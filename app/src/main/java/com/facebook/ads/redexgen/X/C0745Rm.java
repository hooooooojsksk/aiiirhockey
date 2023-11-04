package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Rm */
/* loaded from: assets/audience_network.dex */
public class C0745Rm extends LK {
    public final /* synthetic */ C0744Rl A00;

    public C0745Rm(C0744Rl c0744Rl) {
        this.A00 = c0744Rl;
    }

    @Override // com.facebook.ads.redexgen.X.LK, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        LL.A0H(this.A00.A01);
        this.A00.A00.ABN();
    }
}
