package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SC extends Q9 {
    public final /* synthetic */ C02918w A00;

    public SC(C02918w c02918w) {
        this.A00 = c02918w;
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A02() {
        LD ld;
        LD ld2;
        QA qa;
        LD ld3;
        InterfaceC0505Ia interfaceC0505Ia;
        AbstractC0952Zs abstractC0952Zs;
        C0887Xc c0887Xc;
        AbstractC0952Zs abstractC0952Zs2;
        InterfaceC0587Lj interfaceC0587Lj;
        InterfaceC0587Lj interfaceC0587Lj2;
        MC mc;
        ld = this.A00.A0B;
        if (!ld.A07()) {
            ld2 = this.A00.A0B;
            ld2.A05();
            NA na = new NA();
            qa = this.A00.A0H;
            NA A03 = na.A03(qa);
            ld3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(ld3).A05();
            interfaceC0505Ia = this.A00.A08;
            abstractC0952Zs = this.A00.A06;
            interfaceC0505Ia.A9H(abstractC0952Zs.A0m(), A05);
            c0887Xc = this.A00.A07;
            c0887Xc.A0E().A2Z();
            abstractC0952Zs2 = this.A00.A06;
            AnonymousClass29.A00(abstractC0952Zs2.A0I());
            interfaceC0587Lj = this.A00.A0C;
            if (interfaceC0587Lj != null) {
                interfaceC0587Lj2 = this.A00.A0C;
                mc = this.A00.A0D;
                interfaceC0587Lj2.A3t(mc.A6t());
            }
        }
    }
}
