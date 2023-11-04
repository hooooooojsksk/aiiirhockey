package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class Y0 implements C6E {
    public final List<C0967a7> A00;
    public final /* synthetic */ C0910Xz A01;

    public Y0(C0910Xz c0910Xz, List<C0967a7> list) {
        this.A01 = c0910Xz;
        this.A00 = list;
    }

    private void A00() {
        C5W c5w;
        C5W c5w2;
        C5W c5w3;
        C0887Xc c0887Xc;
        C5W c5w4;
        C5W c5w5;
        C0887Xc c0887Xc2;
        c5w = this.A01.A00;
        c5w.A05(true);
        c5w2 = this.A01.A00;
        c5w2.A02();
        c5w3 = this.A01.A00;
        c5w3.A03(0);
        for (C0967a7 c0967a7 : this.A00) {
            c0887Xc = this.A01.A01;
            InterfaceC0528Ix A0K = C0799Tp.A0K();
            c5w4 = this.A01.A00;
            C0799Tp c0799Tp = new C0799Tp(c0887Xc, c0967a7, null, A0K, c5w4.A01());
            if (c0799Tp.A0y() != null && c0799Tp.A0y().A0F() != null) {
                ((ZV) c0799Tp.A0y().A0F()).A00(c0799Tp);
            }
            c5w5 = this.A01.A00;
            c0887Xc2 = this.A01.A01;
            c5w5.A04(new NativeAd(c0887Xc2, c0799Tp));
        }
        C0547Js.A00(new Y1(this));
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAT() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAb() {
        A00();
    }
}
