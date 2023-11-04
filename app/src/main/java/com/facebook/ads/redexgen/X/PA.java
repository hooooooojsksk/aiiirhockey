package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* loaded from: assets/audience_network.dex */
public final class PA extends LinearLayout {
    public static final int A00 = (int) (Kk.A02 * 32.0f);
    public static final int A01 = (int) (Kk.A02 * 8.0f);

    public PA(C0887Xc c0887Xc, NativeAd nativeAd, J0 j0, NU nu, AdOptionsView adOptionsView) {
        super(c0887Xc);
        setOrientation(0);
        nu.setFullCircleCorners(true);
        int i = A00;
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(i, i);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(nu, iconViewParams);
        TextView textView = new TextView(c0887Xc);
        j0.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c0887Xc);
        j0.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c0887Xc);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        LinearLayout.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
