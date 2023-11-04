package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Di */
/* loaded from: assets/audience_network.dex */
public class RunnableC0389Di implements Runnable {
    public final /* synthetic */ ConditionVariable A00;

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
