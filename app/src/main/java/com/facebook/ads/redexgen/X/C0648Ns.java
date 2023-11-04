package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Ns */
/* loaded from: assets/audience_network.dex */
public class C0648Ns extends AnimatorListenerAdapter {
    public final /* synthetic */ SG A00;
    public final /* synthetic */ boolean A01;

    public C0648Ns(SG sg, boolean z) {
        this.A00 = sg;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        O0 o0;
        C0775Sq c0775Sq;
        C0775Sq c0775Sq2;
        super.onAnimationEnd(animator);
        o0 = this.A00.A0F;
        o0.setTranslationY(0.0f);
        this.A00.A0H();
        if (this.A01) {
            return;
        }
        c0775Sq = this.A00.A0D;
        if (c0775Sq == null) {
            return;
        }
        c0775Sq2 = this.A00.A0D;
        c0775Sq2.destroy();
    }
}
