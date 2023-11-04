package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EU implements Runnable {
    public final /* synthetic */ C0411Ee A00;
    public final /* synthetic */ InterfaceC0414Eh A01;

    public EU(C0411Ee c0411Ee, InterfaceC0414Eh interfaceC0414Eh) {
        this.A00 = c0411Ee;
        this.A01 = interfaceC0414Eh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.ABh(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
