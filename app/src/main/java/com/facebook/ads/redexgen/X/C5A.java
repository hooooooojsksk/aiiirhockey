package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.5A */
/* loaded from: assets/audience_network.dex */
public final class C5A implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E = {"of0bzA7MwNGTia9F31tAkieNA09H6OOQ", "TyTQj7xFBxvma6AaZ1TUwVS6lItsexiQ", "kN9yyhhGlFuDqh5wulKzoOOSsFZblOVu", "DXKKP4SSVuW5x9unPZpKCS00jdGSX4q", "ceBkREnsnDPWKQGMERGG6oDocc2kf8dJ", "ULZujO58Hn4sCnlurEwExiI5FfKtYml", "oBzM86F4GMvLYp6iWCqbmyfPVfF4ncm8", "8s2Qgj6JQYkd4IbFNTxV1lfTN5yJUxqm"};
    public long A00;
    @Nullable
    public View A01;
    @Nullable
    public AdListener A02;
    @Nullable
    public C0426Et A03;
    @Nullable
    public N8 A04;
    @Nullable
    public String A05;
    @Nullable
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final C0402Dv A0A;
    public final JD A0B;
    public final String A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-78, -79, -77, -26, -79, -74, -30, -29, airhockey.J_WAIT, 119, -88, 123, 126, airhockey.J_ACHIEVEMENTCALLBACK, -85, 119, -13, 32, 33, -14, -11, -8, -11, 36, -17, 14, 27, 27, 18, 31, -51, 14, 17, -51, 17, 18, 32, 33, 31, 28, 38, 18, 17, -14, 17, 30, 30, 21, 34, -48, 17, 20, -48, 28, 31, 17, 20, -48, 34, 21, 33, 37, 21, 35, 36, 21, 20, -118, -88, -75, -75, -74, -69, airhockey.J_ENEMYWIN, -83, -80, -75, -85, airhockey.J_ENEMYWIN, -88, airhockey.J_ENEMYWIN, -69, -84, -76, -73, -77, -88, -69, -84, airhockey.J_ENEMYWIN, -69, -81, -88, -69, airhockey.J_ENEMYWIN, -77, -74, -88, -85, airhockey.J_ENEMYWIN, -87, -80, -85, airhockey.J_ENEMYWIN, airhockey.J_INVITE, airhockey.J_GAME_DISCONNECT, -70, airhockey.J_INVITE, -77, -74, -91, -69, -52, -73, -20, -19, -5, -4, -6, -9, 1, -40, -37, -51, -48, -83, -48};
        if (A0E[2].charAt(11) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "i0zr3oWhaZ1ZQYjulO9yltnfKtDweGPM";
        strArr[6] = "f16HnFk6V4WfoRTY4RGQrwGHYb77b2mz";
        A0D = bArr;
    }

    static {
        A02();
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C5A(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = KY.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = C5M.A06(context);
            this.A0A.A0E().A2h(AdPlacementType.BANNER.toString(), str);
            C01161p c01161p = new C01161p(str, KY.A05(this.A0B), AdPlacementType.BANNER, KY.A04(adSize), 1);
            c01161p.A06(this.A05);
            c01161p.A07(this.A06);
            this.A03 = new C0426Et(this.A0A, c01161p);
            this.A03.A0O(new YF(this));
            return;
        }
        throw new IllegalArgumentException(A01(108, 6, 18));
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C5A(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws JB {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0E().A3d();
    }

    public static AdSize A00(String str) throws JB {
        JF template = JK.A00(str);
        if (template != null) {
            JK.A03(template);
            return KY.A01(template);
        }
        throw new JB(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(67, 41, 7), str));
    }

    private void A03(@Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0E().A2e();
        } else {
            this.A0A.A0E().A2d();
        }
        C0426Et c0426Et = this.A03;
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "8EJDtH9EjlwutgZO3WtzB3nx702AY4O";
        strArr2[5] = "dTiKD7UwUCw1SvcKYJrEphBgoR9CLtC";
        if (c0426Et != null) {
            c0426Et.A0R(str);
        }
        this.A0A.A0E().A2c();
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    @Nullable
    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    @Nullable
    public final C0426Et A08() {
        return this.A03;
    }

    public final C0402Dv A09() {
        return this.A0A;
    }

    public final JD A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        C0676Ov A01;
        this.A0A.A0E().A3q(this.A06 != null);
        String str = this.A06;
        if (str != null && (A01 = C0675Ou.A01(this.A0A, str)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(A01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(@Nullable AdListener adListener) {
        this.A0A.A0E().A2a(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(N8 n8) {
        this.A04 = n8;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C0518In(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        JO.A05(A01(114, 7, 72), A01(24, 19, 109), A01(0, 8, 65));
        this.A0A.A0E().A2i();
        C0426Et c0426Et = this.A03;
        if (c0426Et != null) {
            c0426Et.A0T(true);
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18 && this.A04 != null && IK.A10(this.A08.getContext())) {
            N8 n8 = this.A04;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "fmi4ltQko56R0Ot1hIU3uMuoiOam3SD1";
            strArr2[6] = "7H1g3sSDF1cZj7eOXlokIXc1uirRZwhG";
            n8.A07();
            View view = this.A01;
            if (view != null) {
                view.getOverlay().remove(this.A04);
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        C0426Et c0426Et = this.A03;
        boolean z = c0426Et == null || c0426Et.A0U();
        this.A0A.A0E().A4b(z);
        return z;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        JO.A05(A01(121, 6, 44), A01(43, 24, 112), A01(16, 8, 127));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        JO.A05(A01(121, 6, 44), A01(43, 24, 112), A01(8, 8, 5));
        A03(((C0518In) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            JH.A01(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        C0426Et c0426Et;
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
        if (IK.A0i(this.A0A) && (c0426Et = this.A03) != null) {
            c0426Et.A07.A06(this.A05);
            this.A03.A07.A07(this.A06);
        }
    }
}
