package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class R4 extends C8V<C02456y> {
    public final /* synthetic */ AnonymousClass75 A00;

    public R4(AnonymousClass75 anonymousClass75) {
        this.A00 = anonymousClass75;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(C02456y c02456y) {
        RA ra;
        RA ra2;
        int A00 = c02456y.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            ra = this.A00.A0B;
            int currentPositionMS2 = ra.getDuration();
            if (A00 == currentPositionMS2) {
                ra2 = this.A00.A0B;
                int duration = ra2.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    public final Class<C02456y> A01() {
        return C02456y.class;
    }
}
