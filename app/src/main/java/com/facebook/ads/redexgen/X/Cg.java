package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class Cg {
    public static String[] A0D = {"l0mEWa9ddmOWtLNaP3Ecwy6mLHD8UZzg", "VNe96EWaki8yaza3W8GwHPPKa5bxe5tO", "kmpa3GxYxfo0cf1rhuvwNk5Qrb09HabI", "3sCg2iJ29nRFYuhJ2lcUotI7GRJn6pCh", "XWLZFeRzwTnh2BC9TcYHYW69tvufAeZE", "SYdDROIE4gUmdNh4g7xzRZbmvYLgdVRD", "81JQxwgiV49o5YJunDWqlnSFkCvUozpt", "BnyGWHqAIvsDVpphtdYgIF4MDirarxKL"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0351Bh A0C;

    public Cg(InterfaceC0351Bh interfaceC0351Bh) {
        this.A0C = interfaceC0351Bh;
    }

    private void A00(int i) {
        boolean z = this.A0A;
        this.A0C.AEY(this.A04, z ? 1 : 0, (int) (this.A01 - this.A03), i, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j, int i) {
        if (this.A0B && this.A06) {
            this.A0A = this.A08;
            this.A0B = false;
        } else if (!this.A05 && !this.A06) {
        } else {
            if (this.A09) {
                A00(i + ((int) (j - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A09 = true;
            this.A0A = this.A08;
        }
    }

    public final void A03(long j, int i, int i2, long j2) {
        boolean z = false;
        this.A06 = false;
        this.A05 = false;
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = j;
        if (i2 >= 32) {
            if (!this.A0B) {
                boolean z2 = this.A09;
                if (A0D[0].charAt(27) == 'I') {
                    throw new RuntimeException();
                }
                A0D[0] = "GPqbNVd0KmzIn8HN4fJcjlRtDRWTnntY";
                if (z2) {
                    A00(i);
                    this.A09 = false;
                }
            }
            if (i2 <= 34) {
                boolean z3 = this.A0B;
                if (A0D[0].charAt(27) == 'I') {
                    throw new RuntimeException();
                }
                A0D[0] = "R2DrglDmm00IZ4lcqpbVOyN2qQAQtCsT";
                this.A05 = !z3;
                this.A0B = true;
            }
        }
        this.A08 = i2 >= 16 && i2 <= 21;
        this.A07 = (this.A08 || i2 <= 9) ? true : true;
    }

    public final void A04(byte[] bArr, int i, int i2) {
        if (this.A07) {
            int i3 = this.A00;
            int i4 = (i + 2) - i3;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "cpcrPWEOO8MA3KXYn8qEkHLDMe8DBK4E";
            strArr2[5] = "pATXmdvV1oW6zIeHBCJgs6zY3L0W3Kgl";
            if (i4 < i2) {
                int headerOffset = bArr[i4];
                this.A06 = (headerOffset & 128) != 0;
                String[] strArr3 = A0D;
                String str = strArr3[7];
                String str2 = strArr3[6];
                int charAt = str.charAt(30);
                int headerOffset2 = str2.charAt(30);
                if (charAt != headerOffset2) {
                    A0D[2] = "v11A3OgFTS0Ad6G9jNFN3q5DAJDiI5ZW";
                    this.A07 = false;
                    return;
                }
                String[] strArr4 = A0D;
                strArr4[7] = "OBH0KjA8v9aSSxK5wO8V3n95O2rRmiSd";
                strArr4[6] = "STELshWQ5K1o99AkGFf5hhAcCQunI3bN";
                this.A07 = false;
                return;
            }
            this.A00 = i3 + (i2 - i);
        }
    }
}
