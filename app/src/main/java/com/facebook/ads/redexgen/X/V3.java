package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class V3 implements FR {
    public final List<FQ> A00;

    public V3(List<FQ> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final List<FQ> A6H(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final long A6i(int i) {
        HD.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A6j() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A7A(long j) {
        return j < 0 ? 0 : -1;
    }
}
