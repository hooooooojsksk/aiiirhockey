package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uy */
/* loaded from: assets/audience_network.dex */
public final class C0834Uy implements FR {
    public final C0445Fo A00;
    public final Map<String, C0451Fu> A01;
    public final Map<String, C0446Fp> A02;
    public final long[] A03;

    public C0834Uy(C0445Fo c0445Fo, Map<String, C0451Fu> map, Map<String, C0446Fp> map2) {
        Map<String, C0451Fu> emptyMap;
        this.A00 = c0445Fo;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0445Fo.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final List<FQ> A6H(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final long A6i(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A6j() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A7A(long j) {
        int A0A = C0499Hs.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
