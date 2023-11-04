package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9a */
/* loaded from: assets/audience_network.dex */
public final class C02959a {
    public static final C02959a A04 = new C02959a(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C02959a(float f) {
        this(f, 1.0f, false);
    }

    public C02959a(float f, float f2, boolean z) {
        HD.A03(f > 0.0f);
        HD.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02959a c02959a = (C02959a) obj;
        return this.A01 == c02959a.A01 && this.A00 == c02959a.A00 && this.A02 == c02959a.A02;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        int result2 = this.A02 ? 1 : 0;
        return (((((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + result2;
    }
}
