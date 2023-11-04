package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.text.NumberFormat;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class SW extends ND {
    public static byte[] A0I;
    public static String[] A0J = {"ZYFZvgakVe", "Z9juamcNffZ", "L6NhnuluGVbfOuIZp07EBLc1k7rVfOba", "poGipFcmqzgO1AN9d1VwktKUuwbeuE2x", "1MA0bi3k", "zUZ", "l0mlyabDLiJh1QvHe0VixDkOpEP8aZzg", "KStQaqdBmF0CfboN9Wjc4"};
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C1J A06;
    public C1L A07;
    public C1M A08;
    public NW A09;
    public boolean A0A;
    public boolean A0B;
    public final LinearLayout A0C;
    public final RelativeLayout A0D;
    public final RelativeLayout A0E;
    public final TextView A0F;
    public final C0887Xc A0G;
    public final boolean A0H;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A04() {
        this.A0D.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0N;
        this.A0D.setLayoutParams(layoutParams);
        LL.A0K(this.A0D);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(super.A00, super.A00);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0D.addView(super.A05, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0O;
        layoutParams3.addRule(1, super.A05.getId());
        layoutParams3.addRule(15);
        this.A0D.addView(this.A0E, layoutParams3);
        this.A0E.removeAllViews();
        LL.A0K(this.A05);
        this.A05.setLayoutParams(ND.A08);
        this.A05.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        LL.A0X(this.A05, true, 18);
        this.A0E.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0P);
        layoutParams4.topMargin = A0O / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0E.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        LL.A0X(this.A04, false, 14);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = A0O;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A08() {
        A0I = new byte[]{-111, -20};
    }

    static {
        A08();
        A0Q = C01272a.A01(-1, 77);
        A0N = (int) (Kk.A02 * 12.0f);
        A0O = (int) (Kk.A02 * 8.0f);
        A0K = (int) (Kk.A02 * 26.0f);
        A0M = (int) (Kk.A02 * 144.0f);
        A0L = (int) (Kk.A02 * 48.0f);
        A0P = (int) (Kk.A02 * 16.0f);
        A0R = (int) (Kk.A02 * 14.0f);
    }

    public SW(C0887Xc c0887Xc, int i, boolean z, C1L c1l, boolean z2, String str, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, QA qa, LD ld) {
        super(c0887Xc, i, c1l, z2, str, interfaceC0505Ia, interfaceC0587Lj, qa, ld);
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0G = c0887Xc;
        super.A05.setFullCircleCorners(z);
        int i2 = A0N;
        setPadding(i2, i2, i2, A0K);
        this.A0D = new RelativeLayout(getContext());
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A09 = new NW(this.A0G, A0R, 5, A0Q, -1);
        this.A0E = new RelativeLayout(getContext());
        this.A0C = new LinearLayout(getContext());
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A02.addView(this.A0D);
        super.A02.addView(this.A0C);
        this.A0F = new TextView(getContext());
        this.A07 = c1l;
        this.A0H = IK.A0y(c0887Xc);
        LL.A0R(this, c0887Xc);
        this.A0A = IK.A1t(this.A0G);
        A06();
    }

    private void A02() {
        super.A04.setPadding(0, 0, 0, 0);
        super.A04.setLayoutParams(new LinearLayout.LayoutParams(-1, A0L));
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams;
        this.A0C.setOrientation(1);
        this.A0C.setPadding(0, 0, 0, A0N);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0D.getId());
        this.A0C.setLayoutParams(layoutParams2);
        this.A0C.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0A ? this.A07.A05(true) : -1);
        if (A0J[3].charAt(12) != '1') {
            throw new RuntimeException();
        }
        A0J[3] = "GrwjTtxURhrO1EQl6RsuguGKXpAC8Gmx";
        LL.A0X(this.A03, false, 16);
        if (this.A0H) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        LinearLayout linearLayout = this.A0C;
        String[] strArr = A0J;
        if (strArr[2].charAt(17) != strArr[6].charAt(17)) {
            throw new RuntimeException();
        }
        A0J[1] = "ewlwa2SJNlK21mEN5Hlfw30tD2ecrw";
        linearLayout.addView(this.A03, layoutParams);
    }

    private void A05() {
        LinearLayout.LayoutParams layoutParams;
        this.A0F.setMaxLines(1);
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A0F.setAllCaps(true);
        LL.A0X(this.A0F, false, 12);
        new LinearLayout.LayoutParams(-1, -2);
        if (this.A0H) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0N;
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A06() {
        removeAllViews();
        super.A02.setLayoutParams(ND.A08);
        A04();
        A03();
        A02();
        A05();
        A07();
        LL.A0J(super.A02);
        LL.A0J(super.A04);
        LL.A0J(this.A0F);
        addView(super.A02);
        addView(super.A04);
        addView(this.A0F);
    }

    private void A07() {
        C1J c1j = this.A06;
        if (c1j == null) {
            return;
        }
        this.A05.setText(c1j.A06());
        this.A03.setText(this.A06.A01());
        this.A0F.setText(this.A06.A04());
        if (TextUtils.isEmpty(this.A08.A04())) {
            LL.A0H(super.A04);
        }
        if (TextUtils.isEmpty(this.A06.A04())) {
            LL.A0H(this.A0F);
        }
        if (TextUtils.isEmpty(this.A06.A03())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        NW nw = this.A09;
        String A03 = this.A06.A03();
        if (A0J[0].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "VSVKlO90K15ihGB4A0qZPRqEppX5OU7U";
        strArr[6] = "xs76xd0mQfWREabMq0mbrfEp6FCRmbTD";
        nw.setRating(Float.parseFloat(A03));
        if (this.A06.A02() == null) {
            return;
        }
        TextView textView = this.A04;
        textView.setText(A01(0, 1, 6) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A06.A02())) + A01(1, 1, 96));
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public final void A09() {
        LL.A0H(super.A05);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0E.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public final void A0A() {
        LL.A0H(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public final void A0B() {
        super.A0B();
        this.A09.setOnClickListener(super.A01);
        this.A0F.setOnClickListener(super.A01);
        this.A04.setOnClickListener(super.A01);
        this.A03.setOnClickListener(super.A01);
        this.A05.setOnClickListener(super.A01);
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public final void A0C(int i) {
        int i2 = 1;
        boolean z = i == 1;
        if (!z) {
            i2 = 0;
        }
        setOrientation(i2);
        if (!z) {
            setWeightSum(5.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 4.0f;
            layoutParams.bottomMargin = A0K - A0N;
            super.A02.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, A0L);
            layoutParams2.bottomMargin = A0K / 2;
            layoutParams2.weight = 1.0f;
            layoutParams2.gravity = 80;
            super.A04.setLayoutParams(layoutParams2);
            super.A04.setMinWidth(A0M);
            LL.A0J(this.A0F);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = A0O;
            this.A0C.addView(this.A0F, layoutParams3);
            this.A0C.setPadding(0, 0, 0, 0);
            this.A0F.setGravity(3);
        } else {
            A06();
        }
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public final View getExpandableLayout() {
        return this.A0C;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0F.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public void setInfo(C1J c1j, C1M c1m, String str, String str2, @Nullable NH nh) {
        super.setInfo(c1j, c1m, str, str2, nh);
        this.A06 = c1j;
        this.A08 = c1m;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.ND
    public void setTitleMaxLines(int i) {
        this.A05.setMaxLines(i);
        this.A05.setEllipsize(TextUtils.TruncateAt.END);
    }
}
