package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6H */
/* loaded from: assets/audience_network.dex */
public class C6H implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C6M A01;

    public C6H(C6M c6m, C6I c6i) {
        this.A01 = c6m;
        new Handler(Looper.getMainLooper()).post(new C0890Xf(this, c6m, c6i));
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    public void A03(C6I c6i) {
        C7N c7n;
        C7N c7n2;
        long currentTimeMillis = System.currentTimeMillis();
        c7n = this.A01.A04;
        C0705Py A05 = C0705Py.A05(c7n.A01());
        Uri A00 = KT.A00(c6i.A08);
        long j = c6i.A00;
        if (j == -1) {
            c7n2 = this.A01.A04;
            j = IK.A0N(c7n2);
        }
        A05.A0G(A00, new C0889Xe(this, c6i, j, currentTimeMillis), j);
    }
}
