package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5R */
/* loaded from: assets/audience_network.dex */
public final class C5R implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"Ds1OlE9QLNwB", "aoTFD1mdY9qS2iG1b6xBMIzf9BXXSrYm", "osndMvDCAJCV1YpU", "nBivoQhUG9UhcV9idWewaYAmGQw5UcJS", "JB025Vwse6xgHKaH4PdlPsgjNbTaZijW", "Rr8Hg5ZtJOltbAd8rryGswWrdJNm13cq", "EfdUYpEvlCzoAxPYZB8PQhxNy", "DXUiKhR"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C0887Xc A03;
    @Nullable
    public InterfaceC0524It A04;
    public AB A05;
    public boolean A06;
    public boolean A07;
    @Nullable
    public NativeAd A08;
    public final M9 A0D = new E5(this);
    public final AbstractC0623Mt A0C = new E4(this);
    public final NY A0B = new E3(this);
    public final AbstractC0603Lz A0E = new E2(this);
    public final PO A09 = new E1(this);
    public final AbstractC0569Kr A0F = new E0(this);
    public final AbstractC0664Oj A0A = new C0406Dz(this);
    public C5K A02 = new C5K();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{-30, 7, 15, -6, 5, 2, -3, -71, -17, 2, -2, 16, -71, -4, 8, 7, 12, 13, 11, 14, -4, 13, 8, 11, -71, 9, -6, 11, -6, 6, 12, -71, 13, 18, 9, -2, -57, -34, -16, -16, -10, -12, -7, -14, -85, -8, 0, -2, -1, -85, -19, -16, -85, -5, -3, -16, -18, -16, -17, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -73, -85, -20, -7, -17, -85, -15, -6, -9, -9, -6, 2, -16, -17, -85, -19, 4, -85, -20, -85, -18, -20, -9, -9, -85, -1, -6, -85, -17, -12, -2, -16, -7, -14, -20, -14, -16, -34, -16, -16, -10, -71, -27, -22, -12, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -95, -28, -30, -19, -19, -26, -27, -95, -8, -22, -11, -23, -16, -10, -11, -95, -26, -17, -24, -30, -24, -26, -44, -26, -26, -20, -81, airhockey.P_GAME_EXIT, 83, 76, airhockey.P_GAME_BREAKBALLCOUNT, 76, airhockey.P_GAME_EXIT, 56, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 80, 5, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_BREAKBALLCOUNT, 81, 81, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, 5, 92, 78, 89, 77, 84, 90, 89, 5, airhockey.P_GAME_REMATCH, 78, 88, airhockey.P_GAME_EXIT, 83, 76, airhockey.P_GAME_BREAKBALLCOUNT, 76, airhockey.P_GAME_EXIT, 56, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 80, 19};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        NativeAd nativeAd = this.A08;
        if (nativeAd != null) {
            C0799Tp.A0L(nativeAd.getInternalNativeAd()).A1c(false, false);
        }
        this.A08 = null;
        InterfaceC0524It interfaceC0524It = this.A04;
        if (interfaceC0524It != null) {
            interfaceC0524It.AFh();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        C0887Xc A11 = ((C0799Tp) nativeAd.getInternalNativeAd()).A11();
        C0887Xc adObjectContext = this.A03;
        adObjectContext.A0G(A11);
        C5S c5s = (C5S) nativeAd.getNativeAdApi();
        this.A05.setClientToken(C0799Tp.A0L(nativeAd.getInternalNativeAd()).A1B());
        this.A05.setVideoMPD(c5s.A01());
        this.A05.setVideoURI(c5s.A02());
        C0967a7 A0y = C0799Tp.A0L(nativeAd.getInternalNativeAd()).A0y();
        if (A0y != null) {
            this.A05.setVideoProgressReportIntervalMs(A0y.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c5s.getVideoAutoplayBehavior();
        InterfaceC0524It interfaceC0524It = this.A04;
        if (interfaceC0524It != null) {
            interfaceC0524It.AF2(nativeAd);
        }
    }

    public final void A05(InterfaceC0505Ia interfaceC0505Ia) {
        this.A05.setAdEventManager(interfaceC0505Ia);
    }

    public final void A06(@Nullable InterfaceC0524It interfaceC0524It) {
        this.A04 = interfaceC0524It;
    }

    public final void A07(@Nullable InterfaceC0596Ls interfaceC0596Ls) {
        this.A05.setListener(interfaceC0596Ls);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0V();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            boolean isDebugBuild = AdInternalSettings.isDebugBuild();
            if (A0H[6].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[0] = "WtsbSHtQErqq";
            strArr[2] = "XLMSbaKAMNULMDv3";
            if (isDebugBuild) {
                Log.w(A0I, A01(127, 40, 5));
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0b(LH.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(167, 40, 105));
                return;
            }
            return;
        }
        this.A06 = true;
        this.A07 = Q7.A0A.equals(this.A05.getState());
        this.A05.A0e(false, 1);
        this.A00.onSeekEngaged();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C0887Xc A02;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C0887Xc) {
            A02 = (C0887Xc) context;
        } else {
            A02 = C5M.A02(context);
        }
        this.A03 = A02;
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            this.A05 = new AB(A02);
        } else if (initializationType == 1) {
            this.A05 = new AB(A02, adViewConstructorParams.getAttributeSet());
        } else if (initializationType == 2) {
            this.A05 = new AB(A02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
        } else if (initializationType == 3) {
            this.A05 = new AB(A02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
        } else {
            throw new IllegalArgumentException(A01(0, 37, 29));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        EnumC0567Kp.A04(this.A05, EnumC0567Kp.A0A);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0e(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0b(LH.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(@IntRange(from = 0) int i) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(37, 90, 15));
                return;
            }
            return;
        }
        this.A05.A0Y(i);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        AB ab = this.A05;
        if (ab == null || ab.getState() == Q7.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
