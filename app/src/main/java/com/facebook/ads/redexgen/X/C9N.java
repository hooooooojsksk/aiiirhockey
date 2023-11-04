package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9N */
/* loaded from: assets/audience_network.dex */
public final class C9N {
    public int A00;
    public int A01;
    public C9Z A02;
    public boolean A03;

    public C9N() {
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            HD.A03(i == 4);
            return;
        }
        this.A03 = true;
        this.A00 = i;
    }

    public final void A05(C9Z c9z) {
        this.A02 = c9z;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C9Z c9z) {
        return c9z != this.A02 || this.A01 > 0 || this.A03;
    }
}
