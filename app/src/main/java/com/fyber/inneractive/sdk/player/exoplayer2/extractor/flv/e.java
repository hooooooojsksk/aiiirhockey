package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;

/* loaded from: classes.dex */
public final class e extends d {
    public final k b;
    public final k c;
    public int d;
    public boolean e;
    public int f;

    public e(n nVar) {
        super(nVar);
        this.b = new k(i.a);
        this.c = new k(4);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public boolean a(k kVar) throws d.a {
        int l = kVar.l();
        int i = (l >> 4) & 15;
        int i2 = l & 15;
        if (i2 == 7) {
            this.f = i;
            return i != 5;
        }
        throw new d.a("Video format not supported: " + i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public void b(k kVar, long j) throws l {
        int l = kVar.l();
        long n = j + (kVar.n() * 1000);
        if (l == 0 && !this.e) {
            k kVar2 = new k(new byte[kVar.a()]);
            kVar.a(kVar2.a, 0, kVar.a());
            com.fyber.inneractive.sdk.player.exoplayer2.video.a b = com.fyber.inneractive.sdk.player.exoplayer2.video.a.b(kVar2);
            this.d = b.b;
            this.a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "video/avc", (String) null, -1, -1, b.c, b.d, -1.0f, b.a, -1, b.e, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
            this.e = true;
        } else if (l == 1 && this.e) {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.d;
            int i2 = 0;
            while (kVar.a() > 0) {
                kVar.a(this.c.a, i, this.d);
                this.c.e(0);
                int o = this.c.o();
                this.b.e(0);
                this.a.a(this.b, 4);
                this.a.a(kVar, o);
                i2 = i2 + 4 + o;
            }
            this.a.a(n, this.f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}
