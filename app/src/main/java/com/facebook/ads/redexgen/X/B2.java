package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class B2 {
    public final CopyOnWriteArrayList<B1> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<B1> it = this.A00.iterator();
        while (it.hasNext()) {
            B1 next = it.next();
            B3 listener = next.A01;
            next.A00.post(new RunnableC0343Ax(this, listener));
        }
    }

    public final void A01() {
        Iterator<B1> it = this.A00.iterator();
        while (it.hasNext()) {
            B1 next = it.next();
            B3 listener = next.A01;
            next.A00.post(new B0(this, listener));
        }
    }

    public final void A02() {
        Iterator<B1> it = this.A00.iterator();
        while (it.hasNext()) {
            B1 next = it.next();
            B3 listener = next.A01;
            next.A00.post(new RunnableC0345Az(this, listener));
        }
    }

    public final void A03(Handler handler, B3 b3) {
        HD.A03((handler == null || b3 == null) ? false : true);
        this.A00.add(new B1(handler, b3));
    }

    public final void A04(Exception exc) {
        Iterator<B1> it = this.A00.iterator();
        while (it.hasNext()) {
            B1 next = it.next();
            B3 listener = next.A01;
            next.A00.post(new RunnableC0344Ay(this, listener, exc));
        }
    }
}
