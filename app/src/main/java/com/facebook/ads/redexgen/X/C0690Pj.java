package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pj */
/* loaded from: assets/audience_network.dex */
public class C0690Pj implements Animator.AnimatorListener {
    public final /* synthetic */ JS A00;

    public C0690Pj(JS js) {
        this.A00 = js;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A00.A08(false);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A00.A02 = EnumC0687Pg.A05;
        view = this.A00.A05;
        LL.A0H(view);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
