package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class WB implements InterfaceC0362By {
    public static String[] A05 = {"YO3Mv", "DxVAQWWu8j9i6k1h5ZfxybzoYJdsy2xl", "vXk7alCMSJGdJNe2n8WQkC5NRefPTIq", "ZV", "S8Uid7BWM3mGwyARzsRqwPOCPslD34Eg", "BP", "k4eI01zMPbHAOvERg49f6jW6RoPQTjCj", "LVriLWZDKqqvbv6paz1EHGa9qDGzRuUD"};
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C0483Hc A04;

    public WB(WD wd) {
        this.A04 = wd.A00;
        this.A04.A0Y(12);
        this.A02 = this.A04.A0H() & 255;
        this.A03 = this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0362By
    public final int A7V() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0362By
    public final boolean A8j() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0362By
    public final int ADv() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A0E();
        }
        if (i == 16) {
            C0483Hc c0483Hc = this.A04;
            if (A05[4].charAt(8) != 'Z') {
                A05[2] = "dItPwdgOkLJrEcAMKiFMJfVFB7ycDui";
                return c0483Hc.A0I();
            }
            throw new RuntimeException();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            this.A00 = this.A04.A0E();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
