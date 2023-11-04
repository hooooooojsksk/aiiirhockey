package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Zi */
/* loaded from: assets/audience_network.dex */
public class C0942Zi implements InterfaceC01121l {
    public final /* synthetic */ C01041d A00;

    public C0942Zi(C01041d c01041d) {
        this.A00 = c01041d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01121l
    public final void ABz(AdError adError) {
        InterfaceC01031c interfaceC01031c;
        interfaceC01031c = this.A00.A04;
        interfaceC01031c.AA6(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01121l
    public final void AC0() {
        InterfaceC01031c interfaceC01031c;
        interfaceC01031c = this.A00.A04;
        interfaceC01031c.AA7();
    }
}
