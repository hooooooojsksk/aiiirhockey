package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* loaded from: assets/audience_network.dex */
public final class E6 extends Y5 {
    public P9 A00;

    public final void A04(C0887Xc c0887Xc, NativeBannerAd nativeBannerAd, J0 j0, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        j0.A09(adOptionsView, 20);
        this.A00 = new RH(c0887Xc, nativeBannerAd, j0, C0799Tp.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        LL.A0M(nativeAdLayout, j0.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
