package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.redexgen.X.AnonymousClass57;
import com.facebook.ads.redexgen.X.C02055d;
import com.facebook.ads.redexgen.X.C02095h;
import com.facebook.ads.redexgen.X.C0529Iy;
import com.facebook.ads.redexgen.X.C0530Iz;
import com.facebook.ads.redexgen.X.C0799Tp;
import com.facebook.ads.redexgen.X.C5A;
import com.facebook.ads.redexgen.X.C5F;
import com.facebook.ads.redexgen.X.C5L;
import com.facebook.ads.redexgen.X.C5M;
import com.facebook.ads.redexgen.X.C5O;
import com.facebook.ads.redexgen.X.C5R;
import com.facebook.ads.redexgen.X.C5S;
import com.facebook.ads.redexgen.X.C5T;
import com.facebook.ads.redexgen.X.C5W;
import com.facebook.ads.redexgen.X.C8G;
import com.facebook.ads.redexgen.X.J0;
import com.facebook.ads.redexgen.X.JB;
import com.facebook.ads.redexgen.X.JD;
import com.facebook.ads.redexgen.X.KY;
import com.facebook.ads.redexgen.X.U1;
import com.facebook.ads.redexgen.X.Y5;
import com.facebook.ads.redexgen.X.Y6;
import com.facebook.ads.redexgen.X.YM;
import com.facebook.ads.redexgen.X.YN;
import com.mobirix.airhockey.airhockey;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements DynamicLoader {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C5L A04;
    public static String[] A05 = {"", "hl0DpOFqxM1jfK98LJTADvCdgffrETQN", "QW5nZBv4w8ebawOaJAju5UC6DpXIEYNP", "lDXIr49IIqC5d9soZ9ZlhOdK7Sq4PNcS", "1TLrXBQAGAxZIydv1bacR9cCDSxOiDhT", "HKpyy44hPf1TiYKwXHdFJYATCyhvdc4i", "5Vop4gtsdytJgHep4xjnsMChzM034SFi", "0HGMkPnlBdCz3NKZQL2lJn"};
    public static final InitApi A06 = new InitApi() { // from class: com.facebook.ads.redexgen.X.5N
        @Override // com.facebook.ads.internal.api.InitApi
        public final void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
            C8G.A0G(C5M.A07(context), multithreadedBundleWrapper, initListener, i);
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final boolean isInitialized() {
            return C8G.A0H();
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdLoadInvoked(Context context) {
            C8G.A08(C5M.A07(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onContentProviderCreated(Context context) {
            C8G.A09(C5M.A07(context));
        }
    };

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdCompanionViewApi createAdCompanionViewApi() {
        return new YN();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        return new YM(context, nativeAdBase, nativeAdLayout, orientation, i, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new YM(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.59
                public static byte[] A00;
                public static String[] A01 = {"TFkOB7WAPr6F4oSDAD2lBM3orjMmpCql", "qm70b4Ur0FRBuwfAT3tN36vqG0Nf4UFd", "zPpQ1cnfbXvczPvVr", "8IvLkkrNdMNEKNCoxjkf6IUs19Br2Jri", "GW45NL8mXfcvSmeq7", "yk6fztNbTNbTdYOeWP4a4qU6KiJuVBGT", "Yi7aT5eKgI7tScmdPed7vydq7f2NoqCT", "ldtlhzHQs0POAzCz5K2SoOIZIeNjlq2l"};
                public static final String A02;
                public static final Collection<String> A03;
                public static volatile boolean A04;

                public static String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A00 = new byte[]{124, 119, airhockey.J_GAME_STANDBY, 8, 15, 9, 4, 31, 30, 13, 18, 24, 30, 4, 18, 31, 4, 19, 26, 8, 19, 4, 16, 30, 2, airhockey.J_GAME_ENEMYEXIT, 90, 76, 75, 31, 82, 80, 91, 90, 31, 91, 90, airhockey.P_GAME_REMATCH, 86, 92, 90, 31, 87, 94, 76, 87, 5, 31, 45, 18, 31, 20, 90, 14, 31, 9, 14, 19, 20, 29, 90, 3, 21, 15, 8, 90, 27, 10, 10, 90, 13, 19, 14, 18, 90, 60, 27, 25, 31, 24, 21, 21, 17, 93, 9, 90, 27, 30, 90, 15, 20, 19, 14, 9, 90, 3, 21, 15, 90, 23, 15, 9, 14, 90, 9, 10, 31, 25, 19, 28, 3, 90, 14, 18, 31, 90, 30, 31, 12, 19, 25, 31, 90, 18, 27, 9, 18, 31, 30, 90, 51, 62, 90, 14, 21, 90, 31, 20, 9, 15, 8, 31, 90, 14, 18, 31, 90, 30, 31, 22, 19, 12, 31, 8, 3, 90, 21, 28, 90, 14, 31, 9, 14, 90, 27, 30, 9, 86, 90, 27, 30, 30, 90, 14, 18, 31, 90, 28, 21, 22, 22, 21, 13, 19, 20, 29, 90, 25, 21, 30, 31, 90, 24, 31, 28, 21, 8, 31, 90, 22, 21, 27, 30, 19, 20, 29, 90, 27, 20, 90, 27, 30, 64, 90, 59, 30, 41, 31, 14, 14, 19, 20, 29, 9, 84, 27, 30, 30, 46, 31, 9, 14, 62, 31, 12, 19, 25, 31, 82, 88, 26, 27, 8, 23, 29, 27, 55, 26, 54, 31, 13, 22, 60, 52, 52, 60, 55, 62, 4, 40, 63, 48, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_GAME_EXIT, 102, airhockey.J_SAVEDGAME_RELOAD, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, 40, 38, 96, 41, 61, 48, 39, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, 43, 47};
                }

                static {
                    A01();
                    A02 = AdInternalSettings.class.getSimpleName();
                    A03 = new HashSet();
                    A03.add(A00(262, 3, 49));
                    A03.add(A00(252, 10, 107));
                    A03.add(A00(265, 7, 32));
                    A03.add(A00(272, 8, 111));
                    A04 = false;
                }

                public static void A02(String str) {
                    if (A04) {
                        return;
                    }
                    A04 = true;
                    String str2 = A02;
                    Log.i(str2, A00(25, 23, 15) + str);
                    String str3 = A02;
                    Log.i(str3, A00(48, 192, 74) + str + A00(0, 3, 110));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(Context context) {
                    if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isExplicitTestMode() || A03.contains(Build.PRODUCT)) {
                        return true;
                    }
                    MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                    String A002 = A00(3, 22, 107);
                    String string = multithreadedBundleWrapper.getString(A002, null);
                    if (string == null) {
                        SharedPreferences A003 = C0541Jm.A00(context);
                        String A004 = A00(240, 12, 78);
                        string = A003.getString(A004, null);
                        if (TextUtils.isEmpty(string)) {
                            UUID randomUUID = UUID.randomUUID();
                            if (A01[6].charAt(4) == 'r') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A01;
                            strArr[4] = "ACuTT9OHS44wxpENU";
                            strArr[2] = "rDA9ItLQjR7JTNF9w";
                            string = randomUUID.toString();
                            A003.edit().putString(A004, string).apply();
                        }
                        AdInternalSettings.sSettingsBundle.putString(A002, string);
                    }
                    if (AdInternalSettings.getTestDevicesList().contains(string)) {
                        return true;
                    }
                    A02(string);
                    return false;
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    JO.A02();
                }
            };
        }
        AdSettingsApi adSettingsApi = A00;
        String[] strArr = A05;
        if (strArr[5].charAt(22) != strArr[3].charAt(22)) {
            A05[7] = "zPBUQH";
            return adSettingsApi;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i) {
        final JD A022 = KY.A02(i);
        return new AdSizeApi() { // from class: com.facebook.ads.redexgen.X.8D
            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getHeight() {
                return A022.A02();
            }

            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getWidth() {
                return A022.A03();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) AnonymousClass57.A00(new C5A(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) AnonymousClass57.A00(new C5A(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (JB e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        return new AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, new C5F(audienceNetworkActivity, audienceNetworkActivityApi)) { // from class: com.facebook.ads.redexgen.X.5G
            public static byte[] A03;
            public static String[] A04 = {"kVVxbIvKBpFLpNMn249evg7U1t5DMrkR", "HNBIISUKPJt5lzvo", "tha", "s0U2IqORDUirQkjYFZUhzDbmHPDS66DK", "4XQ6Ra6x1CsG5mP0jlsGo4Oc8x5GsOh7", "mYQ1yQiLRLlGaSwEYEmmcgt3b9ncmm6M", "URRMMekVjcz4ECsO2XmiMnA4WEVCe5QQ", "lW2qNIOuJVr9bvm7hZsN45J1F7Bnv3JY"};
            public boolean A00;
            public final AudienceNetworkActivityApi A01;
            public final C5F A02;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A03 = new byte[]{12, 8, 7, 59, 42, 47, 43, 52, 41, 43, 20, 43, 58, 61, 53, 56, 49, 19, 44, 35, 54, 46, 35, 33, 50, 35, 34, -34, 35, 54, 33, 35, 46, 50, 39, 45, 44, -20, -70, -57, -72, -70, -68, -51, -62, -49, -62, -51, -46};
            }

            static {
                A01();
            }

            {
                this.A01 = audienceNetworkActivityApi;
                this.A02 = c5f;
            }

            private void A02(Throwable th) {
                this.A00 = true;
                this.A02.A0J();
                finish(8);
                C7N logContext = this.A02.A0I();
                if (logContext != null) {
                    logContext.A07().A9C(A00(38, 11, 18), C02627s.A0C, new C02637t(th));
                    return;
                }
                String A002 = A00(0, 17, 127);
                if (A04[3].charAt(1) != '0') {
                    throw new RuntimeException();
                }
                A04[6] = "roakWe6n8CepWvGQKms2st32sM0MtJhe";
                Log.e(A002, A00(17, 21, 119), th);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
                try {
                    if (this.A00) {
                        this.A01.dump(str, fileDescriptor, printWriter, strArr);
                    } else {
                        this.A02.dump(str, fileDescriptor, printWriter, strArr);
                    }
                } catch (Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i) {
                this.A02.finish(i);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onActivityResult(int i, int i2, Intent intent) {
                try {
                } catch (Throwable t) {
                    A02(t);
                }
                if (this.A00) {
                    this.A01.onActivityResult(i, i2, intent);
                    return;
                }
                this.A02.onActivityResult(i, i2, intent);
                this.A01.onActivityResult(i, i2, intent);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onBackPressed() {
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onBackPressed();
                } catch (Throwable th) {
                    String[] strArr = A04;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[7] = "o2QAVIvbVP3X0FiUaWNt1f6t7dHcTRBl";
                    strArr2[0] = "vmYtMIbIQwew4451MpW2UPrO9wIbxS87";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onConfigurationChanged(Configuration configuration) {
                try {
                } catch (Throwable t) {
                    A02(t);
                }
                if (this.A00) {
                    this.A01.onConfigurationChanged(configuration);
                    return;
                }
                this.A02.onConfigurationChanged(configuration);
                this.A01.onConfigurationChanged(configuration);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onCreate(Bundle bundle) {
                this.A01.onCreate(bundle);
                try {
                    this.A02.onCreate(bundle);
                } catch (Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onDestroy() {
                try {
                } catch (Throwable t) {
                    A02(t);
                }
                if (this.A00) {
                    this.A01.onDestroy();
                    return;
                }
                this.A02.onDestroy();
                this.A01.onDestroy();
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onPause() {
                try {
                } catch (Throwable t) {
                    A02(t);
                }
                if (this.A00) {
                    this.A01.onPause();
                    return;
                }
                this.A02.onPause();
                this.A01.onPause();
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onResume() {
                this.A01.onResume();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onResume();
                } catch (Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onSaveInstanceState(Bundle bundle) {
                this.A01.onSaveInstanceState(bundle);
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onSaveInstanceState(bundle);
                } catch (Throwable th) {
                    String[] strArr = A04;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A04[6] = "46sQaeWUXFUhhsRkoBzMlxezgaVtku4l";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStart() {
                this.A01.onStart();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStart();
                } catch (Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStop() {
                this.A01.onStop();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStop();
                } catch (Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                } catch (Throwable t) {
                    A02(t);
                }
                if (this.A00) {
                    return this.A01.onTouchEvent(motionEvent);
                }
                this.A02.onTouchEvent(motionEvent);
                return this.A01.onTouchEvent(motionEvent);
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.5I
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(String str) {
                    return C0548Jt.A02(this) ? 0 : 0;
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(Context context, @Nullable MultithreadedBundleWrapper initSettings, @Nullable AudienceNetworkAds.InitListener initListener) {
                    if (C0548Jt.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.5H
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (Throwable th) {
                            C0548Jt.A00(th, this);
                            return;
                        }
                    }
                    DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() {
                    if (C0548Jt.A02(this)) {
                        return false;
                    }
                    try {
                        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
                        if (dynamicLoader == null) {
                            return false;
                        }
                        return dynamicLoader.getInitApi().isInitialized();
                    } catch (Throwable th) {
                        C0548Jt.A00(th, this);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(Context context) {
                    if (C0548Jt.A02(this)) {
                        return;
                    }
                    try {
                        DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
                    } catch (Throwable th) {
                        C0548Jt.A00(th, this);
                    }
                }
            };
        }
        return A01;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new U1();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) AnonymousClass57.A00(new C5O(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new Y6();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new C5R();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5S createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5S(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5S createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5S(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new C0799Tp(context, str, C0799Tp.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new C0799Tp((C0799Tp) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return C0799Tp.A0A(context, str, str2);
        } catch (JB e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return C0529Iy.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new Y5();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public C0530Iz createNativeAdRatingApi(JSONObject jSONObject) {
        return C0530Iz.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, @Nullable NativeAdScrollView.AdViewProvider adViewProvider, int i, @Nullable NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        return new C5T(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i, type, nativeAdViewAttributes, i2);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5U
                public static String[] A00 = {"4lhDSJeQx8ImoxNIMYyIsOpW4XJuQDgf", "lqCKp7vrLkXGNxXrvc6I3m7c", "zCZ5ygsfQGVhB3Y237HbJ1q9o76yX", "bq9vw23WcXUY1kk1BWsR1Wz1yPOY5uBm", "", "Hv6Nwq3QZSzEF0Nb8JqXMZqCHWYzLqUn", "tYYpfGiIizklMQ8", "46C5bVFnHWUcfGRcMiONp8ja9wt0MV54"};

                public static View A00(C0887Xc c0887Xc, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    J0 j0 = (J0) nativeAdViewAttributes.getInternalAttributes();
                    C0799Tp internalNativeAd = C0799Tp.A0L(nativeAd.getInternalNativeAd());
                    internalNativeAd.A1X(J1.A00(type.getEnumCode()));
                    internalNativeAd.A1W(j0);
                    C0403Dw c0403Dw = new C0403Dw();
                    NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c0887Xc, c0403Dw);
                    c0403Dw.A04(mediumRectTemplateLayout, c0887Xc, nativeAd, j0);
                    mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (Kk.A02 * type.getHeight())));
                    return mediumRectTemplateLayout;
                }

                public static View A01(C0887Xc c0887Xc, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C0799Tp A0L = C0799Tp.A0L(nativeAd.getInternalNativeAd());
                    J0 j0 = (J0) nativeAdViewAttributes.getInternalAttributes();
                    A0L.A1X(J1.A0B);
                    A0L.A1W(j0);
                    C0403Dw c0403Dw = new C0403Dw();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c0887Xc, c0403Dw);
                    c0403Dw.A04(nativeAdLayout, c0887Xc, nativeAd, j0);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd) {
                    return render(context, nativeAd, (NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C5M.A02(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        C0887Xc A022 = C5M.A02(context);
                        if (A00[1].length() == 17) {
                            Throwable t = new RuntimeException();
                            throw t;
                        }
                        String[] strArr = A00;
                        strArr[0] = "2CJ6YuIajjVObDWBrmgwGQhi0qiA6kO3";
                        strArr[3] = "BzZMljeHsN6l5z4UR6G3olqVRWzg5ScF";
                        return C0598Lu.A00(A022, th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    C0887Xc contextWrapper;
                    try {
                        if (context instanceof C0887Xc) {
                            contextWrapper = (C0887Xc) context;
                        } else {
                            contextWrapper = C5M.A02(context);
                        }
                        return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0598Lu.A00(C5M.A02(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new J0();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(int i) {
        return new NativeAdViewTypeApi(i) { // from class: com.facebook.ads.redexgen.X.5V
            public final J1 A00;

            {
                this.A00 = J1.A00(i);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A03();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A05();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i) {
        return (NativeAdsManagerApi) AnonymousClass57.A00(new C5W(context, str, i), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5a
            public static byte[] A01;
            public static String[] A02 = {"GHtEJsCBxF6ZG8G1CCL5RBmKmDCxDlHG", "8TFtHG5", "ovYsObbmHQ4MgJZYSDt7UbSE4I8Jd3xL", "OStrwIklzSQSoVp6y3SnTe0L", "CizBuXx6tKQSK5P8xVf5ORSYZ1", "CxGaKpsxgS6bhWDX5B71lG4aeRzyf4w9", "ZUquOnXGk9BCY4cqa0yz5KxW6oH5Pvvn", "wvrH4lpYI8UyLhNBrrW8XGK9bs66R2Pk"};
            public final C0799Tp A00;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{43, 47, 44, 24, 9, 4, 8, 3, 14, 8, 35, 8, 25, 26, 2, 31, 6};
                String[] strArr = A02;
                if (strArr[3].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                A02[1] = "g9VMJ7KVDiHxjzY4mov6XPU8OVFxG";
            }

            static {
                A01();
            }

            {
                this.A00 = C0799Tp.A0L(nativeAdBaseApi);
                this.A00.A1Y(JF.A04);
            }

            private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi2) {
                C0799Tp A0L = C0799Tp.A0L(nativeAdBaseApi2);
                C0909Xy c0909Xy = new C0909Xy(this, imageView, A0L);
                C0529Iy adIcon = A0L.getAdIcon();
                if (adIcon != null) {
                    Bitmap preloadedBitmap = A0L.A10().A0M(adIcon.getUrl());
                    C0887Xc A022 = C5M.A02(imageView.getContext());
                    if (preloadedBitmap != null) {
                        Drawable A052 = C0799Tp.A05(A022, preloadedBitmap, A0L.A1d(), A0L.A1C());
                        C0799Tp.A0e(A052, imageView);
                        imageView.post(new C0908Xx(this, A0L, A052));
                        return;
                    }
                    C5X loadImageTask = new C5X(A022, c0909Xy, A0L.A1d(), null);
                    loadImageTask.execute(new C5Z(adIcon.getUrl(), A0L.A1C(), null));
                    return;
                }
                InterfaceC0798To A15 = A0L.A15();
                AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                A0L.A11().A0E().A2b(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (A15 != null) {
                    A15.AAv(JA.A00(adErrorType));
                }
                Log.e(A00(0, 17, 69), adErrorType.getDefaultErrorMessage());
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView) {
                registerViewForInteraction(view, imageView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView, @Nullable List<View> clickableViews) {
                if (imageView != null) {
                    A02(imageView, this.A00);
                }
                if (clickableViews != null) {
                    this.A00.A1M(view, imageView, clickableViews);
                } else {
                    this.A00.A1L(view, imageView);
                }
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
                if (mediaView != null) {
                    Y6 y6 = (Y6) mediaView.getMediaViewApi();
                    C0799Tp c0799Tp = this.A00;
                    String[] strArr = A02;
                    if (strArr[3].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[2] = "js1TYeoyNOBe6miaJaLofzAsC6CsUfwk";
                    strArr2[0] = "W1hafLFlhK2580scubVHArACmFSZlS1F";
                    y6.A0M(c0799Tp, true);
                }
                if (list != null) {
                    this.A00.A1O(view, mediaView, list);
                } else {
                    this.A00.A1N(view, mediaView);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5b
                public static View A00(C0887Xc c0887Xc, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C0799Tp.A0L(nativeBannerAd.getInternalNativeAd()).A1X(J1.A00(type.getEnumCode()));
                    E6 bannerTemplateLayoutApi = new E6();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c0887Xc, bannerTemplateLayoutApi);
                    bannerTemplateLayoutApi.A04(c0887Xc, nativeBannerAd, (J0) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (Kk.A02 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C5M.A02(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C0598Lu.A00(C5M.A02(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5c
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
                if (view != null && nativeComponentTag != null) {
                    EnumC0567Kp.A03(view, nativeComponentTag);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedInterstitialAdApi createRewardedInterstitialAd(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        return (RewardedInterstitialAdApi) AnonymousClass57.A00(new C02055d(context, str, rewardedInterstitialAd), RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) AnonymousClass57.A00(new C02095h(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C5L getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C5L();
        }
        C5L c5l = A04;
        if (A05[0].length() != 2) {
            A05[6] = "wbYWwuhs42I1eIPNPpozWjfLzFT5vnXv";
            return c5l;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        C8G.A0A(C5M.A07(context));
    }
}
