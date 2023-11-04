package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class GG implements QH {
    public final /* synthetic */ C01663p A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public GG(C01663p c01663p, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c01663p;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.QH
    public final void AAZ(QF qf) {
        C01663p.A06(qf.A5s(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.QH
    public final void AAw(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
