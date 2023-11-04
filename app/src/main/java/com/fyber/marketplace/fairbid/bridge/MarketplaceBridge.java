package com.fyber.marketplace.fairbid.bridge;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.impl.f;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class MarketplaceBridge {
    public static final MarketplaceBridge a = new f();

    public static void currentAudienceAppliesCoppa() {
        InneractiveAdManager.currentAudienceAppliesToCoppa();
    }

    public static void currentAudienceIsAChild() {
        InneractiveAdManager.currentAudienceIsAChild();
    }

    public static String getVersion() {
        return InneractiveAdManager.getVersion();
    }

    public static MarketplaceBridge initialize(Context context, String str, String str2, boolean z) {
        InneractiveAdManager.initialize(context, str);
        IAConfigManager.M.t = str2;
        IAlog.a = z ? 2 : 5;
        return a;
    }

    public static boolean isChild() {
        return InneractiveAdManager.isCurrentUserAChild();
    }

    public abstract MarketplaceAuctionParameters getAuctionParameters();

    public abstract MarketplaceAuctionParameters getAuctionParameters(String str);

    public abstract boolean isMuted();

    public abstract void loadBannerAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceBannerListener marketplaceBannerListener);

    public abstract void loadInterstitialAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceInterstitialListener marketplaceInterstitialListener);

    public abstract void loadRewardedAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceRewardedListener marketplaceRewardedListener);

    public abstract String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener);

    public abstract void setMuted(boolean z);
}
