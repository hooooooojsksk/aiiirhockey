package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq */
/* loaded from: assets/audience_network.dex */
public class C0697Pq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ JP A01;

    public C0697Pq(JP jp, View view) {
        this.A01 = jp;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int value = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.setTranslationY(value);
    }
}
