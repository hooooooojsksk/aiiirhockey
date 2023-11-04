package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class w implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ x b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            w.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = w.this.b;
            xVar.e(!xVar.u);
            w.this.b.o = null;
        }
    }

    public w(x xVar, long j) {
        this.b = xVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.b.J()) {
            x xVar = this.b;
            xVar.o = new a();
            long a2 = xVar.a(this.a);
            x xVar2 = this.b;
            xVar2.getClass();
            t0 t0Var = new t0(TimeUnit.MILLISECONDS, a2);
            xVar2.p = t0Var;
            t0Var.e = new y(xVar2);
            t0Var.c();
            x xVar3 = this.b;
            xVar3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(xVar3), Long.valueOf(a2));
            this.b.m = null;
        } else {
            x xVar4 = this.b;
            xVar4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(xVar4));
            this.b.e(false);
        }
        Runnable runnable = this.b.m;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            this.b.m = null;
        }
    }
}
