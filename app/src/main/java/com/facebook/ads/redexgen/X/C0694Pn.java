package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Pn */
/* loaded from: assets/audience_network.dex */
public class C0694Pn implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ JQ A02;

    public C0694Pn(JQ jq, int i, int i2) {
        this.A02 = jq;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        EnumC0687Pg enumC0687Pg;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        JQ jq = this.A02;
        int i2 = this.A01;
        i = jq.A04;
        if (i2 == i) {
            enumC0687Pg = EnumC0687Pg.A03;
        } else {
            enumC0687Pg = EnumC0687Pg.A05;
        }
        jq.A01 = enumC0687Pg;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
