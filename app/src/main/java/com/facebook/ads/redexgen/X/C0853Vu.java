package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Vu */
/* loaded from: assets/audience_network.dex */
public final class C0853Vu implements InterfaceC0364Cb {
    public static String[] A0C = {"jvuSXyRxFwWN5M53JxqXTqjBlHPmO5yS", "Nx6fwt5mIYqSRgPxQoB61NXpIqViXreb", "NbRu72XFqCPxMxVeHFzrnyrjREaihhdr", "Z3KBXmMomO9rJfjLZz1JQz2Kw0Fx28Ab", "zLbRIBf4nYWkQfyOEtwQDAQMGMEl8", "zvpubyWaUoinARhzufpjCqD1DbWF7ekR", "kxIGpaDKqbCPDUN5La7nQCmFVSx", "CqFgkkKKOYx1Bj1EdbgCjsaN4ksOOdQn"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public InterfaceC0351Bh A06;
    public String A07;
    public boolean A08;
    public final C0482Hb A09;
    public final C0483Hc A0A;
    public final String A0B;

    public C0853Vu() {
        this(null);
    }

    public C0853Vu(String str) {
        this.A09 = new C0482Hb(new byte[128]);
        this.A0A = new C0483Hc(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
        if (r1.A05 == r13.A05.A0O) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.Hb r1 = r13.A09
            r0 = 0
            r1.A07(r0)
            com.facebook.ads.redexgen.X.Hb r0 = r13.A09
            com.facebook.ads.redexgen.X.A2 r1 = com.facebook.ads.redexgen.X.A3.A09(r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r13.A05
            if (r0 == 0) goto L47
            int r2 = r1.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r13.A05
            int r0 = r0.A05
            if (r2 != r0) goto L47
            int r5 = r1.A03
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r13.A05
            int r4 = r0.A0C
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0853Vu.A0C
            r0 = 6
            r0 = r2[r0]
            int r2 = r0.length()
            r0 = 27
            if (r2 == r0) goto L31
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L31:
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C0853Vu.A0C
            java.lang.String r2 = "rmTuGOWOeoxLIH1QLptnusvxizN1V0jV"
            r0 = 2
            r3[r0] = r2
            java.lang.String r2 = "2RMufqWRuZFq3WutxyrHt00cbPeHqbYj"
            r0 = 5
            r3[r0] = r2
            if (r5 != r4) goto L47
            java.lang.String r2 = r1.A05
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r13.A05
            java.lang.String r0 = r0.A0O
            if (r2 == r0) goto L64
        L47:
            java.lang.String r2 = r13.A07
            java.lang.String r3 = r1.A05
            r4 = 0
            r5 = -1
            r6 = -1
            int r7 = r1.A00
            int r8 = r1.A03
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = r13.A0B
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A05 = r0
            com.facebook.ads.redexgen.X.Bh r2 = r13.A06
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r13.A05
            r2.A5X(r0)
        L64:
            int r0 = r1.A01
            r13.A01 = r0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r1.A02
            long r2 = (long) r0
            long r2 = r2 * r4
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r13.A05
            int r0 = r0.A0C
            long r0 = (long) r0
            long r2 = r2 / r0
            r13.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0853Vu.A00():void");
    }

    private boolean A01(C0483Hc c0483Hc) {
        while (true) {
            if (c0483Hc.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c0483Hc.A0E() == 11;
            } else {
                int A0E = c0483Hc.A0E();
                if (A0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0E == 11;
            }
        }
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
        while (true) {
            int A04 = c0483Hc.A04();
            if (A0C[3].charAt(28) != '2') {
                throw new RuntimeException();
            }
            A0C[6] = "j4ZJ9Sb1FxDogpbJuhr4W7MrwTg";
            if (A04 > 0) {
                int i = this.A02;
                if (i == 0) {
                    boolean A01 = A01(c0483Hc);
                    String[] strArr = A0C;
                    if (strArr[0].charAt(28) != strArr[7].charAt(28)) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "NiiW4aHzTbHYGvCl9hvl0BCQG8aT05lW";
                    if (A01) {
                        this.A02 = 1;
                        this.A0A.A00[0] = 11;
                        this.A0A.A00[1] = 119;
                        this.A00 = 2;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c0483Hc.A04(), this.A01 - this.A00);
                        this.A06.AEX(c0483Hc, min);
                        int bytesToRead = this.A00;
                        this.A00 = bytesToRead + min;
                        int bytesToRead2 = this.A00;
                        int i2 = this.A01;
                        if (bytesToRead2 == i2) {
                            this.A06.AEY(this.A04, 1, i2, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                        }
                    }
                } else if (A02(c0483Hc, this.A0A.A00, 128)) {
                    A00();
                    this.A0A.A0Y(0);
                    InterfaceC0351Bh interfaceC0351Bh = this.A06;
                    C0483Hc c0483Hc2 = this.A0A;
                    String[] strArr2 = A0C;
                    if (strArr2[0].charAt(28) != strArr2[7].charAt(28)) {
                        interfaceC0351Bh.AEX(c0483Hc2, 128);
                        this.A02 = 2;
                    } else {
                        A0C[4] = "thGmrgzi8Rkjtt3yqKW2WPJBde0Fj";
                        interfaceC0351Bh.AEX(c0483Hc2, 128);
                        this.A02 = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A07 = c0375Cp.A04();
        this.A06 = bx.AFc(c0375Cp.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
