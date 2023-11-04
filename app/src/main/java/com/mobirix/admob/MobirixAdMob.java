package com.mobirix.admob;

import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.mobirix.airhockey.airhockey;

/* loaded from: classes2.dex */
public class MobirixAdMob {
    protected airhockey mAct;
    private String mBannerAdmobUnitId;
    private int mBannerGrivity;
    private AdSize mBannerSize;
    private int mBannerdesignHeight;
    private int mBannerlimitHeight;
    private String mFullAdmobUnitId;
    private String mMiddleAdmobUnitId;
    private int mMiddleGrivity;
    private AdSize mMiddleSize;
    private String mRewardAdmobUnitId;
    public final int eAdMob_FacebookEvent_Banner = 0;
    public final int eAdMob_FacebookEvent_MidBanner = 1;
    public final int eAdMob_FacebookEvent_Interstitial = 2;
    public final int eAdMob_FacebookEvent_Reward = 3;
    private int mRequestCount = 0;
    private boolean mbMiddleLoaded = false;
    private boolean bInterAdReady = false;
    private boolean bRewardDone = false;
    private AdView mAdview = null;
    private AdView mAdmiddleview = null;
    private InterstitialAd mFullview = null;
    private RewardedAd mRewardedAd = null;
    private adReawrdListenerCallback adListenerReward = null;

    /* loaded from: classes2.dex */
    public interface adReawrdListenerCallback {
        void onRewarded(int i);

        void onRewardedVideoAdLoaded();
    }

    public AdView getBannerAd() {
        return this.mAdview;
    }

    public AdView getMiddleAd() {
        return this.mAdmiddleview;
    }

    public InterstitialAd getFullAd() {
        return this.mFullview;
    }

    public RewardedAd getRewardAd() {
        return this.mRewardedAd;
    }

    public MobirixAdMob(airhockey airhockeyVar) {
        this.mAct = airhockeyVar;
    }

    public void createBannerAd(AdSize adSize, int i, String str, int i2, int i3) {
        if (this.mAct == null) {
            return;
        }
        this.mAdview = null;
        this.mBannerSize = adSize;
        this.mBannerGrivity = i;
        this.mBannerAdmobUnitId = str;
        this.mBannerlimitHeight = i2;
        this.mBannerdesignHeight = i3;
        createBannerAdmob();
    }

    protected void createBannerAdmob() {
        this.mAdview = null;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, this.mBannerGrivity);
        try {
            AdSize bannerAdSize = getBannerAdSize(this.mBannerlimitHeight, this.mBannerdesignHeight);
            if (bannerAdSize == null) {
                int bannerType = getBannerType(this.mBannerSize, this.mBannerlimitHeight, this.mBannerdesignHeight);
                if (bannerType == 1) {
                    bannerAdSize = AdSize.SMART_BANNER;
                } else if (bannerType == 2) {
                    bannerAdSize = AdSize.BANNER;
                } else {
                    this.mAdview = null;
                    return;
                }
            }
            AdView adView = new AdView(this.mAct);
            this.mAdview = adView;
            adView.setAdSize(bannerAdSize);
            this.mAdview.setAdUnitId(this.mBannerAdmobUnitId);
            this.mAct.addContentView(this.mAdview, layoutParams);
            this.mAdview.loadAd(getAdRequest());
            this.mAdview.setVisibility(0);
            this.mAdview.setVisibility(8);
            this.mAdview.setAdListener(new AdListener() { // from class: com.mobirix.admob.MobirixAdMob.1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    MobirixAdMob.this.mAdview.bringToFront();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    super.onAdOpened();
                }
            });
        } catch (Exception unused) {
            AdView adView2 = this.mAdview;
            if (adView2 != null) {
                adView2.destroy();
                this.mAdview = null;
            }
        }
    }

    public void createMiddleAd(AdSize adSize, int i, String str) {
        if (this.mAct == null) {
            return;
        }
        this.mAdmiddleview = null;
        this.mMiddleSize = adSize;
        this.mMiddleGrivity = i;
        this.mMiddleAdmobUnitId = str;
        this.mRequestCount = 0;
        this.mbMiddleLoaded = false;
        createMiddleAdmob();
    }

    protected void createMiddleAdmob() {
        this.mAdmiddleview = null;
        this.mRequestCount = 0;
        this.mbMiddleLoaded = false;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, this.mMiddleGrivity);
        try {
            AdView adView = new AdView(this.mAct);
            this.mAdmiddleview = adView;
            adView.setAdSize(this.mMiddleSize);
            this.mAdmiddleview.setAdUnitId(this.mMiddleAdmobUnitId);
            this.mAct.addContentView(this.mAdmiddleview, layoutParams);
            this.mAdmiddleview.loadAd(getAdRequest());
            this.mAdmiddleview.setVisibility(0);
            this.mAdmiddleview.setVisibility(8);
            this.mAdmiddleview.setAdListener(new AdListener() { // from class: com.mobirix.admob.MobirixAdMob.2
                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    MobirixAdMob.this.mbMiddleLoaded = true;
                    MobirixAdMob.this.mAdmiddleview.bringToFront();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    super.onAdOpened();
                }
            });
            this.mAdmiddleview.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.mobirix.admob.MobirixAdMob.3
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public void onPaidEvent(AdValue adValue) {
                }
            });
        } catch (Exception unused) {
            AdView adView2 = this.mAdmiddleview;
            if (adView2 != null) {
                adView2.destroy();
                this.mAdmiddleview = null;
            }
        }
    }

    public void createFullAd(String str) {
        if (this.mAct == null) {
            return;
        }
        this.mFullview = null;
        this.mFullAdmobUnitId = str;
        this.bInterAdReady = false;
        createFullAdmob();
    }

    protected void createFullAdmob() {
        if (this.bInterAdReady) {
            return;
        }
        this.bInterAdReady = false;
        try {
            InterstitialAd.load(this.mAct, this.mFullAdmobUnitId, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.mobirix.admob.MobirixAdMob.4
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    MobirixAdMob.this.mFullview = interstitialAd;
                    MobirixAdMob.this.bInterAdReady = true;
                    MobirixAdMob.this.mFullview.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.mobirix.admob.MobirixAdMob.4.1
                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            MobirixAdMob.this.createFullAdmob();
                            airhockey airhockeyVar = MobirixAdMob.this.mAct;
                            airhockey.my_debug("The ad was dismissed.");
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            MobirixAdMob.this.mFullview = null;
                            airhockey airhockeyVar = MobirixAdMob.this.mAct;
                            airhockey.my_debug("The ad failed to show.");
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            MobirixAdMob.this.bInterAdReady = false;
                            airhockey airhockeyVar = MobirixAdMob.this.mAct;
                            airhockey.my_debug("The ad was shown.");
                        }
                    });
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    MobirixAdMob.this.mFullview = null;
                    MobirixAdMob.this.bInterAdReady = false;
                }
            });
        } catch (Exception unused) {
            this.mFullview = null;
        }
    }

    public void bannerOnlyView(final boolean z) {
        airhockey airhockeyVar = this.mAct;
        if (airhockeyVar != null) {
            airhockeyVar.runOnUiThread(new Runnable() { // from class: com.mobirix.admob.MobirixAdMob.5
                @Override // java.lang.Runnable
                public void run() {
                    if (MobirixAdMob.this.mAdview != null) {
                        if (z) {
                            MobirixAdMob.this.mAdview.setVisibility(0);
                            if (MobirixAdMob.this.mAdmiddleview != null) {
                                MobirixAdMob.this.mAdmiddleview.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        MobirixAdMob.this.mAdview.setVisibility(8);
                    }
                }
            });
        }
    }

    public void middleOnlyView(final boolean z) {
        airhockey airhockeyVar = this.mAct;
        if (airhockeyVar != null) {
            airhockeyVar.runOnUiThread(new Runnable() { // from class: com.mobirix.admob.MobirixAdMob.6
                @Override // java.lang.Runnable
                public void run() {
                    if (MobirixAdMob.this.mAdmiddleview != null) {
                        if (z) {
                            if (!MobirixAdMob.this.mbMiddleLoaded && MobirixAdMob.this.mRequestCount == 0) {
                                MobirixAdMob.this.mRequestCount = 1;
                                MobirixAdMob.this.mAdmiddleview.loadAd(MobirixAdMob.this.getAdRequest());
                            }
                            MobirixAdMob.this.mAdmiddleview.setVisibility(0);
                            if (MobirixAdMob.this.mAdview != null) {
                                MobirixAdMob.this.mAdview.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        MobirixAdMob.this.mAdmiddleview.setVisibility(8);
                    }
                }
            });
        }
    }

    public void fullOnlyView() {
        airhockey airhockeyVar = this.mAct;
        if (airhockeyVar != null) {
            airhockeyVar.runOnUiThread(new Runnable() { // from class: com.mobirix.admob.MobirixAdMob.7
                @Override // java.lang.Runnable
                public void run() {
                    if (MobirixAdMob.this.mFullview != null) {
                        if (MobirixAdMob.this.bInterAdReady) {
                            MobirixAdMob.this.mFullview.show(MobirixAdMob.this.mAct);
                        } else {
                            MobirixAdMob.this.createFullAdmob();
                        }
                    }
                }
            });
        }
    }

    public void admobsView(final boolean z, final boolean z2, final boolean z3) {
        airhockey airhockeyVar = this.mAct;
        if (airhockeyVar != null) {
            airhockeyVar.runOnUiThread(new Runnable() { // from class: com.mobirix.admob.MobirixAdMob.8
                @Override // java.lang.Runnable
                public void run() {
                    if (MobirixAdMob.this.mAdmiddleview != null) {
                        if (z2) {
                            if (!MobirixAdMob.this.mbMiddleLoaded && MobirixAdMob.this.mRequestCount == 0) {
                                MobirixAdMob.this.mRequestCount = 1;
                                MobirixAdMob.this.mAdmiddleview.loadAd(MobirixAdMob.this.getAdRequest());
                            }
                            MobirixAdMob.this.mAdmiddleview.setVisibility(0);
                        } else {
                            MobirixAdMob.this.mAdmiddleview.setVisibility(8);
                        }
                    }
                    if (MobirixAdMob.this.mFullview != null && z3) {
                        if (MobirixAdMob.this.bInterAdReady) {
                            MobirixAdMob.this.mFullview.show(MobirixAdMob.this.mAct);
                        } else {
                            MobirixAdMob.this.createFullAdmob();
                        }
                    }
                    if (MobirixAdMob.this.mAdview != null) {
                        if (z) {
                            MobirixAdMob.this.mAdview.setVisibility(0);
                        } else {
                            MobirixAdMob.this.mAdview.setVisibility(8);
                        }
                    }
                }
            });
        }
    }

    public void createRewardAd(String str, adReawrdListenerCallback adreawrdlistenercallback) {
        if (this.mAct == null) {
            return;
        }
        this.mRewardedAd = null;
        this.mRewardAdmobUnitId = str;
        this.adListenerReward = adreawrdlistenercallback;
        this.bRewardDone = false;
        try {
            loadRewardedVideoAd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showRewardAd() {
        airhockey airhockeyVar;
        if (this.mRewardedAd == null || (airhockeyVar = this.mAct) == null) {
            return;
        }
        airhockeyVar.runOnUiThread(new Runnable() { // from class: com.mobirix.admob.MobirixAdMob.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MobirixAdMob.this.mRewardedAd.show(MobirixAdMob.this.mAct, new OnUserEarnedRewardListener() { // from class: com.mobirix.admob.MobirixAdMob.9.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            if (MobirixAdMob.this.adListenerReward != null) {
                                MobirixAdMob.this.bRewardDone = true;
                                MobirixAdMob.this.adListenerReward.onRewarded(rewardItem.getAmount());
                            }
                        }
                    });
                    MobirixAdMob.this.loadRewardedVideoAd();
                } catch (Exception unused) {
                }
            }
        });
    }

    public void loadRewardedVideoAd() {
        try {
            RewardedAd.load(this.mAct, this.mRewardAdmobUnitId, new AdRequest.Builder().build(), new AnonymousClass10());
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.mobirix.admob.MobirixAdMob$10 */
    /* loaded from: classes2.dex */
    public class AnonymousClass10 extends RewardedAdLoadCallback {
        AnonymousClass10() {
            MobirixAdMob.this = r1;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MobirixAdMob.this.mRewardedAd = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            MobirixAdMob.this.mRewardedAd = rewardedAd;
            if (MobirixAdMob.this.adListenerReward != null) {
                MobirixAdMob.this.adListenerReward.onRewardedVideoAdLoaded();
                MobirixAdMob.this.mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.mobirix.admob.MobirixAdMob.10.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        airhockey airhockeyVar = MobirixAdMob.this.mAct;
                        airhockey.my_debug("Ad was shown.");
                        MobirixAdMob.this.mRewardedAd = null;
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        airhockey airhockeyVar = MobirixAdMob.this.mAct;
                        airhockey.my_debug("Ad failed to show.");
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        airhockey airhockeyVar = MobirixAdMob.this.mAct;
                        airhockey.my_debug("Ad was dismissed.");
                        if (MobirixAdMob.this.bRewardDone) {
                            MobirixAdMob.this.bRewardDone = false;
                            try {
                                MobirixAdMob.this.mAct.runOnUiThread(new Runnable() { // from class: com.mobirix.admob.MobirixAdMob.10.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Toast.makeText(MobirixAdMob.this.mAct, "Success", 1).show();
                                    }
                                });
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void pause() {
        AdView adView = this.mAdview;
        if (adView != null) {
            adView.pause();
        }
        AdView adView2 = this.mAdmiddleview;
        if (adView2 != null) {
            adView2.pause();
        }
    }

    public void resume() {
        AdView adView = this.mAdview;
        if (adView != null) {
            adView.resume();
        }
        AdView adView2 = this.mAdmiddleview;
        if (adView2 != null) {
            adView2.resume();
        }
    }

    public void destroy() {
        AdView adView = this.mAdview;
        if (adView != null) {
            adView.destroy();
        }
        AdView adView2 = this.mAdmiddleview;
        if (adView2 != null) {
            adView2.destroy();
        }
    }

    protected AdRequest getAdRequest() {
        return new AdRequest.Builder().build();
    }

    private int getBannerType(AdSize adSize, int i, int i2) {
        int heightInPixels = AdSize.SMART_BANNER.getHeightInPixels(this.mAct);
        int heightInPixels2 = AdSize.BANNER.getHeightInPixels(this.mAct);
        float f = i * (this.mAct.getResources().getDisplayMetrics().heightPixels / i2);
        if (heightInPixels > f || adSize == AdSize.BANNER) {
            return ((float) heightInPixels2) <= f ? 2 : 0;
        }
        return 1;
    }

    public AdSize getBannerAdSize(int i, int i2) {
        float f = i * (this.mAct.getResources().getDisplayMetrics().heightPixels / i2);
        Display defaultDisplay = this.mAct.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.mAct, (int) (displayMetrics.widthPixels / displayMetrics.density));
        if (currentOrientationAnchoredAdaptiveBannerAdSize.getHeightInPixels(this.mAct) <= f) {
            return currentOrientationAnchoredAdaptiveBannerAdSize;
        }
        return null;
    }
}
