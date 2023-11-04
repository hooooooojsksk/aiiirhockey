package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class WU implements InterfaceC0348Be {
    public final long A00;
    public final C0347Bd A01;

    public WU(long j) {
        this(j, 0L);
    }

    public WU(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0347Bd(j2 == 0 ? C0349Bf.A03 : new C0349Bf(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final long A6Y() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final C0347Bd A7a(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final boolean A8v() {
        return false;
    }
}
