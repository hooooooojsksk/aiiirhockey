package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oc */
/* loaded from: assets/audience_network.dex */
public final class C0658Oc {
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public final C1J A04;
    public final C1V A05;
    public final C0887Xc A06;
    public C1L A01 = C1L.A01(null);
    public int A00 = 1000;

    public C0658Oc(C0887Xc c0887Xc, C1J c1j, C1V c1v) {
        this.A06 = c0887Xc;
        this.A04 = c1j;
        this.A05 = c1v;
    }

    public final C0658Oc A07(int i) {
        this.A00 = i;
        return this;
    }

    public final C0658Oc A08(C1L c1l) {
        this.A01 = c1l;
        return this;
    }

    public final C0658Oc A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C0658Oc A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0660Oe A0B() {
        return new C0660Oe(this, null);
    }
}
