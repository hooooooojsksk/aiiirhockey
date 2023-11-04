package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class GD implements InterfaceC0730Qx {
    public final EnumC0722Qp A00;
    public final C4R A01;

    public GD(C4R c4r, EnumC0722Qp enumC0722Qp) {
        this.A01 = c4r;
        this.A00 = enumC0722Qp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0730Qx
    public void A3P(Map<InterfaceC0712Qf, R2> map, Map<InterfaceC0459Gd, EnumC0722Qp> map2) {
        map2.put(this.A01, this.A00);
    }
}
