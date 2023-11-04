package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class YY implements InterfaceC01703t {
    public final /* synthetic */ E9 A00;

    public YY(E9 e9) {
        this.A00 = e9;
    }

    private final void A00(C01713u c01713u) {
        int i = c01713u.A00;
        if (i == 1) {
            this.A00.A06.A1Q(this.A00, c01713u.A02, c01713u.A01);
        } else if (i == 2) {
            this.A00.A06.A1R(this.A00, c01713u.A02, c01713u.A01);
        } else if (i == 4) {
            this.A00.A06.A1T(this.A00, c01713u.A02, c01713u.A01, c01713u.A03);
        } else if (i != 8) {
        } else {
            this.A00.A06.A1S(this.A00, c01713u.A02, c01713u.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final AbstractC01934r A5S(int i) {
        AbstractC01934r A1G = this.A00.A1G(i, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void A9g(int i, int i2, Object obj) {
        this.A00.A1g(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void AA0(int i, int i2) {
        this.A00.A1d(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void AA1(int i, int i2) {
        this.A00.A1e(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void AA2(int i, int i2) {
        this.A00.A1h(i, i2, true);
        E9 e9 = this.A00;
        e9.A0G = true;
        e9.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void AA3(int i, int i2) {
        this.A00.A1h(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void AAi(C01713u c01713u) {
        A00(c01713u);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01703t
    public final void AAk(C01713u c01713u) {
        A00(c01713u);
    }
}
