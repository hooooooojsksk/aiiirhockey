package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h implements Handler.Callback, m.a, n.a {
    public c A;
    public long B;
    public a C;
    public a D;
    public a E;
    public p F;
    public final n[] a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.a[] b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.c d;
    public final q e;
    public final Handler f;
    public final HandlerThread g;
    public final Handler h;
    public final e i;
    public final p.c j;
    public final p.b k;
    public b l;
    public m m;
    public n n;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g o;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.n p;
    public n[] q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v = 1;
    public int w;
    public int x;
    public long y;
    public int z;

    /* loaded from: classes.dex */
    public static final class a {
        public final com.fyber.inneractive.sdk.player.exoplayer2.source.m a;
        public final Object b;
        public final com.fyber.inneractive.sdk.player.exoplayer2.source.o[] c;
        public final boolean[] d;
        public final long e;
        public int f;
        public long g;
        public boolean h;
        public boolean i;
        public boolean j;
        public a k;
        public boolean l;
        public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h m;
        public final n[] n;
        public final com.fyber.inneractive.sdk.player.exoplayer2.a[] o;
        public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g p;
        public final com.fyber.inneractive.sdk.player.exoplayer2.c q;
        public final com.fyber.inneractive.sdk.player.exoplayer2.source.n r;
        public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h s;

        public a(n[] nVarArr, com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, long j, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar, Object obj, int i, boolean z, long j2) {
            this.n = nVarArr;
            this.o = aVarArr;
            this.e = j;
            this.p = gVar;
            this.q = cVar;
            this.r = nVar;
            this.b = com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(obj);
            this.f = i;
            this.h = z;
            this.g = j2;
            this.c = new com.fyber.inneractive.sdk.player.exoplayer2.source.o[nVarArr.length];
            this.d = new boolean[nVarArr.length];
            this.a = nVar.a(i, cVar.a(), j2);
        }

        public long a(long j) {
            return Math.abs(j - a());
        }

        public boolean b() {
            return this.i && (!this.j || this.a.d() == Long.MIN_VALUE);
        }

        public void c() {
            try {
                this.r.a(this.a);
            } catch (RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r0 = r6.p
                com.fyber.inneractive.sdk.player.exoplayer2.a[] r1 = r6.o
                com.fyber.inneractive.sdk.player.exoplayer2.source.m r2 = r6.a
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r2 = r2.b()
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.a(r1, r2)
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r1 = r6.s
                r0.getClass()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L18
                goto L25
            L18:
                r4 = 0
            L19:
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.b
                int r5 = r5.a
                if (r4 >= r5) goto L2a
                boolean r5 = r0.a(r1, r4)
                if (r5 != 0) goto L27
            L25:
                r1 = 0
                goto L2b
            L27:
                int r4 = r4 + 1
                goto L19
            L2a:
                r1 = 1
            L2b:
                if (r1 == 0) goto L2e
                return r3
            L2e:
                r6.m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.h.a.d():boolean");
        }

        public long a() {
            return this.e - this.g;
        }

        public long a(long j, boolean z, boolean[] zArr) {
            int i;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar = this.m.b;
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 >= fVar.a) {
                    break;
                }
                boolean[] zArr2 = this.d;
                if (z || !this.m.a(this.s, i2)) {
                    z2 = false;
                }
                zArr2[i2] = z2;
                i2++;
            }
            long a = this.a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[]) fVar.b.clone(), this.d, this.c, zArr, j);
            this.s = this.m;
            this.j = false;
            int i3 = 0;
            while (true) {
                com.fyber.inneractive.sdk.player.exoplayer2.source.o[] oVarArr = this.c;
                if (i3 >= oVarArr.length) {
                    break;
                }
                if (oVarArr[i3] != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(fVar.b[i3] != null);
                    this.j = true;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(fVar.b[i3] == null);
                }
                i3++;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.c cVar = this.q;
            n[] nVarArr = this.n;
            s sVar = this.m.a;
            cVar.f = 0;
            for (int i4 = 0; i4 < nVarArr.length; i4++) {
                if (fVar.b[i4] != null) {
                    int i5 = cVar.f;
                    int k = nVarArr[i4].k();
                    int i6 = u.a;
                    if (k == 0) {
                        i = 16777216;
                    } else if (k == 1) {
                        i = 3538944;
                    } else if (k == 2) {
                        i = 13107200;
                    } else if (k != 3 && k != 4) {
                        throw new IllegalStateException();
                    } else {
                        i = 131072;
                    }
                    cVar.f = i5 + i;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = cVar.a;
            int i7 = cVar.f;
            synchronized (kVar) {
                boolean z3 = i7 < kVar.e;
                kVar.e = i7;
                if (z3) {
                    kVar.b();
                }
            }
            return a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;
        public volatile long c;
        public volatile long d;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
            this.c = j;
            this.d = j;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final p a;
        public final int b;
        public final long c;

        public c(p pVar, int i, long j) {
            this.a = pVar;
            this.b = i;
            this.c = j;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final p a;
        public final Object b;
        public final b c;
        public final int d;

        public d(p pVar, Object obj, b bVar, int i) {
            this.a = pVar;
            this.b = obj;
            this.c = bVar;
            this.d = i;
        }
    }

    public h(n[] nVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.c cVar, boolean z, Handler handler, b bVar, e eVar) {
        this.a = nVarArr;
        this.c = gVar;
        this.d = cVar;
        this.s = z;
        this.h = handler;
        this.l = bVar;
        this.i = eVar;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.a[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            nVarArr[i].a(i);
            this.b[i] = nVarArr[i].m();
        }
        this.e = new q();
        this.q = new n[0];
        this.j = new p.c();
        this.k = new p.b();
        this.m = m.d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.g = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper(), this);
    }

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar) {
        this.f.obtainMessage(9, (com.fyber.inneractive.sdk.player.exoplayer2.source.m) pVar).sendToTarget();
    }

    public final void b(c cVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.F == null) {
            this.z++;
            this.A = cVar;
            return;
        }
        Pair<Integer, Long> a2 = a(cVar);
        if (a2 == null) {
            b bVar = new b(0, 0L);
            this.l = bVar;
            this.h.obtainMessage(4, 1, 0, bVar).sendToTarget();
            this.l = new b(0, -9223372036854775807L);
            a(4);
            b(false);
            return;
        }
        int i = cVar.c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) a2.first).intValue();
        long longValue = ((Long) a2.second).longValue();
        try {
            b bVar2 = this.l;
            if (intValue == bVar2.a && longValue / 1000 == bVar2.c / 1000) {
                return;
            }
            long b2 = b(intValue, longValue);
            int i2 = i | (longValue == b2 ? 0 : 1);
            b bVar3 = new b(intValue, b2);
            this.l = bVar3;
            this.h.obtainMessage(4, i2, 0, bVar3).sendToTarget();
        } finally {
            b bVar4 = new b(intValue, longValue);
            this.l = bVar4;
            this.h.obtainMessage(4, i, 0, bVar4).sendToTarget();
        }
    }

    public final void c(boolean z) {
        if (this.u != z) {
            this.u = z;
            this.h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void d(boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.t = false;
        this.s = z;
        if (!z) {
            h();
            i();
            b(false);
            return;
        }
        int i = this.v;
        if (i == 3) {
            f();
            this.f.sendEmptyMessage(2);
        } else if (i == 2) {
            this.f.sendEmptyMessage(2);
        }
    }

    public final void e() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        boolean z = true;
        while (aVar != null && aVar.i) {
            if (aVar.d()) {
                if (z) {
                    a aVar2 = this.D;
                    a aVar3 = this.E;
                    boolean z2 = aVar2 != aVar3;
                    a(aVar3.k);
                    a aVar4 = this.E;
                    aVar4.k = null;
                    this.C = aVar4;
                    this.D = aVar4;
                    boolean[] zArr = new boolean[this.a.length];
                    long a2 = aVar4.a(this.l.c, z2, zArr);
                    if (a2 != this.l.c) {
                        this.l.c = a2;
                        b(a2);
                    }
                    boolean[] zArr2 = new boolean[this.a.length];
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        n[] nVarArr = this.a;
                        if (i >= nVarArr.length) {
                            break;
                        }
                        n nVar = nVarArr[i];
                        zArr2[i] = nVar.a() != 0;
                        com.fyber.inneractive.sdk.player.exoplayer2.source.o oVar = this.E.c[i];
                        if (oVar != null) {
                            i2++;
                        }
                        if (zArr2[i]) {
                            if (oVar != nVar.n()) {
                                if (nVar == this.n) {
                                    if (oVar == null) {
                                        this.e.a(this.o);
                                    }
                                    this.o = null;
                                    this.n = null;
                                }
                                a(nVar);
                                nVar.l();
                            } else if (zArr[i]) {
                                nVar.a(this.B);
                            }
                        }
                        i++;
                    }
                    this.h.obtainMessage(3, aVar.m).sendToTarget();
                    a(zArr2, i2);
                } else {
                    this.C = aVar;
                    for (a aVar5 = aVar.k; aVar5 != null; aVar5 = aVar5.k) {
                        aVar5.c();
                    }
                    a aVar6 = this.C;
                    aVar6.k = null;
                    if (aVar6.i) {
                        long max = Math.max(aVar6.g, aVar6.a(this.B));
                        a aVar7 = this.C;
                        aVar7.a(max, false, new boolean[aVar7.n.length]);
                    }
                }
                b();
                i();
                this.f.sendEmptyMessage(2);
                return;
            }
            if (aVar == this.D) {
                z = false;
            }
            aVar = aVar.k;
        }
    }

    public final void f() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.t = false;
        q qVar = this.e;
        if (!qVar.a) {
            qVar.c = SystemClock.elapsedRealtime();
            qVar.a = true;
        }
        for (n nVar : this.q) {
            nVar.f();
        }
    }

    public final void g() {
        b(true);
        this.d.a(true);
        a(1);
    }

    public final void h() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        q qVar = this.e;
        if (qVar.a) {
            qVar.a(qVar.o());
            qVar.a = false;
        }
        for (n nVar : this.q) {
            a(nVar);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.n) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    d(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((c) message.obj);
                    return true;
                case 4:
                    a((m) message.obj);
                    return true;
                case 5:
                    g();
                    return true;
                case 6:
                    d();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.m) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.m mVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.m) message.obj;
                    a aVar = this.C;
                    if (aVar != null && aVar.a == mVar) {
                        b();
                    }
                    return true;
                case 10:
                    e();
                    return true;
                case 11:
                    a((e.c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.d e) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            this.h.obtainMessage(8, e).sendToTarget();
            g();
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            this.h.obtainMessage(8, new com.fyber.inneractive.sdk.player.exoplayer2.d(0, null, e2, -1)).sendToTarget();
            g();
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.h.obtainMessage(8, new com.fyber.inneractive.sdk.player.exoplayer2.d(2, null, e3, -1)).sendToTarget();
            g();
            return true;
        }
    }

    public final void i() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        long f = aVar.a.f();
        if (f != -9223372036854775807L) {
            b(f);
        } else {
            n nVar = this.n;
            if (nVar != null && !nVar.b()) {
                long o = this.o.o();
                this.B = o;
                this.e.a(o);
            } else {
                this.B = this.e.o();
            }
            f = this.E.a(this.B);
        }
        this.l.c = f;
        this.y = SystemClock.elapsedRealtime() * 1000;
        long d2 = this.q.length == 0 ? Long.MIN_VALUE : this.E.a.d();
        b bVar = this.l;
        if (d2 == Long.MIN_VALUE) {
            d2 = this.F.a(this.E.f, this.k, false).d;
        }
        bVar.d = d2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n.a
    public void a(p pVar, Object obj) {
        this.f.obtainMessage(7, Pair.create(pVar, obj)).sendToTarget();
    }

    public final void a(int i) {
        if (this.v != i) {
            this.v = i;
            this.h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    public final void c() throws IOException {
        a aVar = this.C;
        if (aVar == null || aVar.i) {
            return;
        }
        a aVar2 = this.D;
        if (aVar2 == null || aVar2.k == aVar) {
            for (n nVar : this.q) {
                if (!nVar.g()) {
                    return;
                }
            }
            this.C.a.e();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar, boolean z) {
        this.h.sendEmptyMessage(0);
        b(true);
        this.d.a(false);
        if (z) {
            this.l = new b(0, -9223372036854775807L);
        }
        this.p = nVar;
        nVar.a(this.i, true, (n.a) this);
        a(2);
        this.f.sendEmptyMessage(2);
    }

    public final void d() {
        b(true);
        this.d.a(true);
        a(1);
        synchronized (this) {
            this.r = true;
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x015a A[LOOP:2: B:286:0x015a->B:290:0x016a, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws com.fyber.inneractive.sdk.player.exoplayer2.d, java.io.IOException {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.h.a():void");
    }

    public final long b(int i, long j) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar;
        h();
        this.t = false;
        a(2);
        a aVar2 = this.E;
        if (aVar2 == null) {
            a aVar3 = this.C;
            if (aVar3 != null) {
                aVar3.c();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f == i && aVar2.i) {
                    aVar = aVar2;
                } else {
                    aVar2.c();
                }
                aVar2 = aVar2.k;
            }
        }
        a aVar4 = this.E;
        if (aVar4 != aVar || aVar4 != this.D) {
            for (n nVar : this.q) {
                nVar.l();
            }
            this.q = new n[0];
            this.o = null;
            this.n = null;
            this.E = null;
        }
        if (aVar != null) {
            aVar.k = null;
            this.C = aVar;
            this.D = aVar;
            b(aVar);
            a aVar5 = this.E;
            if (aVar5.j) {
                j = aVar5.a.b(j);
            }
            b(j);
            b();
        } else {
            this.C = null;
            this.D = null;
            this.E = null;
            b(j);
        }
        this.f.sendEmptyMessage(2);
        return j;
    }

    public final void b(long j) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.E;
        long a2 = j + (aVar == null ? 60000000L : aVar.a());
        this.B = a2;
        this.e.a(a2);
        for (n nVar : this.q) {
            nVar.a(this.B);
        }
    }

    public final void b(boolean z) {
        n[] nVarArr;
        this.f.removeMessages(2);
        this.t = false;
        q qVar = this.e;
        if (qVar.a) {
            qVar.a(qVar.o());
            qVar.a = false;
        }
        this.o = null;
        this.n = null;
        this.B = 60000000L;
        for (n nVar : this.q) {
            try {
                a(nVar);
                nVar.l();
            } catch (com.fyber.inneractive.sdk.player.exoplayer2.d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.q = new n[0];
        a aVar = this.E;
        if (aVar == null) {
            aVar = this.C;
        }
        a(aVar);
        this.C = null;
        this.D = null;
        this.E = null;
        c(false);
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar2 = this.p;
            if (nVar2 != null) {
                nVar2.b();
                this.p = null;
            }
            this.F = null;
        }
    }

    public final void b(Object obj, int i) {
        this.h.obtainMessage(6, new d(this.F, obj, this.l, i)).sendToTarget();
    }

    public final void b() {
        a aVar = this.C;
        long a2 = !aVar.i ? 0L : aVar.a.a();
        if (a2 == Long.MIN_VALUE) {
            c(false);
            return;
        }
        long a3 = this.C.a(this.B);
        boolean a4 = this.d.a(a2 - a3);
        c(a4);
        if (a4) {
            a aVar2 = this.C;
            aVar2.l = false;
            aVar2.a.a(a3);
            return;
        }
        this.C.l = true;
    }

    public final void b(a aVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.E == aVar) {
            return;
        }
        boolean[] zArr = new boolean[this.a.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            n[] nVarArr = this.a;
            if (i < nVarArr.length) {
                n nVar = nVarArr[i];
                zArr[i] = nVar.a() != 0;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = aVar.m.b.b[i];
                if (eVar != null) {
                    i2++;
                }
                if (zArr[i] && (eVar == null || (nVar.h() && nVar.n() == this.E.c[i]))) {
                    if (nVar == this.n) {
                        this.e.a(this.o);
                        this.o = null;
                        this.n = null;
                    }
                    a(nVar);
                    nVar.l();
                }
                i++;
            } else {
                this.E = aVar;
                this.h.obtainMessage(3, aVar.m).sendToTarget();
                a(zArr, i2);
                return;
            }
        }
    }

    public final void a(long j, long j2) {
        this.f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f.sendEmptyMessage(2);
        } else {
            this.f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void a(m mVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar = this.o;
        if (gVar != null) {
            mVar = gVar.a(mVar);
        } else {
            q qVar = this.e;
            if (qVar.a) {
                qVar.a(qVar.o());
            }
            qVar.d = mVar;
        }
        this.m = mVar;
        this.h.obtainMessage(7, mVar).sendToTarget();
    }

    public final void a(e.c[] cVarArr) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        try {
            for (e.c cVar : cVarArr) {
                cVar.a.a(cVar.b, cVar.c);
            }
            if (this.p != null) {
                this.f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.x++;
                notifyAll();
                throw th;
            }
        }
    }

    public final void a(n nVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (nVar.a() == 2) {
            nVar.d();
        }
    }

    public final boolean a(long j) {
        a aVar;
        return j == -9223372036854775807L || this.l.c < j || ((aVar = this.E.k) != null && aVar.i);
    }

    public final boolean a(boolean z) {
        long d2;
        a aVar = this.C;
        if (!aVar.i) {
            d2 = aVar.g;
        } else {
            d2 = aVar.a.d();
        }
        if (d2 == Long.MIN_VALUE) {
            a aVar2 = this.C;
            if (aVar2.h) {
                return true;
            }
            d2 = this.F.a(aVar2.f, this.k, false).d;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.c cVar = this.d;
        long a2 = d2 - this.C.a(this.B);
        long j = z ? cVar.e : cVar.d;
        return j <= 0 || a2 >= j;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.util.Pair<com.fyber.inneractive.sdk.player.exoplayer2.p, java.lang.Object> r13) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.h.a(android.util.Pair):void");
    }

    public final void a(Object obj, int i) {
        this.l = new b(0, 0L);
        b(obj, i);
        this.l = new b(0, -9223372036854775807L);
        a(4);
        b(false);
    }

    public final int a(int i, p pVar, p pVar2) {
        int i2 = -1;
        while (i2 == -1 && i < pVar.a() - 1) {
            i++;
            i2 = pVar2.a(pVar.a(i, this.k, true).b);
        }
        return i2;
    }

    public final Pair<Integer, Long> a(c cVar) {
        p pVar = cVar.a;
        if (pVar.c()) {
            pVar = this.F;
        }
        try {
            Pair<Integer, Long> a2 = a(pVar, cVar.b, cVar.c, 0L);
            p pVar2 = this.F;
            if (pVar2 == pVar) {
                return a2;
            }
            int a3 = pVar2.a(pVar.a(((Integer) a2.first).intValue(), this.k, true).b);
            if (a3 != -1) {
                return Pair.create(Integer.valueOf(a3), a2.second);
            }
            int a4 = a(((Integer) a2.first).intValue(), pVar, this.F);
            if (a4 != -1) {
                return a(this.F.a(a4, this.k, false).c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new k(this.F, cVar.b, cVar.c);
        }
    }

    public final Pair<Integer, Long> a(int i, long j) {
        return a(this.F, i, j, 0L);
    }

    public final Pair<Integer, Long> a(p pVar, int i, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i, 0, pVar.b());
        pVar.a(i, this.j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.j.e;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        p.c cVar = this.j;
        int i2 = cVar.c;
        long j3 = cVar.g + j;
        long j4 = pVar.a(i2, this.k, false).d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.j.d) {
            j3 -= j4;
            i2++;
            j4 = pVar.a(i2, this.k, false).d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.m mVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        a aVar = this.C;
        if (aVar == null || aVar.a != mVar) {
            return;
        }
        aVar.i = true;
        aVar.d();
        aVar.g = aVar.a(aVar.g, false, new boolean[aVar.n.length]);
        if (this.E == null) {
            a aVar2 = this.C;
            this.D = aVar2;
            b(aVar2.g);
            b(this.D);
        }
        b();
    }

    public final void a(a aVar) {
        while (aVar != null) {
            aVar.c();
            aVar = aVar.k;
        }
    }

    public final void a(boolean[] zArr, int i) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.q = new n[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            n[] nVarArr = this.a;
            if (i2 >= nVarArr.length) {
                return;
            }
            n nVar = nVarArr[i2];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = this.E.m.b.b[i2];
            if (eVar != null) {
                int i4 = i3 + 1;
                this.q[i3] = nVar;
                if (nVar.a() == 0) {
                    o oVar = this.E.m.d[i2];
                    boolean z = this.s && this.v == 3;
                    boolean z2 = !zArr[i2] && z;
                    int f = eVar.f();
                    i[] iVarArr = new i[f];
                    for (int i5 = 0; i5 < f; i5++) {
                        iVarArr[i5] = eVar.a(i5);
                    }
                    a aVar = this.E;
                    nVar.a(oVar, iVarArr, aVar.c[i2], this.B, z2, aVar.a());
                    com.fyber.inneractive.sdk.player.exoplayer2.util.g j = nVar.j();
                    if (j != null) {
                        if (this.o == null) {
                            this.o = j;
                            this.n = nVar;
                            j.a(this.m);
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(2, null, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                        }
                    }
                    if (z) {
                        nVar.f();
                    }
                }
                i3 = i4;
            }
            i2++;
        }
    }
}
