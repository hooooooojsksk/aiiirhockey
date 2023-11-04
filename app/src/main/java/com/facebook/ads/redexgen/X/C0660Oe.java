package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oe */
/* loaded from: assets/audience_network.dex */
public final class C0660Oe extends LinearLayout {
    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C0887Xc A02;
    public final NU A03;
    public final C0630Na A04;
    public static final int A07 = (int) (Kk.A02 * 16.0f);
    public static final int A08 = (int) (Kk.A02 * 16.0f);
    public static final int A06 = (int) (Kk.A02 * 8.0f);
    public static final int A05 = (int) (Kk.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0660Oe(com.facebook.ads.redexgen.X.C0658Oc r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Xc r0 = com.facebook.ads.redexgen.X.C0658Oc.A04(r7)
            r6.<init>(r0)
            com.facebook.ads.redexgen.X.Xc r0 = com.facebook.ads.redexgen.X.C0658Oc.A04(r7)
            r6.A02 = r0
            com.facebook.ads.redexgen.X.Xc r1 = r6.A02
            com.facebook.ads.redexgen.X.NU r0 = new com.facebook.ads.redexgen.X.NU
            r0.<init>(r1)
            r6.A03 = r0
            com.facebook.ads.redexgen.X.Na r0 = new com.facebook.ads.redexgen.X.Na
            com.facebook.ads.redexgen.X.Xc r1 = r6.A02
            com.facebook.ads.redexgen.X.1L r2 = com.facebook.ads.redexgen.X.C0658Oc.A02(r7)
            r3 = 1
            r4 = 0
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A04 = r0
            int r0 = com.facebook.ads.redexgen.X.C0658Oc.A00(r7)
            r6.A01 = r0
            r6.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0660Oe.<init>(com.facebook.ads.redexgen.X.Oc):void");
    }

    public /* synthetic */ C0660Oe(C0658Oc c0658Oc, C0744Rl c0744Rl) {
        this(c0658Oc);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C0658Oc c0658Oc) {
        String str;
        String str2;
        String str3;
        str = c0658Oc.A03;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i = A08;
            linearLayout.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            LL.A0X(textView, false, 16);
            str2 = c0658Oc.A03;
            textView.setText(str2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            AsyncTaskC0764Sf A04 = new AsyncTaskC0764Sf(imageView, this.A02).A04();
            str3 = c0658Oc.A02;
            A04.A07(str3);
            int i2 = A07;
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(i2, i2);
            informativeTextViewParams.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, informativeTextViewParams);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            LL.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(C0658Oc c0658Oc) {
        C1J c1j;
        C1V c1v;
        C1J c1j2;
        C1V c1v2;
        LL.A0M(this.A03, 0);
        this.A03.setRadius(50);
        c1j = c0658Oc.A04;
        if (c1j.A00() == C1H.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        AsyncTaskC0764Sf A04 = new AsyncTaskC0764Sf(this.A03, this.A02).A04();
        c1v = c0658Oc.A05;
        A04.A07(c1v.A01());
        C0630Na c0630Na = this.A04;
        c1j2 = c0658Oc.A04;
        String A062 = c1j2.A06();
        c1v2 = c0658Oc.A05;
        c0630Na.A03(A062, c1v2.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        LinearLayout.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i2, i2);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(c0658Oc);
        LL.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC0659Od interfaceC0659Od) {
        A00();
        postDelayed(new C0744Rl(this, interfaceC0659Od), this.A01);
    }
}
