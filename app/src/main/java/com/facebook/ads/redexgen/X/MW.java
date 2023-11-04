package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class MW extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (Kk.A02 * 8.0f);
    public static final int A06 = (int) (Kk.A02 * 14.5d);
    public static final int A04 = (int) (Kk.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public MW(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A00 = new ImageView(c0887Xc);
        this.A00.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c0887Xc);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout linearLayout = this.A01;
        LinearLayout.LayoutParams iconParams = A03;
        linearLayout.setLayoutParams(iconParams);
        this.A02 = new TextView(c0887Xc);
        LL.A0X(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        LinearLayout linearLayout2 = this.A01;
        TextView textView = this.A02;
        LinearLayout.LayoutParams iconParams2 = A03;
        linearLayout2.addView(textView, iconParams2);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(LT lt, String str, String str2) {
        this.A00.setImageBitmap(LU.A01(lt));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            LL.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i = A05;
            setPadding(0, i, 0, i);
            return;
        }
        int i2 = A06;
        setPadding(0, i2, 0, i2);
    }
}
