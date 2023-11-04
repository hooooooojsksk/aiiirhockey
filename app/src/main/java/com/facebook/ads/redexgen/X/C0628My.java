package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.My */
/* loaded from: assets/audience_network.dex */
public final class C0628My extends RelativeLayout {
    public static InterfaceC0587Lj A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public YO A00;
    public C0887Xc A01;
    public C00970w A02;
    @Nullable
    public C0773So A03;
    @Nullable
    public NT A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (Kk.A02 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (Kk.A02 * 15.0f);
        A05 = new C0772Sn();
    }

    public C0628My(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A01 = c0887Xc;
        this.A02 = new C00970w(c0887Xc);
        LL.A0K(this.A02);
        this.A00 = new EA();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C0668On> A01(AbstractC0952Zs abstractC0952Zs) {
        if (abstractC0952Zs == null) {
            return new ArrayList<>();
        }
        List<C1C> A0o = abstractC0952Zs.A0o();
        ArrayList<C0668On> arrayList = new ArrayList<>(A0o.size());
        for (int i = 0; i < A0o.size(); i++) {
            arrayList.add(new C0668On(i, A0o.size(), A0o.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C0799Tp c0799Tp, int i) {
        ArrayList<C0668On> A01 = A01(c0799Tp.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C0773So(this.A01, A01, c0799Tp.A0z(), this.A01.A01().A09(), c0799Tp, A05, c0799Tp.A0z().A0m(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i - A08, 16, 0);
        this.A03.A06();
        setupDotsLayout(c0799Tp, A01);
    }

    public final void A06(QA qa) {
        C0773So c0773So = this.A03;
        if (c0773So != null) {
            c0773So.A0G(qa);
        } else {
            this.A01.A07().A9C(A00(51, 7, 29), C02627s.A1u, new C02637t(A00(0, 51, 45)));
        }
        this.A02.A23(qa);
    }

    public static InterfaceC0587Lj getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0773So c0773So;
        if (z && (c0773So = this.A03) != null) {
            c0773So.A0F((i3 - i) - A08, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setUpLayoutForCardAtIndex(int i) {
        NT nt = this.A04;
        if (nt != null) {
            nt.A00(i);
        }
    }

    private void setupDotsLayout(C0799Tp c0799Tp, ArrayList<C0668On> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new C0771Sm(this));
        this.A04 = new NT(this.A01, c0799Tp.A0z().A0g().A01(), arrayList.size());
        LL.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
