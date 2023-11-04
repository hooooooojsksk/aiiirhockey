package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class I8 implements Runnable {
    public final /* synthetic */ C0335Ap A00;
    public final /* synthetic */ IF A01;

    public I8(IF r1, C0335Ap c0335Ap) {
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
            ig = this.A01.A01;
            ig.ACy(this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
