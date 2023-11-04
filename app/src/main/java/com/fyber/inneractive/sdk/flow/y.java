package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.t0;

/* loaded from: classes.dex */
public class y implements t0.b {
    public final /* synthetic */ x a;

    public y(x xVar) {
        this.a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.util.t0.b
    public void a(t0 t0Var) {
        Runnable runnable = this.a.o;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.post(runnable);
        }
        x xVar = this.a;
        t0 t0Var2 = xVar.p;
        if (t0Var2 != null) {
            t0Var2.e = null;
            xVar.p = null;
        }
    }
}
