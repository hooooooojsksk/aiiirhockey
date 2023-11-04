package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Rl */
/* loaded from: assets/audience_network.dex */
public class C0744Rl extends K1 {
    public final /* synthetic */ InterfaceC0659Od A00;
    public final /* synthetic */ C0660Oe A01;

    public C0744Rl(C0660Oe c0660Oe, InterfaceC0659Od interfaceC0659Od) {
        this.A01 = c0660Oe;
        this.A00 = interfaceC0659Od;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0745Rm(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
