package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class g implements m, j.b, e.b {
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a;
    public final d b;
    public final int c;
    public final f.a d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b e;
    public final IdentityHashMap<o, Integer> f = new IdentityHashMap<>();
    public final k g = new k();
    public final Handler h = new Handler();
    public final long i;
    public m.a j;
    public int k;
    public boolean l;
    public s m;
    public j[] n;
    public j[] o;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h p;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar, d dVar, int i, f.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j) {
        this.a = eVar;
        this.b = dVar;
        this.c = i;
        this.d = aVar;
        this.e = bVar;
        this.i = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void a(m.a aVar) {
        this.a.h.add(this);
        this.j = aVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = this.a.k;
        ArrayList arrayList = new ArrayList(aVar2.b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            a.C0036a c0036a = (a.C0036a) arrayList.get(i);
            if (c0036a.b.k <= 0 && !a(c0036a, "avc")) {
                if (a(c0036a, "mp4a")) {
                    arrayList3.add(c0036a);
                }
            } else {
                arrayList2.add(c0036a);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List<a.C0036a> list = aVar2.c;
        List<a.C0036a> list2 = aVar2.d;
        int size = list.size() + 1 + list2.size();
        this.n = new j[size];
        this.k = size;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(!arrayList.isEmpty());
        a.C0036a[] c0036aArr = new a.C0036a[arrayList.size()];
        arrayList.toArray(c0036aArr);
        j a = a(0, c0036aArr, aVar2.e, aVar2.f);
        this.n[0] = a;
        a.c.h = true;
        a.g();
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            j a2 = a(1, new a.C0036a[]{list.get(i2)}, null, Collections.emptyList());
            this.n[i3] = a2;
            a2.g();
            i2++;
            i3++;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            a.C0036a c0036a2 = list2.get(i4);
            j a3 = a(3, new a.C0036a[]{c0036a2}, null, Collections.emptyList());
            a3.a(0).a(c0036a2.b);
            a3.n = true;
            a3.i();
            this.n[i3] = a3;
            i4++;
            i3++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public s b() {
        return this.m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e.b
    public void c() {
        g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void c(long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long d() {
        long j;
        LinkedList<f> linkedList;
        j[] jVarArr = this.o;
        long j2 = LongCompanionObject.MAX_VALUE;
        for (j jVar : jVarArr) {
            if (jVar.y) {
                j = Long.MIN_VALUE;
            } else if (jVar.h()) {
                j = jVar.x;
            } else {
                long j3 = jVar.w;
                f last = jVar.k.getLast();
                if (!last.F) {
                    last = jVar.k.size() > 1 ? jVar.k.get(linkedList.size() - 2) : null;
                }
                if (last != null) {
                    j3 = Math.max(j3, last.g);
                }
                int size = jVar.j.size();
                for (int i = 0; i < size; i++) {
                    j3 = Math.max(j3, jVar.j.valueAt(i).d());
                }
                j = j3;
            }
            if (j != Long.MIN_VALUE) {
                j2 = Math.min(j2, j);
            }
        }
        if (j2 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void e() throws IOException {
        j[] jVarArr = this.n;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                jVar.j();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long f() {
        return -9223372036854775807L;
    }

    public final void g() {
        if (this.m != null) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.h) this.j).a((p) this);
            return;
        }
        for (j jVar : this.n) {
            jVar.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long b(long j) {
        this.g.a.clear();
        for (j jVar : this.o) {
            jVar.d(j);
        }
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr, boolean[] zArr, o[] oVarArr, boolean[] zArr2, long j) {
        long j2;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (int i = 0; i < eVarArr.length; i++) {
            iArr[i] = oVarArr[i] == null ? -1 : this.f.get(oVarArr[i]).intValue();
            iArr2[i] = -1;
            if (eVarArr[i] != null) {
                r b = eVarArr[i].b();
                int i2 = 0;
                while (true) {
                    j[] jVarArr = this.n;
                    if (i2 >= jVarArr.length) {
                        break;
                    } else if (jVarArr[i2].t.a(b) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f.clear();
        int length = eVarArr.length;
        o[] oVarArr2 = new o[length];
        o[] oVarArr3 = new o[eVarArr.length];
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[eVarArr.length];
        ArrayList arrayList = new ArrayList(this.n.length);
        int i3 = 0;
        boolean z = false;
        while (i3 < this.n.length) {
            for (int i4 = 0; i4 < eVarArr.length; i4++) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = null;
                oVarArr3[i4] = iArr[i4] == i3 ? oVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    eVar = eVarArr[i4];
                }
                eVarArr2[i4] = eVar;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr3 = eVarArr2;
            z |= this.n[i3].a(eVarArr2, zArr, oVarArr3, zArr2, !this.l);
            boolean z2 = false;
            for (int i6 = 0; i6 < eVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(oVarArr3[i6] != null);
                    oVarArr2[i6] = oVarArr3[i6];
                    this.f.put(oVarArr3[i6], Integer.valueOf(i5));
                    z2 = true;
                } else if (iArr[i6] == i5) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(oVarArr3[i6] == null);
                }
            }
            if (z2) {
                arrayList2.add(this.n[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            eVarArr2 = eVarArr3;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oVarArr2, 0, oVarArr, 0, length);
        j[] jVarArr2 = new j[arrayList3.size()];
        this.o = jVarArr2;
        arrayList3.toArray(jVarArr2);
        j[] jVarArr3 = this.o;
        if (jVarArr3.length > 0) {
            jVarArr3[0].c.h = true;
            int i7 = 1;
            while (true) {
                j[] jVarArr4 = this.o;
                if (i7 >= jVarArr4.length) {
                    break;
                }
                jVarArr4[i7].c.h = false;
                i7++;
            }
        }
        this.p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.o);
        if (this.l && z) {
            j2 = j;
            b(j2);
            for (int i8 = 0; i8 < eVarArr.length; i8++) {
                if (oVarArr[i8] != null) {
                    zArr2[i8] = true;
                }
            }
        } else {
            j2 = j;
        }
        this.l = true;
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m, com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public boolean a(long j) {
        return this.p.a(j);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m, com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        return this.p.a();
    }

    public void a(p pVar) {
        if (this.m == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) this.j).a((p) this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e.b
    public void a(a.C0036a c0036a, long j) {
        int c;
        for (j jVar : this.n) {
            c cVar = jVar.c;
            int a = cVar.f.a(c0036a.b);
            if (a != -1 && (c = cVar.p.c(a)) != -1) {
                cVar.p.a(c, j);
            }
        }
        g();
    }

    public final j a(int i, a.C0036a[] c0036aArr, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        return new j(i, this, new c(this.a, c0036aArr, this.b, this.g, list), this.e, this.i, iVar, this.c, this.d);
    }

    public static boolean a(a.C0036a c0036a, String str) {
        String str2 = c0036a.b.c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (str3.startsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
