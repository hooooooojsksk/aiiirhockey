package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.r a;
    public boolean d;
    public boolean e;
    public boolean f;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h g;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(4096);
    public final SparseArray<a> b = new SparseArray<>();

    /* loaded from: classes.dex */
    public static final class a {
        public final h a;
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.r b;
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.j c = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;
        public long g;

        public a(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar) {
            this.a = hVar;
            this.b = rVar;
        }
    }

    public p(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar) {
        this.a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(bArr, 0, 14, false);
        if (442 == (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            bVar.a(bArr[13] & 7, false);
            bVar.a(bArr, 0, 3, false);
            return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.g = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        this.a.c = -9223372036854775807L;
        for (int i = 0; i < this.b.size(); i++) {
            a valueAt = this.b.valueAt(i);
            valueAt.f = false;
            valueAt.a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x00b0  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }
}
