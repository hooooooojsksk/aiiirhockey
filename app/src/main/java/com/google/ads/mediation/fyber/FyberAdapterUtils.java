package com.google.ads.mediation.fyber;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
class FyberAdapterUtils {
    private FyberAdapterUtils() {
    }

    public static AdError getAdError(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        int i = AnonymousClass1.$SwitchMap$com$fyber$inneractive$sdk$external$OnFyberMarketplaceInitializedListener$FyberInitStatus[fyberInitStatus.ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 299 : HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION : HttpStatus.SC_ACCEPTED : HttpStatus.SC_CREATED : 200;
        return new AdError(i2, "DT Exchange failed to initialize with reason: " + fyberInitStatus, FyberMediationAdapter.ERROR_DOMAIN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.ads.mediation.fyber.FyberAdapterUtils$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode;
        static final /* synthetic */ int[] $SwitchMap$com$fyber$inneractive$sdk$external$OnFyberMarketplaceInitializedListener$FyberInitStatus;

        static {
            int[] iArr = new int[InneractiveErrorCode.values().length];
            $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode = iArr;
            try {
                iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr2 = new int[OnFyberMarketplaceInitializedListener.FyberInitStatus.values().length];
            $SwitchMap$com$fyber$inneractive$sdk$external$OnFyberMarketplaceInitializedListener$FyberInitStatus = iArr2;
            try {
                iArr2[OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$OnFyberMarketplaceInitializedListener$FyberInitStatus[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$OnFyberMarketplaceInitializedListener$FyberInitStatus[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$OnFyberMarketplaceInitializedListener$FyberInitStatus[OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public static AdError getAdError(InneractiveErrorCode inneractiveErrorCode) {
        int i;
        switch (AnonymousClass1.$SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[inneractiveErrorCode.ordinal()]) {
            case 1:
                i = HttpStatus.SC_MULTIPLE_CHOICES;
                break;
            case 2:
                i = HttpStatus.SC_MOVED_PERMANENTLY;
                break;
            case 3:
                i = HttpStatus.SC_MOVED_TEMPORARILY;
                break;
            case 4:
                i = HttpStatus.SC_SEE_OTHER;
                break;
            case 5:
                i = HttpStatus.SC_NOT_MODIFIED;
                break;
            case 6:
                i = HttpStatus.SC_USE_PROXY;
                break;
            case 7:
                i = 306;
                break;
            case 8:
                i = HttpStatus.SC_TEMPORARY_REDIRECT;
                break;
            case 9:
                i = 308;
                break;
            case 10:
                i = 309;
                break;
            case 11:
                i = 310;
                break;
            case 12:
                i = 311;
                break;
            case 13:
                i = 312;
                break;
            case 14:
                i = 313;
                break;
            case 15:
                i = 314;
                break;
            case 16:
                i = 315;
                break;
            case 17:
                i = 316;
                break;
            case 18:
                i = 317;
                break;
            default:
                i = 399;
                break;
        }
        return new AdError(i, "DT Exchange failed to request ad with reason: " + inneractiveErrorCode, FyberMediationAdapter.ERROR_DOMAIN);
    }

    public static void updateFyberExtraParams(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        InneractiveUserConfig inneractiveUserConfig = new InneractiveUserConfig();
        if (bundle.containsKey(InneractiveMediationDefs.KEY_AGE)) {
            inneractiveUserConfig.setAge(bundle.getInt(InneractiveMediationDefs.KEY_AGE, 0));
        }
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
        if (bundle.containsKey("muteVideo")) {
            InneractiveAdManager.setMuteVideo(bundle.getBoolean("muteVideo", false));
        }
    }
}
