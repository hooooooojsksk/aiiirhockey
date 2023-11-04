package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5W */
/* loaded from: assets/audience_network.dex */
public final class C5W implements NativeAdsManagerApi {
    public static final String A0A = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public ZU A02;
    public String A03;
    public final int A06;
    public final C0887Xc A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    @SuppressLint({"CatchGeneralException"})
    public C5W(Context context, String str, int i) {
        this.A07 = C5M.A02(context);
        this.A08 = str;
        this.A06 = Math.max(i, 0);
        this.A09 = new ArrayList(i);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final ZU A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i) {
        this.A00 = i;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z) {
        this.A04 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        ZU zu = this.A02;
        if (zu != null) {
            zu.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        JF jf = JF.A05;
        int i = this.A06;
        ZU zu = this.A02;
        this.A02 = new ZU(this.A07, this.A08, jf, null, i);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new C0910Xz(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    @Nullable
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    @Nullable
    public final NativeAd nextNativeAd(@Nullable NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i = this.A00;
        this.A00 = i + 1;
        List<NativeAd> list = this.A09;
        int pos = list.size();
        NativeAd nativeAd = list.get(i % pos);
        if (nativeAdListener != null) {
            ((C0799Tp) nativeAd.getInternalNativeAd()).A1R(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i >= pos2) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
