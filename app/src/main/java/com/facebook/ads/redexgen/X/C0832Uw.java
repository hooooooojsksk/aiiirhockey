package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Uw */
/* loaded from: assets/audience_network.dex */
public final class C0832Uw implements FR {
    public static String[] A01 = {"HW2qPt5u", "AwGYl2mpYTTxi9jMk2ztyBHwHH9P0uOm", "ziApCMCdbQMQdjd0mTARuvEC3B", "RZTttmRl2v5Rh0lD63G6fj8mov5GfzUW", "CAabTzRSjKw", "MBUj6", "1ELfNFRtAis", "0tjH0VZdGvNSLcI7F3HjH1zffCsfPrCD"};
    public final List<FQ> A00;

    public C0832Uw(List<FQ> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final List<FQ> A6H(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final long A6i(int i) {
        HD.A03(i == 0);
        if (A01[2].length() != 12) {
            A01[2] = "5DVkB5gcIO90TUIp";
            return 0L;
        }
        throw new RuntimeException();
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
