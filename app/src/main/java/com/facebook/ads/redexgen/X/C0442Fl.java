package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fl */
/* loaded from: assets/audience_network.dex */
public final class C0442Fl {
    public static String[] A09 = {"Ae51WtdtbsQ7oHVSUK2kH2lkhYtCD", "qx7lDBYo1odo5Y55vJBjPuPd0SCIUsyA", "8Fm6CMM7j8ObWzEih", "Wlrw6QUG7RBgeIlzL5kKGv4h4BsSo73q", "KMN6ZJtdLdMqvcVUA0dmI7c1fz02SP9b", "8oEfNfnBPUmBxW5HI", "jCL3JtrXJCo63I6Hw50xrAvVkRQtnXEj", "6zRYHFDNSsaLRa7ASpeJIQcC6Xopjreo"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0483Hc A07 = new C0483Hc();
    public final int[] A08 = new int[256];

    public void A03(C0483Hc c0483Hc, int i) {
        int totalLength;
        if (i < 4) {
            return;
        }
        c0483Hc.A0Z(3);
        int i2 = i - 4;
        if (((c0483Hc.A0E() & 128) != 0 ? 1 : 0) != 0) {
            String[] strArr = A09;
            if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
                String[] strArr2 = A09;
                strArr2[2] = "m4TsyqBzkyxUuct48";
                strArr2[5] = "zfIYrv7wq9TBAE9Jz";
                if (i2 < 7 || (totalLength = c0483Hc.A0G()) < 4) {
                    return;
                }
                this.A01 = c0483Hc.A0I();
                this.A00 = c0483Hc.A0I();
                this.A07.A0W(totalLength - 4);
                i2 -= 7;
            }
            throw new RuntimeException();
        }
        int A06 = this.A07.A06();
        int position = this.A07.A07();
        if (A06 < position && i2 > 0) {
            int bytesToRead = Math.min(i2, position - A06);
            C0483Hc c0483Hc2 = this.A07;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(22) == strArr3[7].charAt(22)) {
                A09[6] = "1YWr3OwQ0jPjYWbciqj9BosGRiIvHZyi";
                c0483Hc.A0c(c0483Hc2.A00, A06, bytesToRead);
                this.A07.A0Y(A06 + bytesToRead);
                return;
            }
            throw new RuntimeException();
        }
    }

    public void A04(C0483Hc c0483Hc, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c0483Hc.A0I();
        this.A04 = c0483Hc.A0I();
        c0483Hc.A0Z(11);
        this.A02 = c0483Hc.A0I();
        this.A03 = c0483Hc.A0I();
    }

    public void A05(C0483Hc c0483Hc, int i) {
        if (i % 5 != 2) {
            return;
        }
        c0483Hc.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int entryCount = c0483Hc.A0E();
            int a = c0483Hc.A0E();
            int A0E = c0483Hc.A0E();
            int A0E2 = c0483Hc.A0E();
            int entryCount2 = A0E - 128;
            int cb = (int) (a + (entryCount2 * 1.402d));
            int r = (int) ((a - ((A0E2 - 128) * 0.34414d)) - ((A0E - 128) * 0.71414d));
            int g = c0483Hc.A0E() << 24;
            this.A08[entryCount] = g | (C0499Hs.A06(cb, 0, 255) << 16) | (C0499Hs.A06(r, 0, 255) << 8) | C0499Hs.A06((int) (a + ((A0E2 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final FQ A06() {
        int A0E;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A07() == 0 || this.A07.A06() != this.A07.A07()) {
            return null;
        }
        boolean z = this.A06;
        if (A09[6].charAt(24) != 'V') {
            A09[1] = "nq70zeHujM7cnH9A4IhpB5iOObfNW5He";
            if (!z) {
                return null;
            }
            this.A07.A0Y(0);
            int[] iArr = new int[this.A01 * this.A00];
            int switchBits = 0;
            while (switchBits < iArr.length) {
                int argbBitmapDataIndex = this.A07.A0E();
                if (argbBitmapDataIndex != 0) {
                    int[] argbBitmapData = this.A08;
                    iArr[switchBits] = argbBitmapData[argbBitmapDataIndex];
                    switchBits++;
                } else {
                    int argbBitmapDataIndex2 = this.A07.A0E();
                    if (argbBitmapDataIndex2 != 0) {
                        if ((argbBitmapDataIndex2 & 64) == 0) {
                            A0E = argbBitmapDataIndex2 & 63;
                        } else {
                            A0E = ((argbBitmapDataIndex2 & 63) << 8) | this.A07.A0E();
                        }
                        Arrays.fill(iArr, switchBits, switchBits + A0E, (argbBitmapDataIndex2 & 128) == 0 ? 0 : this.A08[this.A07.A0E()]);
                        switchBits += A0E;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
            int argbBitmapDataIndex3 = this.A05;
            int i = this.A04;
            return new FQ(createBitmap, this.A02 / argbBitmapDataIndex3, 0, this.A03 / i, 0, this.A01 / argbBitmapDataIndex3, this.A00 / i);
        }
        throw new RuntimeException();
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
