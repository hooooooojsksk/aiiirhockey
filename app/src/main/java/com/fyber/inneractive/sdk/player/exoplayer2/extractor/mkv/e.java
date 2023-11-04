package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class e {
    public final k a = new k(8);
    public int b;

    public final long a(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        int i = 0;
        bVar.a(this.a.a, 0, 1, false);
        int i2 = this.a.a[0] & UByte.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        bVar.a(this.a.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }
}
