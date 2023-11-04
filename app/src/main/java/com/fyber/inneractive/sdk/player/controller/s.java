package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.l;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.player.mediaplayer.a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class s implements l.a, VideoRendererEventListener, e.a, com.fyber.inneractive.sdk.player.exoplayer2.source.f {
    public final WeakReference<d> a;
    public boolean b = false;

    public s(d dVar) {
        this.a = new WeakReference<>(dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.m mVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(boolean z, int i) {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", b(), Boolean.valueOf(z), Integer.valueOf(i));
        d dVar = this.a.get();
        if (dVar == null || (eVar = dVar.s) == null || dVar.A) {
            return;
        }
        if (i != 3) {
            if (i == 2) {
                if (dVar.e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    dVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                }
            } else if (i == 4) {
                dVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
            }
        } else if (!z) {
            if (dVar.e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                if (eVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
                    if (gVar.r != null && gVar.r.a > 0) {
                        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar2 = gVar.r.b[0];
                        com.fyber.inneractive.sdk.player.exoplayer2.i c = eVar2 == null ? null : eVar2.c();
                        if (c != null) {
                            int i2 = c.j;
                            int i3 = c.k;
                            dVar.t = i2;
                            dVar.u = i3;
                        }
                    }
                }
                this.b = true;
                dVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
            }
        } else {
            dVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        }
    }

    public final String b() {
        d dVar = this.a.get();
        if (dVar == null) {
            return s.class.getName();
        }
        return IAlog.a(dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onDroppedFrames(int i, long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        d dVar = this.a.get();
        if (dVar != null) {
            dVar.t = i;
            dVar.u = i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.d dVar) {
        d dVar2 = this.a.get();
        if (dVar2 != null && dVar2.H && dVar2.B && !this.b && (dVar.getCause() instanceof c.e)) {
            dVar2.v = true;
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar = dVar2.s;
            if (eVar != null) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).b();
                dVar2.s = null;
            }
            dVar2.a(false);
            dVar2.a(dVar2.G);
            dVar2.i.post(new h(dVar2, false));
        } else if (dVar2 != null && dVar2.B && !this.b && com.fyber.inneractive.sdk.player.cache.n.f.a() && dVar2.I < dVar2.p) {
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar2 = dVar2.s;
            if (eVar2 != null) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar2).b();
                dVar2.s = null;
            }
            dVar2.a(true);
            dVar2.a(dVar2.G);
            dVar2.I++;
            dVar2.i.post(new h(dVar2, true));
        } else {
            a.l lVar = new a.l(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
            IAlog.a("%sonPlayerError called with %s for sendErrorState", b(), lVar);
            d dVar3 = (d) com.fyber.inneractive.sdk.util.q.a(this.a);
            if (dVar3 != null) {
                dVar3.a(lVar);
            }
        }
    }
}
