package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.flow.n;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class u implements Runnable {
    public final /* synthetic */ t a;

    public u(t tVar) {
        this.a = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar = this.a;
        tVar.a.stopLoading();
        IAlog.a("%sonLoadTimeout after %d msec", IAlog.a(tVar), Long.valueOf(tVar.n));
        com.fyber.inneractive.sdk.ignite.j jVar = tVar.h;
        if (jVar == null || tVar.d == null) {
            return;
        }
        ((n.a) jVar).a(com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, tVar.k, com.fyber.inneractive.sdk.ignite.i.LOAD_WEBPAGE_TIMEOUT.e(), tVar.d);
    }
}
