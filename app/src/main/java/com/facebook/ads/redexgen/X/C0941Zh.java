package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Zh */
/* loaded from: assets/audience_network.dex */
public class C0941Zh implements InterfaceC02135l {
    public final /* synthetic */ C01041d A00;

    public C0941Zh(C01041d c01041d) {
        this.A00 = c01041d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAD() {
        InterfaceC01031c interfaceC01031c;
        interfaceC01031c = this.A00.A04;
        interfaceC01031c.AA7();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAE() {
        InterfaceC01031c interfaceC01031c;
        interfaceC01031c = this.A00.A04;
        interfaceC01031c.AA6(AdError.CACHE_ERROR);
    }
}
