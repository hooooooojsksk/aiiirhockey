package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AL A01;

    public AK(AL al, int i) {
        this.A01 = al;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM am;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            am = this.A01.A01;
            am.AAK(this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
