package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ar */
/* loaded from: assets/audience_network.dex */
public class C0337Ar extends Thread {
    public final /* synthetic */ AbstractC0863We A00;

    public C0337Ar(AbstractC0863We abstractC0863We) {
        this.A00 = abstractC0863We;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
