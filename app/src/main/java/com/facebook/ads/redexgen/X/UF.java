package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: assets/audience_network.dex */
public class UF extends K1 {
    public final /* synthetic */ UE A00;

    public UF(UE ue) {
        this.A00 = ue;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
