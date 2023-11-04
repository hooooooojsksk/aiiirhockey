package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class N1 implements Runnable {
    public final /* synthetic */ N2 A00;
    public final /* synthetic */ N3 A01;

    public N1(N2 n2, N3 n3) {
        this.A00 = n2;
        this.A01 = n3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.AAF();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
