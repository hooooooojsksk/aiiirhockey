package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class FyberMediationAdapter extends Adapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    public static final int ERROR_AD_NOT_READY = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 103;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY_INSTANCE = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.dtexchange";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_WRONG_CONTROLLER_TYPE = 105;
    private static final String KEY_APP_ID = "applicationId";
    static final String KEY_MUTE_VIDEO = "muteVideo";
    static final String KEY_SPOT_ID = "spotId";
    private static final InneractiveMediationName MEDIATOR_NAME = InneractiveMediationName.ADMOB;
    static final String TAG = "FyberMediationAdapter";
    private InneractiveAdSpot bannerSpot;
    private ViewGroup bannerWrapperView;
    private WeakReference<Activity> interstitialActivityRef;
    private InneractiveAdSpot interstitialSpot;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;
    private AdSize requestedAdSize;
    private FyberRewardedVideoRenderer rewardedRenderer;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(final MediationRewardedAdConfiguration mediationRewardedAdConfiguration, final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.1
            @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
            public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                    AdError adError2 = FyberAdapterUtils.getAdError(fyberInitStatus);
                    Log.w(FyberMediationAdapter.TAG, adError2.getMessage());
                    mediationAdLoadCallback.onFailure(adError2);
                    return;
                }
                FyberMediationAdapter.this.rewardedRenderer = new FyberRewardedVideoRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback);
                FyberMediationAdapter.this.rewardedRenderer.render();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (InneractiveAdManager.wasInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString(KEY_APP_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (hashSet.size() > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", KEY_APP_ID, hashSet, str));
        }
        InneractiveAdManager.initialize(context, str, new OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.2
            @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
            public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                    AdError adError2 = FyberAdapterUtils.getAdError(fyberInitStatus);
                    Log.w(FyberMediationAdapter.TAG, adError2.getMessage());
                    initializationCompleteCallback.onInitializationFailed(adError2.getMessage());
                    return;
                }
                initializationCompleteCallback.onInitializationSucceeded();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String version = InneractiveAdManager.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final Context context, MediationBannerListener mediationBannerListener, final Bundle bundle, final AdSize adSize, MediationAdRequest mediationAdRequest, final Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString(KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            this.mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        InneractiveAdManager.initialize(context, string, new OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.3
            @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
            public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                    AdError adError2 = FyberAdapterUtils.getAdError(fyberInitStatus);
                    Log.w(FyberMediationAdapter.TAG, adError2.getMessage());
                    FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
                    return;
                }
                String string2 = bundle.getString("spotId");
                if (TextUtils.isEmpty(string2)) {
                    AdError adError3 = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", FyberMediationAdapter.ERROR_DOMAIN);
                    Log.w(FyberMediationAdapter.TAG, adError3.getMessage());
                    FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(FyberMediationAdapter.this, adError3);
                    return;
                }
                FyberMediationAdapter.this.bannerSpot = InneractiveAdSpotManager.get().createSpot();
                FyberMediationAdapter.this.bannerSpot.setMediationName(FyberMediationAdapter.MEDIATOR_NAME);
                FyberMediationAdapter.this.bannerSpot.addUnitController(new InneractiveAdViewUnitController());
                FyberMediationAdapter.this.bannerWrapperView = new RelativeLayout(context);
                FyberMediationAdapter.this.bannerSpot.setRequestListener(FyberMediationAdapter.this.createFyberBannerAdListener());
                FyberMediationAdapter.this.requestedAdSize = adSize;
                FyberAdapterUtils.updateFyberExtraParams(bundle2);
                FyberMediationAdapter.this.bannerSpot.requestAd(new InneractiveAdRequest(string2));
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.bannerWrapperView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.bannerSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.bannerSpot = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.interstitialSpot;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.interstitialSpot = null;
        }
        WeakReference<Activity> weakReference = this.interstitialActivityRef;
        if (weakReference != null) {
            weakReference.clear();
            this.interstitialActivityRef = null;
        }
    }

    public InneractiveAdSpot.RequestListener createFyberBannerAdListener() {
        return new InneractiveAdSpot.RequestListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.4
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                if (!(FyberMediationAdapter.this.bannerSpot.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
                    AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.bannerSpot.getSelectedUnitController().getClass().getName()), FyberMediationAdapter.ERROR_DOMAIN);
                    Log.w(FyberMediationAdapter.TAG, adError.getMessage());
                    FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                    FyberMediationAdapter.this.bannerSpot.destroy();
                }
                InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) FyberMediationAdapter.this.bannerSpot.getSelectedUnitController();
                inneractiveAdViewUnitController.setEventsListener(FyberMediationAdapter.this.createFyberAdViewListener());
                inneractiveAdViewUnitController.bindView(FyberMediationAdapter.this.bannerWrapperView);
                Context context = FyberMediationAdapter.this.bannerWrapperView.getContext();
                float f = context.getResources().getDisplayMetrics().density;
                int round = Math.round(inneractiveAdViewUnitController.getAdContentWidth() / f);
                int round2 = Math.round(inneractiveAdViewUnitController.getAdContentHeight() / f);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AdSize(round, round2));
                if (MediationUtils.findClosestSize(context, FyberMediationAdapter.this.requestedAdSize, arrayList) != null) {
                    FyberMediationAdapter.this.mediationBannerListener.onAdLoaded(FyberMediationAdapter.this);
                    return;
                }
                AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Integer.valueOf(Math.round(FyberMediationAdapter.this.requestedAdSize.getWidthInPixels(context) / f)), Integer.valueOf(Math.round(FyberMediationAdapter.this.requestedAdSize.getHeightInPixels(context) / f)), Integer.valueOf(round), Integer.valueOf(round2)), FyberMediationAdapter.ERROR_DOMAIN);
                Log.w(FyberMediationAdapter.TAG, adError2.getMessage());
                FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                AdError adError = FyberAdapterUtils.getAdError(inneractiveErrorCode);
                Log.w(FyberMediationAdapter.TAG, adError.getMessage());
                FyberMediationAdapter.this.mediationBannerListener.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                if (inneractiveAdSpot != null) {
                    inneractiveAdSpot.destroy();
                }
            }
        };
    }

    public InneractiveAdViewEventsListener createFyberAdViewListener() {
        return new InneractiveAdViewEventsListenerAdapter() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.5
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationBannerListener.onAdClicked(FyberMediationAdapter.this);
                FyberMediationAdapter.this.mediationBannerListener.onAdOpened(FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationBannerListener.onAdClosed(FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationBannerListener.onAdLeftApplication(FyberMediationAdapter.this);
            }
        };
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(final Context context, MediationInterstitialListener mediationInterstitialListener, final Bundle bundle, MediationAdRequest mediationAdRequest, final Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString(KEY_APP_ID);
        AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
        if (TextUtils.isEmpty(string)) {
            Log.w(TAG, adError.getMessage());
            this.mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        InneractiveAdManager.initialize(context, string, new OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.6
            @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
            public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                    AdError adError2 = FyberAdapterUtils.getAdError(fyberInitStatus);
                    Log.w(FyberMediationAdapter.TAG, adError2.getMessage());
                    FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
                    return;
                }
                String string2 = bundle.getString("spotId");
                if (TextUtils.isEmpty(string2)) {
                    AdError adError3 = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", FyberMediationAdapter.ERROR_DOMAIN);
                    Log.w(FyberMediationAdapter.TAG, adError3.getMessage());
                    FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(FyberMediationAdapter.this, adError3);
                } else if (!(context instanceof Activity)) {
                    AdError adError4 = new AdError(107, "Cannot request an interstitial ad without an activity context.", FyberMediationAdapter.ERROR_DOMAIN);
                    Log.w(FyberMediationAdapter.TAG, adError4.getMessage());
                    if (FyberMediationAdapter.this.mediationInterstitialListener != null) {
                        FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(FyberMediationAdapter.this, adError4);
                    }
                } else {
                    FyberMediationAdapter.this.interstitialActivityRef = new WeakReference((Activity) context);
                    FyberMediationAdapter.this.interstitialSpot = InneractiveAdSpotManager.get().createSpot();
                    FyberMediationAdapter.this.interstitialSpot.setMediationName(FyberMediationAdapter.MEDIATOR_NAME);
                    FyberMediationAdapter.this.interstitialSpot.addUnitController(new InneractiveFullscreenUnitController());
                    FyberMediationAdapter.this.interstitialSpot.setRequestListener(FyberMediationAdapter.this.createFyberInterstitialAdListener());
                    FyberAdapterUtils.updateFyberExtraParams(bundle2);
                    FyberMediationAdapter.this.interstitialSpot.requestAd(new InneractiveAdRequest(string2));
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.interstitialActivityRef;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            Log.w(TAG, "showInterstitial called, but activity reference was lost.");
            this.mediationInterstitialListener.onAdOpened(this);
            this.mediationInterstitialListener.onAdClosed(this);
        } else if (!(this.interstitialSpot.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
            Log.w(TAG, "showInterstitial called, but wrong spot has been used (should not happen).");
            this.mediationInterstitialListener.onAdOpened(this);
            this.mediationInterstitialListener.onAdClosed(this);
        } else {
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) this.interstitialSpot.getSelectedUnitController();
            if (!this.interstitialSpot.isReady()) {
                Log.w(TAG, "showInterstitial called, but Ad has expired.");
                this.mediationInterstitialListener.onAdOpened(this);
                this.mediationInterstitialListener.onAdClosed(this);
                return;
            }
            inneractiveFullscreenUnitController.show(activity);
        }
    }

    public InneractiveAdSpot.RequestListener createFyberInterstitialAdListener() {
        return new InneractiveAdSpot.RequestListener() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.7
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                if (!(FyberMediationAdapter.this.interstitialSpot.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                    AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.bannerSpot.getSelectedUnitController().getClass().getName()), FyberMediationAdapter.ERROR_DOMAIN);
                    Log.w(FyberMediationAdapter.TAG, adError.getMessage());
                    FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                    FyberMediationAdapter.this.interstitialSpot.destroy();
                }
                ((InneractiveFullscreenUnitController) FyberMediationAdapter.this.interstitialSpot.getSelectedUnitController()).setEventsListener(FyberMediationAdapter.this.createFyberInterstitialListener());
                FyberMediationAdapter.this.mediationInterstitialListener.onAdLoaded(FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                AdError adError = FyberAdapterUtils.getAdError(inneractiveErrorCode);
                Log.w(FyberMediationAdapter.TAG, adError.getMessage());
                FyberMediationAdapter.this.mediationInterstitialListener.onAdFailedToLoad(FyberMediationAdapter.this, adError);
            }
        };
    }

    public InneractiveFullscreenAdEventsListener createFyberInterstitialListener() {
        return new InneractiveFullscreenAdEventsListenerAdapter() { // from class: com.google.ads.mediation.fyber.FyberMediationAdapter.8
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationInterstitialListener.onAdOpened(FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationInterstitialListener.onAdClicked(FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationInterstitialListener.onAdClosed(FyberMediationAdapter.this);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
                FyberMediationAdapter.this.mediationInterstitialListener.onAdLeftApplication(FyberMediationAdapter.this);
            }
        };
    }
}
