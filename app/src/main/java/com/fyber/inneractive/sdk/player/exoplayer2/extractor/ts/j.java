package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;

/* loaded from: classes.dex */
public final class j implements h {
    public final s a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n j;
    public b k;
    public boolean l;
    public long m;
    public final boolean[] h = new boolean[3];
    public final n d = new n(7, 128);
    public final n e = new n(8, 128);
    public final n f = new n(6, 128);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k n = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();

    /* loaded from: classes.dex */
    public static final class b {
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a;
        public final boolean b;
        public final boolean c;
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.l f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public boolean o;
        public long p;
        public long q;
        public boolean r;
        public final SparseArray<i.b> d = new SparseArray<>();
        public final SparseArray<i.a> e = new SparseArray<>();
        public a m = new a();
        public a n = new a();

        /* loaded from: classes.dex */
        public static final class a {
            public boolean a;
            public boolean b;
            public i.b c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;

            public a() {
            }

            public static boolean a(a aVar, a aVar2) {
                boolean z;
                boolean z2;
                if (aVar.a) {
                    if (!aVar2.a || aVar.f != aVar2.f || aVar.g != aVar2.g || aVar.h != aVar2.h) {
                        return true;
                    }
                    if (aVar.i && aVar2.i && aVar.j != aVar2.j) {
                        return true;
                    }
                    int i = aVar.d;
                    int i2 = aVar2.d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = aVar.c.h;
                    if (i3 == 0 && aVar2.c.h == 0 && (aVar.m != aVar2.m || aVar.n != aVar2.n)) {
                        return true;
                    }
                    if ((i3 == 1 && aVar2.c.h == 1 && (aVar.o != aVar2.o || aVar.p != aVar2.p)) || (z = aVar.k) != (z2 = aVar2.k)) {
                        return true;
                    }
                    if (z && z2 && aVar.l != aVar2.l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar, boolean z, boolean z2) {
            this.a = nVar;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new com.fyber.inneractive.sdk.player.exoplayer2.util.l(bArr, 0, 0);
            a();
        }

        public void a() {
            this.k = false;
            this.o = false;
            a aVar = this.n;
            aVar.b = false;
            aVar.a = false;
        }
    }

    public j(s sVar, boolean z, boolean z2) {
        this.a = sVar;
        this.b = z;
        this.c = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(this.h);
        this.d.a();
        this.e.a();
        this.f.a();
        b bVar = this.k;
        bVar.k = false;
        bVar.o = false;
        b.a aVar = bVar.n;
        aVar.b = false;
        aVar.a = false;
        this.g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.i = dVar.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a2 = hVar.a(dVar.c(), 2);
        this.j = a2;
        this.k = new b(a2, this.b, this.c);
        this.a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        this.m = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b9, code lost:
        if ((r1.b && ((r1 = r1.e) == 7 || r1 == 2)) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ea, code lost:
        if (r6 != 1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r31) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(byte[], int, int):void");
    }
}
