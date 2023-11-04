package com.fyber.marketplace.fairbid.impl;

import android.app.Activity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdShowError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenDisplayEventsListener;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class g<T extends MarketplaceFullscreenDisplayEventsListener> extends a implements MarketplaceFullscreenAd<T>, InneractiveFullscreenAdEventsListener {
    public final InneractiveFullscreenUnitController mController;
    public T mEventsListener;
    private final MarketplaceAdLoadListener<MarketplaceFullscreenAd<T>> mLoadListener;

    public g(String str, JSONObject jSONObject, Map<String, String> map, boolean z, MarketplaceAdLoadListener<MarketplaceFullscreenAd<T>> marketplaceAdLoadListener, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, z, marketplaceAuctionParameters);
        this.mLoadListener = marketplaceAdLoadListener;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        this.mController = inneractiveFullscreenUnitController;
        inneractiveFullscreenUnitController.setEventsListener(this);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd
    public void destroy() {
        InneractiveAdSpot adSpot;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.mController;
        if (inneractiveFullscreenUnitController == null || (adSpot = inneractiveFullscreenUnitController.getAdSpot()) == null) {
            return;
        }
        adSpot.destroy();
    }

    @Override // com.fyber.marketplace.fairbid.impl.a
    public void internalOnAdLoaded(a aVar, e eVar) {
        if (this.mController != null && eVar != null) {
            InneractiveAdSpotManager.get().bindSpot(eVar);
            this.mController.setAdSpot(eVar);
        }
        MarketplaceAdLoadListener<MarketplaceFullscreenAd<T>> marketplaceAdLoadListener = this.mLoadListener;
        if (marketplaceAdLoadListener != null) {
            marketplaceAdLoadListener.onAdLoaded(this);
        }
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd
    public boolean isAvailable() {
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.mController;
        return inneractiveFullscreenUnitController != null && inneractiveFullscreenUnitController.isAvailable();
    }

    @Override // com.fyber.marketplace.fairbid.impl.a
    public boolean isFullscreen() {
        return true;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd
    public void load() {
        loadAd(this.mController, this.mLoadListener);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        T t = this.mEventsListener;
        if (t != null) {
            t.onClick();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        T t = this.mEventsListener;
        if (t != null) {
            t.onClose();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        T t = this.mEventsListener;
        if (t != null) {
            t.onShow();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd
    public void show(Activity activity, T t) {
        if (this.mController == null) {
            if (t != null) {
                t.onShowError(MarketplaceAdShowError.GENERIC_SHOW_ERROR);
                return;
            }
            return;
        }
        this.mEventsListener = t;
        if (this.adSpot.isReady()) {
            this.mController.show(activity);
        } else {
            t.onShowError(MarketplaceAdShowError.EXPIRED_AD_ERROR);
        }
    }
}
