package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.Pi */
/* loaded from: assets/audience_network.dex */
public class C0689Pi implements Animator.AnimatorListener {
    public final /* synthetic */ JS A00;

    public C0689Pi(JS js) {
        this.A00 = js;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = EnumC0687Pg.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
