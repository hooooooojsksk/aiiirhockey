package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Uz */
/* loaded from: assets/audience_network.dex */
public final class C0835Uz implements FR {
    public final long[] A00;
    public final FQ[] A01;

    public C0835Uz(FQ[] fqArr, long[] jArr) {
        this.A01 = fqArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final List<FQ> A6H(long j) {
        int A0B = C0499Hs.A0B(this.A00, j, true, false);
        if (A0B != -1) {
            FQ[] fqArr = this.A01;
            if (fqArr[A0B] != null) {
                return Collections.singletonList(fqArr[A0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final long A6i(int i) {
        boolean z = true;
        HD.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        HD.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A6j() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A7A(long j) {
        int A0A = C0499Hs.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
