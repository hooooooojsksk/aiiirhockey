package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class i<T> {
    public final Queue<T> a = new ConcurrentLinkedQueue();
    public a<T> b;

    /* loaded from: classes.dex */
    public interface a<TT> {
        TT a();
    }

    public i(int i, a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(aVar.a());
        }
        this.b = aVar;
    }

    public T a() {
        T poll = this.a.poll();
        return poll == null ? this.b.a() : poll;
    }
}
