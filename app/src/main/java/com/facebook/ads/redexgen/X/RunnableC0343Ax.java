package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ax */
/* loaded from: assets/audience_network.dex */
public class RunnableC0343Ax implements Runnable {
    public final /* synthetic */ B2 A00;
    public final /* synthetic */ B3 A01;

    public RunnableC0343Ax(B2 b2, B3 b3) {
        this.A00 = b2;
        this.A01 = b3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
