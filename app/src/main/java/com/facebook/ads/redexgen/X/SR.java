package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SR extends AbstractC0638Ni {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C0551Jx A00;
    @Nullable
    public JS A01;
    public JP A02;
    public final AbstractC0952Zs A03;
    public final C1C A04;
    public final ND A05;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A06 = new byte[]{9, 5, 7, airhockey.P_GAME_SELECTMAP, 12, 11, 9, 15, 8, 5, 5, 1, airhockey.P_GAME_SELECTMAP, 11, 14, 25, airhockey.P_GAME_SELECTMAP, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, airhockey.P_GAME_SELECTMAP, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, airhockey.P_GAME_EXIT, 75, airhockey.P_GAME_EXIT, airhockey.J_BACK, 88, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, 75, 65};
    }

    static {
        A0D();
        A0B = (int) (Kk.A02 * 48.0f);
        A0F = (int) (Kk.A02 * 16.0f);
        A08 = (int) (Kk.A02 * 4.0f);
        A0E = (int) (Kk.A02 * 44.0f);
        A0C = (int) (Kk.A02 * 8.0f);
        A0D = (int) (Kk.A02 * 12.0f);
        A0H = (int) (Kk.A02 * 12.0f);
        A0G = (int) (Kk.A02 * 26.0f);
        A09 = C01272a.A01(-1, 77);
        A0A = C01272a.A01(A09, 90);
    }

    public SR(C0642Nm c0642Nm, boolean z) {
        super(c0642Nm, z);
        this.A03 = c0642Nm.A04();
        this.A04 = this.A03.A0h();
        this.A05 = A0B(c0642Nm);
        AbstractC0586Li A082 = c0642Nm.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private ND A0B(C0642Nm c0642Nm) {
        String A0C2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0642Nm.A04().A0K().equals(A0C(37, 14, 56))) {
            A0C2 = PN.A04.A02();
        } else if (A07[3].charAt(14) != '2') {
            throw new RuntimeException();
        } else {
            A07[5] = "WUaGuSp4tuIpD6iTfwLrbbBI";
            A0C2 = A0C(0, 37, 124);
        }
        SW sw = new SW(c0642Nm.A05(), A0B, this.A04.A0E().A00() == C1H.A05, getColors(), this.A04.A0F().A06(), A0C2, c0642Nm.A06(), c0642Nm.A09(), c0642Nm.A0B(), c0642Nm.A07());
        this.A02 = new JP(sw, HttpStatus.SC_BAD_REQUEST, 100, 0);
        LL.A0K(sw);
        sw.A0C(c0642Nm.A00());
        if (IK.A0y(c0642Nm.A05())) {
            sw.A0B();
            if (c0642Nm.A08() != null) {
                c0642Nm.A08().setCTAClickListener(getCtaButton());
            }
        }
        addView(sw, layoutParams);
        sw.getCTAButton().A0A(this.A03, c0642Nm.A08());
        return sw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public void A0c(C1C c1c, String str, double d, @Nullable Bundle bundle) {
        super.A0c(c1c, str, d, bundle);
        this.A05.setInfo(c1c.A0E(), c1c.A0F(), str, this.A03.A0k().A01(), null);
    }

    public final int A0f(@Nullable AbstractC0586Li abstractC0586Li) {
        return abstractC0586Li == null ? AbstractC0586Li.A00 : abstractC0586Li.getToolbarHeight();
    }

    public void A0g() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new C0551Jx(true);
            JS js = this.A01;
            if (js != null) {
                C0551Jx c0551Jx = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                c0551Jx.A0I(js);
            }
            C1L A01 = this.A03.A0g().A01();
            this.A00.A0I(new JQ(getAdDetailsView().getCTAButton(), HttpStatus.SC_MULTIPLE_CHOICES, -1, A01.A09(true)));
            Drawable A082 = LL.A08(A09, A0A, A08);
            Drawable startDrawable = LL.A05(A01.A08(true), A08);
            this.A00.A0I(new JT(getAdDetailsView().getCTAButton(), HttpStatus.SC_MULTIPLE_CHOICES, A082, startDrawable));
            this.A00.A0I(new JR(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AbstractC0952Zs getAdDataBundle() {
        return this.A03;
    }

    public JP getAdDetailsAnimation() {
        return this.A02;
    }

    public ND getAdDetailsView() {
        return this.A05;
    }

    public C1C getAdInfo() {
        return this.A04;
    }

    public C0551Jx getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0C(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        JS js = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (js == null) {
            this.A01 = new JS(expandableLayout, HttpStatus.SC_MULTIPLE_CHOICES, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
