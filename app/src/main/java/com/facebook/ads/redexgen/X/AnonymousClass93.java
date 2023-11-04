package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.93 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass93 extends SR implements M1 {
    public static byte[] A0F;
    public static String[] A0G = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    @Nullable
    public View A00;
    public View A01;
    public C0887Xc A02;
    @Nullable
    public C0558Ke A03;
    @Nullable
    public AbstractC0586Li A04;
    public P3 A05;
    @Nullable
    public JP A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC0587Lj A09;
    public final NR A0A;
    public final NS A0B;
    public final RA A0C;
    public final JW A0D;
    public final AtomicBoolean A0E;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A08();
    }

    public AnonymousClass93(C0642Nm c0642Nm) {
        super(c0642Nm, false);
        this.A0E = new AtomicBoolean(false);
        this.A08 = false;
        this.A07 = false;
        this.A02 = c0642Nm.A05();
        this.A04 = c0642Nm.A08();
        this.A01 = new View(this.A02);
        LL.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A05();
        this.A09 = c0642Nm.A09();
        C0634Ne.A00(c0642Nm.A05(), this, getAdInfo().A0D().A07());
        this.A0C = A01(c0642Nm);
        getAdDetailsView().bringToFront();
        this.A0D = A02(c0642Nm);
        A0g();
        this.A05 = new P3(this.A02, c0642Nm.A06(), getAdDataBundle());
        this.A0A = new SP(this);
        this.A0B = new NS(c0642Nm, getAdDataBundle(), this.A0C, this.A0D, getAdDetailsView(), this.A09, this.A0A);
        if (IK.A14(getAdContextWrapper())) {
            this.A0C.getVideoImplView().setOnClickListener(new View$OnClickListenerC0644No(this));
        }
    }

    private RA A01(C0642Nm c0642Nm) {
        RA ra = (RA) c0642Nm.A02();
        int A0f = A0f(c0642Nm.A08());
        ImageView imageView = (ImageView) c0642Nm.A03();
        int i = SR.A0D;
        int i2 = SR.A0D;
        int toolbarHeight = SR.A0D;
        imageView.setPadding(i, i2, toolbarHeight, SR.A0D);
        int toolbarHeight2 = SR.A0E;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, SR.A0E);
        int toolbarHeight3 = SR.A0C;
        layoutParams.setMargins(0, A0f, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(ra, layoutParams2);
        ra.addView(imageView, layoutParams);
        return ra;
    }

    private JW A02(C0642Nm c0642Nm) {
        JW A0A = c0642Nm.A0A();
        A0A.A06(-1, SR.A09);
        A0A.setPadding(SR.A0H, SR.A0H, SR.A0H, SR.A0H);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, SR.A0G);
        progressBarLayoutParams.addRule(12);
        addView(A0A, progressBarLayoutParams);
        return A0A;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0C.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        AbstractC0586Li abstractC0586Li = this.A04;
        if (abstractC0586Li == null) {
            return;
        }
        this.A06 = new JP(abstractC0586Li, HttpStatus.SC_BAD_REQUEST, -abstractC0586Li.getToolbarHeight(), 0);
    }

    private void A06() {
        new C0513Ii(getAdDataBundle().A0m(), getAdEventManager()).A04(EnumC0512Ih.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0E.set(true);
        LL.A0T(this);
        LL.A0H(this.A0C);
        LL.A0Z(this.A0C, this.A0D, this.A0B, this.A00);
        LL.A0L(this.A04);
        P3 p3 = this.A05;
        View$OnClickListenerC0759Sa ctaButton = getCtaButton();
        String[] strArr = A0G;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<P2, View> A03 = p3.A03(ctaButton);
        this.A00 = (View) A03.second;
        int i = C0645Np.A00[((P2) A03.first).ordinal()];
        if (i == 1) {
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, A0f(this.A04), 0, 0);
            layoutParams.addRule(2, getAdDetailsView().getId());
            addView(this.A00, layoutParams);
        } else if (i == 2) {
            LL.A0Z(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(SR.A0F, SR.A0F, SR.A0F, SR.A0F);
            addView(this.A00, layoutParams2);
        }
        if (getAdInfo().A0G().A00() >= 0) {
            this.A07 = true;
            AbstractC0586Li abstractC0586Li = this.A04;
            if (abstractC0586Li != null) {
                abstractC0586Li.setToolbarActionMode(2);
                this.A04.setProgressImmediate(0.0f);
            }
            this.A03 = new C0558Ke((int) getAdInfo().A0G().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new SO(this));
            this.A03.A08();
        }
    }

    private void A07() {
        JP jp = this.A06;
        if (jp != null) {
            jp.A3N(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3N(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final void A0B(AnonymousClass72 anonymousClass72) {
        super.A0B(anonymousClass72);
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final void A0C(C02456y c02456y) {
        super.A0C(c02456y);
        int videoLengthMs = c02456y.A00();
        int duration = this.A0C.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0G[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0G[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final void A0X() {
        super.A0X();
        A04();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.X.SR, com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final void A0c(C1C c1c, String str, double d, @Nullable Bundle bundle) {
        super.A0c(c1c, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(0, 31, 118), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(55, 18, 103), false)) {
            A06();
        }
        if (bundle.getBoolean(A03(31, 24, 116), false)) {
            NS ns = this.A0B;
            if (A0G[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            ns.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0e(boolean z) {
        if (z && !this.A08) {
            boolean z2 = this.A0E.get();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0G;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    this.A0B.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0G[5].charAt(17) != 'k') {
            A0G[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0E.get()) {
                this.A0C.A0a(PF.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.SR
    public final void A0g() {
        super.A0g();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A93(this.A0C);
        }
    }

    public final boolean A0h() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (this.A07) {
            return 2;
        }
        if (A0h() && !this.A0E.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.SR, com.facebook.ads.redexgen.X.AbstractC0638Ni, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
