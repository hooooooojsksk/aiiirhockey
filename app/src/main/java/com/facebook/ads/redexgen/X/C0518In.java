package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* renamed from: com.facebook.ads.redexgen.X.In */
/* loaded from: assets/audience_network.dex */
public final class C0518In implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    @Nullable
    public String A00;
    public final C5A A01;

    public C0518In(C5A c5a) {
        this.A01 = c5a;
    }

    @Nullable
    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
