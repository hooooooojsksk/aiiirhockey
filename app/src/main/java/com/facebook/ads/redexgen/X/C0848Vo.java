package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vo */
/* loaded from: assets/audience_network.dex */
public final class C0848Vo implements InterfaceC0364Cb {
    public static byte[] A06;
    public static String[] A07 = {"c0KpkRjZorNQD76", "v", "0d4inMg3wDkuo1aYYl0ssqqGC", "DDXERfdvXnPt4luj6e7N9DVUtx6ZaQcR", "MB0SdpAzdDPGS5LRihVQgeZ9YJgSZ4OW", "1ftUnjVA0zWQWzcI2VyXZGsvfHTse3XE", "DWX3euW52jSmR8J8g1ui9PfHl", "CNcDYli8yhj93EfpNTcuq0KbKbZRyRug"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0372Cm> A04;
    public final InterfaceC0351Bh[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{52, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYSCORE, 63, 60, 54, 52, airhockey.P_GAME_MYWIN, 60, airhockey.P_NATION, 65, 2, 55, airhockey.P_GAME_REMATCH, 53, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYLOSE, 53, airhockey.P_GAME_BREAKBALLCOUNT};
    }

    static {
        A01();
    }

    public C0848Vo(List<C0372Cm> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0351Bh[list.size()];
    }

    private boolean A02(C0483Hc c0483Hc, int i) {
        if (c0483Hc.A04() == 0) {
            return false;
        }
        if (c0483Hc.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4B(C0483Hc c0483Hc) {
        InterfaceC0351Bh[] interfaceC0351BhArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0483Hc, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0483Hc, 0)) {
                return;
            }
            int A062 = c0483Hc.A06();
            if (A07[5].charAt(6) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "JHIe8W9CfwFDjJjaFpf1hCiFr";
            strArr[6] = "vBjglJY7hKXluELD1o7ad0wQv";
            int A04 = c0483Hc.A04();
            for (InterfaceC0351Bh interfaceC0351Bh : this.A05) {
                c0483Hc.A0Y(A062);
                interfaceC0351Bh.AEX(c0483Hc, A04);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A04;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0004 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4Y(com.facebook.ads.redexgen.X.BX r14, com.facebook.ads.redexgen.X.C0375Cp r15) {
        /*
            r13 = this;
            r3 = 0
        L1:
            com.facebook.ads.redexgen.X.Bh[] r0 = r13.A05
            int r0 = r0.length
            if (r3 >= r0) goto L41
            java.util.List<com.facebook.ads.redexgen.X.Cm> r0 = r13.A04
            java.lang.Object r4 = r0.get(r3)
            com.facebook.ads.redexgen.X.Cm r4 = (com.facebook.ads.redexgen.X.C0372Cm) r4
            r15.A05()
            int r1 = r15.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.Bh r2 = r14.AFc(r1, r0)
            java.lang.String r5 = r15.A04()
            r7 = 0
            r8 = -1
            r9 = 0
            byte[] r0 = r4.A02
            java.util.List r10 = java.util.Collections.singletonList(r0)
            java.lang.String r11 = r4.A01
            r12 = 0
            r4 = 0
            r1 = 19
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r6 = A00(r4, r1, r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.A5X(r0)
            com.facebook.ads.redexgen.X.Bh[] r0 = r13.A05
            r0[r3] = r2
            int r3 = r3 + 1
            goto L1
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0848Vo.A4Y(com.facebook.ads.redexgen.X.BX, com.facebook.ads.redexgen.X.Cp):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
        if (this.A03) {
            for (InterfaceC0351Bh interfaceC0351Bh : this.A05) {
                interfaceC0351Bh.AEY(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        this.A03 = false;
    }
}
