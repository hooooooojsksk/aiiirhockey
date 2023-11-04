package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements f {
    public static final int m = u.a("Xing");
    public static final int n = u.a("Info");
    public static final int o = u.a("VBRI");
    public final long a;
    public h e;
    public n f;
    public int g;
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.a h;
    public a i;
    public long k;
    public int l;
    public final k b = new k(10);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.k();
    public final j d = new j();
    public long j = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a extends m {
        long b(long j);
    }

    public b(int i, long j) {
        this.a = j;
    }

    public static boolean a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        return a(gVar, true);
    }

    public final a b(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(this.b.a, 0, 4, false);
        this.b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.k.a(this.b.c(), this.c);
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a(bVar.c, this.c.f, bVar.b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.e = hVar;
        this.f = hVar.a(0, 1);
        this.e.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        this.g = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0058, code lost:
        if (r12 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.n) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0200  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r36, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r37) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00d4, code lost:
        if (r14 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d6, code lost:
        r13.c(r3 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00db, code lost:
        r13.e = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00dd, code lost:
        r12.g = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00df, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r13, boolean r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, boolean):boolean");
    }
}
