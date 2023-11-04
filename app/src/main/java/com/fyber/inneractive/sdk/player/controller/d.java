package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.cache.d;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d extends g implements d.b, d.c {
    public boolean A;
    public final boolean B;
    public Bitmap C;
    public int D;
    public String E;
    public final List<com.fyber.inneractive.sdk.player.cache.h> F;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.n G;
    public boolean H;
    public int I;
    public final int p;
    public final com.fyber.inneractive.sdk.config.global.s q;
    public final int r;
    public com.fyber.inneractive.sdk.player.exoplayer2.e s;
    public int t;
    public int u;
    public boolean v;
    public Surface w;
    public com.fyber.inneractive.sdk.player.exoplayer2.n[] x;
    public Handler y;
    public s z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar = d.this.s;
            if (eVar != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
                gVar.a(gVar.a(), -9223372036854775807L);
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) d.this.s).e.f.sendEmptyMessage(5);
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) d.this.s).b();
                d.this.s = null;
            }
        }
    }

    public d(Context context, boolean z, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(context);
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = null;
        this.A = false;
        this.F = new CopyOnWriteArrayList();
        this.G = null;
        this.I = 0;
        this.B = z;
        this.q = sVar;
        this.r = IAConfigManager.c().a().a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.r rVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.r) sVar.a(com.fyber.inneractive.sdk.config.global.features.r.class) : null;
        this.p = rVar == null ? 0 : rVar.f();
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b(boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar;
        c(true);
        this.n = z;
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = this.x;
        if (nVarArr == null || (eVar = this.s) == null || this.A || nVarArr.length < 2) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(new e.c(nVarArr[1], 2, Float.valueOf(0.0f)));
        this.v = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int c() {
        long j;
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.s;
        if (eVar == null || this.A) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
        if (!gVar.o.c() && gVar.l <= 0) {
            gVar.o.a(gVar.t.a, gVar.h, false);
            j = com.fyber.inneractive.sdk.player.exoplayer2.b.b(gVar.h.e) + com.fyber.inneractive.sdk.player.exoplayer2.b.b(gVar.t.c);
        } else {
            j = gVar.v;
        }
        return (int) j;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void d(boolean z) {
        c(false);
        this.n = z;
        if (this.s == null || this.A) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = this.x;
        if (nVarArr != null && nVarArr.length >= 2) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.g) this.s).a(new e.c(nVarArr[1], 2, Float.valueOf(f)));
        }
        this.v = false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public Bitmap e() {
        return this.C;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public String f() {
        return this.B ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int g() {
        return this.u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int h() {
        return this.t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean i() {
        return this.v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean j() {
        return (this.s == null || this.A || this.e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void k() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.e;
        if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar2 != (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.s;
            if (eVar != null && !this.A) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(false);
            }
            m();
            a(bVar);
            return;
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(int i, boolean z) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i), Boolean.valueOf(z));
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.s;
        if (eVar == null || this.A) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(z);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) this.s;
        gVar.a(gVar.a(), i);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void l() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (this.s == null || this.A) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) this.s).a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar;
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        this.w = surface;
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = this.x;
        if (nVarArr == null || (eVar = this.s) == null || this.A) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(new e.c(nVarArr[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b() {
        if (this.s != null) {
            if (!this.A) {
                this.A = true;
                com.fyber.inneractive.sdk.util.m.a(new a());
            }
            s sVar = this.z;
            if (sVar != null) {
                sVar.a.clear();
            }
            this.z = null;
        }
        for (com.fyber.inneractive.sdk.player.cache.h hVar : this.F) {
            hVar.a(hVar.o);
            com.fyber.inneractive.sdk.player.cache.n nVar = com.fyber.inneractive.sdk.player.cache.n.f;
            nVar.d.remove(hVar.a());
        }
        this.F.clear();
        super.b();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(boolean z) {
        if (this.s != null || this.A) {
            return;
        }
        this.H = z;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        s sVar = this.z;
        if (sVar != null) {
            sVar.a.clear();
        }
        this.z = new s(this);
        this.y = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.n[z ? 2 : 1];
        this.x = nVarArr;
        Context context = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a;
        nVarArr[0] = new MediaCodecVideoRenderer(context, cVar, 5000L, null, false, this.y, this.z, -1);
        if (z) {
            this.x[1] = new MediaCodecAudioRenderer(cVar, null, true, null, null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.x, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b(null), new com.fyber.inneractive.sdk.player.exoplayer2.c(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(true, 65536, 0), 15000, 30000, 2500L, 5000L));
        this.s = gVar;
        gVar.f.add(this.z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int d() {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.s;
        if (eVar == null || this.A) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
        return (int) (gVar.o.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.b(gVar.o.a(gVar.a(), gVar.g).f));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    @Override // com.fyber.inneractive.sdk.player.controller.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r24, int r25) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.d.a(java.lang.String, int):void");
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.s;
        if (eVar == null || nVar == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
        if (!gVar.o.c() || gVar.p != null) {
            gVar.o = com.fyber.inneractive.sdk.player.exoplayer2.p.a;
            gVar.p = null;
            Iterator<e.a> it = gVar.f.iterator();
            while (it.hasNext()) {
                it.next().a(gVar.o, gVar.p);
            }
        }
        if (gVar.i) {
            gVar.i = false;
            gVar.q = com.fyber.inneractive.sdk.player.exoplayer2.source.s.d;
            gVar.r = gVar.c;
            gVar.b.a(null);
            Iterator<e.a> it2 = gVar.f.iterator();
            while (it2.hasNext()) {
                it2.next().a(gVar.q, gVar.r);
            }
        }
        gVar.m++;
        gVar.e.f.obtainMessage(0, 1, 0, nVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean a() {
        return this.B;
    }
}
