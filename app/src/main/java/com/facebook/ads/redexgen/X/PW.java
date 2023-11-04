package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PW extends AnimatorListenerAdapter {
    public final /* synthetic */ C0545Jq A00;

    public PW(C0545Jq c0545Jq) {
        this.A00 = c0545Jq;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
