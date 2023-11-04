package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.5w */
/* loaded from: assets/audience_network.dex */
public final class C02245w {
    public final long A00;
    public final EnumC02235v A01;
    public final String A02;
    public final boolean A03;

    public C02245w(String str, boolean z, EnumC02235v enumC02235v) {
        this(str, z, enumC02235v, System.currentTimeMillis());
    }

    public C02245w(String str, boolean z, EnumC02235v enumC02235v, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC02235v;
        this.A00 = j;
    }

    public static C02245w A00() {
        return new C02245w("", true, EnumC02235v.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC02235v A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
