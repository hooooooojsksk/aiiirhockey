package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Zl */
/* loaded from: assets/audience_network.dex */
public class C0945Zl implements InterfaceC02135l {
    public final /* synthetic */ C01041d A00;
    public final /* synthetic */ C0887Xc A01;
    public final /* synthetic */ boolean A02;

    public C0945Zl(C01041d c01041d, C0887Xc c0887Xc, boolean z) {
        this.A00 = c01041d;
        this.A01 = c0887Xc;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAD() {
        InterfaceC01031c interfaceC01031c;
        F1 f1;
        if (!IK.A1I(this.A01) || !this.A02) {
            interfaceC01031c = this.A00.A04;
            interfaceC01031c.AA7();
            return;
        }
        C01041d c01041d = this.A00;
        C0887Xc c0887Xc = this.A01;
        f1 = c01041d.A03;
        c01041d.A02 = ON.A01(c0887Xc, f1, 1, new C0946Zm(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAE() {
        InterfaceC01031c interfaceC01031c;
        interfaceC01031c = this.A00.A04;
        interfaceC01031c.AA6(AdError.CACHE_ERROR);
    }
}
