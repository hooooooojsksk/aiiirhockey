package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.q;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class e implements x.a<y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c>> {
    public final Uri a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d b;
    public final int d;
    public final InterfaceC0037e g;
    public final f.a j;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a k;
    public a.C0036a l;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b m;
    public boolean n;
    public final List<b> h = new ArrayList();
    public final x i = new x("HlsPlaylistTracker:MasterPlaylist");
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d();
    public final IdentityHashMap<a.C0036a, a> e = new IdentityHashMap<>();
    public final Handler f = new Handler();

    /* loaded from: classes.dex */
    public interface b {
        void a(a.C0036a c0036a, long j);

        void c();
    }

    /* loaded from: classes.dex */
    public static final class c extends IOException {
        public c(String str) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {
        public d(String str) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0037e {
    }

    public e(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar, f.a aVar, int i, InterfaceC0037e interfaceC0037e) {
        this.a = uri;
        this.b = dVar;
        this.j = aVar;
        this.d = i;
        this.g = interfaceC0037e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j, long j2, boolean z) {
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
        this.j.a(yVar2.a, 4, j, j2, yVar2.f);
    }

    public boolean b(a.C0036a c0036a) {
        int i;
        a aVar = this.e.get(c0036a);
        if (aVar.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max((long) WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, com.fyber.inneractive.sdk.player.exoplayer2.b.b(aVar.d.o));
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = aVar.d;
            if (bVar.j || (i = bVar.b) == 2 || i == 1 || aVar.e + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j, long j2) {
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar;
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar3 = yVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = yVar3.d;
        boolean z = cVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
        if (z) {
            yVar2 = yVar3;
            List singletonList = Collections.singletonList(new a.C0036a(cVar.a, new i("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, LongCompanionObject.MAX_VALUE, null, null, null)));
            List emptyList = Collections.emptyList();
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a(null, singletonList, emptyList, emptyList, null, null);
        } else {
            yVar2 = yVar3;
            aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) cVar;
        }
        this.k = aVar;
        this.l = aVar.b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.b);
        arrayList.addAll(aVar.c);
        arrayList.addAll(aVar.d);
        int size = arrayList.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a.C0036a c0036a = (a.C0036a) arrayList.get(i);
            this.e.put(c0036a, new a(c0036a, elapsedRealtime));
        }
        a aVar2 = this.e.get(this.l);
        if (z) {
            aVar2.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) cVar);
        } else {
            aVar2.b();
        }
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar4 = yVar2;
        this.j.b(yVar4.a, 4, j, j2, yVar4.f);
    }

    /* loaded from: classes.dex */
    public final class a implements x.a<y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c>>, Runnable {
        public final a.C0036a a;
        public final x b = new x("HlsPlaylistTracker:MediaPlaylist");
        public final y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> c;
        public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b d;
        public long e;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public IOException j;

        public a(a.C0036a c0036a, long j) {
            e.this = r3;
            this.a = c0036a;
            this.g = j;
            this.c = new y<>(((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b) r3.b).a(4), t.a(r3.k.a, c0036a.a), 4, r3.c);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
        public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j, long j2, boolean z) {
            y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
            e.this.j.a(yVar2.a, 4, j, j2, yVar2.f);
        }

        public void b() {
            this.h = 0L;
            if (this.i || this.b.b()) {
                return;
            }
            this.b.a(this.c, this, e.this.d);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i = false;
            b();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
        public void a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j, long j2) {
            y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = yVar2.d;
            if (cVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) {
                a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) cVar);
                e.this.j.b(yVar2.a, 4, j, j2, yVar2.f);
                return;
            }
            this.j = new l("Loaded playlist has unexpected type.");
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
        public int a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j, long j2, IOException iOException) {
            y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
            boolean z = iOException instanceof l;
            e.this.j.a(yVar2.a, 4, j, j2, yVar2.f, iOException, z);
            if (z) {
                return 3;
            }
            boolean z2 = true;
            if (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b.a(iOException)) {
                a();
                e eVar = e.this;
                if (eVar.l != this.a || e.a(eVar)) {
                    z2 = false;
                }
            }
            return z2 ? 0 : 2;
        }

        public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar) {
            long j;
            long j2;
            long j3;
            long j4;
            int i;
            b.a a;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar2;
            long j5;
            int i2;
            int i3;
            int size;
            int size2;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar3 = this.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.e = elapsedRealtime;
            e eVar = e.this;
            eVar.getClass();
            bVar.getClass();
            if (!(bVar3 == null || (i2 = bVar.g) > (i3 = bVar3.g) || (i2 >= i3 && ((size = bVar.m.size()) > (size2 = bVar3.m.size()) || (size == size2 && bVar.j && !bVar3.j))))) {
                if (!bVar.j || bVar3.j) {
                    j = elapsedRealtime;
                    bVar2 = bVar3;
                } else {
                    j = elapsedRealtime;
                    bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b(bVar3.b, bVar3.a, bVar3.c, bVar3.d, bVar3.e, bVar3.f, bVar3.g, bVar3.h, bVar3.i, true, bVar3.k, bVar3.l, bVar3.m, bVar3.n);
                }
            } else {
                j = elapsedRealtime;
                if (bVar.k) {
                    j2 = bVar.d;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar4 = eVar.m;
                    j2 = bVar4 != null ? bVar4.d : 0L;
                    if (bVar3 != null) {
                        int size3 = bVar3.m.size();
                        b.a a2 = e.a(bVar3, bVar);
                        if (a2 != null) {
                            j3 = bVar3.d;
                            j4 = a2.d;
                        } else if (size3 == bVar.g - bVar3.g) {
                            j3 = bVar3.d;
                            j4 = bVar3.o;
                        }
                        j2 = j3 + j4;
                    }
                }
                long j6 = j2;
                if (bVar.e) {
                    i = bVar.f;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar5 = eVar.m;
                    i = bVar5 != null ? bVar5.f : 0;
                    if (bVar3 != null && (a = e.a(bVar3, bVar)) != null) {
                        i = (bVar3.f + a.c) - bVar.m.get(0).c;
                    }
                }
                bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b(bVar.b, bVar.a, bVar.c, j6, true, i, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, bVar.m, bVar.n);
            }
            this.d = bVar2;
            if (bVar2 != bVar3) {
                this.j = null;
                this.f = j;
                if (e.a(e.this, this.a, bVar2)) {
                    j5 = this.d.i;
                }
                j5 = -9223372036854775807L;
            } else {
                long j7 = j;
                if (!bVar2.j) {
                    double b = com.fyber.inneractive.sdk.player.exoplayer2.b.b(bVar2.i);
                    Double.isNaN(b);
                    if (j7 - this.f > b * 3.5d) {
                        this.j = new d(this.a.a);
                        a();
                    } else if (bVar.g + bVar.m.size() < this.d.g) {
                        this.j = new c(this.a.a);
                    }
                    j5 = this.d.i / 2;
                }
                j5 = -9223372036854775807L;
            }
            if (j5 != -9223372036854775807L) {
                this.i = e.this.f.postDelayed(this, com.fyber.inneractive.sdk.player.exoplayer2.b.b(j5));
            }
        }

        public final void a() {
            this.h = SystemClock.elapsedRealtime() + 60000;
            e eVar = e.this;
            a.C0036a c0036a = this.a;
            int size = eVar.h.size();
            for (int i = 0; i < size; i++) {
                eVar.h.get(i).a(c0036a, 60000L);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public int a(y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar, long j, long j2, IOException iOException) {
        y<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c> yVar2 = yVar;
        boolean z = iOException instanceof l;
        this.j.a(yVar2.a, 4, j, j2, yVar2.f, iOException, z);
        return z ? 3 : 0;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b a(a.C0036a c0036a) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar;
        a aVar = this.e.get(c0036a);
        aVar.getClass();
        aVar.g = SystemClock.elapsedRealtime();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar2 = aVar.d;
        if (bVar2 != null && this.k.b.contains(c0036a) && (((bVar = this.m) == null || !bVar.j) && this.e.get(this.l).g - SystemClock.elapsedRealtime() > 15000)) {
            this.l = c0036a;
            this.e.get(c0036a).b();
        }
        return bVar2;
    }

    public static boolean a(e eVar) {
        List<a.C0036a> list = eVar.k.b;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a aVar = eVar.e.get(list.get(i));
            if (elapsedRealtime > aVar.h) {
                eVar.l = aVar.a;
                aVar.b();
                return true;
            }
        }
        return false;
    }

    public static boolean a(e eVar, a.C0036a c0036a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar) {
        q qVar;
        long j;
        if (c0036a == eVar.l) {
            if (eVar.m == null) {
                eVar.n = !bVar.j;
            }
            eVar.m = bVar;
            h hVar = (h) eVar.g;
            hVar.getClass();
            long j2 = bVar.c;
            if (hVar.d.n) {
                long j3 = bVar.j ? bVar.d + bVar.o : -9223372036854775807L;
                List<b.a> list = bVar.m;
                if (j2 == -9223372036854775807L) {
                    if (!list.isEmpty()) {
                        j2 = list.get(Math.max(0, list.size() - 3)).d;
                    } else {
                        j = 0;
                        qVar = new q(j3, bVar.o, bVar.d, j, true, !bVar.j);
                    }
                }
                j = j2;
                qVar = new q(j3, bVar.o, bVar.d, j, true, !bVar.j);
            } else {
                long j4 = j2 == -9223372036854775807L ? 0L : j2;
                long j5 = bVar.d;
                long j6 = bVar.o;
                qVar = new q(j5 + j6, j6, j5, j4, true, false);
            }
            hVar.e.a(qVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.e(hVar.d.k, bVar));
        }
        int size = eVar.h.size();
        for (int i = 0; i < size; i++) {
            eVar.h.get(i).c();
        }
        return c0036a == eVar.l && !bVar.j;
    }

    public static b.a a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar2) {
        int i = bVar2.g - bVar.g;
        List<b.a> list = bVar.m;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
