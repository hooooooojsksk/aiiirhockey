package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class Y6 extends C5K implements MediaViewApi, Repairable, C7L {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    @Nullable
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C0887Xc A07;
    public AnonymousClass19 A08;
    public N7 A09;
    @Nullable
    public C02908v A0A;
    @Nullable
    public C0676Ov A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, 63, 57, 18, 57, 40, 43, 51, 46, 55, 64, airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, airhockey.J_GAME_DISCONNECT, 41, 123, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYWIN, 109, airhockey.J_GAME_DISCONNECT, 123, airhockey.J_GAME_DISCONNECT, 123, 41, airhockey.J_ONREWARDED, 124, airhockey.J_PURCHASE, 125, 41, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 41, airhockey.J_PURCHASE, airhockey.J_GAME_DISCONNECT, 125, 41, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 111, 102, 123, airhockey.J_GAME_DISCONNECT, 41, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, 125, 96, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYLOSE, 109, 39, 96, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 78, 76, 9, 91, 76, airhockey.P_GAME_MYWIN, 77, 76, 91, 76, 91, 9, airhockey.P_GAME_SELECTMAP, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, airhockey.P_GAME_BREAKBALLCOUNT, 91, 76, 9, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, 93, 64, 95, 76, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYWIN, 76, 91, airhockey.J_ENEMYLOSE, 77, 7, 18, 53, 45, 58, 55, 50, 63, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, airhockey.J_ERROR, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, airhockey.J_SDKVER, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, airhockey.J_SAVEDGAME_SAVE, 26, 11, 18, 96, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, 45, airhockey.J_GAME_STANDBY, airhockey.J_NATION, 96, 102, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYLOSE, 45, airhockey.J_NATION, airhockey.J_ENEMYWIN, airhockey.J_GOO, 45, 109, airhockey.J_NATION, 119, airhockey.J_GAME_EXIT, airhockey.J_ERROR, 102, 45, 96, 111, airhockey.J_GAME_EXIT, 96, airhockey.J_ENEMYLOSE, 102, airhockey.J_ENEMYWIN, airhockey.J_ERROR, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, 102, airhockey.J_GAME_DISCONNECT, 86, airhockey.J_BACK, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        C02908v c02908v = this.A0A;
        if (c02908v != null) {
            c02908v.setVisibility(8);
            C3E.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                LL.A0J(this.A08);
            }
            float f = Kk.A02;
            float density = 4.0f * f;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        EnumC0567Kp.A04(this.A03, EnumC0567Kp.A0A);
        EnumC0567Kp.A04(this.A09, EnumC0567Kp.A0A);
        EnumC0567Kp.A04(this.A05, EnumC0567Kp.A0A);
        EnumC0567Kp.A04(this.A01, EnumC0567Kp.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, C0799Tp c0799Tp) {
        C0676Ov c0676Ov = this.A0B;
        if (c0676Ov != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c0676Ov);
        }
        if (!c0799Tp.A1d()) {
            return;
        }
        String A1C = c0799Tp.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        String str = strArr3[5];
        String mediationData = strArr3[0];
        if (str.length() != mediationData.length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C0676Ov A01 = C0675Ou.A01(this.A07, A1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        } else {
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                LL.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(LL.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 6));
    }

    @TargetApi(21)
    private final void A0C(C0887Xc c0887Xc, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0887Xc, attributeSet, i, i2));
        A0H(new N7(c0887Xc, attributeSet, i, i2));
        this.A08 = new AnonymousClass19(c0887Xc, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0887Xc, attributeSet, i, i2));
        A07();
    }

    private final void A0D(C0887Xc c0887Xc, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0887Xc, attributeSet, i));
        A0H(new N7(c0887Xc, attributeSet, i));
        this.A08 = new AnonymousClass19(c0887Xc, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0887Xc, attributeSet, i));
        A07();
    }

    private final void A0E(C0887Xc c0887Xc, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0887Xc, attributeSet));
        A0H(new N7(c0887Xc, attributeSet));
        this.A08 = new AnonymousClass19(c0887Xc, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0887Xc, attributeSet));
        A07();
    }

    private final void A0F(C0887Xc c0887Xc, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0887Xc));
        A0H(new N7(c0887Xc));
        this.A08 = new AnonymousClass19(c0887Xc);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0887Xc));
        A07();
    }

    private void A0G(C0799Tp c0799Tp, boolean z, C0529Iy c0529Iy) {
        AsyncTaskC0764Sf A04 = new AsyncTaskC0764Sf(this.A02, this.A07).A04();
        if (z) {
            A04.A06(new YD(this, c0799Tp));
        }
        A04.A07(c0529Iy.getUrl());
    }

    private void A0H(N7 n7) {
        if (!this.A0D) {
            N7 n72 = this.A09;
            if (n72 != null) {
                this.A03.removeView(n72);
            }
            n7.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(n7, layoutParams);
            this.A09 = n7;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((C5S) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        for (NativeAd nativeAd2 : carousel) {
            if (nativeAd2.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5S) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0364, code lost:
        if ((r1 instanceof com.facebook.ads.redexgen.X.C0628My) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0366, code lost:
        ((com.facebook.ads.redexgen.X.C0628My) r1).A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03b9, code lost:
        if ((r1 instanceof com.facebook.ads.redexgen.X.C0628My) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03bc, code lost:
        ((com.facebook.ads.redexgen.X.E9) r1).setAdapter(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(com.facebook.ads.NativeAd r18) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y6.A0L(com.facebook.ads.NativeAd):void");
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C0887Xc A11 = ((C0799Tp) nativeAdBaseApi).A11();
        C0887Xc adObjectContext = this.A07;
        adObjectContext.A0G(A11);
        A11.A0H(this);
        this.A0D = true;
        C0799Tp A0L = C0799Tp.A0L(nativeAdBaseApi);
        A0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5R) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof C0628My) {
                ((C0628My) view2).A04();
            } else {
                ((E9) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        C0529Iy adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap A0M = A0L.A10().A0M(adIcon.getUrl());
            if (A0M != null) {
                this.A02.setImageBitmap(A0M);
                if (z) {
                    this.A03.post(new YE(this, A0L));
                }
            } else {
                A0G(A0L, z, adIcon);
            }
        } else {
            InterfaceC0798To A15 = A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A11.A0E().A2b(A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A15 != null) {
                A15.AAv(JA.A00(adErrorType));
            }
            Log.e(A04(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C0887Xc adObjectContext2 = this.A07;
                adObjectContext2.A07().A9C(A04(258, 3, 84), C02627s.A0W, new C02637t(A04(192, 23, 96)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    public final C0887Xc A5d() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            C0676Ov c0676Ov = this.A0B;
            if (c0676Ov != null) {
                this.A06.bringChildToFront(c0676Ov);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) != 't') {
            A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            String[] strArr2 = A0F;
            strArr2[5] = "pFreRfYdfw1";
            strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C0887Xc) {
            this.A07 = (C0887Xc) context;
        } else {
            this.A07 = C5M.A02(context);
        }
        this.A07.A0H(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0F(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A04(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int currentHeight = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (currentHeight > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = currentHeight;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 116) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5R) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5R) this.A05.getMediaViewVideoRendererApi()).A07(new Y7(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C5R) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A09());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((Y6) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(LL.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 114));
    }
}
