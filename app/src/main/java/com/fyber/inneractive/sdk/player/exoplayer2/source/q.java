package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.p;

/* loaded from: classes.dex */
public final class q extends com.fyber.inneractive.sdk.player.exoplayer2.p {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public q(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public p.c a(int i, p.c cVar, boolean z, long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i, 0, 1);
        Object obj = z ? g : null;
        long j2 = this.e;
        boolean z2 = this.f;
        if (z2) {
            j2 += j;
            if (j2 > this.c) {
                j2 = -9223372036854775807L;
            }
        }
        long j3 = this.c;
        long j4 = this.d;
        cVar.a = obj;
        cVar.b = z2;
        cVar.e = j2;
        cVar.f = j3;
        cVar.c = 0;
        cVar.d = 0;
        cVar.g = j4;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public int b() {
        return 1;
    }

    public q(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public p.b a(int i, p.b bVar, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i, 0, 1);
        Object obj = z ? g : null;
        long j = this.b;
        bVar.a = obj;
        bVar.b = obj;
        bVar.c = 0;
        bVar.d = j;
        bVar.e = -this.d;
        return bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public int a(Object obj) {
        return g.equals(obj) ? 0 : -1;
    }
}
