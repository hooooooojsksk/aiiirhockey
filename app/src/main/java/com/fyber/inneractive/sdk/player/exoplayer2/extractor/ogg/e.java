package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {
    public static final int h = u.a("OggS");
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k g = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(255);

    public void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, boolean z) throws IOException, InterruptedException {
        int i;
        this.g.r();
        a();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        long j = bVar.b;
        if ((j == -1 || j - (bVar.c + ((long) bVar.e)) >= 27) && bVar.a(this.g.a, 0, 27, true)) {
            if (this.g.m() != h) {
                if (z) {
                    return false;
                }
                throw new l("expected OggS capture pattern at begin of page");
            } else if (this.g.l() != 0) {
                if (z) {
                    return false;
                }
                throw new l("unsupported bit stream revision");
            } else {
                this.a = this.g.l();
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = this.g;
                byte[] bArr = kVar.a;
                int i2 = kVar.b + 1;
                kVar.b = i2;
                int i3 = i2 + 1;
                kVar.b = i3;
                int i4 = i3 + 1;
                kVar.b = i4;
                int i5 = i4 + 1;
                kVar.b = i5;
                int i6 = i5 + 1;
                kVar.b = i6;
                int i7 = i6 + 1;
                kVar.b = i7;
                int i8 = i7 + 1;
                kVar.b = i8;
                kVar.b = i8 + 1;
                this.b = ((bArr[i8] & 255) << 56) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48);
                kVar.f();
                this.g.f();
                this.g.f();
                int l = this.g.l();
                this.c = l;
                this.d = l + 27;
                this.g.r();
                bVar.a(this.g.a, 0, this.c, false);
                for (int i9 = 0; i9 < this.c; i9++) {
                    this.f[i9] = this.g.l();
                    this.e += this.f[i9];
                }
                return true;
            }
        }
        if (z) {
            return false;
        }
        throw new EOFException();
    }
}
