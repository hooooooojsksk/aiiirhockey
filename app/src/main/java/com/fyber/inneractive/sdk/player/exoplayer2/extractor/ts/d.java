package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class d implements h {
    public static final byte[] r = {airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 51};
    public final boolean a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.j b = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[7]);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(Arrays.copyOf(r, 10));
    public final String d;
    public String e;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public long m;
    public int n;
    public long o;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n p;
    public long q;

    public d(boolean z, String str) {
        c();
        this.a = z;
        this.d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = hVar.a(dVar.c(), 1);
        if (this.a) {
            dVar.a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a = hVar.a(dVar.c(), 4);
            this.g = a;
            a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/id3", null, -1, null));
            return;
        }
        this.g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j, boolean z) {
        this.o = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        while (kVar.a() > 0) {
            int i = this.h;
            if (i == 0) {
                byte[] bArr = kVar.a;
                int i2 = kVar.b;
                int i3 = kVar.c;
                while (true) {
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        int i5 = bArr[i2] & UByte.MAX_VALUE;
                        int i6 = this.j;
                        if (i6 != 512 || i5 < 240 || i5 == 255) {
                            int i7 = i5 | i6;
                            if (i7 == 329) {
                                this.j = 768;
                            } else if (i7 == 511) {
                                this.j = 512;
                            } else if (i7 == 836) {
                                this.j = 1024;
                            } else if (i7 == 1075) {
                                this.h = 1;
                                this.i = r.length;
                                this.n = 0;
                                this.c.e(0);
                                kVar.e(i4);
                                break;
                            } else if (i6 != 256) {
                                this.j = 256;
                                i2 = i4 - 1;
                            }
                            i2 = i4;
                        } else {
                            this.k = (i5 & 1) == 0;
                            this.h = 2;
                            this.i = 0;
                            kVar.e(i4);
                        }
                    } else {
                        kVar.e(i2);
                        break;
                    }
                }
            } else if (i != 1) {
                if (i == 2) {
                    if (a(kVar, this.b.a, this.k ? 7 : 5)) {
                        this.b.b(0);
                        if (!this.l) {
                            int a = this.b.a(2) + 1;
                            if (a != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + a + ", but assuming AAC LC.");
                                a = 2;
                            }
                            int a2 = this.b.a(4);
                            this.b.c(1);
                            byte[] bArr2 = {(byte) (((a << 3) & 248) | ((a2 >> 1) & 7)), (byte) (((a2 << 7) & 128) | ((this.b.a(3) << 3) & 120))};
                            Pair<Integer, Integer> a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.c.a(bArr2);
                            com.fyber.inneractive.sdk.player.exoplayer2.i a4 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(this.e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, Collections.singletonList(bArr2), (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, this.d);
                            this.m = 1024000000 / a4.s;
                            this.f.a(a4);
                            this.l = true;
                        } else {
                            this.b.c(10);
                        }
                        this.b.c(4);
                        int a5 = (this.b.a(13) - 2) - 5;
                        if (this.k) {
                            a5 -= 2;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar = this.f;
                        long j = this.m;
                        this.h = 3;
                        this.i = 0;
                        this.p = nVar;
                        this.q = j;
                        this.n = a5;
                    }
                } else if (i == 3) {
                    int min = Math.min(kVar.a(), this.n - this.i);
                    this.p.a(kVar, min);
                    int i8 = this.i + min;
                    this.i = i8;
                    int i9 = this.n;
                    if (i8 == i9) {
                        this.p.a(this.o, 1, i9, 0, null);
                        this.o += this.q;
                        c();
                    }
                }
            } else if (a(kVar, this.c.a, 10)) {
                this.g.a(this.c, 10);
                this.c.e(6);
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.g;
                this.h = 3;
                this.i = 10;
                this.p = nVar2;
                this.q = 0L;
                this.n = this.c.k() + 10;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.a(), i - this.i);
        System.arraycopy(kVar.a, kVar.b, bArr, this.i, min);
        kVar.b += min;
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }
}
