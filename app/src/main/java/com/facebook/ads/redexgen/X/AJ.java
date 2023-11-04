package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AJ implements Runnable {
    public final /* synthetic */ AL A00;
    public final /* synthetic */ C0335Ap A01;

    public AJ(AL al, C0335Ap c0335Ap) {
        this.A00 = al;
        this.A01 = c0335Ap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM am;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            am = this.A00.A01;
            am.AAH(this.A01);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
