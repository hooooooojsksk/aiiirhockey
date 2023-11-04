package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EL implements Runnable {
    public final /* synthetic */ BR A00;

    public EL(BR br) {
        this.A00 = br;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
