package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hd */
/* loaded from: assets/audience_network.dex */
public final class C0484Hd {
    public static String[] A04 = {"BtHKr", "GAfuq", "1TcIbYyYGpE6Ekv4glvvfZz9bC", "q9fmd3d0ImW5Daxca", "ooOXUvpeMSptobOLnq6qd7gNdq", "VwsWXVZM3brBJlmy9", "pSziVAe", "zUHU2CyO73eexnRwL2LOOWJW4Jr0bcWv"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C0484Hd(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i2 = (1 << i) - 1;
        int leadingZeros = i > 0 ? A05(i) : 0;
        return i2 + leadingZeros;
    }

    private void A01() {
        boolean z;
        int i = this.A02;
        if (i >= 0) {
            int i2 = this.A01;
            if (A04[1].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "f06qvbC";
            strArr[0] = "HuIz9";
            if (i < i2 || (i == i2 && this.A00 == 0)) {
                z = true;
                HD.A04(z);
            }
        }
        z = false;
        HD.A04(z);
    }

    private boolean A02(int i) {
        if (2 <= i && i < this.A01) {
            byte[] bArr = this.A03;
            byte b = bArr[i];
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A04;
                strArr2[5] = "Jod3dkhqFQ8qWj2s5";
                strArr2[3] = "0zxF2BZpdiUX5xaGz";
                if (b == 3 && bArr[i - 2] == 0) {
                    byte b2 = bArr[i - 1];
                    String[] strArr3 = A04;
                    if (strArr3[6].length() != strArr3[0].length()) {
                        String[] strArr4 = A04;
                        strArr4[6] = "lQKXp2Z";
                        strArr4[0] = "Kosug";
                        if (b2 == 0) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int A03() {
        int A00 = A00();
        int codeNum = A00 % 2;
        int i = codeNum == 0 ? -1 : 1;
        int codeNum2 = A00 + 1;
        return i * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i2;
        int i3 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i;
        while (true) {
            i2 = this.A00;
            if (i2 <= 8) {
                break;
            }
            int returnValue2 = i2 - 8;
            this.A00 = returnValue2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            int returnValue3 = bArr[i4];
            int i5 = returnValue3 & 255;
            int returnValue4 = this.A00;
            i3 |= i5 << returnValue4;
            int returnValue5 = i4 + 1;
            if (!A02(returnValue5)) {
                r7 = 1;
            }
            this.A02 = i4 + r7;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int returnValue6 = bArr2[i6];
        int i7 = returnValue6 & 255;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[3];
        int length = str.length();
        int returnValue7 = str2.length();
        if (length != returnValue7) {
            throw new RuntimeException();
        }
        A04[7] = "CI85ryy9UuGcWp4q0bXmx78DrLL4QG6i";
        int returnValue8 = 8 - i2;
        int returnValue9 = 32 - i;
        int i8 = (i3 | (i7 >> returnValue8)) & ((-1) >>> returnValue9);
        if (i2 == 8) {
            this.A00 = 0;
            int returnValue10 = i6 + 1;
            this.A02 = i6 + (A02(returnValue10) ? 2 : 1);
        }
        A01();
        return i8;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            this.A02 = i2 + (A02(i2 + 1) ? 2 : 1);
        }
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:32:0x0048 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(int r7) {
        /*
            r6 = this;
            int r3 = r6.A02
            int r2 = r7 / 8
            int r0 = r6.A02
            int r0 = r0 + r2
            r6.A02 = r0
            int r1 = r6.A00
            int r0 = r2 * 8
            int r7 = r7 - r0
            int r1 = r1 + r7
            r6.A00 = r1
            int r5 = r6.A00
            r0 = 7
            if (r5 <= r0) goto L44
            int r0 = r6.A02
            int r4 = r0 + 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0484Hd.A04
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L32
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L32:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0484Hd.A04
            java.lang.String r1 = "WKnUhbHg5PXpVOXLjQbslPOixC"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "5elOCNAU3UTje1WUqtoqjArHkZ"
            r0 = 4
            r2[r0] = r1
            r6.A02 = r4
            int r0 = r5 + (-8)
            r6.A00 = r0
        L44:
            int r1 = r3 + 1
        L46:
            int r0 = r6.A02
            if (r1 > r0) goto L5b
            boolean r0 = r6.A02(r1)
            if (r0 == 0) goto L58
            int r0 = r6.A02
            int r0 = r0 + 1
            r6.A02 = r0
            int r1 = r1 + 2
        L58:
            int r1 = r1 + 1
            goto L46
        L5b:
            r6.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0484Hd.A07(int):void");
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A09() {
        /*
            r7 = this;
            int r6 = r7.A02
            int r5 = r7.A00
            r4 = 0
        L5:
            int r1 = r7.A02
            int r0 = r7.A01
            if (r1 >= r0) goto L14
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L14
            int r4 = r4 + 1
            goto L5
        L14:
            int r3 = r7.A02
            int r0 = r7.A01
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L2e
            r0 = 1
        L1d:
            r7.A02 = r6
            r7.A00 = r5
            if (r0 != 0) goto L2d
            int r0 = r4 * 2
            int r0 = r0 + r1
            boolean r0 = r7.A0B(r0)
            if (r0 == 0) goto L2d
            r2 = 1
        L2d:
            return r2
        L2e:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0484Hd.A09():boolean");
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i) {
        int numBytes = this.A02;
        int oldByteOffset = i / 8;
        int i2 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i2++;
            newBitOffset -= 8;
        }
        int newByteOffset = numBytes + 1;
        while (newByteOffset <= i2 && i2 < this.A01) {
            if (A02(newByteOffset)) {
                i2++;
                newByteOffset += 2;
            }
            newByteOffset++;
        }
        int oldByteOffset2 = this.A01;
        if (i2 >= oldByteOffset2) {
            return i2 == oldByteOffset2 && newBitOffset == 0;
        }
        return true;
    }
}
