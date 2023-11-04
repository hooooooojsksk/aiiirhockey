package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public HP(byte[] bArr, int i) {
        C0482Hb c0482Hb = new C0482Hb(bArr);
        c0482Hb.A07(i * 8);
        this.A04 = c0482Hb.A04(16);
        this.A02 = c0482Hb.A04(16);
        this.A05 = c0482Hb.A04(24);
        this.A03 = c0482Hb.A04(24);
        this.A06 = c0482Hb.A04(20);
        this.A01 = c0482Hb.A04(3) + 1;
        this.A00 = c0482Hb.A04(5) + 1;
        this.A07 = ((c0482Hb.A04(4) & 15) << 32) | (c0482Hb.A04(32) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / this.A06;
    }
}
