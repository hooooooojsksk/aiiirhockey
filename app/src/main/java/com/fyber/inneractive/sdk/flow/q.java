package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class q implements Runnable {
    public final /* synthetic */ p a;

    public q(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p pVar = this.a;
        pVar.getClass();
        IAlog.a("%sRe-enabling clicks, grace period has passed", IAlog.a(pVar));
        this.a.g = true;
        this.a.h = null;
    }
}
