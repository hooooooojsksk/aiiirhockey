package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RS extends Q9 {
    public final /* synthetic */ C7E A00;

    public RS(C7E c7e) {
        this.A00 = c7e;
    }

    @Override // com.facebook.ads.redexgen.X.Q9
    public final void A02() {
        LD ld;
        LD ld2;
        String str;
        QA qa;
        LD ld3;
        AbstractC0952Zs abstractC0952Zs;
        InterfaceC0505Ia interfaceC0505Ia;
        String str2;
        C0887Xc c0887Xc;
        AbstractC0952Zs abstractC0952Zs2;
        ld = this.A00.A0E;
        if (!ld.A07()) {
            C7E c7e = this.A00;
            ld2 = c7e.A0E;
            c7e.setImpressionRecordingFlag(ld2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                NA na = new NA();
                qa = this.A00.A09;
                NA A03 = na.A03(qa);
                ld3 = this.A00.A0E;
                NA A02 = A03.A02(ld3);
                abstractC0952Zs = ((T9) this.A00).A0A;
                Map<String, String> A05 = A02.A04(abstractC0952Zs.A0J()).A05();
                interfaceC0505Ia = ((T9) this.A00).A0C;
                str2 = this.A00.A0A;
                interfaceC0505Ia.A9H(str2, A05);
                c0887Xc = this.A00.A0D;
                c0887Xc.A0E().A2Z();
                abstractC0952Zs2 = this.A00.A03;
                AnonymousClass29.A00(abstractC0952Zs2.A0I());
            }
        }
    }
}
