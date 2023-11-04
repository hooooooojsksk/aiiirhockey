package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dn */
/* loaded from: assets/audience_network.dex */
public class RunnableC0394Dn implements Runnable {
    public final /* synthetic */ RunnableC0397Dq A00;

    public RunnableC0394Dn(RunnableC0397Dq runnableC0397Dq) {
        this.A00 = runnableC0397Dq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
