package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class B0 implements Runnable {
    public final /* synthetic */ B2 A00;
    public final /* synthetic */ B3 A01;

    public B0(B2 b2, B3 b3) {
        this.A00 = b2;
        this.A01 = b3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.AAo();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
