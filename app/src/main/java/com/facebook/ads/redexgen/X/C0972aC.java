package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.aC */
/* loaded from: assets/audience_network.dex */
public class C0972aC extends Q9 {
    public final /* synthetic */ C0970aA A00;

    public C0972aC(C0970aA c0970aA) {
        this.A00 = c0970aA;
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A02() {
        LD ld;
        LD ld2;
        C0402Dv c0402Dv;
        C0958Zy c0958Zy;
        C0402Dv c0402Dv2;
        F3 f3;
        QA qa;
        LD ld3;
        F3 f32;
        InterfaceC0505Ia interfaceC0505Ia;
        F3 f33;
        QA qa2;
        ld = this.A00.A05;
        if (!ld.A07()) {
            ld2 = this.A00.A05;
            ld2.A05();
            c0402Dv = this.A00.A03;
            InterfaceC0989aT A0E = c0402Dv.A0E();
            c0958Zy = this.A00.A01;
            A0E.A3a(c0958Zy != null);
            c0402Dv2 = this.A00.A03;
            c0402Dv2.A0E().A2Z();
            f3 = this.A00.A02;
            AnonymousClass29.A00(f3.A0I());
            NA na = new NA();
            qa = this.A00.A0A;
            NA A03 = na.A03(qa);
            ld3 = this.A00.A05;
            NA A02 = A03.A02(ld3);
            f32 = this.A00.A02;
            Map<String, String> A05 = A02.A04(f32.A0J()).A05();
            interfaceC0505Ia = this.A00.A04;
            f33 = this.A00.A02;
            interfaceC0505Ia.A9H(f33.A0m(), A05);
            qa2 = this.A00.A0A;
            qa2.A0V();
        }
    }
}
