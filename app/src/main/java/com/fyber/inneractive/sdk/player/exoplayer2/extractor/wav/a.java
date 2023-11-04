package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements f, m {
    public h a;
    public n b;
    public b c;
    public int d;
    public int e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        return c.a(gVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        b bVar = this.c;
        return ((bVar.h / bVar.d) * 1000000) / bVar.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.a = hVar;
        this.b = hVar.a(0, 1);
        this.c = null;
        hVar.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        this.e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(g gVar, l lVar) throws IOException, InterruptedException {
        if (this.c == null) {
            b a = c.a(gVar);
            this.c = a;
            if (a != null) {
                int i = a.b;
                int i2 = a.a;
                this.b.a(i.a((String) null, "audio/raw", (String) null, a.e * i * i2, 32768, i2, i, a.f, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
                this.d = this.c.d;
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Unsupported or unrecognized wav header.");
            }
        }
        b bVar = this.c;
        if (!((bVar.g == 0 || bVar.h == 0) ? false : true)) {
            gVar.getClass();
            bVar.getClass();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
            bVar2.e = 0;
            k kVar = new k(8);
            c.a a2 = c.a.a(gVar, kVar);
            while (a2.a != u.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.a);
                long j = a2.b + 8;
                if (a2.a == u.a("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    bVar2.c((int) j);
                    a2 = c.a.a(gVar, kVar);
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Chunk is too large (~2GB+) to skip; id: " + a2.a);
                }
            }
            bVar2.c(8);
            long j2 = bVar2.c;
            long j3 = a2.b;
            bVar.g = j2;
            bVar.h = j3;
            this.a.a(this);
        }
        int a3 = this.b.a(gVar, 32768 - this.e, true);
        if (a3 != -1) {
            this.e += a3;
        }
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            b bVar3 = this.c;
            int i6 = i5 * i4;
            int i7 = i3 - i6;
            this.e = i7;
            this.b.a(((((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c - i3) * 1000000) / bVar3.c, 1, i6, i7, null);
        }
        return a3 == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        b bVar = this.c;
        long j2 = bVar.d;
        return Math.min((((j * bVar.c) / 1000000) / j2) * j2, bVar.h - j2) + bVar.g;
    }
}
