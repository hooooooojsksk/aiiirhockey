package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBannerListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridge;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedListener;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends MarketplaceBridge {
    public final com.fyber.marketplace.fairbid.impl.b b = new com.fyber.marketplace.fairbid.impl.b(new com.fyber.inneractive.sdk.serverapi.b(s.b()));
    public boolean c = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ MarketplaceOnUserAgentAvailableListener a;

        public a(f fVar, MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
            this.a = marketplaceOnUserAgentAvailableListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAConfigManager iAConfigManager;
            int i = 0;
            while (true) {
                iAConfigManager = IAConfigManager.M;
                if (iAConfigManager.y.c.compareAndSet(true, true) || i >= 100) {
                    break;
                }
                IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
                i++;
            }
            String a = iAConfigManager.y.a();
            if (a.isEmpty()) {
                return;
            }
            IAlog.a("UserAgentAvailable", new Object[0]);
            this.a.onUserAgentAvailable(a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements IAConfigManager.OnConfigurationReadyAndValidListener {
        public final /* synthetic */ MarketplaceBridgeAd a;
        public final /* synthetic */ MarketplaceAdLoadListener b;

        public b(f fVar, MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener marketplaceAdLoadListener) {
            this.a = marketplaceBridgeAd;
            this.b = marketplaceAdLoadListener;
        }

        @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
            IAConfigManager.removeListener(this);
            if (IAConfigManager.j()) {
                this.a.load();
                return;
            }
            MarketplaceAdLoadListener marketplaceAdLoadListener = this.b;
            if (marketplaceAdLoadListener != null) {
                marketplaceAdLoadListener.onAdLoadFailed(MarketplaceAdLoadError.FMP_NOT_READY_TO_LOAD_ADS);
            }
        }
    }

    public void a(MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        IAConfigManager.addListener(new b(this, marketplaceBridgeAd, marketplaceAdLoadListener));
        IAConfigManager.a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public MarketplaceAuctionParameters getAuctionParameters(String str) {
        com.fyber.marketplace.fairbid.impl.b bVar = this.b;
        bVar.d = str;
        return bVar;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public boolean isMuted() {
        return this.c;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public void loadBannerAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceBannerListener marketplaceBannerListener) {
        IAlog.a("Request Banner with spotId = %s", str);
        d dVar = new d(str, jSONObject, map, this.c, marketplaceBannerListener, this.b);
        com.fyber.marketplace.fairbid.impl.b bVar = this.b;
        com.fyber.inneractive.sdk.dv.g gVar = bVar.b.get(bVar.d);
        bVar.b.remove(bVar.d);
        if (gVar != null) {
            dVar.setQueryInfo(gVar);
        }
        a(dVar, marketplaceBannerListener);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public void loadInterstitialAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceInterstitialListener marketplaceInterstitialListener) {
        IAlog.a("Request Interstitial with spotId = %s", str);
        a(new h(str, jSONObject, map, this.c, marketplaceInterstitialListener, this.b), marketplaceInterstitialListener);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public void loadRewardedAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceRewardedListener marketplaceRewardedListener) {
        IAlog.a("Request Interstitial with spotId = %s", str);
        a(new i(str, jSONObject, map, marketplaceRewardedListener, this.b), marketplaceRewardedListener);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        m.a(new a(this, marketplaceOnUserAgentAvailableListener));
        return IAConfigManager.M.y.a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public void setMuted(boolean z) {
        this.c = z;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public MarketplaceAuctionParameters getAuctionParameters() {
        com.fyber.marketplace.fairbid.impl.b bVar = this.b;
        bVar.d = "";
        return bVar;
    }
}
