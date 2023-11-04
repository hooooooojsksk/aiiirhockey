package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vh */
/* loaded from: assets/audience_network.dex */
public final class C0843Vh implements InterfaceC0376Cq {
    public static byte[] A0C;
    public static String[] A0D = {"wYbCHe4PqE0rUTWdo8mFq0UBpfkRDoC", "CuNoFwrXbx7Fup1Bnz4crpheboHEAq61", "i4a35YUA6bJnEiUQjLdSeulU0LA5VC2", "DQj4nZO33GsRRuNygGqDxWwIbU", "NTzjfKAdqL5R4ni", "Zn", "9Rh66LtnIoGSEkHARJ7O", "nCQ56kMXgmV4b9DPw80w9mtudgrGO1uA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0495Ho A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC0364Cb A0A;
    public final C0482Hb A0B = new C0482Hb(new byte[10]);
    public int A03 = 0;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[6] = "tGST5WGrXasfnynKry2Y";
            strArr2[4] = "X7BCEDGkhqj2a0M";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A02() {
        A0C = new byte[]{-37, 40, 42, 45, 32, -37, 29, 52, 47, 32, 46, -44, -23, -9, -42, -23, -27, -24, -23, -10, -14, 11, 2, 21, 13, 2, 0, 17, 2, 1, -67, 16, 17, -2, 15, 17, -67, 0, 12, 1, 2, -67, 13, 15, 2, 3, 6, 21, -41, -67, 40, 65, 56, 75, airhockey.P_GAME_MYSCORE, 56, 54, airhockey.P_GAME_MYWIN, 56, 55, -13, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 52, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, -13, 60, 65, 55, 60, 54, 52, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_STANDBY, -13, airhockey.P_GAME_STANDBY, 56, 52, 55, 60, 65, 58, -13, 56, 75, airhockey.P_GAME_MYWIN, 56, 65, 55, 56, 55, -13, 59, 56, 52, 55, 56, airhockey.P_GAME_STANDBY, -2, 23, 14, 33, 25, 14, 12, 29, 14, 13, -55, 28, 29, 10, 27, 29, -55, 18, 23, 13, 18, 12, 10, 29, 24, 27, -29, -55, 14, 33, 25, 14, 12, 29, 14, 13, -55};
    }

    static {
        A02();
    }

    public C0843Vh(InterfaceC0364Cb interfaceC0364Cb) {
        this.A0A = interfaceC0364Cb;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A08(4);
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long A04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j = A04 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A05.A07((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A07(j);
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int A04 = this.A0B.A04(24);
        if (A04 != 1) {
            Log.w(A00(11, 9, 27), A00(20, 30, 52) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int A042 = this.A0B.A04(16);
        this.A0B.A08(5);
        this.A06 = this.A0B.A0F();
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int startCodePrefix = this.A0B.A04(8);
        this.A01 = startCodePrefix;
        if (A042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = A042 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
        }
        return true;
    }

    private boolean A05(C0483Hc c0483Hc, byte[] bArr, int i) {
        int min = Math.min(c0483Hc.A04(), i - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c0483Hc.A0Z(min);
        } else {
            int bytesToRead = this.A00;
            c0483Hc.A0c(bArr, bytesToRead, min);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0376Cq
    public final void A4C(C0483Hc c0483Hc, boolean z) throws C9Y {
        if (z) {
            int i = this.A03;
            if (i != 0 && i != 1) {
                String A00 = A00(11, 9, 27);
                if (i == 2) {
                    String[] strArr = A0D;
                    if (strArr[1].charAt(7) != strArr[7].charAt(7)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0D;
                    strArr2[1] = "JSMzt33XVYw0URvsfpTaW68w8McAQAga";
                    strArr2[7] = "8Usb8lvXttIgdfLbHt2n59rh1GP9ZAH0";
                    Log.w(A00, A00(50, 50, 106));
                } else if (i == 3) {
                    if (this.A02 != -1) {
                        Log.w(A00, A00(100, 37, 64) + this.A02 + A00(0, 11, 82));
                    }
                    this.A0A.ADM();
                }
            }
            A03(1);
        }
        while (true) {
            int A04 = c0483Hc.A04();
            if (A0D[3].length() == 19) {
                throw new RuntimeException();
            }
            A0D[5] = "hj";
            if (A04 > 0) {
                int i2 = this.A03;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (A05(c0483Hc, this.A0B.A00, Math.min(10, this.A01)) && A05(c0483Hc, null, this.A01)) {
                                A01();
                                this.A0A.ADN(this.A04, this.A06);
                                A03(3);
                            }
                        } else if (i2 == 3) {
                            int A042 = c0483Hc.A04();
                            int i3 = this.A02;
                            int i4 = i3 != -1 ? A042 - i3 : 0;
                            if (i4 > 0) {
                                A042 -= i4;
                                c0483Hc.A0X(c0483Hc.A06() + A042);
                            }
                            this.A0A.A4B(c0483Hc);
                            int i5 = this.A02;
                            if (i5 != -1) {
                                this.A02 = i5 - A042;
                                String[] strArr3 = A0D;
                                if (strArr3[0].length() != strArr3[2].length()) {
                                    A0D[5] = "CC";
                                    if (this.A02 == 0) {
                                        this.A0A.ADM();
                                        A03(1);
                                    }
                                } else {
                                    String[] strArr4 = A0D;
                                    strArr4[1] = "LSiWMZuXq2ZkQJ8O9FVKXTUkrIS5d9oP";
                                    strArr4[7] = "piT6qZLXrsL5nFXzA5eMWRbmPpryfyVW";
                                    if (this.A02 == 0) {
                                        this.A0A.ADM();
                                        A03(1);
                                    }
                                }
                            }
                        }
                    } else if (A05(c0483Hc, this.A0B.A00, 9)) {
                        A03(A04() ? 2 : 0);
                    }
                } else {
                    c0483Hc.A0Z(c0483Hc.A04());
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0376Cq
    public final void A8X(C0495Ho c0495Ho, BX bx, C0375Cp c0375Cp) {
        this.A05 = c0495Ho;
        this.A0A.A4Y(bx, c0375Cp);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0376Cq
    public final void AEb() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AEb();
    }
}
