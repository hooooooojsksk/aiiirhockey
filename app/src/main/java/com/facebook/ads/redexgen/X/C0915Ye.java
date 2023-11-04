package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ye */
/* loaded from: assets/audience_network.dex */
public class C0915Ye extends C4Z implements InterfaceC01874l {
    public static byte[] A0F;
    public static String[] A0G = {"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4J A04;
    public boolean A05;
    public int A06;
    public C4E A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C4C A0D;
    public final C4D A0E;

    public static String A0T(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{30, 25, 1, 22, 27, 30, 19, 87, 24, 5, 30, 18, 25, 3, 22, 3, 30, 24, 25, 77};
    }

    static {
        A0V();
    }

    public C0915Ye(Context context) {
        this(context, 1, false);
    }

    public C0915Ye(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C4C(this);
        this.A0E = new C4D();
        this.A06 = 2;
        A2E(i);
        A0h(z);
        A1V(true);
    }

    private final int A04(int i, C01834h c01834h, C01904o c01904o) {
        if (A0W() == 0 || i == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2D();
        int absDy = i > 0 ? 1 : -1;
        int consumed = Math.abs(i);
        A0Y(absDy, consumed, true, c01904o);
        int i2 = this.A07.A07;
        int layoutDirection = A08(c01834h, this.A07, c01904o, false);
        int i3 = i2 + layoutDirection;
        if (i3 < 0) {
            return 0;
        }
        int absDy2 = consumed > i3 ? absDy * i3 : i;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i, C01834h c01834h, C01904o c01904o, boolean z) {
        int gap = this.A04.A07() - i;
        if (gap > 0) {
            int i2 = -A04(-gap, c01834h, c01904o);
            int i3 = i + i2;
            if (z) {
                int A07 = this.A04.A07();
                int fixOffset = A0G[0].length();
                if (fixOffset == 7) {
                    throw new RuntimeException();
                }
                A0G[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int i4 = A07 - i3;
                if (i4 > 0) {
                    this.A04.A0J(i4);
                    return i4 + i2;
                }
            }
            return i2;
        }
        return 0;
    }

    private int A06(int i, C01834h c01834h, C01904o c01904o, boolean z) {
        int A0A;
        int gap = i - this.A04.A0A();
        if (gap > 0) {
            int i2 = -A04(gap, c01834h, c01904o);
            int i3 = i + i2;
            if (z && (A0A = i3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-A0A);
                return i2 - A0A;
            }
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0033, code lost:
        r0 = r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0036, code lost:
        return r7 - r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A08(com.facebook.ads.redexgen.X.C01834h r10, com.facebook.ads.redexgen.X.C4E r11, com.facebook.ads.redexgen.X.C01904o r12, boolean r13) {
        /*
            r9 = this;
            int r7 = r11.A00
            int r0 = r11.A07
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r6) goto L16
            int r0 = r11.A00
            if (r0 >= 0) goto L13
            int r1 = r11.A07
            int r0 = r11.A00
            int r1 = r1 + r0
            r11.A07 = r1
        L13:
            r9.A0e(r10, r11)
        L16:
            int r5 = r11.A00
            int r0 = r11.A02
            int r5 = r5 + r0
            com.facebook.ads.redexgen.X.4D r4 = r9.A0E
        L1d:
            boolean r0 = r11.A09
            if (r0 != 0) goto L23
            if (r5 <= 0) goto L33
        L23:
            boolean r0 = r11.A05(r12)
            if (r0 == 0) goto L33
            r4.A00()
            r9.A2H(r10, r12, r11, r4)
            boolean r0 = r4.A01
            if (r0 == 0) goto L37
        L33:
            int r0 = r11.A00
            int r7 = r7 - r0
            return r7
        L37:
            int r2 = r11.A06
            int r1 = r4.A00
            int r0 = r11.A05
            int r1 = r1 * r0
            int r2 = r2 + r1
            r11.A06 = r2
            boolean r0 = r4.A03
            if (r0 == 0) goto L51
            com.facebook.ads.redexgen.X.4E r0 = r9.A07
            java.util.List<com.facebook.ads.redexgen.X.4r> r0 = r0.A08
            if (r0 != 0) goto L51
            boolean r0 = r12.A07()
            if (r0 != 0) goto L5b
        L51:
            int r1 = r11.A00
            int r0 = r4.A00
            int r1 = r1 - r0
            r11.A00 = r1
            int r0 = r4.A00
            int r5 = r5 - r0
        L5b:
            int r0 = r11.A07
            if (r0 == r6) goto L87
            int r1 = r11.A07
            int r0 = r4.A00
            int r1 = r1 + r0
            r11.A07 = r1
            int r0 = r11.A00
            if (r0 >= 0) goto L84
            int r8 = r11.A07
            int r3 = r11.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0915Ye.A0G
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto La1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0915Ye.A0G
            java.lang.String r1 = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf"
            r0 = 5
            r2[r0] = r1
            int r8 = r8 + r3
            r11.A07 = r8
        L84:
            r9.A0e(r10, r11)
        L87:
            if (r13 == 0) goto L1d
            boolean r3 = r4.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0915Ye.A0G
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto La1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0915Ye.A0G
            java.lang.String r1 = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L1d
            goto L33
        La1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0915Ye.A08(com.facebook.ads.redexgen.X.4h, com.facebook.ads.redexgen.X.4E, com.facebook.ads.redexgen.X.4o, boolean):int");
    }

    private int A09(C01904o c01904o) {
        if (A0W() != 0) {
            A2D();
            return C01944s.A00(c01904o, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        } else if (A0G[5].length() != 31) {
            throw new RuntimeException();
        } else {
            A0G[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
            return 0;
        }
    }

    private int A0A(C01904o c01904o) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C01944s.A02(c01904o, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0B(C01904o c01904o) {
        if (A0W() != 0) {
            A2D();
            return C01944s.A01(c01904o, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) != strArr[4].charAt(4)) {
            String[] strArr2 = A0G;
            strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
            strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
            return 0;
        }
        throw new RuntimeException();
    }

    private final int A0C(C01904o c01904o) {
        if (c01904o.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i, int i2) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A2D();
        if (i2 > i) {
            next = 1;
        } else {
            next = i2 < i ? -1 : 0;
        }
        if (next == 0) {
            View A0t = A0t(i);
            String[] strArr = A0G;
            String str = strArr[6];
            String str2 = strArr[7];
            int length = str.length();
            int next2 = str2.length();
            if (length != next2) {
                throw new RuntimeException();
            }
            A0G[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return A0t;
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i));
        int next3 = this.A04.A0A();
        if (preferredBoundsFlag2 < next3) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        int next4 = this.A00;
        if (next4 == 0) {
            return super.A04.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i, int i2, boolean z, boolean z2) {
        int i3;
        A2D();
        int i4 = 0;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (z2) {
            i4 = 320;
        }
        int i5 = this.A00;
        int acceptableBoundsFlag = A0G[1].charAt(30);
        if (acceptableBoundsFlag != 111) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i5 == 0) {
            return super.A04.A00(i, i2, i3, i4);
        }
        return super.A05.A00(i, i2, i3, i4);
    }

    private View A0K(C01834h c01834h, C01904o c01904o) {
        return A2C(c01834h, c01904o, 0, A0W(), c01904o.A03());
    }

    private View A0L(C01834h c01834h, C01904o c01904o) {
        return A2C(c01834h, c01904o, A0W() - 1, -1, c01904o.A03());
    }

    private View A0M(C01834h c01834h, C01904o c01904o) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C01834h c01834h, C01904o c01904o) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C01834h c01834h, C01904o c01904o) {
        return this.A05 ? A0K(c01834h, c01904o) : A0L(c01834h, c01904o);
    }

    private View A0P(C01834h c01834h, C01904o c01904o) {
        return this.A05 ? A0L(c01834h, c01904o) : A0K(c01834h, c01904o);
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(0, A0W(), z, z2);
        }
        return A0J(A0W() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z, z2);
        }
        return A0J(0, A0W(), z, z2);
    }

    private final C4E A0S() {
        return new C4E();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2J()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z;
    }

    private void A0W(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        C4E c4e = this.A07;
        c4e.A01 = i;
        c4e.A05 = 1;
        c4e.A06 = i2;
        c4e.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        C4E c4e = this.A07;
        c4e.A01 = i;
        c4e.A03 = this.A05 ? 1 : -1;
        C4E c4e2 = this.A07;
        c4e2.A05 = -1;
        c4e2.A06 = i2;
        c4e2.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i, int i2, boolean z, C01904o c01904o) {
        int A0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c01904o);
        C4E c4e = this.A07;
        c4e.A05 = i;
        if (i == 1) {
            c4e.A02 += this.A04.A08();
            View A0F2 = A0F();
            C4E c4e2 = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            c4e2.A03 = r4;
            this.A07.A01 = A0p(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0F2);
            A0A = this.A04.A0C(A0F2) - this.A04.A07();
        } else {
            View A0G2 = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(A0G2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0G2);
            A0A = (-this.A04.A0F(A0G2)) + this.A04.A0A();
        }
        C4E c4e3 = this.A07;
        c4e3.A00 = i2;
        if (z) {
            c4e3.A00 -= A0A;
        }
        this.A07.A07 = A0A;
        int scrollingOffset = A0G[0].length();
        if (scrollingOffset == 7) {
            throw new RuntimeException();
        }
        A0G[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0Z(C4C c4c) {
        A0W(c4c.A01, c4c.A00);
    }

    private void A0a(C4C c4c) {
        A0X(c4c.A01, c4c.A00);
    }

    private void A0b(C01834h c01834h, int i) {
        int A0W = A0W();
        if (i < 0) {
            return;
        }
        int A06 = this.A04.A06() - i;
        if (this.A05) {
            for (int i2 = 0; i2 < A0W; i2++) {
                View A0t = A0t(i2);
                int childCount = this.A04.A0F(A0t);
                if (childCount >= A06) {
                    int childCount2 = this.A04.A0H(A0t);
                    if (childCount2 >= A06) {
                    }
                }
                A0d(c01834h, 0, i2);
                return;
            }
            return;
        }
        for (int i3 = A0W - 1; i3 >= 0; i3--) {
            View A0t2 = A0t(i3);
            int childCount3 = this.A04.A0F(A0t2);
            if (childCount3 >= A06) {
                int childCount4 = this.A04.A0H(A0t2);
                if (childCount4 >= A06) {
                }
            }
            int childCount5 = A0W - 1;
            A0d(c01834h, childCount5, i3);
            return;
        }
    }

    private void A0c(C01834h c01834h, int i) {
        if (i < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[0] = "66";
        int A0W = A0W();
        if (this.A05) {
            for (int i2 = A0W - 1; i2 >= 0; i2--) {
                View A0t = A0t(i2);
                int limit = this.A04.A0C(A0t);
                if (limit <= i) {
                    C4J c4j = this.A04;
                    String[] strArr2 = A0G;
                    String str = strArr2[6];
                    String str2 = strArr2[7];
                    int childCount = str.length();
                    int limit2 = str2.length();
                    if (childCount != limit2) {
                        int limit3 = c4j.A0G(A0t);
                        if (limit3 <= i) {
                        }
                    } else {
                        A0G[3] = "uDZbJl3GZvnd0";
                        int limit4 = c4j.A0G(A0t);
                        if (limit4 <= i) {
                        }
                    }
                }
                int limit5 = A0W - 1;
                A0d(c01834h, limit5, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < A0W; i3++) {
            View A0t2 = A0t(i3);
            int A0C = this.A04.A0C(A0t2);
            int childCount2 = A0G[3].length();
            if (childCount2 == 28) {
                throw new RuntimeException();
            }
            A0G[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (A0C <= i) {
                int limit6 = this.A04.A0G(A0t2);
                if (limit6 <= i) {
                }
            }
            A0d(c01834h, 0, i3);
            return;
        }
    }

    private void A0d(C01834h c01834h, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A14(i3, c01834h);
            }
            return;
        }
        while (i > i2) {
            A14(i, c01834h);
            i--;
        }
    }

    private void A0e(C01834h c01834h, C4E c4e) {
        if (!c4e.A0B || c4e.A09) {
            return;
        }
        int i = c4e.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i == -1) {
                int i2 = c4e.A07;
                if (A0G[1].charAt(30) == 'o') {
                    A0G[3] = "CiNTyTfZO3PW6tP";
                    A0b(c01834h, i2);
                    return;
                }
            } else {
                A0c(c01834h, c4e.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0f(C01834h c01834h, C01904o c01904o, int i, int i2) {
        if (!c01904o.A08() || A0W() == 0 || c01904o.A07() || !A26()) {
            return;
        }
        int i3 = 0;
        int scrapExtraEnd = 0;
        List<AbstractC01934r> A0J = c01834h.A0J();
        int i4 = A0J.size();
        int A0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i4; scrapSize++) {
            AbstractC01934r abstractC01934r = A0J.get(scrapSize);
            if (!abstractC01934r.A0c()) {
                int direction = 1;
                if ((abstractC01934r.A0I() < A0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    i3 += this.A04.A0D(abstractC01934r.A0H);
                } else {
                    scrapExtraEnd += this.A04.A0D(abstractC01934r.A0H);
                }
            }
        }
        this.A07.A08 = A0J;
        if (i3 > 0) {
            A0X(A0p(A0G()), i);
            C4E c4e = this.A07;
            c4e.A02 = i3;
            c4e.A00 = 0;
            c4e.A04();
            A08(c01834h, this.A07, c01904o, false);
        }
        if (scrapExtraEnd > 0) {
            A0W(A0p(A0F()), i2);
            C4E c4e2 = this.A07;
            c4e2.A02 = scrapExtraEnd;
            c4e2.A00 = 0;
            c4e2.A04();
            A08(c01834h, this.A07, c01904o, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C01834h c01834h, C01904o c01904o, C4C c4c) {
        if (A0k(c01904o, c4c)) {
            return;
        }
        boolean A0j = A0j(c01834h, c01904o, c4c);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[3] = "XDJ2jDWhUW9a7iN";
        if (A0j) {
            return;
        }
        c4c.A02();
        c4c.A01 = this.A0C ? c01904o.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A22(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C01834h c01834h, C01904o c01904o, C4C c4c) {
        View A0P;
        int A0A;
        boolean z = false;
        if (A0W() == 0) {
            return false;
        }
        View A0s = A0s();
        if (A0s != null && c4c.A06(A0s, c01904o)) {
            c4c.A05(A0s);
            return true;
        } else if (this.A08 != this.A0C) {
            return false;
        } else {
            if (c4c.A02) {
                A0P = A0O(c01834h, c01904o);
            } else {
                A0P = A0P(c01834h, c01904o);
            }
            if (A0P != null) {
                c4c.A04(A0P);
                if (!c01904o.A07() && A26()) {
                    if ((this.A04.A0F(A0P) >= this.A04.A07() || this.A04.A0C(A0P) < this.A04.A0A()) ? true : true) {
                        if (c4c.A02) {
                            A0A = this.A04.A07();
                        } else {
                            A0A = this.A04.A0A();
                        }
                        c4c.A00 = A0A;
                    }
                }
                return true;
            }
            return false;
        }
    }

    private boolean A0k(C01904o c01904o, C4C c4c) {
        int i;
        int startGap;
        if (c01904o.A07() || (i = this.A01) == -1) {
            return false;
        }
        if (i < 0 || i >= c01904o.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        c4c.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View A1q = A1q(this.A01);
                if (A1q != null) {
                    if (this.A04.A0D(A1q) > this.A04.A0B()) {
                        c4c.A02();
                        return true;
                    } else if (this.A04.A0F(A1q) - this.A04.A0A() < 0) {
                        c4c.A00 = this.A04.A0A();
                        c4c.A02 = false;
                        return true;
                    } else {
                        int endGap = this.A04.A07() - this.A04.A0C(A1q);
                        if (endGap < 0) {
                            c4c.A00 = this.A04.A07();
                            c4c.A02 = true;
                            return true;
                        }
                        if (c4c.A02) {
                            int startGap2 = this.A04.A0C(A1q);
                            C4J c4j = this.A04;
                            String[] strArr = A0G;
                            String str = strArr[2];
                            String str2 = strArr[4];
                            int endGap2 = str.charAt(4);
                            if (endGap2 == str2.charAt(4)) {
                                throw new RuntimeException();
                            }
                            A0G[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                            startGap = startGap2 + c4j.A05();
                        } else {
                            startGap = this.A04.A0F(A1q);
                        }
                        c4c.A00 = startGap;
                    }
                } else {
                    if (A0W() > 0) {
                        View child = A0t(0);
                        int endGap3 = A0p(child);
                        boolean z = this.A01 < endGap3;
                        boolean z2 = this.A05;
                        int endGap4 = A0G[1].charAt(30);
                        if (endGap4 != 111) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0G;
                        strArr2[2] = "1tNDA9T9nSDYektAgKE77gOe81bMFJSk";
                        strArr2[4] = "TZYqXNdWGZVKxzfIQyf7YZEk7yb7IRTm";
                        c4c.A02 = z == z2;
                    }
                    c4c.A02();
                }
                return true;
            }
            boolean z3 = this.A05;
            c4c.A02 = z3;
            if (z3) {
                c4c.A00 = this.A04.A07() - this.A02;
            } else {
                c4c.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        c4c.A02 = this.A03.A02;
        if (c4c.A02) {
            c4c.A00 = this.A04.A07() - this.A03.A00;
        } else {
            c4c.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public int A1h(int i, C01834h c01834h, C01904o c01904o) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c01834h, c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public int A1i(int i, C01834h c01834h, C01904o c01904o) {
        if (this.A00 == 0) {
            return 0;
        }
        int A04 = A04(i, c01834h, c01904o);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "CDnF1shpb";
        return A04;
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final int A1j(C01904o c01904o) {
        return A09(c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final int A1k(C01904o c01904o) {
        return A0A(c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final int A1l(C01904o c01904o) {
        return A0B(c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final int A1m(C01904o c01904o) {
        return A09(c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final int A1n(C01904o c01904o) {
        return A0A(c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final int A1o(C01904o c01904o) {
        return A0B(c01904o);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final Parcelable A1p() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(linearLayoutManager$SavedState));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A2D();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState2.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState2.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState2.A01 = A0p(refChild);
            } else {
                View A0G2 = A0G();
                linearLayoutManager$SavedState2.A01 = A0p(A0G2);
                linearLayoutManager$SavedState2.A00 = this.A04.A0F(A0G2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState2.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState2);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    @Nullable
    public final View A1q(int i) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View A0t = A0t(childCount);
            if (A0p(A0t) == i) {
                return A0t;
            }
        }
        return super.A1q(i);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public View A1r(View view, int i, C01834h c01834h, C01904o c01904o) {
        int maxScroll;
        View A0M;
        View nextCandidate;
        A0U();
        if (A0W() == 0 || (maxScroll = A2B(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A2D();
        A2D();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, c01904o);
        C4E c4e = this.A07;
        c4e.A07 = Integer.MIN_VALUE;
        c4e.A0B = false;
        A08(c01834h, c4e, c01904o, true);
        if (maxScroll == -1) {
            A0M = A0N(c01834h, c01904o);
        } else {
            A0M = A0M(c01834h, c01904o);
        }
        if (maxScroll == -1) {
            nextCandidate = A0G();
        } else {
            nextCandidate = A0F();
        }
        boolean hasFocusable = nextCandidate.hasFocusable();
        if (A0G[0].length() != 7) {
            String[] strArr = A0G;
            strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
            strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
            if (hasFocusable) {
                if (A0M == null) {
                    return null;
                }
                return nextCandidate;
            }
            return A0M;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public C01774a A1s() {
        return new C01774a(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public void A1t(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A1u(int i, int i2, C01904o c01904o, C4X c4x) {
        if (this.A00 != 0) {
            i = i2;
        }
        int delta = A0W();
        if (delta == 0 || i == 0) {
            return;
        }
        A2D();
        int i3 = i > 0 ? 1 : -1;
        int delta2 = Math.abs(i);
        A0Y(i3, delta2, true, c01904o);
        A2I(c01904o, this.A07, c4x);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A1v(int i, C4X c4x) {
        boolean z;
        int direction;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            z = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            int i2 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0G[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            if (i2 == -1) {
                direction = z ? i - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.A06 && direction >= 0 && direction < i; i4++) {
            c4x.A3H(direction, 0);
            direction += i3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A1w(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (A0G[1].charAt(30) == 'o') {
            A0G[1] = "tHEWx5U9TGfOm0s3U2zrO5nR7UMaVIoI";
            if (classLoader == null) {
                return;
            }
            if (A0G[5].length() == 31) {
                A0G[3] = "tm";
                Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
                if (state instanceof LinearLayoutManager$SavedState) {
                    this.A03 = (LinearLayoutManager$SavedState) state;
                    A0y();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A1x(AccessibilityEvent accessibilityEvent) {
        super.A1x(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A28());
            int A29 = A29();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(A29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00a4, code lost:
        if (r8 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00aa, code lost:
        if (r9.A02 == Integer.MIN_VALUE) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00ac, code lost:
        r1 = A1q(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00b0, code lost:
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00b4, code lost:
        if (r9.A05 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00b6, code lost:
        r8 = r9.A04.A07() - r9.A04.A0C(r1);
        r5 = com.facebook.ads.redexgen.X.C0915Ye.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d4, code lost:
        if (r5[2].charAt(4) == r5[4].charAt(4)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d6, code lost:
        com.facebook.ads.redexgen.X.C0915Ye.A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
        r8 = r8 - r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00e0, code lost:
        if (r8 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00e2, code lost:
        r6 = r6 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01fa, code lost:
        r7 = r7 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01fd, code lost:
        r5 = com.facebook.ads.redexgen.X.C0915Ye.A0G;
        r5[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
        r5[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
        r8 = r8 - r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x020e, code lost:
        r8 = r9.A02 - (r9.A04.A0F(r1) - r9.A04.A0A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x022c, code lost:
        if (r8 != (-1)) goto L26;
     */
    @Override // com.facebook.ads.redexgen.X.C4Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1y(com.facebook.ads.redexgen.X.C01834h r10, com.facebook.ads.redexgen.X.C01904o r11) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0915Ye.A1y(com.facebook.ads.redexgen.X.4h, com.facebook.ads.redexgen.X.4o):void");
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public void A1z(C01904o c01904o) {
        super.A1z(c01904o);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A20(E9 e9, C01834h c01834h) {
        super.A20(e9, c01834h);
        if (this.A09) {
            A1I(c01834h);
            c01834h.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public void A21(E9 e9, C01904o c01904o, int i) {
        C0914Yd linearSmoothScroller = new C0914Yd(e9.getContext());
        linearSmoothScroller.A0A(i);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A22(String str) {
        if (this.A03 == null) {
            super.A22(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final boolean A23() {
        if (A0Y() != 1073741824 && A0i() != 1073741824) {
            boolean A1W = A1W();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            A0G[0] = "ZYU5Lu8KJdo1W8";
            if (A1W) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final boolean A24() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final boolean A25() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public boolean A26() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A27() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A28() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A29() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A2A() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A2B(int r8) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0915Ye.A2B(int):int");
    }

    public View A2C(C01834h c01834h, C01904o c01904o, int i, int i2, int i3) {
        A2D();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i2 > i ? 1 : -1;
        while (i != i2) {
            View outOfBoundsMatch = A0t(i);
            int A0p = A0p(outOfBoundsMatch);
            if (A0p >= 0 && A0p < i3) {
                if (((C01774a) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < A0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2D() {
        if (this.A07 == null) {
            this.A07 = A0S();
        }
        if (this.A04 == null) {
            this.A04 = C4J.A02(this, this.A00);
        }
    }

    public final void A2E(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(A0T(0, 20, 1) + i);
        } else if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        } else {
            A0G[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
            A22(null);
            if (i == this.A00) {
                return;
            }
            this.A00 = i;
            this.A04 = null;
            A0y();
        }
    }

    public final void A2F(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[3] = "tDl3kZGUKMTs";
    }

    public void A2G(C01834h c01834h, C01904o c01904o, C4C c4c, int i) {
    }

    public void A2H(C01834h c01834h, C01904o c01904o, C4E c4e, C4D c4d) {
        int A0g;
        int left;
        int i;
        int i2;
        View A03 = c4e.A03(c01834h);
        if (A03 == null) {
            c4d.A01 = true;
            return;
        }
        C01774a c01774a = (C01774a) A03.getLayoutParams();
        if (c4e.A08 == null) {
            boolean z = this.A05;
            int top = c4e.A05 == -1 ? 1 : 0;
            if (z == top) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        } else {
            boolean z2 = this.A05;
            int top2 = c4e.A05;
            int top3 = top2 == -1 ? 1 : 0;
            if (z2 == top3) {
                A16(A03);
            } else {
                A18(A03, 0);
            }
        }
        A1A(A03, 0, 0);
        c4d.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2J()) {
                i2 = A0h() - A0f();
                int right = this.A04.A0E(A03);
                i = i2 - right;
            } else {
                i = A0e();
                i2 = this.A04.A0E(A03) + i;
            }
            int right2 = c4e.A05;
            if (right2 == -1) {
                left = c4e.A06;
                int i3 = c4e.A06;
                int right3 = c4d.A00;
                A0g = i3 - right3;
            } else {
                A0g = c4e.A06;
                left = c4e.A06 + c4d.A00;
            }
        } else {
            A0g = A0g();
            left = this.A04.A0E(A03) + A0g;
            int top4 = c4e.A05;
            if (top4 == -1) {
                i2 = c4e.A06;
                int i4 = c4e.A06;
                int top5 = c4d.A00;
                i = i4 - top5;
            } else {
                i = c4e.A06;
                int i5 = c4e.A06;
                int top6 = c4d.A00;
                i2 = i5 + top6;
            }
        }
        A1B(A03, i, A0g, i2, left);
        if (c01774a.A02() || c01774a.A01()) {
            c4d.A03 = true;
        }
        c4d.A02 = A03.hasFocusable();
    }

    public void A2I(C01904o c01904o, C4E c4e, C4X c4x) {
        int i = c4e.A01;
        if (i >= 0) {
            int pos = c01904o.A03();
            if (i < pos) {
                int pos2 = c4e.A07;
                c4x.A3H(i, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2J() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01874l
    public final PointF A48(int i) {
        if (A0W() == 0) {
            return null;
        }
        int firstChildPos = i < A0p(A0t(0)) ? 1 : 0;
        int i2 = firstChildPos != this.A05 ? -1 : 1;
        int i3 = this.A00;
        int firstChildPos2 = A0G[0].length();
        if (firstChildPos2 != 7) {
            A0G[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
            if (i3 == 0) {
                return new PointF(i2, 0.0f);
            }
            return new PointF(0.0f, i2);
        }
        throw new RuntimeException();
    }
}
