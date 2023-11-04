package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cf */
/* loaded from: assets/audience_network.dex */
public final class C0367Cf {
    public static String[] A0I = {"F0jWKjQTCy62z5RMZ8LXaJxAHVXVw03", "jefijzmMiLSAGWVfBYlCHQnNu7WiK65", "5NKy3uod9nHosUme2DvPYxtYVEy", "OBCuuRHFU9olC8zTnYpCIYDmocSOdWsL", "GchpYIdYbHeAJ5Ou", "h9yGOulo4c92iX", "0WO8HWLEfGPVrZyS", "YTVxkuYMC8IrkJuZM8HCcFhUbHlAsN8p"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC0351Bh A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<HX> A0D = new SparseArray<>();
    public final SparseArray<HW> A0C = new SparseArray<>();
    public C0366Ce A06 = new C0366Ce();
    public C0366Ce A07 = new C0366Ce();
    public byte[] A0B = new byte[128];
    public final C0484Hd A0F = new C0484Hd(this.A0B, 0, 0);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(byte[] bArr, int i, int i2) {
        if (this.A08) {
            int i3 = i2 - i;
            byte[] bArr2 = this.A0B;
            int length = bArr2.length;
            int i4 = this.A00;
            if (length < i4 + i3) {
                int i5 = (i4 + i3) * 2;
                String[] strArr = A0I;
                if (strArr[0].length() == strArr[1].length()) {
                    String[] strArr2 = A0I;
                    strArr2[0] = "I85ez55UKF4vR6ktlfwpENhqyCssmG4";
                    strArr2[1] = "5okjmZY1XRxLGurOWaApunPnJUdAZAM";
                    this.A0B = Arrays.copyOf(bArr2, i5);
                }
                throw new RuntimeException();
            }
            System.arraycopy(bArr, i, this.A0B, this.A00, i3);
            this.A00 += i3;
            this.A0F.A08(this.A0B, 0, this.A00);
            if (this.A0F.A0B(8)) {
                this.A0F.A06();
                int A05 = this.A0F.A05(2);
                this.A0F.A07(5);
                if (this.A0F.A09()) {
                    this.A0F.A04();
                    if (this.A0F.A09()) {
                        int A04 = this.A0F.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(A04);
                        } else if (this.A0F.A09()) {
                            int A042 = this.A0F.A04();
                            if (this.A0C.indexOfKey(A042) < 0) {
                                this.A08 = false;
                                return;
                            }
                            HW hw = this.A0C.get(A042);
                            HX hx = this.A0D.get(hw.A01);
                            if (hx.A09) {
                                if (this.A0F.A0B(2)) {
                                    C0484Hd c0484Hd = this.A0F;
                                    if (A0I[2].length() != 18) {
                                        A0I[2] = "BDS58Myee4yHYxTG8mu";
                                        c0484Hd.A07(2);
                                    }
                                    throw new RuntimeException();
                                }
                                return;
                            }
                            if (this.A0F.A0B(hx.A01)) {
                                boolean z = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                int A052 = this.A0F.A05(hx.A01);
                                if (hx.A08) {
                                    if (A0I[5].length() != 7) {
                                        String[] strArr3 = A0I;
                                        strArr3[6] = "E8pM94a91AlwBow9";
                                        strArr3[4] = "HP5p1w370WRNIPZM";
                                    } else {
                                        A0I[5] = "F8tLSSZzAzz";
                                    }
                                } else if (!this.A0F.A0B(1)) {
                                    return;
                                } else {
                                    z = this.A0F.A0A();
                                    if (z) {
                                        if (!this.A0F.A0B(1)) {
                                            return;
                                        }
                                        z3 = this.A0F.A0A();
                                        z2 = true;
                                    }
                                }
                                boolean z4 = this.A01 == 5;
                                int i6 = 0;
                                if (z4) {
                                    if (!this.A0F.A09()) {
                                        return;
                                    }
                                    i6 = this.A0F.A04();
                                }
                                int i7 = 0;
                                int i8 = 0;
                                int i9 = 0;
                                int i10 = 0;
                                if (hx.A04 == 0) {
                                    if (!this.A0F.A0B(hx.A03)) {
                                        return;
                                    }
                                    i7 = this.A0F.A05(hx.A03);
                                    if (hw.A02 && !z) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        }
                                        i8 = this.A0F.A03();
                                        if (A0I[2].length() == 18) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr4 = A0I;
                                        strArr4[0] = "g2bkZ9ezj0cNTkJE1UxkspvpJWxpUaF";
                                        strArr4[1] = "QpgHFNMopSkcTctyPNXRqEd3z8gySmi";
                                    }
                                } else if (hx.A04 == 1 && !hx.A07) {
                                    if (!this.A0F.A09()) {
                                        return;
                                    }
                                    i9 = this.A0F.A03();
                                    if (hw.A02 && !z) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        }
                                        i10 = this.A0F.A03();
                                    }
                                }
                                this.A07.A04(hx, A05, A04, A052, A042, z, z2, z3, z4, i6, i7, i8, i9, i10);
                                this.A08 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public C0367Cf(InterfaceC0351Bh interfaceC0351Bh, boolean z, boolean z2) {
        this.A0E = interfaceC0351Bh;
        this.A0G = z;
        this.A0H = z2;
        A01();
    }

    private void A00(int i) {
        boolean z = this.A0A;
        this.A0E.AEY(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0014, code lost:
        if (r0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(long r7, int r9) {
        /*
            r6 = this;
            int r1 = r6.A01
            r3 = 0
            r4 = 1
            r0 = 9
            if (r1 == r0) goto L16
            boolean r0 = r6.A0H
            if (r0 == 0) goto L4d
            com.facebook.ads.redexgen.X.Ce r1 = r6.A07
            com.facebook.ads.redexgen.X.Ce r0 = r6.A06
            boolean r0 = com.facebook.ads.redexgen.X.C0366Ce.A01(r1, r0)
            if (r0 == 0) goto L4d
        L16:
            boolean r5 = r6.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0367Cf.A0I
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L30:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0367Cf.A0I
            java.lang.String r1 = "rg9RD6QhDdRr"
            r0 = 2
            r2[r0] = r1
            if (r5 == 0) goto L41
            long r0 = r6.A02
            long r7 = r7 - r0
            int r0 = (int) r7
            int r9 = r9 + r0
            r6.A00(r9)
        L41:
            long r0 = r6.A02
            r6.A04 = r0
            long r0 = r6.A03
            r6.A05 = r0
            r6.A0A = r3
            r6.A09 = r4
        L4d:
            boolean r2 = r6.A0A
            int r1 = r6.A01
            r0 = 5
            if (r1 == r0) goto L62
            boolean r0 = r6.A0G
            if (r0 == 0) goto L63
            if (r1 != r4) goto L63
            com.facebook.ads.redexgen.X.Ce r0 = r6.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L63
        L62:
            r3 = 1
        L63:
            r2 = r2 | r3
            r6.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0367Cf.A02(long, int):void");
    }

    public final void A03(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            int i2 = this.A01;
            if (i2 != 5 && i2 != 1 && i2 != 2) {
                return;
            }
        }
        C0366Ce c0366Ce = this.A06;
        C0366Ce newSliceHeader = this.A07;
        this.A06 = newSliceHeader;
        this.A07 = c0366Ce;
        C0366Ce newSliceHeader2 = this.A07;
        newSliceHeader2.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(HW hw) {
        this.A0C.append(hw.A00, hw);
    }

    public final void A05(HX hx) {
        this.A0D.append(hx.A05, hx);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
