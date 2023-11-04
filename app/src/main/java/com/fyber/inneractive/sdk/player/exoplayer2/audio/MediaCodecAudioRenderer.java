package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MediaCodecAudioRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b implements com.fyber.inneractive.sdk.player.exoplayer2.util.g {
    public final AudioRendererEventListener.EventDispatcher V;
    public final c W;
    public boolean X;
    public int Y;
    public int Z;
    public long a0;
    public boolean b0;

    /* loaded from: classes.dex */
    public final class b implements c.f {
        public b() {
            MediaCodecAudioRenderer.this = r1;
        }
    }

    public MediaCodecAudioRenderer(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(cVar, cVar2, z, null, null, new com.fyber.inneractive.sdk.player.exoplayer2.audio.b[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean b() {
        if (this.Q) {
            c cVar = this.W;
            if (!cVar.e() || (cVar.X && !cVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public m i() {
        return this.W.s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean isReady() {
        return this.W.d() || super.isReady();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a, com.fyber.inneractive.sdk.player.exoplayer2.n
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g j() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x018c A[Catch: Exception -> 0x01a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a7, blocks: (B:137:0x0167, B:139:0x018c), top: B:177:0x0167 }] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long o() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer.o():long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.a
    public void p() {
        try {
            c cVar = this.W;
            cVar.h();
            for (com.fyber.inneractive.sdk.player.exoplayer2.audio.b bVar : cVar.c) {
                bVar.g();
            }
            cVar.Z = 0;
            cVar.Y = false;
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void q() {
        this.W.g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void r() {
        c cVar = this.W;
        cVar.Y = false;
        if (cVar.e()) {
            cVar.j();
            c.b bVar = cVar.g;
            if (bVar.g != -9223372036854775807L) {
                return;
            }
            bVar.a.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void w() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        try {
            c cVar = this.W;
            if (!cVar.X && cVar.e() && cVar.a()) {
                c.b bVar = cVar.g;
                long c = cVar.c();
                bVar.h = bVar.a();
                bVar.g = SystemClock.elapsedRealtime() * 1000;
                bVar.i = c;
                bVar.a.stop();
                cVar.w = 0;
                cVar.X = true;
            }
        } catch (c.h e) {
            throw com.fyber.inneractive.sdk.player.exoplayer2.d.a(e, this.c);
        }
    }

    public MediaCodecAudioRenderer(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.c cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, com.fyber.inneractive.sdk.player.exoplayer2.audio.b... bVarArr) {
        super(1, cVar, cVar2, z);
        this.W = new c(bVarArr, new b());
        this.V = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x005d, code lost:
        if (r4 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0140, code lost:
        if (r10 == false) goto L19;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r10, com.fyber.inneractive.sdk.player.exoplayer2.i r11) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.b {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar, i iVar, boolean z) throws d.b {
        String str = iVar.f;
        this.W.getClass();
        return cVar.a(iVar.f, z);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, i iVar, MediaCrypto mediaCrypto) {
        boolean z;
        String str = aVar.a;
        if (u.a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(u.c)) {
            String str2 = u.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.X = z;
                mediaCodec.configure(iVar.a(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z = false;
        this.X = z;
        mediaCodec.configure(iVar.a(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(String str, long j, long j2) {
        this.V.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(i iVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(iVar);
        this.V.inputFormatChanged(iVar);
        this.Y = "audio/raw".equals(iVar.f) ? iVar.t : 2;
        this.Z = iVar.r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.X && integer == 6 && (i = this.Z) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.Z; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.W.a("audio/raw", integer, integer2, this.Y, 0, iArr);
        } catch (c.d e) {
            throw com.fyber.inneractive.sdk.player.exoplayer2.d.a(e, this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(long j, boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(j, z);
        this.W.h();
        this.a0 = j;
        this.b0 = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public m a(m mVar) {
        return this.W.a(mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.T.skippedOutputBufferCount++;
            c cVar = this.W;
            if (cVar.L == 1) {
                cVar.L = 2;
            }
            return true;
        }
        try {
            if (this.W.a(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                this.T.renderedOutputBufferCount++;
                return true;
            }
            return false;
        } catch (c.e | c.h e) {
            throw com.fyber.inneractive.sdk.player.exoplayer2.d.a(e, this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.T = decoderCounters;
        this.V.enabled(decoderCounters);
        int i = this.b.a;
        if (i != 0) {
            c cVar = this.W;
            cVar.getClass();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(u.a >= 21);
            if (cVar.a0 && cVar.Z == i) {
                return;
            }
            cVar.a0 = true;
            cVar.Z = i;
            cVar.h();
            return;
        }
        c cVar2 = this.W;
        if (cVar2.a0) {
            cVar2.a0 = false;
            cVar2.Z = 0;
            cVar2.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.b
    public void a(int i, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i == 2) {
            c cVar = this.W;
            float floatValue = ((Float) obj).floatValue();
            if (cVar.P != floatValue) {
                cVar.P = floatValue;
                cVar.k();
            }
        } else if (i != 3) {
        } else {
            int intValue = ((Integer) obj).intValue();
            c cVar2 = this.W;
            if (cVar2.n == intValue) {
                return;
            }
            cVar2.n = intValue;
            if (cVar2.a0) {
                return;
            }
            cVar2.h();
            cVar2.Z = 0;
        }
    }
}
