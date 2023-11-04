package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TS implements L1 {
    public int A00;
    public final L1 A01;

    public TS(L1 l1, int i) {
        this.A01 = l1;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void ADc(String str) {
        if (this.A00 > 0) {
            this.A01.ADc(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void flush() {
        this.A01.flush();
    }
}
