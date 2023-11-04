package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ci */
/* loaded from: assets/audience_network.dex */
public final class C0369Ci {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0364Cb A05;
    public final C0482Hb A06 = new C0482Hb(new byte[64]);
    public final C0495Ho A07;

    public C0369Ci(InterfaceC0364Cb interfaceC0364Cb, C0495Ho c0495Ho) {
        this.A05 = interfaceC0364Cb;
        this.A07 = c0495Ho;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long A04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j = A04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEb();
    }

    public final void A03(C0483Hc c0483Hc) throws C9Y {
        c0483Hc.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0483Hc.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADN(this.A01, true);
        this.A05.A4B(c0483Hc);
        this.A05.ADM();
    }
}
