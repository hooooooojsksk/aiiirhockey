package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class c {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final k c;
    public final a.C0036a[] d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e e;
    public final r f;
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> g;
    public boolean h;
    public byte[] i;
    public IOException j;
    public a.C0036a k;
    public Uri l;
    public byte[] m;
    public String n;
    public byte[] o;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e p;

    /* loaded from: classes.dex */
    public static final class a extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.c {
        public final String l;
        public byte[] m;

        public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, iVar, i, obj, bArr);
            this.l = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a a;
        public boolean b;
        public a.C0036a c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$c */
    /* loaded from: classes.dex */
    public static final class C0035c extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a {
        public int g;

        public C0035c(r rVar, int[] iArr) {
            super(rVar, iArr);
            this.g = a(rVar.a(0));
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public void a(long j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.g, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!b(i, elapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public int d() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public int e() {
            return this.g;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public Object g() {
            return null;
        }
    }

    public c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar, a.C0036a[] c0036aArr, d dVar, k kVar, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.e = eVar;
        this.d = c0036aArr;
        this.c = kVar;
        this.g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[c0036aArr.length];
        int[] iArr = new int[c0036aArr.length];
        for (int i = 0; i < c0036aArr.length; i++) {
            iVarArr[i] = c0036aArr[i].b;
            iArr[i] = i;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b) dVar;
        this.a = bVar.a(1);
        this.b = bVar.a(3);
        r rVar = new r(iVarArr);
        this.f = rVar;
        this.p = new C0035c(rVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.l = uri;
        this.m = bArr;
        this.n = str;
        this.o = bArr2;
    }
}
