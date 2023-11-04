package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class MG extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2D A02;
    public final C0887Xc A03;
    public final MJ A04;
    public final boolean A05;
    public static final int A09 = (int) (Kk.A02 * 16.0f);
    public static final int A0A = (int) (Kk.A02 * 8.0f);
    public static final int A0D = (int) (Kk.A02 * 44.0f);
    public static final int A08 = (int) (Kk.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (Kk.A02 * 75.0f);
    public static final int A0B = (int) (Kk.A02 * 25.0f);
    public static final int A0F = (int) (Kk.A02 * 45.0f);
    public static final int A0C = (int) (Kk.A02 * 15.0f);
    public static final int A06 = (int) (Kk.A02 * 16.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MG(com.facebook.ads.redexgen.X.MF r11) {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.Xc r0 = com.facebook.ads.redexgen.X.MF.A01(r11)
            r10.<init>(r0)
            com.facebook.ads.redexgen.X.Xc r0 = com.facebook.ads.redexgen.X.MF.A01(r11)
            r10.A03 = r0
            com.facebook.ads.redexgen.X.Xc r0 = r10.A03
            com.facebook.ads.redexgen.X.Xb r0 = r0.A01()
            com.facebook.ads.redexgen.X.2D r0 = com.facebook.ads.redexgen.X.C2E.A00(r0)
            r10.A02 = r0
            com.facebook.ads.redexgen.X.MJ r0 = com.facebook.ads.redexgen.X.MF.A03(r11)
            r10.A04 = r0
            boolean r0 = com.facebook.ads.redexgen.X.MF.A09(r11)
            if (r0 == 0) goto La1
            int r0 = com.facebook.ads.redexgen.X.MG.A0E
        L27:
            r10.A01 = r0
            boolean r0 = com.facebook.ads.redexgen.X.MF.A09(r11)
            if (r0 == 0) goto L9e
            int r0 = com.facebook.ads.redexgen.X.MG.A0B
        L31:
            r10.A00 = r0
            boolean r0 = com.facebook.ads.redexgen.X.MF.A0A(r11)
            r10.A05 = r0
            r0 = 1
            r10.setFocusable(r0)
            android.view.View r7 = r10.A01(r11)
            android.view.View r6 = r10.A00(r11)
            android.view.View r5 = r10.getFooterView()
            com.facebook.ads.redexgen.X.LL.A0K(r7)
            com.facebook.ads.redexgen.X.LL.A0K(r6)
            com.facebook.ads.redexgen.X.LL.A0K(r5)
            r9 = -2
            r8 = -1
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r8, r9)
            r0 = 10
            r4.addRule(r0)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r8, r8)
            r0 = 13
            r3.addRule(r0)
            r1 = 3
            int r0 = r7.getId()
            r3.addRule(r1, r0)
            r1 = 2
            int r0 = r5.getId()
            r3.addRule(r1, r0)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r8, r9)
            r0 = 12
            r2.addRule(r0)
            int r0 = com.facebook.ads.redexgen.X.MG.A09
            r1 = 0
            r2.setMargins(r0, r1, r0, r0)
            r10.addView(r7, r4)
            r10.addView(r6, r3)
            r10.addView(r5, r2)
            boolean r0 = com.facebook.ads.redexgen.X.MF.A0B(r11)
            if (r0 == 0) goto L9b
        L97:
            r5.setVisibility(r1)
            return
        L9b:
            r1 = 8
            goto L97
        L9e:
            int r0 = com.facebook.ads.redexgen.X.MG.A0C
            goto L31
        La1:
            int r0 = com.facebook.ads.redexgen.X.MG.A0F
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.MG.<init>(com.facebook.ads.redexgen.X.MF):void");
    }

    public /* synthetic */ MG(MF mf, MD md) {
        this(mf);
    }

    private View A00(MF mf) {
        LT lt;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        int i2 = this.A00;
        imageView.setPadding(i2, i2, i2, i2);
        lt = mf.A01;
        imageView.setImageBitmap(LU.A01(lt));
        imageView.setColorFilter(-1);
        int i3 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i = mf.A00;
        gradientDrawable.setColor(i);
        LL.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i4 = A09;
        layoutParams.setMargins(i4, 0, i4, i4);
        TextView textView = new TextView(getContext());
        LL.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        str = mf.A06;
        textView.setText(str);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A09;
        layoutParams2.setMargins(i5, 0, i5, i5);
        TextView textView2 = new TextView(getContext());
        LL.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        str2 = mf.A05;
        textView2.setText(str2);
        textView2.setGravity(17);
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(-1, -2);
        int i6 = A09;
        subtitleParams.setMargins(i6, 0, i6, i6);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, subtitleParams);
        z = mf.A09;
        if (z) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = mf.A04;
            if (!TextUtils.isEmpty(str3)) {
                NU nu = new NU(this.A03);
                int i7 = A0F;
                LinearLayout.LayoutParams subtitleParams2 = new LinearLayout.LayoutParams(i7, i7);
                subtitleParams2.setMargins(0, 0, A0A, 0);
                nu.setFullCircleCorners(true);
                AsyncTaskC0764Sf asyncTaskC0764Sf = new AsyncTaskC0764Sf(nu, this.A03);
                int i8 = A0F;
                AsyncTaskC0764Sf A05 = asyncTaskC0764Sf.A05(i8, i8);
                str5 = mf.A04;
                A05.A07(str5);
                linearLayout2.addView(nu, subtitleParams2);
            }
            ML ml = new ML(this.A03);
            str4 = mf.A03;
            ml.setData(str4, LT.CHECKMARK);
            ml.setSelected(true);
            linearLayout2.addView(ml, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(MF mf) {
        boolean z;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z = mf.A0A;
        if (z) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(LU.A01(LT.CROSS));
            imageView.setOnClickListener(new MD(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(LU.A01(LT.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        LL.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i2 = A0A;
        managePrefsText.setPadding(i2, i2, i2, i2);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ME(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
