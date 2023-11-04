package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public h a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        boolean z;
        boolean equals;
        try {
            e eVar = new e();
            if (eVar.a(gVar, true) && (eVar.a & 2) == 2) {
                int min = Math.min(eVar.e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(min);
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(kVar.a, 0, min, false);
                kVar.e(0);
                if (kVar.a() >= 5 && kVar.l() == 127 && kVar.m() == 1179402563) {
                    this.a = new b();
                } else {
                    kVar.e(0);
                    try {
                        z = k.a(1, kVar, true);
                    } catch (l unused) {
                        z = false;
                    }
                    if (z) {
                        this.a = new j();
                    } else {
                        kVar.e(0);
                        int i = g.o;
                        int a = kVar.a();
                        byte[] bArr = g.p;
                        if (a < bArr.length) {
                            equals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            int length = bArr.length;
                            System.arraycopy(kVar.a, kVar.b, bArr2, 0, length);
                            kVar.b += length;
                            equals = Arrays.equals(bArr2, bArr);
                        }
                        if (equals) {
                            this.a = new g();
                        }
                    }
                }
                return true;
            }
        } catch (l unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        n a = hVar.a(0, 1);
        hVar.c();
        h hVar2 = this.a;
        hVar2.c = hVar;
        hVar2.b = a;
        hVar2.a = new d();
        hVar2.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j, long j2) {
        h hVar = this.a;
        d dVar = hVar.a;
        dVar.a.a();
        dVar.b.r();
        dVar.c = -1;
        dVar.e = false;
        if (j == 0) {
            hVar.a(!hVar.l);
        } else if (hVar.h != 0) {
            hVar.e = hVar.d.c(j2);
            hVar.h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws IOException, InterruptedException {
        h hVar = this.a;
        int i = hVar.h;
        if (i == 0) {
            boolean z = true;
            while (z) {
                if (!hVar.a.a(gVar)) {
                    hVar.h = 3;
                    return -1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
                long j = bVar.c;
                long j2 = hVar.f;
                hVar.k = j - j2;
                boolean a = hVar.a(hVar.a.b, j2, hVar.j);
                if (a) {
                    hVar.f = bVar.c;
                }
                z = a;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar = hVar.j.a;
            hVar.i = iVar.s;
            if (!hVar.m) {
                hVar.b.a(iVar);
                hVar.m = true;
            }
            f fVar = hVar.j.b;
            if (fVar != null) {
                hVar.d = fVar;
            } else {
                long j3 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b;
                if (j3 == -1) {
                    hVar.d = new h.b();
                } else {
                    e eVar = hVar.a.a;
                    hVar.d = new a(hVar.f, j3, hVar, eVar.d + eVar.e, eVar.b);
                }
            }
            hVar.j = null;
            hVar.h = 2;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = hVar.a.b;
            byte[] bArr = kVar.a;
            if (bArr.length != 65025) {
                kVar.a = Arrays.copyOf(bArr, Math.max(65025, kVar.c));
            }
        } else if (i == 1) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c((int) hVar.f);
            hVar.h = 2;
        } else if (i == 2) {
            long a2 = hVar.d.a(gVar);
            if (a2 >= 0) {
                lVar.a = a2;
                return 1;
            }
            if (a2 < -1) {
                hVar.b(-(a2 + 2));
            }
            if (!hVar.l) {
                hVar.c.a(hVar.d.b());
                hVar.l = true;
            }
            if (hVar.k <= 0 && !hVar.a.a(gVar)) {
                hVar.h = 3;
                return -1;
            }
            hVar.k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = hVar.a.b;
            long a3 = hVar.a(kVar2);
            if (a3 >= 0) {
                long j4 = hVar.g;
                if (j4 + a3 >= hVar.e) {
                    hVar.b.a(kVar2, kVar2.c);
                    hVar.b.a((j4 * 1000000) / hVar.i, 1, kVar2.c, 0, null);
                    hVar.e = -1L;
                }
            }
            hVar.g += a3;
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
