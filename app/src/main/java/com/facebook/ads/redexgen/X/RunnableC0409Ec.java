package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ec */
/* loaded from: assets/audience_network.dex */
public class RunnableC0409Ec implements Runnable {
    public final /* synthetic */ C0411Ee A00;
    public final /* synthetic */ C0413Eg A01;
    public final /* synthetic */ InterfaceC0414Eh A02;

    public RunnableC0409Ec(C0411Ee c0411Ee, InterfaceC0414Eh interfaceC0414Eh, C0413Eg c0413Eg) {
        this.A00 = c0411Ee;
        this.A02 = interfaceC0414Eh;
        this.A01 = c0413Eg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A02.AAm(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
