package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SU extends Q9 {
    public final /* synthetic */ C0633Nd A00;

    public SU(C0633Nd c0633Nd) {
        this.A00 = c0633Nd;
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A02() {
        LD ld;
        LD ld2;
        C0427Eu c0427Eu;
        QA qa;
        LD ld3;
        C0427Eu c0427Eu2;
        InterfaceC0505Ia interfaceC0505Ia;
        C0427Eu c0427Eu3;
        C0887Xc c0887Xc;
        C0427Eu c0427Eu4;
        InterfaceC0587Lj interfaceC0587Lj;
        MC mc;
        ld = this.A00.A0H;
        if (!ld.A07()) {
            ld2 = this.A00.A0H;
            ld2.A05();
            c0427Eu = this.A00.A0E;
            if (!TextUtils.isEmpty(c0427Eu.A0m())) {
                NA na = new NA();
                qa = this.A00.A0c;
                NA A03 = na.A03(qa);
                ld3 = this.A00.A0H;
                NA A02 = A03.A02(ld3);
                c0427Eu2 = this.A00.A0E;
                Map<String, String> A05 = A02.A04(c0427Eu2.A0J()).A05();
                interfaceC0505Ia = this.A00.A0G;
                c0427Eu3 = this.A00.A0E;
                interfaceC0505Ia.A9H(c0427Eu3.A0m(), A05);
                c0887Xc = this.A00.A0F;
                c0887Xc.A0E().A2Z();
                c0427Eu4 = this.A00.A0E;
                AnonymousClass29.A00(c0427Eu4.A0I());
                interfaceC0587Lj = this.A00.A0I;
                mc = this.A00.A0J;
                interfaceC0587Lj.A3t(mc.A6t());
            }
        }
    }
}
