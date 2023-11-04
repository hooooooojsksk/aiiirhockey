package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AL A03;

    public AI(AL al, int i, long j, long j2) {
        this.A03 = al;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM am;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            am = this.A03.A01;
            am.AAL(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
