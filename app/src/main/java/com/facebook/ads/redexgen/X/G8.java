package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class G8 implements InterfaceC0730Qx {
    public final C0469Go A00;
    public final R2 A01;

    public G8(C0469Go c0469Go, R2 r2) {
        this.A00 = c0469Go;
        this.A01 = r2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0730Qx
    public void A3P(Map<InterfaceC0712Qf, R2> map, Map<InterfaceC0459Gd, EnumC0722Qp> map2) {
        map.put(this.A00, this.A01);
    }
}
