package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class V8 extends AbstractC03149u {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    @Nullable
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public V8(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, @Nullable Object obj) {
        this.A01 = j;
        this.A05 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A02 = j6;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = obj;
    }

    public V8(long j, long j2, long j3, long j4, boolean z, boolean z2, @Nullable Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public V8(long j, boolean z, boolean z2, @Nullable Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03149u
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03149u
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03149u
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03149u
    public final C03129s A0A(int i, C03129s c03129s, boolean z) {
        HD.A00(i, 0, 1);
        Object uid = z ? A09 : null;
        return c03129s.A0B(null, uid, 0, this.A00, -this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03149u
    public final C03139t A0D(int i, C03139t c03139t, boolean z, long j) {
        Object obj;
        HD.A00(i, 0, 1);
        if (z) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j2 = this.A02;
        if (this.A07 && j != 0) {
            long j3 = this.A03;
            if (j3 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 += j;
                if (j2 > j3) {
                    j2 = -9223372036854775807L;
                }
            }
        }
        return c03139t.A04(obj, this.A01, this.A05, this.A08, this.A07, j2, this.A03, 0, 0, this.A04);
    }
}
