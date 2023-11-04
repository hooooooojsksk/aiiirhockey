package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Gc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0822Um A03;

    public Gc(C0822Um c0822Um, int i, long j, long j2) {
        this.A03 = c0822Um;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GR gr;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            gr = this.A03.A07;
            gr.AAN(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
