package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* loaded from: assets/audience_network.dex */
public class ID implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ IF A01;

    public ID(IF r1, Surface surface) {
        this.A01 = r1;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IG ig;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ig = this.A01.A01;
            ig.ACL(this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
