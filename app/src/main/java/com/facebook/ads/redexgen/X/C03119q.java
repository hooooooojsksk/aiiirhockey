package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.9q */
/* loaded from: assets/audience_network.dex */
public final class C03119q {
    public final long A00;
    public final long A01;
    public static final C03119q A04 = new C03119q(0, 0);
    public static final C03119q A02 = new C03119q(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
    public static final C03119q A06 = new C03119q(LongCompanionObject.MAX_VALUE, 0);
    public static final C03119q A05 = new C03119q(0, LongCompanionObject.MAX_VALUE);
    public static final C03119q A03 = A04;

    public C03119q(long j, long j2) {
        HD.A03(j >= 0);
        HD.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C03119q c03119q = (C03119q) obj;
        return this.A01 == c03119q.A01 && this.A00 == c03119q.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
