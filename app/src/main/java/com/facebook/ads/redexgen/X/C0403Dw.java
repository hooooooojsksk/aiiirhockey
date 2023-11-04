package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Dw */
/* loaded from: assets/audience_network.dex */
public final class C0403Dw extends Y5 {
    public P9 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(NativeAdLayout nativeAdLayout, C0887Xc c0887Xc, NativeAd nativeAd, J0 j0) {
        NU nu = new NU(c0887Xc);
        MediaView mediaView = new MediaView(c0887Xc);
        AdOptionsView adOptionsView = new AdOptionsView(c0887Xc, nativeAd, nativeAdLayout);
        j0.A09(adOptionsView, 28);
        this.A00 = new RG(c0887Xc, nativeAd, j0, C0799Tp.A0L(nativeAd.getInternalNativeAd()).A17(), nu, mediaView, adOptionsView);
        LL.A0M(nativeAdLayout, j0.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, nu, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
