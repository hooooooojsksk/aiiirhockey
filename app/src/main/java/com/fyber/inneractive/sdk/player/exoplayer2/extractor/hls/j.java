package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class j implements x.a<com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a>, p, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h, d.InterfaceC0034d {
    public final int a;
    public final b b;
    public final c c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.i e;
    public final int f;
    public final f.a h;
    public boolean n;
    public boolean o;
    public int p;
    public com.fyber.inneractive.sdk.player.exoplayer2.i q;
    public int r;
    public boolean s;
    public s t;
    public int u;
    public boolean[] v;
    public long w;
    public long x;
    public boolean y;
    public final x g = new x("Loader:HlsSampleStreamWrapper");
    public final c.b i = new c.b();
    public final SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> j = new SparseArray<>();
    public final LinkedList<f> k = new LinkedList<>();
    public final Runnable l = new a();
    public final Handler m = new Handler();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.i();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public j(int i, b bVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i2, f.a aVar) {
        this.a = i;
        this.b = bVar;
        this.c = cVar;
        this.d = bVar2;
        this.e = iVar;
        this.f = i2;
        this.h = aVar;
        this.w = j;
        this.x = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public void a(m mVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar, long j, long j2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar2 = aVar;
        f.a aVar3 = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar = aVar2.a;
        int i = aVar2.b;
        int i2 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = aVar2.c;
        int i3 = aVar2.d;
        Object obj = aVar2.e;
        long j3 = aVar2.f;
        long j4 = aVar2.g;
        long c = aVar2.c();
        if (aVar3.b != null) {
            aVar3.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(aVar3, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c));
        }
        if (z) {
            return;
        }
        int size = this.j.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.j.valueAt(i4).a(this.v[i4]);
        }
        ((g) this.b).a(this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public void c() {
        this.n = true;
        this.m.post(this.l);
    }

    public void d(long j) {
        this.w = j;
        this.x = j;
        this.y = false;
        this.k.clear();
        if (this.g.b()) {
            this.g.a();
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            this.j.valueAt(i).a(this.v[i]);
        }
    }

    public void g() {
        if (this.o) {
            return;
        }
        a(this.w);
    }

    public final boolean h() {
        return this.x != -9223372036854775807L;
    }

    public final void i() {
        j[] jVarArr;
        if (this.s || this.o || !this.n) {
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (this.j.valueAt(i).e() == null) {
                return;
            }
        }
        int size2 = this.j.size();
        int i2 = 0;
        char c = 0;
        int i3 = -1;
        while (true) {
            char c2 = 3;
            if (i2 >= size2) {
                break;
            }
            String str = this.j.valueAt(i2).e().f;
            if (!com.fyber.inneractive.sdk.player.exoplayer2.util.h.e(str)) {
                if (com.fyber.inneractive.sdk.player.exoplayer2.util.h.d(str)) {
                    c2 = 2;
                } else {
                    c2 = "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.h.b(str)) ? (char) 1 : (char) 0;
                }
            }
            if (c2 > c) {
                i3 = i2;
                c = c2;
            } else if (c2 == c && i3 != -1) {
                i3 = -1;
            }
            i2++;
        }
        r rVar = this.c.f;
        int i4 = rVar.a;
        this.u = -1;
        this.v = new boolean[size2];
        r[] rVarArr = new r[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            com.fyber.inneractive.sdk.player.exoplayer2.i e = this.j.valueAt(i5).e();
            if (i5 == i3) {
                com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    iVarArr[i6] = a(rVar.b[i6], e);
                }
                rVarArr[i5] = new r(iVarArr);
                this.u = i5;
            } else {
                rVarArr[i5] = new r(a((c == 3 && com.fyber.inneractive.sdk.player.exoplayer2.util.h.d(e.f)) ? this.e : null, e));
            }
        }
        this.t = new s(rVarArr);
        this.o = true;
        g gVar = (g) this.b;
        int i7 = gVar.k - 1;
        gVar.k = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (j jVar : gVar.n) {
            i8 += jVar.t.a;
        }
        r[] rVarArr2 = new r[i8];
        int i9 = 0;
        for (j jVar2 : gVar.n) {
            int i10 = jVar2.t.a;
            int i11 = 0;
            while (i11 < i10) {
                rVarArr2[i9] = jVar2.t.b[i11];
                i11++;
                i9++;
            }
        }
        gVar.m = new s(rVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) gVar.j).f.obtainMessage(8, gVar).sendToTarget();
    }

    public void j() throws IOException {
        this.g.c();
        c cVar = this.c;
        IOException iOException = cVar.j;
        if (iOException == null) {
            a.C0036a c0036a = cVar.k;
            if (c0036a != null) {
                e.a aVar = cVar.e.e.get(c0036a);
                aVar.b.c();
                IOException iOException2 = aVar.j;
                if (iOException2 != null) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar2 = aVar;
        c cVar = this.c;
        cVar.getClass();
        if (aVar2 instanceof c.a) {
            c.a aVar3 = (c.a) aVar2;
            cVar.i = aVar3.i;
            cVar.a(aVar3.a.a, aVar3.l, aVar3.m);
        }
        f.a aVar4 = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar = aVar2.a;
        int i = aVar2.b;
        int i2 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = aVar2.c;
        int i3 = aVar2.d;
        Object obj = aVar2.e;
        long j3 = aVar2.f;
        long j4 = aVar2.g;
        long c = aVar2.c();
        if (aVar4.b != null) {
            aVar4.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(aVar4, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.o) {
            a(this.w);
        } else {
            ((g) this.b).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a9 A[ORIG_RETURN, RETURN] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r30, long r31, long r33, java.io.IOException r35) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) r1
            long r2 = r1.c()
            boolean r4 = r1 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f
            r5 = 1
            if (r4 == 0) goto L18
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L18
        L16:
            r2 = 0
            goto L19
        L18:
            r2 = 1
        L19:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r3 = r0.c
            r3.getClass()
            if (r2 == 0) goto L3b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r2 = r3.p
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r3 = r3.f
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r1.c
            int r3 = r3.a(r7)
            int r3 = r2.c(r3)
            r7 = 60000(0xea60, double:2.9644E-319)
            r15 = r35
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b.a(r2, r3, r15, r7)
            if (r2 == 0) goto L3d
            r2 = 1
            goto L3e
        L3b:
            r15 = r35
        L3d:
            r2 = 0
        L3e:
            if (r2 == 0) goto L5f
            if (r4 == 0) goto L60
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.k
            java.lang.Object r2 = r2.removeLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f) r2
            if (r2 != r1) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(r2)
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L60
            long r2 = r0.w
            r0.x = r2
            goto L60
        L5f:
            r5 = 0
        L60:
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r10 = r0.h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r11 = r1.a
            int r12 = r1.b
            int r13 = r0.a
            com.fyber.inneractive.sdk.player.exoplayer2.i r14 = r1.c
            int r2 = r1.d
            java.lang.Object r3 = r1.e
            long r7 = r1.f
            r17 = r7
            long r6 = r1.g
            long r25 = r1.c()
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r1 = r10.b
            if (r1 == 0) goto L94
            android.os.Handler r1 = r10.a
            com.fyber.inneractive.sdk.player.exoplayer2.source.d r4 = new com.fyber.inneractive.sdk.player.exoplayer2.source.d
            r9 = r4
            r15 = r2
            r16 = r3
            r19 = r6
            r21 = r31
            r23 = r33
            r27 = r35
            r28 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r28)
            r1.post(r4)
        L94:
            if (r5 == 0) goto La9
            boolean r1 = r0.o
            if (r1 != 0) goto La0
            long r1 = r0.w
            r0.a(r1)
            goto La7
        La0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g) r1
            r1.a(r0)
        La7:
            r6 = 2
            goto Laa
        La9:
            r6 = 0
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c, long, long, java.io.IOException):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public /* bridge */ /* synthetic */ n a(int i, int i2) {
        return a(i);
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr, boolean[] zArr, o[] oVarArr, boolean[] zArr2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.o);
        for (int i = 0; i < eVarArr.length; i++) {
            if (oVarArr[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = ((i) oVarArr[i]).a;
                a(i2, false);
                this.j.valueAt(i2).b();
                oVarArr[i] = null;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && eVarArr[i3] != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar2 = eVarArr[i3];
                int a2 = this.t.a(eVar2.b());
                a(a2, true);
                if (a2 == this.u) {
                    this.c.p = eVar2;
                    eVar = eVar2;
                }
                oVarArr[i3] = new i(this, a2);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (z) {
            int size = this.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.v[i4]) {
                    this.j.valueAt(i4).b();
                }
            }
            if (eVar != null && !this.k.isEmpty()) {
                eVar.a(0L);
                if (eVar.a() != this.c.f.a(this.k.getLast().c)) {
                    d(this.w);
                }
            }
        }
        if (this.p == 0) {
            this.c.j = null;
            this.q = null;
            this.k.clear();
            if (this.g.b()) {
                this.g.a();
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0112  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r37) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j.a(long):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        if (h()) {
            return this.x;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return this.k.getLast().g;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.d a(int i) {
        if (this.j.indexOfKey(i) >= 0) {
            return this.j.get(i);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.d dVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.d(this.d);
        dVar.n = this;
        dVar.c.r = this.r;
        this.j.put(i, dVar);
        return dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.d.InterfaceC0034d
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
        this.m.post(this.l);
    }

    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.v[i] != z);
        this.v[i] = z;
        this.p += z ? 1 : -1;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.i a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar, com.fyber.inneractive.sdk.player.exoplayer2.i iVar2) {
        if (iVar == null) {
            return iVar2;
        }
        String str = null;
        int c = com.fyber.inneractive.sdk.player.exoplayer2.util.h.c(iVar2.f);
        if (c == 1) {
            str = a(iVar.c, 1);
        } else if (c == 2) {
            str = a(iVar.c, 2);
        }
        String str2 = str;
        return new com.fyber.inneractive.sdk.player.exoplayer2.i(iVar.a, iVar2.e, iVar2.f, str2, iVar.b, iVar2.g, iVar.j, iVar.k, iVar2.l, iVar2.m, iVar2.n, iVar2.p, iVar2.o, iVar2.q, iVar2.r, iVar2.s, iVar2.t, iVar2.u, iVar2.v, iVar.x, iVar.y, iVar2.z, iVar2.w, iVar2.h, iVar2.i, iVar2.d);
    }

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == com.fyber.inneractive.sdk.player.exoplayer2.util.h.c(com.fyber.inneractive.sdk.player.exoplayer2.util.h.a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
