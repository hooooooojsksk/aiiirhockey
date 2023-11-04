package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedInterstitialAd;

/* renamed from: com.facebook.ads.redexgen.X.5g */
/* loaded from: assets/audience_network.dex */
public final class C02085g implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C02115j A00;

    public C02085g(C02115j c02115j) {
        this.A00 = c02115j;
    }

    public final C02115j A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i) {
        this.A00.withAppOrientation(i);
        return this;
    }
}
