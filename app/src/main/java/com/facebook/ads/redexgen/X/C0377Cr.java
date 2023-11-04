package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cr */
/* loaded from: assets/audience_network.dex */
public final class C0377Cr {
    public final int A00;
    public final long A01;

    public C0377Cr(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0377Cr A00(BW bw, C0483Hc c0483Hc) throws IOException, InterruptedException {
        bw.ADP(c0483Hc.A00, 0, 8);
        c0483Hc.A0Y(0);
        int A08 = c0483Hc.A08();
        long size = c0483Hc.A0K();
        return new C0377Cr(A08, size);
    }
}
