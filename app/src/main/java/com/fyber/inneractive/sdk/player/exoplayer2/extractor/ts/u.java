package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public static final long l = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("AC-3");
    public static final long m = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("EAC3");
    public static final long n = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("HEVC");
    public final int a;
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c;
    public final SparseIntArray d;
    public final v.c e;
    public final SparseArray<v> f;
    public final SparseBooleanArray g;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h h;
    public int i;
    public boolean j;
    public v k;

    /* loaded from: classes.dex */
    public class a implements q {
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.j a = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[4]);

        public a() {
            u.this = r2;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
            if (kVar.l() != 0) {
                return;
            }
            kVar.f(7);
            int a = kVar.a() / 4;
            for (int i = 0; i < a; i++) {
                kVar.a(this.a, 4);
                int a2 = this.a.a(16);
                this.a.c(3);
                if (a2 == 0) {
                    this.a.c(13);
                } else {
                    int a3 = this.a.a(13);
                    u uVar = u.this;
                    uVar.f.put(a3, new r(new b(a3)));
                    u.this.i++;
                }
            }
            u uVar2 = u.this;
            if (uVar2.a != 2) {
                uVar2.f.remove(0);
            }
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements q {
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.j a = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[5]);
        public final SparseArray<v> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            u.this = r2;
            this.d = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:196:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0208  */
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r25) {
            /*
                Method dump skipped, instructions count: 707
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.b.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        }
    }

    public u(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, v.c cVar) {
        this.e = (v.c) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(cVar);
        this.a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(rVar);
        } else {
            this.b = Collections.singletonList(rVar);
        }
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(940);
        this.g = new SparseBooleanArray();
        this.f = new SparseArray<>();
        this.d = new SparseIntArray();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0023, code lost:
        r2 = r2 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r6.c
            byte[] r0 = r0.a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.a(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 != r4) goto L1a
            r7.c(r2)
            r7 = 1
            return r7
        L1a:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L26
            int r2 = r2 + 1
            goto Ld
        L26:
            int r3 = r3 + 1
            goto L12
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.h = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).c = -9223372036854775807L;
        }
        this.c.r();
        this.d.clear();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a8, code lost:
        if (r0 != ((r7 + 1) & 15)) goto L48;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r10, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    public final void a() {
        this.g.clear();
        this.f.clear();
        SparseArray<v> a2 = this.e.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.f.put(a2.keyAt(i), a2.valueAt(i));
        }
        this.f.put(0, new r(new a()));
        this.k = null;
    }
}
