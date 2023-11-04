package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class d implements b.a {
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;
    public final long e;
    public final int f;

    public d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return this.d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a
    public long b(long j) {
        long j2 = 0;
        if (a()) {
            long j3 = this.a;
            if (j >= j3) {
                double d = j - j3;
                Double.isNaN(d);
                double d2 = this.e;
                Double.isNaN(d2);
                double d3 = (d * 256.0d) / d2;
                int b = u.b(this.d, (long) d3, true, false) + 1;
                long j4 = this.b;
                long j5 = (b * j4) / 100;
                long j6 = b == 0 ? 0L : this.d[b - 1];
                long j7 = b == 99 ? 256L : this.d[b];
                long j8 = (j4 * (b + 1)) / 100;
                if (j7 != j6) {
                    double d4 = j8 - j5;
                    double d5 = j6;
                    Double.isNaN(d5);
                    Double.isNaN(d4);
                    double d6 = j7 - j6;
                    Double.isNaN(d6);
                    j2 = (long) ((d4 * (d3 - d5)) / d6);
                }
                return j5 + j2;
            }
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j) {
        if (!a()) {
            return this.a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.b);
        if (f <= 0.0f) {
            r0 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            float f2 = i != 0 ? (float) this.d[i - 1] : 0.0f;
            r0 = (((i < 99 ? (float) this.d[i] : 256.0f) - f2) * (f - i)) + f2;
        }
        double d = r0;
        Double.isNaN(d);
        double d2 = this.e;
        Double.isNaN(d2);
        long round = Math.round(d * 0.00390625d * d2);
        long j2 = this.a;
        long j3 = round + j2;
        long j4 = this.c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - this.f) + this.e) - 1);
    }
}
