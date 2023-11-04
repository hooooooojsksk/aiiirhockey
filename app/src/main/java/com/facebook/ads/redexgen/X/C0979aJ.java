package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.aJ */
/* loaded from: assets/audience_network.dex */
public class C0979aJ extends K1 {
    public final /* synthetic */ C00950u A00;

    public C0979aJ(C00950u c00950u) {
        this.A00 = c00950u;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C00940t c00940t;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c00940t = this.A00.A02;
        c00940t.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
