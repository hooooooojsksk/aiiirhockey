package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pp */
/* loaded from: assets/audience_network.dex */
public class C0696Pp implements Animator.AnimatorListener {
    public final /* synthetic */ JP A00;

    public C0696Pp(JP jp) {
        this.A00 = jp;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC0687Pg.A05;
        view = this.A00.A05;
        LL.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
