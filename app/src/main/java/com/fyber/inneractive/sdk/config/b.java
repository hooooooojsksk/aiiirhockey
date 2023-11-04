package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.config.j;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b implements j.b {
    public t0 c;
    public final g0 d;
    public final t0.b f;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public boolean b = false;
    public final Handler e = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
            b.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 123) {
                b bVar = b.this;
                if (bVar.a.compareAndSet(false, true)) {
                    if (bVar.a.get() && bVar.c != null) {
                        IAlog.a("startCounting", new Object[0]);
                        bVar.c.c();
                    }
                    IAlog.a("Pause signal", new Object[0]);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$b */
    /* loaded from: classes.dex */
    public class C0008b implements Application.ActivityLifecycleCallbacks {
        public C0008b() {
            b.this = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (b.this.e.hasMessages(123) || b.this.a.get()) {
                return;
            }
            b.this.e.sendEmptyMessageDelayed(123, 3000L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b.this.e.removeMessages(123);
            b bVar = b.this;
            if (bVar.a.compareAndSet(true, false)) {
                if (bVar.b) {
                    IAlog.a("onActivityResumed: restartSession", new Object[0]);
                    bVar.b = false;
                    g0 g0Var = bVar.d;
                    if (g0Var != null) {
                        com.fyber.inneractive.sdk.cache.session.d dVar = ((f0) g0Var).a;
                        if (dVar != null) {
                            dVar.a(dVar.a);
                            com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.cache.session.c(dVar, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.b.NONE));
                        }
                        g0 g0Var2 = bVar.d;
                        ((f0) g0Var2).c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        ((f0) bVar.d).b.clear();
                    }
                }
                t0 t0Var = bVar.c;
                if (t0Var != null) {
                    t0Var.d = false;
                    t0Var.f = 0L;
                    Handler handler = t0Var.c;
                    if (handler != null) {
                        handler.removeMessages(1932593528);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements t0.b {
        public c() {
            b.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.util.t0.b
        public void a(t0 t0Var) {
            IAlog.a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            b.this.b = true;
        }
    }

    public b(g0 g0Var) {
        C0008b c0008b = new C0008b();
        this.f = new c();
        this.d = g0Var;
        Application a2 = com.fyber.inneractive.sdk.util.l.a();
        if (a2 != null) {
            a2.registerActivityLifecycleCallbacks(c0008b);
        }
    }

    @Override // com.fyber.inneractive.sdk.config.j.b
    public void onGlobalConfigChanged(j jVar, i iVar) {
        t0 t0Var = this.c;
        if (t0Var != null) {
            t0Var.d = false;
            t0Var.f = 0L;
            Handler handler = t0Var.c;
            if (handler != null) {
                handler.removeMessages(1932593528);
            }
            t0 t0Var2 = new t0(TimeUnit.MINUTES, iVar.a("session_duration", 30, 1), this.c.f);
            this.c = t0Var2;
            t0Var2.e = this.f;
        }
        jVar.c.remove(this);
    }
}
