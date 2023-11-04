package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public class FyberRewardedVideoRenderer implements MediationRewardedAd {
    private final MediationRewardedAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    private MediationRewardedAdCallback rewardedAdCallback;
    private InneractiveAdSpot rewardedSpot;
    private InneractiveFullscreenUnitController unitController;

    public FyberRewardedVideoRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
    }

    public void render() {
        String string = this.adConfiguration.getServerParameters().getString("spotId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Spot ID is null or empty.", FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.TAG, adError.getMessage());
            this.adLoadCallback.onFailure(adError);
            return;
        }
        InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
        this.rewardedSpot = createSpot;
        createSpot.setMediationName(InneractiveMediationName.ADMOB);
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        this.unitController = inneractiveFullscreenUnitController;
        this.rewardedSpot.addUnitController(inneractiveFullscreenUnitController);
        this.rewardedSpot.setRequestListener(createRequestListener());
        FyberAdapterUtils.updateFyberExtraParams(this.adConfiguration.getMediationExtras());
        this.rewardedSpot.requestAd(new InneractiveAdRequest(string));
    }

    private InneractiveAdSpot.RequestListener createRequestListener() {
        return new InneractiveAdSpot.RequestListener() { // from class: com.google.ads.mediation.fyber.FyberRewardedVideoRenderer.1
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                FyberRewardedVideoRenderer fyberRewardedVideoRenderer = FyberRewardedVideoRenderer.this;
                fyberRewardedVideoRenderer.rewardedAdCallback = (MediationRewardedAdCallback) fyberRewardedVideoRenderer.adLoadCallback.onSuccess(FyberRewardedVideoRenderer.this);
                FyberRewardedVideoRenderer fyberRewardedVideoRenderer2 = FyberRewardedVideoRenderer.this;
                fyberRewardedVideoRenderer2.registerFyberAdListener(fyberRewardedVideoRenderer2.unitController);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                AdError adError = FyberAdapterUtils.getAdError(inneractiveErrorCode);
                Log.w(FyberMediationAdapter.TAG, adError.getMessage());
                FyberRewardedVideoRenderer.this.adLoadCallback.onFailure(adError);
            }
        };
    }

    public void registerFyberAdListener(final InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        InneractiveFullscreenAdEventsListenerAdapter inneractiveFullscreenAdEventsListenerAdapter = new InneractiveFullscreenAdEventsListenerAdapter() { // from class: com.google.ads.mediation.fyber.FyberRewardedVideoRenderer.2
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
                FyberRewardedVideoRenderer.this.rewardedAdCallback.onAdOpened();
                if (FyberRewardedVideoRenderer.this.isVideoAdAvailable(inneractiveFullscreenUnitController)) {
                    FyberRewardedVideoRenderer.this.rewardedAdCallback.onVideoStart();
                }
                FyberRewardedVideoRenderer.this.rewardedAdCallback.reportAdImpression();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                FyberRewardedVideoRenderer.this.rewardedAdCallback.reportAdClicked();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
                FyberRewardedVideoRenderer.this.rewardedAdCallback.onAdClosed();
            }
        };
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        inneractiveFullscreenUnitController.setEventsListener(inneractiveFullscreenAdEventsListenerAdapter);
        inneractiveFullscreenUnitController.setRewardedListener(new InneractiveFullScreenAdRewardedListener() { // from class: com.google.ads.mediation.fyber.FyberRewardedVideoRenderer.3
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
            public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
                FyberRewardedVideoRenderer.this.rewardedAdCallback.onUserEarnedReward(RewardItem.DEFAULT_REWARD);
                FyberRewardedVideoRenderer.this.rewardedAdCallback.onVideoComplete();
            }
        });
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.TAG, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.rewardedSpot;
        if (inneractiveAdSpot != null && this.unitController != null && inneractiveAdSpot.isReady()) {
            this.unitController.show((Activity) context);
        } else if (this.rewardedAdCallback != null) {
            AdError adError2 = new AdError(106, "DT Exchange's rewarded spot is not ready.", FyberMediationAdapter.ERROR_DOMAIN);
            Log.w(FyberMediationAdapter.TAG, adError2.getMessage());
            this.rewardedAdCallback.onAdFailedToShow(adError2);
        }
    }

    public boolean isVideoAdAvailable(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        return (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) ? false : true;
    }
}
