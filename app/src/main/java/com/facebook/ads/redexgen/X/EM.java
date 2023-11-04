package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EM implements Runnable {
    public final /* synthetic */ BR A00;

    public EM(BR br) {
        this.A00 = br;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        VB vb;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0G;
            if (!z) {
                vb = this.A00.A08;
                vb.AAc(this.A00);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
