package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.h;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class g implements e {
    public final n[] a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f c;
    public final Handler d;
    public final h e;
    public final CopyOnWriteArraySet<e.a> f;
    public final p.c g;
    public final p.b h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public p o;
    public Object p;
    public s q;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r;
    public m s;
    public h.b t;
    public int u;
    public long v;

    public g(n[] nVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g gVar, c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + u.e + "]");
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(nVarArr.length > 0);
        this.a = (n[]) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(nVarArr);
        this.b = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.j = false;
        this.k = 1;
        this.f = new CopyOnWriteArraySet<>();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[nVarArr.length]);
        this.c = fVar;
        this.o = p.a;
        this.g = new p.c();
        this.h = new p.b();
        this.q = s.d;
        this.r = fVar;
        this.s = m.d;
        f fVar2 = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.d = fVar2;
        h.b bVar = new h.b(0, 0L);
        this.t = bVar;
        this.e = new h(nVarArr, gVar, cVar, this.j, fVar2, bVar, this);
    }

    public void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<e.a> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(z, this.k);
            }
        }
    }

    public void b() {
        h hVar = this.e;
        synchronized (hVar) {
            if (!hVar.r) {
                hVar.f.sendEmptyMessage(6);
                while (!hVar.r) {
                    try {
                        hVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                hVar.g.quit();
            }
        }
        this.d.removeCallbacksAndMessages(null);
    }

    public void a(int i, long j) {
        if (i >= 0 && (this.o.c() || i < this.o.b())) {
            this.l++;
            this.u = i;
            if (!this.o.c()) {
                this.o.a(i, this.g, false, 0L);
                long j2 = j == -9223372036854775807L ? this.g.e : j;
                p.c cVar = this.g;
                int i2 = cVar.c;
                long a = cVar.g + b.a(j2);
                long j3 = this.o.a(i2, this.h, false).d;
                while (j3 != -9223372036854775807L && a >= j3 && i2 < this.g.d) {
                    a -= j3;
                    i2++;
                    j3 = this.o.a(i2, this.h, false).d;
                }
            }
            if (j == -9223372036854775807L) {
                this.v = 0L;
                this.e.f.obtainMessage(3, new h.c(this.o, i, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.v = j;
            this.e.f.obtainMessage(3, new h.c(this.o, i, b.a(j))).sendToTarget();
            Iterator<e.a> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            return;
        }
        throw new k(this.o, i, j);
    }

    public void a(e.c... cVarArr) {
        h hVar = this.e;
        if (hVar.r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        hVar.w++;
        hVar.f.obtainMessage(11, cVarArr).sendToTarget();
    }

    public int a() {
        if (!this.o.c() && this.l <= 0) {
            return this.o.a(this.t.a, this.h, false).c;
        }
        return this.u;
    }
}
