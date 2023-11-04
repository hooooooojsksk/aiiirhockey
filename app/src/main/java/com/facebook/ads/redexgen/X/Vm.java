package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Vm implements InterfaceC0364Cb {
    public static byte[] A0E;
    public static String[] A0F = {"FmtBUqGmzQvxm47AtoGl5GE", "5iXLyJPyDLcaPMUjk1v5bxBpoPhfo", "hif1Xiw3z0OLVixA8K1yUZiszA96", "VzETX2BwbL5Y", "rXQDE7FzOjIY2cTlxG1EbFIaNFkq3NBz", "hyxBaGmEw9nsGl9VO3HFyZpkQthqrgGl", "hfnp76HvDzKR", "cXQxcUyRSwddwq1B1B5vUbLw26Cn"};
    public long A00;
    public long A01;
    public InterfaceC0351Bh A02;
    public C0367Cf A03;
    public String A04;
    public boolean A05;
    public final C0371Ck A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0368Ch A08 = new C0368Ch(7, 128);
    public final C0368Ch A06 = new C0368Ch(8, 128);
    public final C0368Ch A07 = new C0368Ch(6, 128);
    public final C0483Hc A0A = new C0483Hc();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    static {
        A01();
    }

    public Vm(C0371Ck c0371Ck, boolean z, boolean z2) {
        this.A09 = c0371Ck;
        this.A0B = z;
        this.A0C = z2;
    }

    private void A02(long j, int i, int i2, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i2);
            this.A06.A04(i2);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    HX A06 = HY.A06(this.A08.A01, 3, this.A08.A00);
                    HW ppsData = HY.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A5X(Format.A03(this.A04, A00(0, 9, 18), null, -1, -1, A06.A06, A06.A02, -1.0f, arrayList, -1, A06.A00, null));
                    this.A05 = true;
                    this.A03.A05(A06);
                    this.A03.A04(ppsData);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(HY.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else if (this.A06.A03()) {
                this.A03.A04(HY.A05(this.A06.A01, 3, this.A06.A00));
                this.A06.A00();
            }
        }
        if (this.A07.A04(i2)) {
            C0368Ch c0368Ch = this.A07;
            String[] strArr = A0F;
            if (strArr[4].charAt(26) == strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "MYiVFEqyRoVR8PpaQvBVtWO0d80axIUe";
            strArr2[5] = "WESehlM6UD3i8IXgr5ZdByrcv93bSxFf";
            int unescapedLength = HY.A02(c0368Ch.A01, this.A07.A00);
            this.A0A.A0b(this.A07.A01, unescapedLength);
            this.A0A.A0Y(4);
            this.A09.A02(j2, this.A0A);
        }
        this.A03.A02(j, i);
    }

    private void A03(long j, int i, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i);
            this.A06.A01(i);
        }
        this.A07.A01(i);
        this.A03.A03(j, i, j2);
    }

    private void A04(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A03.A06(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4B(C0483Hc c0483Hc) {
        int offset;
        int A06 = c0483Hc.A06();
        int A07 = c0483Hc.A07();
        byte[] bArr = c0483Hc.A00;
        long j = this.A01;
        int offset2 = c0483Hc.A04();
        this.A01 = j + offset2;
        InterfaceC0351Bh interfaceC0351Bh = this.A02;
        int offset3 = c0483Hc.A04();
        interfaceC0351Bh.AEX(c0483Hc, offset3);
        while (true) {
            int A04 = HY.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int lengthToNalUnit = HY.A01(bArr, A04);
            int i = A04 - A06;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[3] = "lQl99M6qnQlq";
            strArr2[6] = "jJKIbaSVKHql";
            if (i > 0) {
                A04(bArr, A06, A04);
            }
            int i2 = A07 - A04;
            long j2 = this.A01 - i2;
            if (i < 0) {
                offset = -i;
                String[] strArr3 = A0F;
                if (strArr3[7].length() != strArr3[2].length()) {
                    String[] strArr4 = A0F;
                    strArr4[7] = "CFaupTF247UissJwn80OFqAOj9Vx";
                    strArr4[2] = "5OzpI30ijAeJlsq8Y1OyIdlDADpj";
                } else {
                    String[] strArr5 = A0F;
                    strArr5[1] = "eqTKDwhJaRXE4qM7uaf5ert1lQX8N";
                    strArr5[0] = "XXULpdZ36j09HmRAAM7fCX7";
                }
            } else {
                offset = 0;
            }
            A02(j2, i2, offset, this.A00);
            A03(j2, lengthToNalUnit, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A04 = c0375Cp.A04();
        this.A02 = bx.AFc(c0375Cp.A03(), 2);
        this.A03 = new C0367Cf(this.A02, this.A0B, this.A0C);
        this.A09.A03(bx, c0375Cp);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        HY.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
