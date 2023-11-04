package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatorSet a;
    public final /* synthetic */ FyberAdIdentifier b;

    public c(FyberAdIdentifier fyberAdIdentifier, AnimatorSet animatorSet) {
        this.b = fyberAdIdentifier;
        this.a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifier fyberAdIdentifier = this.b;
        if (fyberAdIdentifier.d) {
            fyberAdIdentifier.a.setImageResource(R.drawable.fyber_info_button);
        } else {
            Bitmap bitmap = fyberAdIdentifier.h;
            if (bitmap != null) {
                fyberAdIdentifier.a.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifier.a.setImageResource(R.drawable.fyber_logo_green);
            }
        }
        this.a.start();
        this.b.e = this.a;
    }
}
