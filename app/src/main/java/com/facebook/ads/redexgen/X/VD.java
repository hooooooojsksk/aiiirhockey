package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class VD implements InterfaceC0421Eo {
    public final int A00;
    public final /* synthetic */ BR A01;

    public VD(BR br, int i) {
        this.A01 = br;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0421Eo
    public final boolean A8r() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0421Eo
    public final void A9j() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0421Eo
    public final int ADs(C9S c9s, C0865Wg c0865Wg, boolean z) {
        return this.A01.A0P(this.A00, c9s, c0865Wg, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0421Eo
    public final int AFI(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
