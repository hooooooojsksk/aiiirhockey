package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EN {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public BV A00;
    public final BX A01;
    public final BV[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, 18, 24, 15, 7, -61, 21, 8, 4, 7, -61, 23, 11, 8, -61, 22, 23, 21, 8, 4, 16, -47, -17, 16, 15, 6, -63, 16, 7, -63, 21, 9, 6, -63, 2, 23, 2, 10, 13, 2, 3, 13, 6, -63, 6, 25, 21, 19, 2, 4, 21, 16, 19, 20, -63, -55};
    }

    static {
        A01();
    }

    public EN(BV[] bvArr, BX bx) {
        this.A02 = bvArr;
        this.A01 = bx;
    }

    public final BV A02(BW bw, Uri uri) throws IOException, InterruptedException {
        BV bv = this.A00;
        if (bv != null) {
            return bv;
        }
        BV[] bvArr = this.A02;
        int length = bvArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            BV bv2 = bvArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bw.AES();
                throw th;
            }
            if (bv2.AFL(bw)) {
                this.A00 = bv2;
                bw.AES();
                break;
            }
            continue;
            bw.AES();
            i++;
        }
        BV bv3 = this.A00;
        if (bv3 != null) {
            bv3.A8V(this.A01);
            return this.A00;
        }
        throw new V7(A00(24, 34, 114) + C0499Hs.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
