package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class PV extends AnimatorListenerAdapter {
    public final /* synthetic */ C02336i A00;

    public PV(C02336i c02336i) {
        this.A00 = c02336i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0549Ju(this), 2000L);
    }
}
