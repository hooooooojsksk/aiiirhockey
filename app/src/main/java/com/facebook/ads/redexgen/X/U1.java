package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class U1 extends C5K implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C0887Xc A01;
    @Nullable
    public InterfaceC0522Ir A02;
    @Nullable
    public AB A04;
    public C02316g A05;
    public C6Y A06;
    @DoNotStrip
    public Q9 A07;
    public QA A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final PG A0C = new U7(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public J3 A03 = J3.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, airhockey.J_INVITE, 60, 43, 32, 42, 43, 60, 43, 60, airhockey.J_INVITE, 45, 38, 39, 34, 42, airhockey.J_INVITE, 45, 33, 32, 40, 39, 41, 96, 14, 38, 39, 42, 34, 21, 42, 38, 52, 21, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, airhockey.J_ACHIEVEMENTCALLBACK, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, 16, 43, 36, 39, 41, 32, airhockey.J_GAME_STANDBY, 49, 42, airhockey.J_GAME_STANDBY, 35, 44, 43, 33, airhockey.J_GAME_STANDBY, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, airhockey.J_GAME_STANDBY, 38, 45, 44, 41, 33, airhockey.J_GAME_ENEMYEXIT};
    }

    static {
        A0E();
        A0H = U1.class.getSimpleName();
    }

    private InterfaceC0524It A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new U6(this, mediaViewVideoRendererApi);
    }

    private InterfaceC0524It A02(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        InterfaceC0524It mediaViewVideoRendererChild = new U5(this, mediaViewVideoRendererApi);
        return mediaViewVideoRendererChild;
    }

    private Q9 A04() {
        return new U3(this);
    }

    private QA A05() {
        return new QA(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        AB ab = this.A04;
        if (ab != null) {
            PH ph = (PH) ab.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            ph.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        AB ab = this.A04;
        if (ab != null) {
            ab.getVideoView().setOnTouchListener(new View$OnTouchListenerC0521Iq(this));
        }
    }

    private void A0B() {
        AB ab = this.A04;
        if (ab != null) {
            PH ph = (PH) ab.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            ph.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        AB ab = this.A04;
        if (ab != null && ab.getState() == Q7.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    public void A0D() {
        this.A03 = J3.A03;
        A0B();
    }

    public void A0I(C0799Tp c0799Tp, @Nullable InterfaceC0522Ir interfaceC0522Ir) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC0522Ir;
        A09();
        C02316g c02316g = this.A05;
        if (c0799Tp != null) {
            C0529Iy adCoverImage = c0799Tp.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                str = c0799Tp.getAdCoverImage().getUrl();
                c02316g.setImage(str, new U4(this));
                this.A03 = c0799Tp.A18();
                this.A06.setPlayAccessibilityLabel(c0799Tp.A1E());
                this.A06.setPauseAccessibilityLabel(c0799Tp.A1D());
                this.A08.A0U();
            }
        }
        str = null;
        c02316g.setImage(str, new U4(this));
        this.A03 = c0799Tp.A18();
        this.A06.setPlayAccessibilityLabel(c0799Tp.A1E());
        this.A06.setPauseAccessibilityLabel(c0799Tp.A1D());
        this.A08.A0U();
    }

    public void A0J(PK pk) {
        AB ab = this.A04;
        if (ab != null) {
            ab.A0b(pk, 24);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    public boolean A0K() {
        AB ab = this.A04;
        if (ab == null || ab.getState() == Q7.A06) {
            return false;
        }
        return this.A03 == J3.A05 || this.A03 == J3.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        InterfaceC0524It A02;
        ((C5K) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        if (i == 0) {
            A02 = A02(mediaViewVideoRendererApi);
        } else if (i == 1) {
            A02 = A01(mediaViewVideoRendererApi);
        } else {
            throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5R) mediaViewVideoRendererApi).A06(A02);
        this.A01 = C5M.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C02316g(this.A01);
        this.A07 = A04();
        this.A08 = A05();
        float density = Kk.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C6Y(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int bigPadding2 = 0;
        while (true) {
            int childCount = this.A00.getChildCount();
            if (A0G[3].length() == 24) {
                String[] strArr = A0G;
                strArr[2] = "oEzbzrDqpY4LpZuK9aeaZZijHYv0V";
                strArr[0] = "65U2aK7TrzSKlLOXQMMYyslcv3rZK";
                if (bigPadding2 >= childCount) {
                    break;
                }
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof AB) {
                    this.A04 = (AB) childAt;
                    break;
                }
                bigPadding2++;
            } else {
                throw new RuntimeException();
            }
        }
        AB ab = this.A04;
        if (ab == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 58));
            }
        } else {
            ab.A0c(this.A05);
            this.A04.A0c(this.A06);
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        A02.AEx();
        String[] strArr2 = A0G;
        if (strArr2[4].length() != strArr2[1].length()) {
            String[] strArr3 = A0G;
            strArr3[4] = "NjD77g9sbns6FUonJskLzorZMVzfs";
            strArr3[1] = "sF6jyMJNRDvSJleY8k7g51skJQqlgl";
            return;
        }
        String[] strArr4 = A0G;
        strArr4[2] = "irNdkufru0tgAA9z3l7YlJhRv0dZK";
        strArr4[0] = "zN5wNlZvELtjdUjcESL7VUEU7ru13";
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new View$OnTouchListenerC0520Ip(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5K, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
