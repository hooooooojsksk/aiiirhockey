package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nr */
/* loaded from: assets/audience_network.dex */
public class C0647Nr implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SG A00;

    public C0647Nr(SG sg) {
        this.A00 = sg;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        view = this.A00.A06;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view2 = this.A00.A06;
        view2.requestLayout();
    }
}
