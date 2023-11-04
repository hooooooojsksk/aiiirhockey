package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lg */
/* loaded from: assets/audience_network.dex */
public final class C0584Lg extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2D A02;
    public final C0887Xc A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{airhockey.J_REWARD, 83};
    }

    static {
        A03();
        A08 = (int) (Kk.A02 * 50.0f);
        A05 = (int) (Kk.A02 * 10.0f);
        A06 = (int) (Kk.A02 * 20.0f);
        A09 = (int) (Kk.A02 * 4.0f);
        A07 = (int) (Kk.A02 * 12.0f);
    }

    public C0584Lg(C0887Xc c0887Xc, int i) {
        super(c0887Xc);
        this.A03 = c0887Xc;
        this.A02 = C2E.A00(c0887Xc.A01());
        setOrientation(0);
        this.A00 = new ImageView(c0887Xc);
        this.A01 = new ImageView(c0887Xc);
        A04(i);
    }

    private void A04(int i) {
        LT lt;
        A05(this.A00, LT.AD_CHOICES_ICON);
        if (i == 2) {
            int i2 = A05;
            setPadding(i2, i2 / 3, i2, i2 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            int i3 = A05;
            textView.setPadding(0, i3 / 2, i3 / 2, i3 / 2);
            LL.A0X(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            int i4 = A07;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        int i5 = A05;
        setPadding(i5, i5, i5, i5);
        if (i == 1) {
            lt = LT.AN_INFO_ICON;
        } else {
            lt = LT.DEFAULT_INFO_ICON;
        }
        A05(this.A01, lt);
        int i6 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        int i7 = A06;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i7, i7);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, LT lt) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(LU.A01(lt));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1V c1v, String str, C0513Ii c0513Ii, InterfaceC0587Lj interfaceC0587Lj) {
        setOnClickListener(new View$OnClickListenerC0583Lf(this, c0513Ii, interfaceC0587Lj, str, c1v));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i);
        LL.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}
