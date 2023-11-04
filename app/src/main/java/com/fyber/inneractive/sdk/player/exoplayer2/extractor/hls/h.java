package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h implements n, e.InterfaceC0037e {
    public final Uri a;
    public final d b;
    public final f.a c;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e d;
    public n.a e;

    public h(Uri uri, g.a aVar, int i, Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar) {
        this(uri, new b(aVar), i, handler, fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.e eVar, boolean z, n.a aVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.d == null);
        Uri uri = this.a;
        d dVar = this.b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e(uri, dVar, this.c, 3, this);
        this.d = eVar2;
        this.e = aVar;
        eVar2.i.a(new y(((b) dVar).a.a(), uri, 4, eVar2.c), eVar2, 3);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar = this.d;
        if (eVar != null) {
            eVar.i.d();
            for (e.a aVar : eVar.e.values()) {
                aVar.b.d();
            }
            eVar.f.removeCallbacksAndMessages(null);
            eVar.e.clear();
            this.d = null;
        }
        this.e = null;
    }

    public h(Uri uri, d dVar, int i, Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar) {
        this.a = uri;
        this.b = dVar;
        this.c = new f.a(handler, fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar = this.d;
        eVar.i.c();
        a.C0036a c0036a = eVar.l;
        if (c0036a != null) {
            e.a aVar = eVar.e.get(c0036a);
            aVar.b.c();
            IOException iOException = aVar.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public m a(int i, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i == 0);
        return new g(this.d, this.b, 3, this.c, bVar, j);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(m mVar) {
        g gVar = (g) mVar;
        gVar.a.h.remove(gVar);
        gVar.h.removeCallbacksAndMessages(null);
        j[] jVarArr = gVar.n;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                int size = jVar.j.size();
                for (int i = 0; i < size; i++) {
                    jVar.j.valueAt(i).b();
                }
                jVar.g.d();
                jVar.m.removeCallbacksAndMessages(null);
                jVar.s = true;
            }
        }
    }
}
