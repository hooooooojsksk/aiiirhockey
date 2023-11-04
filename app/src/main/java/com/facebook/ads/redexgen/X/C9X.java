package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9X */
/* loaded from: assets/audience_network.dex */
public final class C9X {
    public static String[] A0C = {"Lb1", "HAO", "yCHPPE9w0w81YCKuxFE6L9DmrxkJ2tU0", "DWgdxvM8Y7BV8jWWEqdgbbwmU3UKZQmt", "Bgm", "OOw1FrSehBTCipzYy8xUBx5", "Tcr4i3yvYCwS9F", "vvoyvovICPFY35FJOKkJE7b"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C9V A04;
    public C9V A05;
    public C9V A06;
    public AbstractC03149u A07;
    public Object A08;
    public boolean A09;
    public final C03129s A0A = new C03129s();
    public final C03139t A0B = new C03139t();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C9W A02(int i, long j, long j2) {
        ER er = new ER(i, j2);
        this.A07.A09(er.A02, this.A0A);
        int A04 = this.A0A.A04(j);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(er, A09);
        return new C9W(er, j, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(er, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Nullable
    private C9W A03(C9V c9v, long j) {
        long j2;
        C9W c9w = c9v.A02;
        if (c9w.A06) {
            int A03 = this.A07.A03(c9w.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j3 = c9w.A04.A03;
            if (this.A07.A0B(i, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i, -9223372036854775807L, Math.max(0L, (c9v.A07() + c9w.A01) - j));
                if (A08 == null) {
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j2 = ((Long) A08.second).longValue();
                if (c9v.A01 != null) {
                    boolean equals = c9v.A01.A09.equals(obj);
                    String[] strArr = A0C;
                    if (strArr[5].length() == strArr[7].length()) {
                        String[] strArr2 = A0C;
                        strArr2[4] = "1Mi";
                        strArr2[1] = "4wM";
                        if (equals) {
                            j3 = c9v.A01.A02.A04.A03;
                        }
                    }
                }
                j3 = this.A02;
                this.A02 = j3 + 1;
            } else {
                j2 = 0;
            }
            return A06(A07(A03, j2, j3), j2, j2);
        }
        ER er = c9w.A04;
        this.A07.A09(er.A02, this.A0A);
        if (er.A01()) {
            int i2 = er.A00;
            int A01 = this.A0A.A01(i2);
            if (A01 == -1) {
                return null;
            }
            int A032 = this.A0A.A03(i2, er.A01);
            if (A032 < A01) {
                if (this.A0A.A0E(i2, A032)) {
                    return A01(er.A02, i2, A032, c9w.A00, er.A03);
                }
                return null;
            }
            return A02(er.A02, c9w.A00, er.A03);
        }
        int i3 = (c9w.A02 > Long.MIN_VALUE ? 1 : (c9w.A02 == Long.MIN_VALUE ? 0 : -1));
        String[] strArr3 = A0C;
        if (strArr3[6].length() != strArr3[0].length()) {
            String[] strArr4 = A0C;
            strArr4[4] = "Mkh";
            strArr4[1] = "LRN";
            if (i3 != 0) {
                int A05 = this.A0A.A05(c9w.A02);
                if (A05 == -1) {
                    return A02(er.A02, c9w.A02, er.A03);
                }
                int A02 = this.A0A.A02(A05);
                if (this.A0A.A0E(A05, A02)) {
                    return A01(er.A02, A05, A02, c9w.A02, er.A03);
                }
                return null;
            }
            int A00 = this.A0A.A00();
            if (A00 == 0) {
                return null;
            }
            int i4 = A00 - 1;
            if (this.A0A.A09(i4) == Long.MIN_VALUE) {
                C03129s c03129s = this.A0A;
                if (A0C[3].charAt(17) == 'q') {
                    String[] strArr5 = A0C;
                    strArr5[6] = "v4RqMCCMyohjhj";
                    strArr5[0] = "VaJ";
                    if (!c03129s.A0D(i4)) {
                        int A022 = this.A0A.A02(i4);
                        if (!this.A0A.A0E(i4, A022)) {
                            String[] strArr6 = A0C;
                            if (strArr6[6].length() != strArr6[0].length()) {
                                A0C[2] = "nHRVyYi6CwR1mKhXGjDN4SEBRB6Sc1lP";
                                return null;
                            }
                            return null;
                        }
                        long A07 = this.A0A.A07();
                        int i5 = er.A02;
                        String[] strArr7 = A0C;
                        if (strArr7[5].length() != strArr7[7].length()) {
                            throw new RuntimeException();
                        }
                        A0C[2] = "rKR9SUNE0wWlvttO7fw3rD4zdQIUaCm2";
                        return A01(i5, i4, A022, A07, er.A03);
                    }
                }
            }
            if (A0C[2].charAt(9) != 'w') {
                return null;
            }
            String[] strArr8 = A0C;
            strArr8[6] = "OaXxy4ZAPPYV9k";
            strArr8[0] = "tU4";
            return null;
        }
        throw new RuntimeException();
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C9W A04(C9W c9w, ER er) {
        long j = c9w.A03;
        long j2 = c9w.A02;
        boolean A0A = A0A(er, j2);
        boolean A0B = A0B(er, A0A);
        this.A07.A09(er.A02, this.A0A);
        return new C9W(er, j, j2, c9w.A00, er.A01() ? this.A0A.A0A(er.A00, er.A01) : j2 == Long.MIN_VALUE ? this.A0A.A07() : j2, A0A, A0B);
    }

    private long A00(int i) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C9V A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid = A0E.A09;
            if (periodUid.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C9V A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AbstractC03149u abstractC03149u = this.A07;
            Object periodUid2 = A0E2.A09;
            int A04 = abstractC03149u.A04(periodUid2);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private C9W A01(int i, int i2, int i3, long j, long j2) {
        long j3;
        ER er = new ER(i, i2, i3, j2);
        boolean A0A = A0A(er, Long.MIN_VALUE);
        boolean A0B = A0B(er, A0A);
        long A0A2 = this.A07.A09(er.A02, this.A0A).A0A(er.A00, er.A01);
        if (i3 == this.A0A.A02(i2)) {
            j3 = this.A0A.A06();
        } else {
            j3 = 0;
        }
        return new C9W(er, j3, Long.MIN_VALUE, j, A0A2, A0A, A0B);
    }

    private C9W A05(C9Z c9z) {
        return A06(c9z.A04, c9z.A01, c9z.A02);
    }

    private C9W A06(ER er, long j, long j2) {
        this.A07.A09(er.A02, this.A0A);
        if (er.A01()) {
            if (!this.A0A.A0E(er.A00, er.A01)) {
                return null;
            }
            return A01(er.A02, er.A00, er.A01, j, er.A03);
        }
        return A02(er.A02, j2, er.A03);
    }

    private ER A07(int i, long j, long j2) {
        this.A07.A09(i, this.A0A);
        int A05 = this.A0A.A05(j);
        if (A05 == -1) {
            return new ER(i, j2);
        }
        return new ER(i, A05, this.A0A.A02(A05), j2);
    }

    /* JADX WARN: Incorrect condition in loop: B:43:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.9V r3 = r13.A0E()
            r6 = 1
            if (r3 != 0) goto L8
            return r6
        L8:
            com.facebook.ads.redexgen.X.9u r7 = r13.A07
            com.facebook.ads.redexgen.X.9W r0 = r3.A02
            com.facebook.ads.redexgen.X.ER r0 = r0.A04
            int r8 = r0.A02
            com.facebook.ads.redexgen.X.9s r9 = r13.A0A
            com.facebook.ads.redexgen.X.9t r10 = r13.A0B
            int r11 = r13.A01
            boolean r12 = r13.A09
            int r5 = r7.A03(r8, r9, r10, r11, r12)
        L1c:
            com.facebook.ads.redexgen.X.9V r0 = r3.A01
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.9W r0 = r3.A02
            boolean r0 = r0.A06
            if (r0 != 0) goto L29
            com.facebook.ads.redexgen.X.9V r3 = r3.A01
            goto L1c
        L29:
            r0 = -1
            if (r5 == r0) goto L5b
            com.facebook.ads.redexgen.X.9V r0 = r3.A01
            if (r0 == 0) goto L5b
            com.facebook.ads.redexgen.X.9V r0 = r3.A01
            com.facebook.ads.redexgen.X.9W r0 = r0.A02
            com.facebook.ads.redexgen.X.ER r0 = r0.A04
            int r4 = r0.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C9X.A0C
            r0 = 3
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L4d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C9X.A0C
            java.lang.String r1 = "04e"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fTm"
            r0 = 1
            r2[r0] = r1
            if (r4 == r5) goto L76
        L5b:
            boolean r2 = r13.A0S(r3)
            com.facebook.ads.redexgen.X.9W r1 = r3.A02
            com.facebook.ads.redexgen.X.9W r0 = r3.A02
            com.facebook.ads.redexgen.X.ER r0 = r0.A04
            com.facebook.ads.redexgen.X.9W r0 = r13.A04(r1, r0)
            r3.A02 = r0
            if (r2 == 0) goto L73
            boolean r0 = r13.A0P()
            if (r0 != 0) goto L74
        L73:
            return r6
        L74:
            r6 = 0
            goto L73
        L76:
            com.facebook.ads.redexgen.X.9V r3 = r3.A01
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9X.A08():boolean");
    }

    private boolean A09(C9V c9v, C9W c9w) {
        C9W c9w2 = c9v.A02;
        return c9w2.A03 == c9w.A03 && c9w2.A02 == c9w.A02 && c9w2.A04.equals(c9w.A04);
    }

    private boolean A0A(ER er, long j) {
        int adGroupCount = this.A07.A09(er.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i = adGroupCount - 1;
        boolean A01 = er.A01();
        if (this.A0A.A09(i) != Long.MIN_VALUE) {
            return !A01 && j == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i);
        if (A0C[3].charAt(17) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "dZB";
        strArr[1] = "bbK";
        if (postrollAdCount == -1) {
            return false;
        }
        if (((A01 && er.A00 == i && er.A01 == postrollAdCount + (-1)) ? 1 : 0) == 0) {
            return !A01 && this.A0A.A02(i) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(ER er, boolean z) {
        return !this.A07.A0B(this.A07.A09(er.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(er.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final C9V A0C() {
        C9V c9v = this.A05;
        if (c9v != null) {
            if (c9v == this.A06) {
                this.A06 = c9v.A01;
            }
            this.A05.A0D();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            C9V c9v2 = this.A05.A01;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[5] = "umGBE5C5CuHWhY73AVgogVf";
            strArr[7] = "vM8t2ZsrAby17UFg4572Zd2";
            this.A05 = c9v2;
        } else {
            C9V c9v3 = this.A04;
            this.A05 = c9v3;
            this.A06 = c9v3;
        }
        return this.A05;
    }

    public final C9V A0D() {
        C9V c9v = this.A06;
        HD.A04((c9v == null || c9v.A01 == null) ? false : true);
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C9V A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C9V A0F() {
        return this.A04;
    }

    public final C9V A0G() {
        return this.A05;
    }

    public final C9V A0H() {
        return this.A06;
    }

    @Nullable
    public final C9W A0I(long j, C9Z c9z) {
        C9V c9v = this.A04;
        if (c9v == null) {
            return A05(c9z);
        }
        return A03(c9v, j);
    }

    public final C9W A0J(C9W c9w, int i) {
        return A04(c9w, c9w.A04.A00(i));
    }

    public final VA A0K(InterfaceC03089n[] interfaceC03089nArr, GM gm, GP gp, ET et, Object obj, C9W c9w) {
        long A07;
        C9V c9v = this.A04;
        if (c9v != null) {
            A07 = c9v.A07() + this.A04.A02.A01;
            String[] strArr = A0C;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "XFCrwzIN7SxWEMf0fznSlHt";
            strArr2[7] = "zDOSpelqL3O1zvPqWZMR4dG";
        } else {
            A07 = c9w.A03;
        }
        C9V c9v2 = new C9V(interfaceC03089nArr, A07, gm, gp, et, obj, c9w);
        if (this.A04 != null) {
            HD.A04(A0P());
            this.A04.A01 = c9v2;
        }
        this.A08 = null;
        this.A04 = c9v2;
        this.A00++;
        return c9v2.A08;
    }

    public final ER A0L(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0M(long j) {
        C9V c9v = this.A04;
        if (c9v != null) {
            c9v.A0G(j);
        }
    }

    public final void A0N(AbstractC03149u abstractC03149u) {
        this.A07 = abstractC03149u;
    }

    public final void A0O(boolean z) {
        C9V A0E = A0E();
        if (A0E != null) {
            this.A08 = z ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C9V c9v = this.A04;
        return c9v == null || (!c9v.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i) {
        this.A01 = i;
        return A08();
    }

    public final boolean A0S(C9V c9v) {
        HD.A04(c9v != null);
        boolean z = false;
        String[] strArr = A0C;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "VEc";
        strArr2[1] = "0t0";
        this.A04 = c9v;
        while (c9v.A01 != null) {
            c9v = c9v.A01;
            if (c9v == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c9v.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0T(VA va) {
        C9V c9v = this.A04;
        return c9v != null && c9v.A08 == va;
    }

    public final boolean A0U(ER er, long j) {
        int i = er.A02;
        C9V c9v = null;
        for (C9V previousPeriodHolder = A0E(); previousPeriodHolder != null; previousPeriodHolder = previousPeriodHolder.A01) {
            if (c9v == null) {
                C9W periodInfo = previousPeriodHolder.A02;
                if (A0C[3].charAt(17) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "pn8srZEQfSJzxw";
                strArr[0] = "zNd";
                previousPeriodHolder.A02 = A0J(periodInfo, i);
            } else if (i == -1 || !previousPeriodHolder.A09.equals(this.A07.A0A(i, this.A0A, true).A03)) {
                return true ^ A0S(c9v);
            } else {
                C9W A03 = A03(c9v, j);
                if (A03 == null) {
                    return true ^ A0S(c9v);
                }
                previousPeriodHolder.A02 = A0J(previousPeriodHolder.A02, i);
                if (!A09(previousPeriodHolder, A03)) {
                    boolean A0S = A0S(c9v);
                    String[] strArr2 = A0C;
                    String str = strArr2[4];
                    String str2 = strArr2[1];
                    int length = str.length();
                    int periodIndex = str2.length();
                    if (length != periodIndex) {
                        return true ^ A0S;
                    }
                    String[] strArr3 = A0C;
                    strArr3[5] = "009NTdXku0rfOoGLKxDbxOM";
                    strArr3[7] = "1WlPwvG5U3NzzyaZC20RJwC";
                    return true ^ A0S;
                }
            }
            if (previousPeriodHolder.A02.A06) {
                i = this.A07.A03(i, this.A0A, this.A0B, this.A01, this.A09);
            }
            c9v = previousPeriodHolder;
        }
        return true;
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}
