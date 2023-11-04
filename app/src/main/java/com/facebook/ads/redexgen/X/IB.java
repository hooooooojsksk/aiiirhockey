package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IF A02;

    public IB(IF r1, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IG ig;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ig = this.A02.A01;
            ig.AAr(this.A00, this.A01);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
