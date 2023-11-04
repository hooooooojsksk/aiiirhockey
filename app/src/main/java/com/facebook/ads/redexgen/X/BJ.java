package com.facebook.ads.redexgen.X;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public abstract class BJ extends AbstractC0864Wf implements FR {
    public long A00;
    public FR A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.AbstractC0330Ak
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, FR fr, long j2) {
        super.A01 = j;
        this.A01 = fr;
        if (j2 == LongCompanionObject.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final List<FQ> A6H(long j) {
        return this.A01.A6H(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final long A6i(int i) {
        return this.A01.A6i(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A6j() {
        return this.A01.A6j();
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A7A(long j) {
        return this.A01.A7A(j - this.A00);
    }
}
