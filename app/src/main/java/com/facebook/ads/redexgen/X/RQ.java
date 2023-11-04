package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RQ implements C5D {
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ C7E A01;

    public RQ(C7E c7e, C5F c5f) {
        this.A01 = c7e;
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final boolean A8b() {
        boolean A0Y;
        boolean A0Z;
        if (!this.A01.A0X()) {
            A0Y = this.A01.A0Y();
            if (A0Y) {
                return true;
            }
            A0Z = this.A01.A0Z();
            return A0Z;
        }
        this.A01.A0W(this.A00);
        return true;
    }
}
