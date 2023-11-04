package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T7 implements NR {
    public final /* synthetic */ T0 A00;

    public T7(T0 t0) {
        this.A00 = t0;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void AA9() {
        boolean A0Y;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            this.A00.A0M();
            this.A00.A0Y.setToolbarActionMessage("");
            this.A00.A0Y.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void ABc() {
        C0558Ke c0558Ke;
        this.A00.A0D = false;
        c0558Ke = this.A00.A0M;
        c0558Ke.A08();
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void ABd() {
        C0558Ke c0558Ke;
        this.A00.A0D = true;
        c0558Ke = this.A00.A0M;
        c0558Ke.A07();
    }
}
