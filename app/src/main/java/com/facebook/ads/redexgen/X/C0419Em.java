package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Em */
/* loaded from: assets/audience_network.dex */
public final class C0419Em {
    @Nullable
    public C0419Em A00;
    @Nullable
    public GO A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0419Em(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final C0419Em A01() {
        this.A01 = null;
        C0419Em c0419Em = this.A00;
        this.A00 = null;
        return c0419Em;
    }

    public final void A02(GO go, C0419Em c0419Em) {
        this.A01 = go;
        this.A00 = c0419Em;
        this.A02 = true;
    }
}
