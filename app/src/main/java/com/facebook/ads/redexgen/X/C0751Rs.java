package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Rs */
/* loaded from: assets/audience_network.dex */
public class C0751Rs implements InterfaceC0657Ob {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0749Rq A01;

    public C0751Rs(C0749Rq c0749Rq, int i) {
        this.A01 = c0749Rq;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ob
    public final void ACv(int i) {
        C0749Rq.A00(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ob
    public final void ACz(String str) {
        C0887Xc c0887Xc;
        InterfaceC0587Lj interfaceC0587Lj;
        MC mc;
        c0887Xc = this.A01.A0B;
        c0887Xc.A0E().A2o(str);
        interfaceC0587Lj = this.A01.A0F;
        mc = this.A01.A0H;
        interfaceC0587Lj.A3t(mc.A6g());
        this.A01.A09();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ob
    public final void AD1() {
        this.A01.A0O(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ob
    public final void AD8(C02456y c02456y) {
        this.A01.A0N(c02456y);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ob
    public final void AFk(float f) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0G;
        fullScreenAdToolbar.setProgress(100.0f * f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Ob
    public final void AFl() {
        this.A01.A0D();
    }
}
