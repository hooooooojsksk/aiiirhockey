package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class f {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public long a(g gVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.b == 0) {
            if (!((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.a, 0, 1, z)) {
                return -1L;
            }
            int a = a(this.a[0] & UByte.MAX_VALUE);
            this.c = a;
            if (a != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.a, 1, i2 - 1, false);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }

    public static int a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & i) > 0L ? 1 : ((jArr[i3] & i) == 0L ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= d[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
