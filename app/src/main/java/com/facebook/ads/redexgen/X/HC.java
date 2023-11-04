package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HC implements InterfaceC0723Qq {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Qq
    public final long A4i() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Qq
    public final void AFK(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
