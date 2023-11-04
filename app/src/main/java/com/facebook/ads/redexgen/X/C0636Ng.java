package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ng */
/* loaded from: assets/audience_network.dex */
public final class C0636Ng {
    public static final int A00 = Kk.A03.heightPixels;
    public static final int A01 = Kk.A03.widthPixels;

    public static float A00(C1C c1c) {
        int height = c1c.A0D().A01();
        int width = c1c.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) ((A01 - (AbstractC0638Ni.A07 * 2)) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = LL.A01(16);
        int ctaTextHeight = NM.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC0638Ni.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = A00;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static View.OnClickListener A03(View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa, String str) {
        return new View$OnClickListenerC0635Nf(view$OnClickListenerC0759Sa, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
