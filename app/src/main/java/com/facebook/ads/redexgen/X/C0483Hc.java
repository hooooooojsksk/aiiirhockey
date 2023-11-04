package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Hc */
/* loaded from: assets/audience_network.dex */
public final class C0483Hc {
    public static byte[] A03;
    public static String[] A04 = {"oSbtVRwphkTFlAHrFUFfvlQVewHH9uZD", "ke9406sA8vEe4ogcratlCLLRCygX4Y6v", "LkVrMYKeL4j", "rD3J2lWEcQES1OY4rXh7UnGCqOy7njew", "qJRaOB7ViewD6", "qa5huEKLFbsop1eqm4Yriado9DIEiYjV", "GSl3McmMnOZYTOuxGBg0tC3pnH", "ySC3qX4TjccxO5mLdOZ"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A04;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "EdmI6fYX5kJGCYPfpqvG1yUufp2PCRFX";
            strArr2[3] = "bDUsxAC2PGUD72vhZpZ7z8M6PcC6y0P6";
            copyOfRange[i4] = (byte) ((b - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{50, 87, 95, airhockey.P_GAME_EXIT, 85, 82, 77, 9, 62, 61, 47, 22, 33, 9, 92, 78, 90, 94, 78, 87, 76, 78, 9, 76, 88, 87, 93, 82, 87, 94, airhockey.P_GAME_EXIT, 93, 82, 88, 87, 9, 75, airhockey.J_NATION, 93, 78, 35, 9, 41, 78, 86, 65, 76, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 0, 53, 52, 38, 13, 24, 0, 83, airhockey.P_GAME_STANDBY, 81, 85, airhockey.P_GAME_STANDBY, 78, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 0, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, 82, 83, 84, 0, airhockey.P_NATION, 89, 84, airhockey.P_GAME_STANDBY, 26, 0, -35, -8, -7, -87, -21, -14, -3, -87, -9, -8, -3, -87, 3, -18, -5, -8, -61, -87, -32, -33, -47, -72, -61};
    }

    static {
        A01();
    }

    public C0483Hc() {
    }

    public C0483Hc(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C0483Hc(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C0483Hc(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i = this.A02;
        return (char) ((bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 24;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & UByte.MAX_VALUE) << 8);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return (bArr[i7] & UByte.MAX_VALUE) | i6;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & UByte.MAX_VALUE) << 24) >> 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i4;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & UByte.MAX_VALUE) << 16);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return ((bArr[i7] & UByte.MAX_VALUE) << 24) | i6;
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return ((bArr[i3] & UByte.MAX_VALUE) << 8) | i2;
    }

    public final int A0D() {
        int b2 = A0E();
        int b1 = A0E();
        int b4 = A0E();
        int b3 = A0E();
        int b22 = (b2 << 21) | (b1 << 14);
        int b12 = b4 << 7;
        return b22 | b12 | b3;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = (bArr[i3] & UByte.MAX_VALUE) | i2;
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 16;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i4;
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (bArr[i3] & UByte.MAX_VALUE) | i2;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((255 & bArr[i8]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((255 & bArr[i4]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (255 & bArr[i8]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (255 & bArr[i4]);
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 21) + A0L);
    }

    public final long A0O() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int length2 = 1 << i2;
            if ((length2 & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                int length3 = 1 << i2;
                j &= length3 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            for (int x = 1; x < i; x++) {
                byte[] bArr2 = this.A00;
                int i3 = this.A02;
                if (A04[2].length() != 11) {
                    throw new RuntimeException();
                }
                A04[2] = "bgE5KGMxqsO";
                byte b = bArr2[i3 + x];
                if ((b & 192) != 128) {
                    throw new NumberFormatException(A00(0, 42, 117) + j);
                }
                int length4 = b & 63;
                j = (j << 6) | length4;
            }
            int length5 = this.A02;
            this.A02 = length5 + i;
            return j;
        }
        throw new NumberFormatException(A00(42, 35, 108) + j);
    }

    /* JADX WARN: Incorrect condition in loop: B:50:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0P() {
        /*
            r6 = this;
            int r0 = r6.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r5 = r6.A02
        La:
            int r0 = r6.A01
            if (r5 >= r0) goto L1b
            byte[] r0 = r6.A00
            r0 = r0[r5]
            boolean r0 = com.facebook.ads.redexgen.X.C0499Hs.A0d(r0)
            if (r0 != 0) goto L1b
            int r5 = r5 + 1
            goto La
        L1b:
            int r4 = r6.A02
            int r0 = r5 - r4
            r3 = 3
            if (r0 < r3) goto L3d
            byte[] r2 = r6.A00
            r1 = r2[r4]
            r0 = -17
            if (r1 != r0) goto L3d
            int r0 = r4 + 1
            r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L3d
            int r0 = r4 + 2
            r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L3d
            int r4 = r4 + r3
            r6.A02 = r4
        L3d:
            byte[] r2 = r6.A00
            int r1 = r6.A02
            int r0 = r5 - r1
            java.lang.String r4 = com.facebook.ads.redexgen.X.C0499Hs.A0R(r2, r1, r0)
            r6.A02 = r5
            int r3 = r6.A02
            int r2 = r6.A01
            if (r3 != r2) goto L50
            return r4
        L50:
            byte[] r0 = r6.A00
            r1 = r0[r3]
            r0 = 13
            if (r1 != r0) goto L61
            int r0 = r3 + 1
            r6.A02 = r0
            int r0 = r6.A02
            if (r0 != r2) goto L61
            return r4
        L61:
            byte[] r3 = r6.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0483Hc.A04
            r0 = 0
            r1 = r1[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto Lab
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0483Hc.A04
            java.lang.String r1 = "dK52fOK8jWv7xyi3a3n"
            r0 = 7
            r2[r0] = r1
            int r2 = r6.A02
            r1 = r3[r2]
            r0 = 10
            if (r1 != r0) goto La0
            int r3 = r2 + 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0483Hc.A04
            r0 = 0
            r1 = r1[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto La1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0483Hc.A04
            java.lang.String r1 = "CzkRNJa9FDUHAtzqy7ViO0FrfGLEXvBM"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "L6K2rBVJE7KS5cY2UbZwATPHMS3LrQAX"
            r0 = 3
            r2[r0] = r1
            r6.A02 = r3
        La0:
            return r4
        La1:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0483Hc.A04
            java.lang.String r1 = "fuXjTapUFN2iKU6xFo1uSk4UrCSPBhbp"
            r0 = 0
            r2[r0] = r1
            r6.A02 = r3
            goto La0
        Lab:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0483Hc.A0P():java.lang.String");
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0Q() {
        /*
            r4 = this;
            int r0 = r4.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == 0) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r3 - r1
            java.lang.String r2 = com.facebook.ads.redexgen.X.C0499Hs.A0R(r2, r1, r0)
            r4.A02 = r3
            int r1 = r4.A02
            int r0 = r4.A01
            if (r1 >= r0) goto L2d
            int r0 = r1 + 1
            r4.A02 = r0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0483Hc.A0Q():java.lang.String");
    }

    public final String A0R(int i) {
        if (i == 0) {
            return A00(0, 0, 25);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0R = C0499Hs.A0R(bArr, stringLength4, i2);
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[4];
        int lastIndex2 = str.length();
        int stringLength5 = str2.length();
        if (lastIndex2 != stringLength5) {
            String[] strArr2 = A04;
            strArr2[6] = "dyM2aynMSNvMWhKjh5bvH5o1wH";
            strArr2[4] = "u6o51QVZzHu50";
            int stringLength6 = this.A02;
            this.A02 = stringLength6 + i;
            return A0R;
        }
        throw new RuntimeException();
    }

    public final String A0S(int i) {
        return A0T(i, Charset.forName(A00(95, 5, 23)));
    }

    public final String A0T(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) ((bArr[i3] & UByte.MAX_VALUE) | i2);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i) {
        A0b(A05() < i ? new byte[i] : this.A00, i);
    }

    public final void A0X(int i) {
        HD.A03(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0Y(int i) {
        HD.A03(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0Z(int i) {
        A0Y(this.A02 + i);
    }

    public final void A0a(C0482Hb c0482Hb, int i) {
        A0c(c0482Hb.A00, 0, i);
        c0482Hb.A07(0);
    }

    public final void A0b(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}
