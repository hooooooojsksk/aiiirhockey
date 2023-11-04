package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class MF {
    public int A00;
    public LT A01;
    public MJ A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C0887Xc A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public MF(C0887Xc c0887Xc, MJ mj) {
        this.A0C = c0887Xc;
        this.A02 = mj;
    }

    public final MF A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final MF A0E(LT lt) {
        this.A01 = lt;
        return this;
    }

    public final MF A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final MF A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final MF A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final MF A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final MF A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final MF A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final MF A0L(boolean z) {
        this.A0B = z;
        return this;
    }

    public final MG A0M() {
        return new MG(this, null);
    }
}
