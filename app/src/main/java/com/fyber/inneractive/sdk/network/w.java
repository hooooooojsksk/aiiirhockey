package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class w {
    public static final ThreadFactory g = new a();
    public BlockingQueue<a0<?>> a = new PriorityBlockingQueue(100, new d(null));
    public volatile boolean b = false;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), g);
    public final Runnable e = new b();
    public o0 f = new o0();

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(100);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            w.this = r1;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:11|12|(1:62)(1:16)|(3:18|(1:22)|23)|(2:24|25)|(5:(8:29|(1:35)|36|37|38|39|40|41)|38|39|40|41)|58|(3:31|33|35)|36|37) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:(8:29|(1:35)|36|37|38|39|40|41)|38|39|40|41) */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x00d4, code lost:
            r3 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x00d6, code lost:
            r1 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x00d8, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x00d9, code lost:
            r4 = null;
            r1 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x00dc, code lost:
            r3 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x00dd, code lost:
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x00de, code lost:
            r2.a((com.fyber.inneractive.sdk.network.a0<?>) null, r3, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x00ed, code lost:
            r4 = r1;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.b.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ a0 a;

        public c(a0 a0Var) {
            w.this = r1;
            this.a = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.d("retryNetworkRequest pre-execute - %s", this.a.getClass().getName());
            w.this.c(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Comparator<a0> {
        public d() {
        }

        @Override // java.util.Comparator
        public int compare(a0 a0Var, a0 a0Var2) {
            return a0Var.g().ordinal() - a0Var2.g().ordinal();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public final <T> void a(a0<T> a0Var, z zVar) {
        try {
            if (a0Var.f() || zVar == null) {
                return;
            }
            a0Var.a((a0<T>) zVar.a, (Exception) null, false);
        } catch (Exception e) {
            IAlog.a("failed notifying the listener request complete", e, new Object[0]);
            a0Var.a((a0<T>) null, e, false);
        }
    }

    public final void b(a0<?> a0Var) {
        try {
            a0Var.b();
        } catch (Exception unused) {
        }
        a0Var.a(n0.DONE);
    }

    public void c(a0<?> a0Var) {
        this.a.offer(a0Var);
        a0Var.a(n0.QUEUED);
    }

    public final <T> void d(a0<T> a0Var) {
        o0 o0Var = this.f;
        o0Var.getClass();
        String e = a0Var.e();
        r0 r0Var = o0Var.a.get(e);
        if (r0Var != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(r0Var.d);
        }
        o0Var.a.remove(e);
    }

    public boolean e(a0<?> a0Var) {
        if (a0Var.l()) {
            a0Var.a(n0.QUEUED_FOR_RETRY);
            long r = a0Var.r();
            IAlog.d("retryNetworkRequest queue up in main thread - %s with delay of %d", a0Var.getClass().getName(), Long.valueOf(r));
            this.c.postDelayed(new c(a0Var), r);
            return true;
        }
        return false;
    }

    public final <T> void a(a0<T> a0Var, j jVar, z zVar) {
        try {
            if (a0Var.f() || a0Var.c() == null || zVar == null || jVar == null || jVar.a != 200) {
                return;
            }
            a0Var.a(zVar, a0Var.c(), jVar.e);
        } catch (Exception e) {
            IAlog.a("Failed cache network response data", e, new Object[0]);
        }
    }

    public final <T> z a(a0<T> a0Var, j jVar) throws Exception {
        z zVar = null;
        if (jVar != null) {
            try {
                if (!a0Var.f()) {
                    int i = jVar.a;
                    if (i != 200 && (i < 300 || i >= 304)) {
                        if (i == 304) {
                            a0Var.a((a0<T>) null, (Exception) new f(), false);
                        } else {
                            a0Var.a((a0<T>) null, (Exception) new p0(jVar.a, jVar.b), false);
                        }
                    }
                    zVar = a0Var.a(jVar, jVar.d, i);
                }
            } catch (w0 e) {
                IAlog.a("failed parsing network request but will retry", e, new Object[0]);
                if (e(a0Var)) {
                    throw e;
                }
                throw new v0(e);
            } catch (Exception e2) {
                IAlog.a("failed parsing network request", e2, new Object[0]);
                throw e2;
            }
        }
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.network.j a(com.fyber.inneractive.sdk.network.a0<?> r4, com.fyber.inneractive.sdk.network.a<?> r5) throws java.lang.Exception {
        /*
            r3 = this;
            java.lang.String r0 = "failed sending network request"
            r1 = 0
            boolean r2 = r4.f()     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L21 com.fyber.inneractive.sdk.network.b -> L23 java.net.UnknownHostException -> L25 com.fyber.inneractive.sdk.network.w0 -> L3d
            if (r2 != 0) goto L18
            if (r5 == 0) goto Le
            java.lang.String r5 = r5.a     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L21 com.fyber.inneractive.sdk.network.b -> L23 java.net.UnknownHostException -> L25 com.fyber.inneractive.sdk.network.w0 -> L3d
            goto L10
        Le:
            java.lang.String r5 = ""
        L10:
            r3.a(r4)     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L21 com.fyber.inneractive.sdk.network.b -> L23 java.net.UnknownHostException -> L25 com.fyber.inneractive.sdk.network.w0 -> L3d
            com.fyber.inneractive.sdk.network.j r4 = r4.a(r5)     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L21 com.fyber.inneractive.sdk.network.b -> L23 java.net.UnknownHostException -> L25 com.fyber.inneractive.sdk.network.w0 -> L3d
            goto L19
        L18:
            r4 = 0
        L19:
            return r4
        L1a:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r4, r5)
            throw r4
        L21:
            r5 = move-exception
            goto L26
        L23:
            r5 = move-exception
            goto L26
        L25:
            r5 = move-exception
        L26:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r5, r1)
            boolean r4 = r3.e(r4)
            if (r4 == 0) goto L37
            com.fyber.inneractive.sdk.network.w0 r4 = new com.fyber.inneractive.sdk.network.w0
            r4.<init>(r5)
            throw r4
        L37:
            com.fyber.inneractive.sdk.network.v0 r4 = new com.fyber.inneractive.sdk.network.v0
            r4.<init>(r5)
            throw r4
        L3d:
            r5 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "failed sending network request but will retry"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r5, r0)
            boolean r4 = r3.e(r4)
            if (r4 == 0) goto L4c
            throw r5
        L4c:
            com.fyber.inneractive.sdk.network.v0 r4 = new com.fyber.inneractive.sdk.network.v0
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(com.fyber.inneractive.sdk.network.a0, com.fyber.inneractive.sdk.network.a):com.fyber.inneractive.sdk.network.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x003a, code lost:
        if (r0.isConnectedOrConnecting() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.network.a0<?> r4) throws com.fyber.inneractive.sdk.network.b {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.global.s r4 = r4.j()
            if (r4 == 0) goto L50
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.k> r0 = com.fyber.inneractive.sdk.config.global.features.k.class
            com.fyber.inneractive.sdk.config.global.features.h r4 = r4.a(r0)
            com.fyber.inneractive.sdk.config.global.features.k r4 = (com.fyber.inneractive.sdk.config.global.features.k) r4
            if (r4 == 0) goto L50
            java.lang.String r0 = "should_use_is_network_connected"
            r1 = 0
            boolean r4 = r4.a(r0, r1)
            if (r4 == 0) goto L50
            r4 = 1
            android.app.Application r0 = com.fyber.inneractive.sdk.util.l.a     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> L3d
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L2b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L3d
            goto L2c
        L2b:
            r0 = 0
        L2c:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = com.fyber.inneractive.sdk.util.l.b(r2)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L45
            if (r0 == 0) goto L45
            boolean r0 = r0.isConnectedOrConnecting()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L45
            goto L44
        L3d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file."
            com.fyber.inneractive.sdk.util.IAlog.b(r1, r0)
        L44:
            r1 = 1
        L45:
            if (r1 == 0) goto L48
            goto L50
        L48:
            com.fyber.inneractive.sdk.network.b r4 = new com.fyber.inneractive.sdk.network.b
            java.lang.String r0 = "No network connection"
            r4.<init>(r0)
            throw r4
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(com.fyber.inneractive.sdk.network.a0):void");
    }
}
