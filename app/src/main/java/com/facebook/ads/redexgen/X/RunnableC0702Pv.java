package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Pv */
/* loaded from: assets/audience_network.dex */
public class RunnableC0702Pv implements Runnable {
    public final /* synthetic */ C0705Py A00;

    public RunnableC0702Pv(C0705Py c0705Py) {
        this.A00 = c0705Py;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
