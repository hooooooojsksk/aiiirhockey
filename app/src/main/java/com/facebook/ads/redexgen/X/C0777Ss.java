package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ss */
/* loaded from: assets/audience_network.dex */
public final class C0777Ss extends MH {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2D A03;
    public final C0887Xc A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, airhockey.J_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_STANDBY, 89, 79, 10, airhockey.J_GAME_ENEMYEXIT, 78, 10, airhockey.J_ACHIEVEMENTCALLBACK, 79, 90, airhockey.P_GAME_STANDBY, 88, 94, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_SELECTMAP, 77};
    }

    static {
        A0C();
        A08 = (int) (Kk.A02 * 8.0f);
        A07 = (int) (Kk.A02 * 10.0f);
        A06 = (int) (Kk.A02 * 44.0f);
    }

    public C0777Ss(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str) {
        super(c0887Xc, interfaceC0505Ia, str);
        this.A04 = c0887Xc;
        this.A03 = C2E.A00(this.A04.A01());
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i = A07;
        imageView.setPadding(i, i, i, i);
        this.A00.setColorFilter(-10459280);
        int i2 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        LL.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i3 = A08;
        linearLayout.setPadding(i3, i3, i3, i3);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0L() {
        this.A00.setImageBitmap(LU.A01(LT.CROSS));
        this.A00.setOnClickListener(new View$OnClickListenerC0604Ma(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        ML ml = new ML(this.A04);
        ml.setData(this.A03.A0H(), LT.HIDE_AD);
        ml.setOnClickListener(new View$OnClickListenerC0605Mb(this, ml));
        ML ml2 = new ML(this.A04);
        ml2.setData(this.A03.A0L(), LT.REPORT_AD);
        ml2.setOnClickListener(new View$OnClickListenerC0606Mc(this, ml2));
        ML ml3 = new ML(this.A04);
        ml3.setData(this.A03.A0M(), LT.AD_CHOICES_ICON);
        ml3.setOnClickListener(new View$OnClickListenerC0607Md(this, ml3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        menuParams.setMargins(i, i, i, i);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LL.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(ml, menuParams);
        linearLayout.addView(ml2, menuParams);
        linearLayout.addView(ml3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0M() {
        LL.A0I(this);
        LL.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0N(C2H c2h, C2F c2f) {
        String A0H;
        LT lt;
        int i;
        this.A00.setOnClickListener(null);
        if (c2f == C2F.A05) {
            A0H = this.A03.A0F();
            lt = LT.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            lt = LT.HIDE_AD;
            i = -13272859;
        }
        MF A0I = new MF(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        MF A0H2 = A0I.A0H(title);
        String title2 = c2h.A04();
        MG adHiddenView = A0H2.A0F(title2).A0K(false).A0E(lt).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LL.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0O(C2H c2h, C2F c2f) {
        boolean isReportFlow = c2f == C2F.A05;
        MZ mz = new MZ(this.A04, c2h, this.A0B, isReportFlow ? LT.REPORT_AD : LT.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(LU.A01(LT.BACK_ARROW));
        this.A00.setOnClickListener(new View$OnClickListenerC0608Me(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        LL.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(mz, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final boolean A0P() {
        return true;
    }
}
