package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EW implements Runnable {
    public final /* synthetic */ C0411Ee A00;
    public final /* synthetic */ C0412Ef A01;
    public final /* synthetic */ C0413Eg A02;
    public final /* synthetic */ InterfaceC0414Eh A03;

    public EW(C0411Ee c0411Ee, InterfaceC0414Eh interfaceC0414Eh, C0412Ef c0412Ef, C0413Eg c0413Eg) {
        this.A00 = c0411Ee;
        this.A03 = interfaceC0414Eh;
        this.A01 = c0412Ef;
        this.A02 = c0413Eg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A03.ABY(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
