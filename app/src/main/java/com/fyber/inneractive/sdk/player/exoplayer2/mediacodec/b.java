package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.j;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] U;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ByteBuffer[] E;
    public ByteBuffer[] F;
    public long G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public DecoderCounters T;
    public final c i;
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> j;
    public final boolean k;
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.b l;
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.b m;
    public final j n;
    public final List<Long> o;
    public final MediaCodec.BufferInfo p;
    public i q;
    public MediaCodec r;
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> s;
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        int i = u.a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16));
        }
        U = bArr;
    }

    public b(int i, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> cVar2, boolean z) {
        super(i);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(u.a >= 16);
        this.i = (c) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(cVar);
        this.j = cVar2;
        this.k = z;
        this.l = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.b(0);
        this.m = com.fyber.inneractive.sdk.player.exoplayer2.decoder.b.b();
        this.n = new j();
        this.o = new ArrayList();
        this.p = new MediaCodec.BufferInfo();
        this.L = 0;
        this.M = 0;
    }

    public abstract int a(c cVar, i iVar) throws d.b;

    public com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(c cVar, i iVar, boolean z) throws d.b {
        return cVar.a(iVar.f, z);
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.fyber.inneractive.sdk.player.exoplayer2.d;

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar) {
    }

    public abstract void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, i iVar, MediaCrypto mediaCrypto) throws d.b;

    public abstract void a(String str, long j, long j2);

    public abstract boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d;

    public boolean a(MediaCodec mediaCodec, boolean z, i iVar, i iVar2) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean b() {
        return this.Q;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean isReady() {
        if (this.q != null && !this.R) {
            if ((this.g ? this.h : this.e.isReady()) || this.I >= 0 || (this.G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void p() {
        this.q = null;
        try {
            v();
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar = this.s;
                if (bVar != null) {
                    this.j.a(bVar);
                }
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar2 = this.t;
                    if (bVar2 != null && bVar2 != this.s) {
                        this.j.a(bVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar3 = this.t;
                    if (bVar3 != null && bVar3 != this.s) {
                        this.j.a(bVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.s != null) {
                    this.j.a(this.s);
                }
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar4 = this.t;
                    if (bVar4 != null && bVar4 != this.s) {
                        this.j.a(bVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar5 = this.t;
                    if (bVar5 != null && bVar5 != this.s) {
                        this.j.a(bVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.s():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.t():void");
    }

    public final void u() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.M == 2) {
            v();
            t();
            return;
        }
        this.Q = true;
        w();
    }

    public void v() {
        if (this.r != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.R = false;
            this.J = false;
            this.o.clear();
            this.E = null;
            this.F = null;
            this.K = false;
            this.N = false;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = false;
            this.B = false;
            this.C = false;
            this.D = false;
            this.O = false;
            this.L = 0;
            this.M = 0;
            this.T.decoderReleaseCount++;
            this.l.c = null;
            try {
                this.r.stop();
                try {
                    this.r.release();
                    this.r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar = this.s;
                    if (bVar == null || this.t == bVar) {
                        return;
                    }
                    try {
                        this.j.a(bVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar2 = this.s;
                    if (bVar2 != null && this.t != bVar2) {
                        try {
                            this.j.a(bVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.r.release();
                    this.r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar3 = this.s;
                    if (bVar3 != null && this.t != bVar3) {
                        try {
                            this.j.a(bVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.r = null;
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> bVar4 = this.s;
                    if (bVar4 != null && this.t != bVar4) {
                        try {
                            this.j.a(bVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void w() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
    }

    public boolean x() {
        return this.r == null && this.q != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(long j, boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.P = false;
        this.Q = false;
        if (this.r != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.S = true;
            this.R = false;
            this.J = false;
            this.o.clear();
            this.C = false;
            this.D = false;
            if (!this.w && (!this.z || !this.O)) {
                if (this.M != 0) {
                    v();
                    t();
                } else {
                    this.r.flush();
                    this.N = false;
                }
            } else {
                v();
                t();
            }
            if (!this.K || this.q == null) {
                return;
            }
            this.L = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(i iVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + iVar, th);
            String str = iVar.f;
            a(i);
        }

        public static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public static String a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        public a(i iVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + iVar, th);
            String str2 = iVar.f;
            if (u.a >= 21) {
                a(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0186 A[LOOP:0: B:123:0x0047->B:191:0x0186, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0189 A[EDGE_INSN: B:207:0x0189->B:192:0x0189 ?: BREAK  , SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r18, long r20) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.a(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
        if (r5.k == r0.k) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i r5) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r4.q
            r4.q = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.i
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.i
        Ld:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L47
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.i
            if (r5 == 0) goto L45
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.j
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = r3.i
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b r5 = r5.a(r1, r3)
            r4.t = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.s
            if (r5 != r1) goto L47
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.j
            r1.a(r5)
            goto L47
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.c
            com.fyber.inneractive.sdk.player.exoplayer2.d r5 = com.fyber.inneractive.sdk.player.exoplayer2.d.a(r5, r0)
            throw r5
        L45:
            r4.t = r1
        L47:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.t
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.s
            if (r5 != r1) goto L76
            android.media.MediaCodec r5 = r4.r
            if (r5 == 0) goto L76
            boolean r1 = r4.u
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.q
            boolean r5 = r4.a(r5, r1, r0, r3)
            if (r5 == 0) goto L76
            r4.K = r2
            r4.L = r2
            boolean r5 = r4.x
            if (r5 == 0) goto L72
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.q
            int r1 = r5.j
            int r3 = r0.j
            if (r1 != r3) goto L72
            int r5 = r5.k
            int r0 = r0.k
            if (r5 != r0) goto L72
            goto L73
        L72:
            r2 = 0
        L73:
            r4.C = r2
            goto L83
        L76:
            boolean r5 = r4.N
            if (r5 == 0) goto L7d
            r4.M = r2
            goto L83
        L7d:
            r4.v()
            r4.t()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b.a(com.fyber.inneractive.sdk.player.exoplayer2.i):void");
    }
}
