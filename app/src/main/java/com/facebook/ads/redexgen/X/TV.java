package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TV implements L1 {
    public int A00;
    public final L1 A01;
    public final L1 A02;

    public TV(L1 l1, int i, L1 l12) {
        this.A01 = l1;
        this.A00 = i;
        this.A02 = l12;
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void ADc(String str) {
        if (this.A00 > 0) {
            this.A01.ADc(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADc(str);
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void flush() {
        this.A02.flush();
    }
}
