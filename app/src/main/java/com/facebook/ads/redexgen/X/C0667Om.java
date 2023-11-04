package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Om */
/* loaded from: assets/audience_network.dex */
public final class C0667Om extends LinearLayout {
    public static final int A04 = (int) (Kk.A02 * 32.0f);
    public static final int A05 = (int) (Kk.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public NU A02;
    public final C0887Xc A03;

    public C0667Om(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A03 = c0887Xc;
        A00(c0887Xc);
    }

    private final void A00(C0887Xc c0887Xc) {
        setGravity(16);
        this.A02 = new NU(c0887Xc);
        this.A02.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i, i);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c0887Xc);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c0887Xc);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LL.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c0887Xc);
        LL.A0X(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C1V c1v) {
        AsyncTaskC0764Sf asyncTaskC0764Sf = new AsyncTaskC0764Sf(this.A02, this.A03);
        int i = A04;
        asyncTaskC0764Sf.A05(i, i);
        asyncTaskC0764Sf.A07(c1v.A01());
        this.A00.setText(c1v.A02());
        this.A01.setText(c1v.A03());
    }
}
