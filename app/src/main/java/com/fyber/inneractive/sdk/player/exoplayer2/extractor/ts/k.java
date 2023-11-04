package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class k implements h {
    public final s a;
    public String b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n c;
    public a d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final n g = new n(32, 128);
    public final n h = new n(33, 128);
    public final n i = new n(34, 128);
    public final n j = new n(39, 128);
    public final n k = new n(40, 128);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k n = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();

    /* loaded from: classes.dex */
    public static final class a {
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar) {
            this.a = nVar;
        }
    }

    public k(s sVar) {
        this.a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        a aVar = this.d;
        aVar.f = false;
        aVar.g = false;
        aVar.h = false;
        aVar.i = false;
        aVar.j = false;
        this.l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.b = dVar.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a2 = hVar.a(dVar.c(), 2);
        this.c = a2;
        this.d = new a(a2);
        this.a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        this.m = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:357:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x03c9  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r39) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            a aVar = this.d;
            if (aVar.f) {
                int i3 = aVar.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    aVar.g = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
                    aVar.f = false;
                } else {
                    aVar.d = i3 + (i2 - i);
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }
}
