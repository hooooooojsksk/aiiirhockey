package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Vp */
/* loaded from: assets/audience_network.dex */
public final class C0849Vp implements InterfaceC0364Cb {
    public static String[] A0B = {"w9cuQ6ovYh3ZHshq", "zlsSG9X60zlLCJUVBT3vkSwjd33HW005", "8vaxpIc6NUL7cuBxBwbBxs", "qXtpOKhwIOIw8VF1RV5ZQBWZqU2hmLV9", "z7BiUu8Ok3CRqNW4O4", "GwHEwqWk84SC7X7T1ylmsXGt995y5exC", "gD736tfkPLt776OMRp3dW8RllnUCOlL1", "HMDdnULPUBD5CGRsSgG0WxNxi6c"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public InterfaceC0351Bh A07;
    public String A08;
    public final String A0A;
    public final C0483Hc A09 = new C0483Hc(new byte[18]);
    public int A02 = 0;

    public C0849Vp(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = C0324Ae.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5X(this.A06);
        }
        this.A01 = C0324Ae.A01(bArr);
        this.A04 = (int) ((C0324Ae.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(C0483Hc c0483Hc) {
        while (c0483Hc.A04() > 0) {
            this.A03 <<= 8;
            this.A03 |= c0483Hc.A0E();
            if (C0324Ae.A07(this.A03)) {
                this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
                this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
                this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
                this.A09.A00[3] = (byte) (this.A03 & 255);
                this.A00 = 4;
                this.A03 = 0;
                return true;
            }
        }
        return false;
    }

    private boolean A02(C0483Hc c0483Hc, byte[] bArr, int i) {
        int min = Math.min(c0483Hc.A04(), i - this.A00);
        int bytesToRead = this.A00;
        c0483Hc.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4B(C0483Hc c0483Hc) {
        while (c0483Hc.A04() > 0) {
            int i = this.A02;
            if (i == 0) {
                boolean A01 = A01(c0483Hc);
                if (A0B[0].length() == 18) {
                    throw new RuntimeException();
                }
                A0B[2] = "o3J7EICCGaR78gVY0KOVd";
                if (A01) {
                    this.A02 = 1;
                }
            } else if (i != 1) {
                if (i == 2) {
                    int min = Math.min(c0483Hc.A04(), this.A01 - this.A00);
                    this.A07.AEX(c0483Hc, min);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + min;
                    int bytesToRead2 = this.A00;
                    int i2 = this.A01;
                    if (bytesToRead2 == i2) {
                        this.A07.AEY(this.A05, 1, i2, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                }
            } else if (A02(c0483Hc, this.A09.A00, 18)) {
                A00();
                this.A09.A0Y(0);
                this.A07.AEX(this.A09, 18);
                this.A02 = 2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A08 = c0375Cp.A04();
        this.A07 = bx.AFc(c0375Cp.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
