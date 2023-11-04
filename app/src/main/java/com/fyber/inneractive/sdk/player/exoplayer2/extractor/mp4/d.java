package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public static final int D = u.a("seig");
    public static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_DISCONNECT, airhockey.P_NATION, 124, airhockey.J_ONREWARDED, -115, -12};
    public n A;
    public n[] B;
    public boolean C;
    public final int a;
    public final SparseArray<b> b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f;
    public final r g;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k h;
    public final byte[] i;
    public final Stack<a.C0039a> j;
    public final LinkedList<a> k;
    public int l;
    public int m;
    public long n;
    public int o;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.k p;
    public long q;
    public int r;
    public long s;
    public long t;
    public b u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h z;

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    public d(int i, r rVar) {
        this(i, null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        return g.a(gVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    public final void c() {
        if ((this.a & 4) != 0 && this.A == null) {
            n a2 = this.z.a(this.b.size(), 4);
            this.A = a2;
            a2.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "application/x-emsg", (long) LongCompanionObject.MAX_VALUE));
        }
        if ((this.a & 8) == 0 || this.B != null) {
            return;
        }
        n a3 = this.z.a(this.b.size() + 1, 3);
        a3.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
        this.B = new n[]{a3};
    }

    public d(int i, r rVar, h hVar) {
        this.a = i | 0;
        this.g = rVar;
        this.h = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(16);
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a);
        this.d = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(5);
        this.e = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(1);
        this.i = new byte[16];
        this.j = new Stack<>();
        this.k = new LinkedList<>();
        this.b = new SparseArray<>();
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.z = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.valueAt(i).a();
        }
        this.k.clear();
        this.r = 0;
        this.j.clear();
        a();
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final j a = new j();
        public final n b;
        public h c;
        public c d;
        public int e;
        public int f;
        public int g;

        public b(n nVar) {
            this.b = nVar;
        }

        public void a(h hVar, c cVar) {
            hVar.getClass();
            this.c = hVar;
            cVar.getClass();
            this.d = cVar;
            this.b.a(hVar.f);
            a();
        }

        public void a() {
            j jVar = this.a;
            jVar.d = 0;
            jVar.r = 0L;
            jVar.l = false;
            jVar.q = false;
            jVar.n = null;
            this.e = 0;
            this.g = 0;
            this.f = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:579:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0004 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r26, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    public final void a() {
        this.l = 0;
        this.o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:613:0x0704, code lost:
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0708, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:593:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r57) throws com.fyber.inneractive.sdk.player.exoplayer2.l {
        /*
            Method dump skipped, instructions count: 1801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d.a(long):void");
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, j jVar) throws l {
        kVar.e(i + 8);
        int c = kVar.c();
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b;
        int i3 = c & ViewCompat.MEASURED_SIZE_MASK;
        if ((i3 & 1) == 0) {
            boolean z = (i3 & 2) != 0;
            int o = kVar.o();
            if (o == jVar.e) {
                Arrays.fill(jVar.m, 0, o, z);
                jVar.a(kVar.a());
                kVar.a(jVar.p.a, 0, jVar.o);
                jVar.p.e(0);
                jVar.q = false;
                return;
            }
            throw new l("Length mismatch: " + o + ", " + jVar.e);
        }
        throw new l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.a a(java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lbc
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b) r5
            int r6 = r5.a
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.V
            if (r6 != r7) goto Lb8
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.P0
            byte[] r5 = r5.a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r6.<init>(r5)
            int r8 = r6.c
            r9 = 32
            if (r8 >= r9) goto L2d
            goto L88
        L2d:
            r6.e(r1)
            int r8 = r6.c()
            int r9 = r6.a()
            int r9 = r9 + 4
            if (r8 == r9) goto L3d
            goto L88
        L3d:
            int r8 = r6.c()
            if (r8 == r7) goto L44
            goto L88
        L44:
            int r7 = r6.c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b(r7)
            r8 = 1
            if (r7 <= r8) goto L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L88
        L66:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.i()
            long r12 = r6.i()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L7e
            int r7 = r6.o()
            int r7 = r7 * 16
            r6.f(r7)
        L7e:
            int r7 = r6.o()
            int r8 = r6.a()
            if (r7 == r8) goto L8a
        L88:
            r6 = r2
            goto L9c
        L8a:
            byte[] r8 = new byte[r7]
            byte[] r10 = r6.a
            int r11 = r6.b
            java.lang.System.arraycopy(r10, r11, r8, r1, r7)
            int r10 = r6.b
            int r10 = r10 + r7
            r6.b = r10
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L9c:
            if (r6 != 0) goto La0
            r6 = r2
            goto La4
        La0:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        La4:
            if (r6 != 0) goto Lae
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb8
        Lae:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        Lb8:
            int r3 = r3 + 1
            goto L8
        Lbc:
            if (r4 != 0) goto Lbf
            goto Ld0
        Lbf:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            int r14 = r4.size()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a.b[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.a.b[]) r14
            r2.<init>(r1, r14)
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d.a(java.util.List):com.fyber.inneractive.sdk.player.exoplayer2.drm.a");
    }
}
