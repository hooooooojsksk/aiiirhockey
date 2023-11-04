package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IE implements Runnable {
    public final /* synthetic */ C0335Ap A00;
    public final /* synthetic */ IF A01;

    public IE(IF r1, C0335Ap c0335Ap) {
        this.A01 = r1;
        this.A00 = c0335Ap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IG ig;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            ig = this.A01.A01;
            ig.ACx(this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
