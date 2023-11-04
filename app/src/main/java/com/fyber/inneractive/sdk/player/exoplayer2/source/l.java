package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l implements n, n.a {
    public final Uri a;
    public final g.a b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i c;
    public final int d;
    public final Handler e;
    public final a f;
    public final p.b g = new p.b();
    public n.a h;
    public boolean i;

    /* loaded from: classes.dex */
    public interface a {
    }

    public l(Uri uri, g.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar, int i, Handler handler, a aVar2, String str) {
        this.a = uri;
        this.b = aVar;
        this.c = iVar;
        this.d = i;
        this.e = handler;
        this.f = aVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a() throws IOException {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.e eVar, boolean z, n.a aVar) {
        this.h = aVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) aVar).f.obtainMessage(7, Pair.create(new q(-9223372036854775807L, false), null)).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void b() {
        this.h = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public m a(int i, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i == 0);
        return new i(this.a, this.b.a(), this.c.a(), this.d, this.e, this.f, this, bVar, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(m mVar) {
        i iVar = (i) mVar;
        i.d dVar = iVar.j;
        x xVar = iVar.i;
        j jVar = new j(iVar, dVar);
        x.b<? extends x.c> bVar = xVar.b;
        if (bVar != null) {
            bVar.a(true);
        }
        xVar.a.execute(jVar);
        xVar.a.shutdown();
        iVar.n.removeCallbacksAndMessages(null);
        iVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, Object obj) {
        boolean z = pVar.a(0, this.g, false).d != -9223372036854775807L;
        if (!this.i || z) {
            this.i = z;
            this.h.a(pVar, null);
        }
    }
}
