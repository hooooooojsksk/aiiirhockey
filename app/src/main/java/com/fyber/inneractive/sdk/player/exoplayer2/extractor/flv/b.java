package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements f, m {
    public static final int n = u.a("FLV");
    public h e;
    public int g;
    public int h;
    public int i;
    public long j;
    public a k;
    public e l;
    public c m;
    public final k a = new k(4);
    public final k b = new k(9);
    public final k c = new k(11);
    public final k d = new k();
    public int f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(this.a.a, 0, 3, false);
        this.a.e(0);
        if (this.a.n() != n) {
            return false;
        }
        bVar.a(this.a.a, 0, 2, false);
        this.a.e(0);
        if ((this.a.q() & 250) != 0) {
            return false;
        }
        bVar.a(this.a.a, 0, 4, false);
        this.a.e(0);
        int c = this.a.c();
        bVar.e = 0;
        bVar.a(c, false);
        bVar.a(this.a.a, 0, 4, false);
        this.a.e(0);
        return this.a.c() == 0;
    }

    public final k b(g gVar) throws IOException, InterruptedException {
        if (this.i > this.d.b()) {
            k kVar = this.d;
            kVar.a = new byte[Math.max(kVar.b() * 2, this.i)];
            kVar.c = 0;
            kVar.b = 0;
        } else {
            this.d.e(0);
        }
        this.d.d(this.i);
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.d.a, 0, this.i, false);
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    public final boolean c(g gVar) throws IOException, InterruptedException {
        boolean z;
        c cVar;
        e eVar;
        a aVar;
        int i = this.h;
        if (i == 8 && (aVar = this.k) != null) {
            aVar.a(b(gVar), this.j);
        } else if (i == 9 && (eVar = this.l) != null) {
            eVar.a(b(gVar), this.j);
        } else if (i == 18 && (cVar = this.m) != null) {
            cVar.a(b(gVar), this.j);
        } else {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(this.i);
            z = false;
            this.g = 4;
            this.f = 2;
            return z;
        }
        z = true;
        this.g = 4;
        this.f = 2;
        return z;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.m.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.e = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        this.f = 1;
        this.g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(g gVar, l lVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f;
            boolean z = true;
            if (i == 1) {
                if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.b.a, 0, 9, true)) {
                    this.b.e(0);
                    this.b.f(4);
                    int l = this.b.l();
                    boolean z2 = (l & 4) != 0;
                    boolean z3 = (l & 1) != 0;
                    if (z2 && this.k == null) {
                        this.k = new a(this.e.a(8, 1));
                    }
                    if (z3 && this.l == null) {
                        this.l = new e(this.e.a(9, 2));
                    }
                    if (this.m == null) {
                        this.m = new c(null);
                    }
                    this.e.c();
                    this.e.a(this);
                    this.g = (this.b.c() - 9) + 4;
                    this.f = 2;
                } else {
                    z = false;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(this.g);
                this.g = 0;
                this.f = 3;
            } else if (i != 3) {
                if (i == 4 && c(gVar)) {
                    return 0;
                }
            } else {
                if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.c.a, 0, 11, true)) {
                    this.c.e(0);
                    this.h = this.c.l();
                    this.i = this.c.n();
                    this.j = this.c.n();
                    this.j = ((this.c.l() << 24) | this.j) * 1000;
                    this.c.f(3);
                    this.f = 4;
                } else {
                    z = false;
                }
                if (!z) {
                    return -1;
                }
            }
        }
    }
}
