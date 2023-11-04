package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rb */
/* loaded from: assets/audience_network.dex */
public class C0734Rb extends Q9 {
    public final /* synthetic */ C7G A00;

    public C0734Rb(C7G c7g) {
        this.A00 = c7g;
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
        F1 f1;
        ld = this.A00.A0H;
        if (!ld.A07()) {
            C7G c7g = this.A00;
            ld2 = c7g.A0H;
            c7g.setImpressionRecordingFlag(ld2);
            str = this.A00.A0C;
            if (!TextUtils.isEmpty(str)) {
                NA na = new NA();
                qa = this.A00.A0B;
                NA A03 = na.A03(qa);
                ld3 = this.A00.A0H;
                NA A02 = A03.A02(ld3);
                abstractC0952Zs = ((T9) this.A00).A0A;
                Map<String, String> A05 = A02.A04(abstractC0952Zs.A0J()).A05();
                interfaceC0505Ia = ((T9) this.A00).A0C;
                str2 = this.A00.A0C;
                interfaceC0505Ia.A9H(str2, A05);
                c0887Xc = this.A00.A0G;
                c0887Xc.A0E().A2Z();
                f1 = this.A00.A04;
                AnonymousClass29.A00(f1.A0I());
            }
        }
    }
}
