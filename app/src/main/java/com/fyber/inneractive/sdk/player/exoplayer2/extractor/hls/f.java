package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.d {
    public static final AtomicInteger G = new AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public j D;
    public volatile boolean E;
    public volatile boolean F;
    public final int j;
    public final int k;
    public final a.C0036a l;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g m;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.j n;
    public final boolean o;
    public final boolean p;
    public final r q;
    public final String r;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.f s;
    public final boolean t;
    public final boolean u;
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> v;
    public final boolean w;
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g x;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k y;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.f z;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar2, a.C0036a c0036a, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list, int i, Object obj, long j, long j2, int i2, int i3, boolean z, r rVar, f fVar, byte[] bArr, byte[] bArr2) {
        super(a(gVar, bArr, bArr2), jVar, c0036a.b, i, obj, j, j2, i2);
        this.k = i3;
        this.n = jVar2;
        this.l = c0036a;
        this.v = list;
        this.p = z;
        this.q = rVar;
        this.o = this.h instanceof a;
        String lastPathSegment = jVar.a.getLastPathSegment();
        this.r = lastPathSegment;
        boolean z2 = false;
        boolean z3 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.w = z3;
        if (fVar != null) {
            this.x = fVar.x;
            this.y = fVar.y;
            this.s = fVar.z;
            boolean z4 = fVar.l != c0036a;
            this.t = z4;
            this.u = (fVar.k != i3 || z4) ? true : true;
        } else {
            this.x = z3 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g() : null;
            this.y = z3 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.k(10) : null;
            this.s = null;
            this.t = false;
            this.u = true;
        }
        this.m = gVar;
        this.j = G.getAndIncrement();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public boolean a() {
        return this.E;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public long c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01aa A[Catch: all -> 0x01f3, TryCatch #5 {all -> 0x01f3, blocks: (B:292:0x0198, B:294:0x01aa, B:296:0x01b2, B:298:0x01bb, B:297:0x01b9, B:300:0x01c3, B:309:0x01e1, B:302:0x01ca, B:304:0x01ce), top: B:321:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01c3 A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #5 {all -> 0x01f3, blocks: (B:292:0x0198, B:294:0x01aa, B:296:0x01b2, B:298:0x01bb, B:297:0x01b9, B:300:0x01c3, B:309:0x01e1, B:302:0x01ca, B:304:0x01ce), top: B:321:0x0198 }] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void load() throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f.load():void");
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.a a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.e = 0;
        if (bVar.a(this.y.a, 0, 10, true)) {
            this.y.c(10);
            if (this.y.n() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.b) {
                return -9223372036854775807L;
            }
            this.y.f(3);
            int k = this.y.k();
            int i = k + 10;
            if (i > this.y.b()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = this.y;
                byte[] bArr = kVar.a;
                kVar.c(i);
                System.arraycopy(bArr, 0, this.y.a, 0, 10);
            }
            if (bVar.a(this.y.a, 10, k, true) && (a = this.x.a(this.y.a, k)) != null) {
                int length = a.a.length;
                for (int i2 = 0; i2 < length; i2++) {
                    a.b bVar2 = a.a[i2];
                    if (bVar2 instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i) {
                        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i) bVar2;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(iVar.b)) {
                            System.arraycopy(iVar.c, 0, this.y.a, 0, 8);
                            this.y.c(8);
                            return this.y.i();
                        }
                    }
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null) ? gVar : new a(gVar, bArr, bArr2);
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.f a(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.f aVar;
        if (this.r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j);
        } else if (!this.r.endsWith(".ac3") && !this.r.endsWith(".ec3")) {
            if (this.r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b(0, j);
            } else {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j);
        }
        aVar.a(this.D);
        return aVar;
    }
}
