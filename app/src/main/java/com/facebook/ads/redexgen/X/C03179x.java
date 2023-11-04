package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9x */
/* loaded from: assets/audience_network.dex */
public final class C03179x {
    public final int A00;
    public final ER A01;

    public C03179x(int i, ER er) {
        this.A00 = i;
        this.A01 = er;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C03179x c03179x = (C03179x) obj;
        return this.A00 == c03179x.A00 && this.A01.equals(c03179x.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
