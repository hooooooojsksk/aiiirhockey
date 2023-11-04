package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class RH extends LinearLayout implements P9 {
    public final NativeBannerAd A00;
    public final C0887Xc A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (Kk.A02 * 42.0f);
    public static final int A03 = (int) (Kk.A02 * 48.0f);
    public static final int A05 = (int) (Kk.A02 * 54.0f);
    public static final int A07 = (int) (Kk.A02 * 4.0f);
    public static final int A06 = (int) (Kk.A02 * 8.0f);

    public RH(C0887Xc c0887Xc, NativeBannerAd nativeBannerAd, J0 j0, J1 j1, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c0887Xc);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams ctaButtonParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c0887Xc;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(j1);
        NV nv = new NV(this.A01);
        nv.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        nv.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(nv, layoutParams2);
        P6 p6 = new P6(c0887Xc, this.A00, j1, j0, adOptionsView);
        p6.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(p6, layoutParams3);
        if (j1 == J1.A0A) {
            int i = A07;
            setPadding(i, i, i, i);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int i2 = A06;
            setPadding(i2, i2, i2, i2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int i3 = A06;
        int i4 = A07;
        textView.setPadding(i3, i4, i3, i4);
        j0.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(J1 j1) {
        int i = P7.A00[j1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return A05;
            }
            return A03;
        }
        return A04;
    }

    @Override // com.facebook.ads.redexgen.X.P9
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P9
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.P9
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
