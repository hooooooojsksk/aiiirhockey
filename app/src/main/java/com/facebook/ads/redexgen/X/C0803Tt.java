package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tt */
/* loaded from: assets/audience_network.dex */
public class C0803Tt extends Q9 {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C0967a7 A01;
    public final /* synthetic */ C0799Tp A02;
    public final /* synthetic */ boolean A03;

    public C0803Tt(C0799Tp c0799Tp, View view, boolean z, C0967a7 c0967a7) {
        this.A02 = c0799Tp;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c0967a7;
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A00() {
        J8 j8;
        j8 = this.A02.A0e;
        j8.A06();
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A01() {
        J8 j8;
        j8 = this.A02.A0e;
        j8.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A02() {
        J8 j8;
        J8 j82;
        C0887Xc c0887Xc;
        QA qa;
        WeakReference weakReference;
        LD ld;
        J8 j83;
        C0957Zx c0957Zx;
        View view;
        View view2;
        C0957Zx c0957Zx2;
        View view3;
        C0957Zx c0957Zx3;
        View view4;
        C0957Zx c0957Zx4;
        J1 j1;
        C0957Zx c0957Zx5;
        boolean z;
        C0957Zx c0957Zx6;
        boolean z2;
        C0957Zx c0957Zx7;
        boolean z3;
        C0957Zx c0957Zx8;
        boolean A0p;
        C0957Zx c0957Zx9;
        EnumC01000z enumC01000z;
        C0957Zx c0957Zx10;
        boolean z4;
        C0957Zx c0957Zx11;
        NativeAdLayout nativeAdLayout;
        C0957Zx c0957Zx12;
        String str;
        C0957Zx c0957Zx13;
        C0957Zx c0957Zx14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        QA qa2;
        Drawable drawable;
        QA qa3;
        J8 j84;
        QA qa4;
        J8 j85;
        j8 = this.A02.A0e;
        j8.A0B();
        if (IK.A1d(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof PH) && !((PH) adContentsView).A02()) {
                    qa4 = this.A02.A0R;
                    qa4.A0T();
                    j85 = this.A02.A0e;
                    j85.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                qa3 = this.A02.A0R;
                qa3.A0T();
                j84 = this.A02.A0e;
                j84.A07();
                return;
            }
            C0799Tp.A0e(drawable, imageView);
        }
        j82 = this.A02.A0e;
        c0887Xc = this.A02.A0c;
        j82.A0C(c0887Xc, this.A01.A0G());
        qa = this.A02.A0R;
        if (qa != null) {
            qa2 = this.A02.A0R;
            qa2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((Q9) weakReference3.get()).A02();
            }
        }
        ld = this.A02.A0f;
        if (ld.A07()) {
            j83 = this.A02.A0e;
            j83.A04();
            return;
        }
        this.A02.A0b();
        c0957Zx = this.A02.A09;
        if (c0957Zx != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c0957Zx2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c0957Zx2.A08(view3);
                    c0957Zx3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c0957Zx3.A07(view4);
                    c0957Zx4 = this.A02.A09;
                    j1 = this.A02.A0I;
                    c0957Zx4.A0B(j1);
                    c0957Zx5 = this.A02.A09;
                    z = this.A02.A0W;
                    c0957Zx5.A0E(z);
                    c0957Zx6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c0957Zx6.A0I(z2);
                    c0957Zx7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c0957Zx7.A0H(z3);
                    c0957Zx8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c0957Zx8.A0F(A0p);
                    c0957Zx9 = this.A02.A09;
                    enumC01000z = this.A02.A08;
                    c0957Zx9.A09(enumC01000z);
                    c0957Zx10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c0957Zx10.A0G(z4);
                    c0957Zx11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c0957Zx11.A0A(MI.A00(nativeAdLayout));
                    c0957Zx12 = this.A02.A09;
                    str = this.A02.A0S;
                    c0957Zx12.A0C(str);
                    c0957Zx13 = this.A02.A09;
                    c0957Zx13.A0J(this.A03);
                    c0957Zx14 = this.A02.A09;
                    c0957Zx14.A02();
                }
            }
        }
    }
}
