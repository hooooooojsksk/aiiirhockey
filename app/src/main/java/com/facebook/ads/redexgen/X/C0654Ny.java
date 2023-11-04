package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ny */
/* loaded from: assets/audience_network.dex */
public final class C0654Ny extends RelativeLayout {
    public final View A00;
    public final NV A01;

    public C0654Ny(C0887Xc c0887Xc, View view) {
        super(c0887Xc);
        this.A00 = view;
        this.A01 = new NV(c0887Xc);
        LL.A0K(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(@Nullable C0630Na c0630Na, boolean z) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c0630Na != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c0630Na.setAlignment(3);
                layoutParams2.setMargins(AbstractC0638Ni.A07 / 2, AbstractC0638Ni.A07 / 2, AbstractC0638Ni.A07 / 2, AbstractC0638Ni.A07 / 2);
                linearLayout.addView(c0630Na, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                LL.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, AbstractC0638Ni.A07, 0, 0);
                c0630Na.setAlignment(17);
                addView(c0630Na, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
