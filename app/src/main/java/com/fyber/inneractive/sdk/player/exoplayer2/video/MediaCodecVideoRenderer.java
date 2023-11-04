package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes.dex */
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b {
    public static final int[] w0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final d V;
    public final VideoRendererEventListener.EventDispatcher W;
    public final long X;
    public final int Y;
    public final boolean Z;
    public i[] a0;
    public a b0;
    public Surface c0;
    public int d0;
    public boolean e0;
    public long f0;
    public long g0;
    public int h0;
    public int i0;
    public int j0;
    public float k0;
    public int l0;
    public int m0;
    public int n0;
    public float o0;
    public int p0;
    public int q0;
    public int r0;
    public float s0;
    public boolean t0;
    public int u0;
    public b v0;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements MediaCodec.OnFrameRenderedListener {
        public b(MediaCodec mediaCodec) {
            MediaCodecVideoRenderer.this = r1;
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.v0) {
                return;
            }
            mediaCodecVideoRenderer.C();
        }
    }

    public MediaCodecVideoRenderer(Context context, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> cVar2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        super(2, cVar, null, z);
        this.X = j;
        this.Y = i;
        this.V = new d(context);
        this.W = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.Z = A();
        this.f0 = -9223372036854775807L;
        this.l0 = -1;
        this.m0 = -1;
        this.o0 = -1.0f;
        this.k0 = -1.0f;
        this.d0 = 1;
        z();
    }

    public static boolean A() {
        return u.a <= 22 && "foster".equals(u.b) && "NVIDIA".equals(u.c);
    }

    public final void B() {
        if (this.h0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.W.droppedFrames(this.h0, elapsedRealtime - this.g0);
            this.h0 = 0;
            this.g0 = elapsedRealtime;
        }
    }

    public void C() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        this.W.renderedFirstFrame(this.c0);
    }

    public final void D() {
        int i = this.l0;
        if (i == -1 && this.m0 == -1) {
            return;
        }
        if (this.p0 == i && this.q0 == this.m0 && this.r0 == this.n0 && this.s0 == this.o0) {
            return;
        }
        this.W.videoSizeChanged(i, this.m0, this.n0, this.o0);
        this.p0 = this.l0;
        this.q0 = this.m0;
        this.r0 = this.n0;
        this.s0 = this.o0;
    }

    public final void E() {
        int i = this.p0;
        if (i == -1 && this.q0 == -1) {
            return;
        }
        this.W.videoSizeChanged(i, this.q0, this.r0, this.s0);
    }

    public final void F() {
        this.f0 = this.X > 0 ? SystemClock.elapsedRealtime() + this.X : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:246:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x02d7  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r18, com.fyber.inneractive.sdk.player.exoplayer2.i r19) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.b {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean isReady() {
        if ((this.e0 || super.x()) && super.isReady()) {
            this.f0 = -9223372036854775807L;
            return true;
        } else if (this.f0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f0) {
                return true;
            }
            this.f0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.a
    public void p() {
        this.l0 = -1;
        this.m0 = -1;
        this.o0 = -1.0f;
        this.k0 = -1.0f;
        z();
        y();
        d dVar = this.V;
        dVar.getClass();
        dVar.a.b.sendEmptyMessage(2);
        this.v0 = null;
        try {
            super.p();
        } finally {
            this.T.ensureUpdated();
            this.W.disabled(this.T);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void q() {
        this.h0 = 0;
        this.g0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void r() {
        this.f0 = -9223372036854775807L;
        B();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public boolean x() {
        Surface surface;
        return super.x() && (surface = this.c0) != null && surface.isValid();
    }

    public final void y() {
        MediaCodec mediaCodec;
        this.e0 = false;
        if (u.a < 23 || !this.t0 || (mediaCodec = this.r) == null) {
            return;
        }
        this.v0 = new b(mediaCodec);
    }

    public final void z() {
        this.p0 = -1;
        this.q0 = -1;
        this.s0 = -1.0f;
        this.r0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(i[] iVarArr) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.a0 = iVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(long j, boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(j, z);
        y();
        this.i0 = 0;
        if (z) {
            F();
        } else {
            this.f0 = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.b
    public void a(int i, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i != 1) {
            if (i == 4) {
                int intValue = ((Integer) obj).intValue();
                this.d0 = intValue;
                MediaCodec mediaCodec = this.r;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(intValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.c0 == surface) {
            if (surface != null) {
                E();
                if (this.e0) {
                    this.W.renderedFirstFrame(this.c0);
                    return;
                }
                return;
            }
            return;
        }
        this.c0 = surface;
        int i2 = this.d;
        if (i2 == 1 || i2 == 2) {
            MediaCodec mediaCodec2 = this.r;
            if (u.a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                v();
                t();
            }
        }
        if (surface != null) {
            E();
            y();
            if (i2 == 2) {
                F();
                return;
            }
            return;
        }
        z();
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x012c A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r23, android.media.MediaCodec r24, com.fyber.inneractive.sdk.player.exoplayer2.i r25, android.media.MediaCrypto r26) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.b {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a, android.media.MediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.i, android.media.MediaCrypto):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(String str, long j, long j2) {
        this.W.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(i iVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(iVar);
        this.W.inputFormatChanged(iVar);
        float f = iVar.n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.k0 = f;
        int i = iVar.m;
        if (i == -1) {
            i = 0;
        }
        this.j0 = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar) {
        if (u.a >= 23 || !this.t0) {
            return;
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.l0 = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.m0 = integer2;
        float f = this.k0;
        this.o0 = f;
        if (u.a >= 21) {
            int i = this.j0;
            if (i == 90 || i == 270) {
                int i2 = this.l0;
                this.l0 = integer2;
                this.m0 = i2;
                this.o0 = 1.0f / f;
            }
        } else {
            this.n0 = this.j0;
        }
        mediaCodec.setVideoScalingMode(this.d0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.T = decoderCounters;
        int i = this.b.a;
        this.u0 = i;
        this.t0 = i != 0;
        this.W.enabled(decoderCounters);
        d dVar = this.V;
        dVar.g = false;
        dVar.a.b.sendEmptyMessage(1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public boolean a(MediaCodec mediaCodec, boolean z, i iVar, i iVar2) {
        if (a(z, iVar, iVar2)) {
            int i = iVar2.j;
            a aVar = this.b0;
            if (i <= aVar.a && iVar2.k <= aVar.b && iVar2.g <= aVar.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0129  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r20, long r22, android.media.MediaCodec r24, java.nio.ByteBuffer r25, int r26, int r27, long r28, boolean r30) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    public final void a(MediaCodec mediaCodec, int i) {
        D();
        s.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        s.a();
        this.T.renderedOutputBufferCount++;
        this.i0 = 0;
        C();
    }

    public final void a(MediaCodec mediaCodec, int i, long j) {
        D();
        s.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        s.a();
        this.T.renderedOutputBufferCount++;
        this.i0 = 0;
        C();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.getClass();
        str.hashCode();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
                i3 = i * i2;
                i4 = 2;
                break;
            case 1:
            case 5:
                i3 = i * i2;
                break;
            case 3:
                if (!"BRAVIA 4K 2015".equals(u.d)) {
                    i3 = u.a(i, 16) * u.a(i2, 16) * 16 * 16;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
        return (i3 * 3) / (i4 * 2);
    }

    public static boolean a(boolean z, i iVar, i iVar2) {
        if (iVar.f.equals(iVar2.f)) {
            int i = iVar.m;
            if (i == -1) {
                i = 0;
            }
            int i2 = iVar2.m;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i == i2) {
                return z || (iVar.j == iVar2.j && iVar.k == iVar2.k);
            }
            return false;
        }
        return false;
    }
}
