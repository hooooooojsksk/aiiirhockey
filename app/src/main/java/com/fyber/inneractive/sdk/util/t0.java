package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class t0 {
    public final TimeUnit a;
    public final long b;
    public Handler c;
    public boolean d;
    public b e;
    public long f;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public final WeakReference<t0> a;

        public a(t0 t0Var) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(t0Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            t0 t0Var = this.a.get();
            if (t0Var == null || message.what != 1932593528 || t0Var.d) {
                return;
            }
            t0Var.a(message.getWhen());
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(t0 t0Var);
    }

    public t0(TimeUnit timeUnit, long j) {
        this.d = false;
        this.f = 0L;
        this.b = j;
        this.a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
    }

    public void a() {
        this.d = true;
        Handler handler = this.c;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    public void b() {
        this.d = false;
        a(SystemClock.uptimeMillis());
    }

    public void c() {
        a aVar = new a(this);
        this.c = aVar;
        this.d = false;
        aVar.sendEmptyMessage(1932593528);
    }

    public final void a(long j) {
        long uptimeMillis = this.f + (SystemClock.uptimeMillis() - j) + 50;
        this.f = uptimeMillis;
        if (this.e != null && uptimeMillis > this.a.toMillis(this.b)) {
            this.e.a(this);
            return;
        }
        Handler handler = this.c;
        if (handler == null || this.e == null) {
            return;
        }
        handler.removeMessages(1932593528);
        this.c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public t0(TimeUnit timeUnit, long j, long j2) {
        this.d = false;
        this.b = j;
        this.a = timeUnit;
        this.f = j2;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
    }
}
