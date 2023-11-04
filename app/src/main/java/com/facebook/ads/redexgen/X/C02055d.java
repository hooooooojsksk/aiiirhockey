package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5d */
/* loaded from: assets/audience_network.dex */
public final class C02055d implements RewardedInterstitialAdApi, Repairable {
    public static byte[] A01;
    public static String[] A02 = {"3NmEwDZbIt", "O8AdKP", "F3ALGhsyO3", "0MHUDKJg5DuGWh7rPRyim2f5Q3jzHAIy", "HXUpQ47Mk3E2sR2m", "8jXe5NRPzLqsvVidOiIerBtc23OceItu", "2ZUtk7q5pb8vSbqEv1qAEyjXWKkByt40", "lRwzP9ChqND6LzN"};
    public final C02095h A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 17, 17, airhockey.P_GAME_SELECTMAP, 64, 76, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 45, 45, 11, 90, 7, 6, 14, 15, 10, 11, 48, 54, airhockey.J_GAME_STANDBY, 62, 53, 51, 53, 63, 36, 19, 1, 23, 4, 18, 19, 18, 86, 31, 24, 2, 19, 4, 5, 2, 31, 2, 31, 23, 26, 86, 23, 18, 86, 18, 19, 5, 2, 4, 25, 15, 19, 18, 6, 49, 35, 53, 38, 48, 49, 48, airhockey.J_DISCONNECT, 61, 58, 32, 49, 38, 39, 32, 61, 32, 61, 53, 56, airhockey.J_DISCONNECT, 53, 48, airhockey.J_DISCONNECT, 56, 59, 53, 48, airhockey.J_DISCONNECT, 38, 49, 37, 33, 49, 39, 32, 49, 48, 36, 19, 1, 23, 4, 18, 19, 18, 86, 31, 24, 2, 19, 4, 5, 2, 31, 2, 31, 23, 26, 86, 23, 18, 86, 5, 30, 25, 1, 86, 21, 23, 26, 26, 19, 18, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 94, 89, 95, airhockey.P_NATION, 84, 50, 49, 63, 58, 31, 58, 6, 29, 26, 2};
        if (A02[4].length() == 1) {
            throw new RuntimeException();
        }
        A02[7] = "xXnNwnRRjThYq22";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C02055d(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new C02095h(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C02075f(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C02085g(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        JO.A05(A00(141, 7, 83), A00(32, 34, 8), A00(16, 8, 65));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        JO.A05(A00(148, 6, 32), A00(66, 39, 42), A00(8, 8, 53));
        this.A00.A07(null, AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true, false);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((C02075f) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        this.A00.registerAdCompanionView(adCompanionView);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        this.A00.repair(th);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @SuppressLint({"DeprecatedMethod"})
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        JO.A05(A00(154, 4, 11), A00(105, 36, 8), A00(0, 8, 10));
        return this.A00.A08(new C02115j().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        JO.A05(A00(154, 4, 11), A00(105, 36, 8), A00(24, 8, 121));
        return this.A00.A08(((C02085g) rewardedInterstitialShowAdConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void unregisterAdCompanionView() {
        this.A00.unregisterAdCompanionView();
    }
}
