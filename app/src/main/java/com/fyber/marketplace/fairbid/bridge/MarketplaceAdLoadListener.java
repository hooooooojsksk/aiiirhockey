package com.fyber.marketplace.fairbid.bridge;

import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;

/* loaded from: classes.dex */
public interface MarketplaceAdLoadListener<T extends MarketplaceBridgeAd> {
    void onAdLoadFailed(MarketplaceAdLoadError marketplaceAdLoadError);

    void onAdLoaded(T t);
}
