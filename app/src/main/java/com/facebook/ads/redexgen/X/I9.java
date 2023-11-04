package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class I9 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IF A02;
    public final /* synthetic */ String A03;

    public I9(IF r1, String str, long j, long j2) {
        this.A02 = r1;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IG ig;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ig = this.A02.A01;
            ig.ACw(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
