package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bd */
/* loaded from: assets/audience_network.dex */
public final class C0347Bd {
    public static byte[] A02;
    public static String[] A03 = {"Gbswf2Oe9t45f6fRXzJLdAUlgQT", "ILNBZUp42FM6TmLhILZx0TrWlxeoP8dK", "KU", "J93uRO2wcICtg9xFmL1Wq8rEF85pJV62", "WBJuDd9qSYCq15FLuSiwKDay7Pd8LUVo", "UmX4zZlFAFbztGwQ3UKbr8sh4otzaxWO", "w0DdKfGqK3izgJmDnX6HRUGA0zrElZm3", "IS4KApUzDZfogKvNlWTv5mOgPbEmupwQ"};
    public final C0349Bf A00;
    public final C0349Bf A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(12) != strArr[6].charAt(12)) {
                break;
            }
            A03[1] = "eICKKIbMZhBsAVWt1kLewwmF6yp8rXBH";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] - i3) - 117);
            if (A03[5].charAt(24) != '4') {
                break;
            }
            String[] strArr2 = A03;
            strArr2[3] = "G7JsKoOQIIowgLRlO4ILFQyuaNQJNquj";
            strArr2[6] = "vJABouZitnLUgZWdQ8VJmHv3StFvgqBT";
            copyOfRange[i4] = b;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A02 = new byte[]{-65, -77, -22, -10};
    }

    static {
        A01();
    }

    public C0347Bd(C0349Bf c0349Bf) {
        this(c0349Bf, c0349Bf);
    }

    public C0347Bd(C0349Bf c0349Bf, C0349Bf c0349Bf2) {
        this.A00 = (C0349Bf) HD.A01(c0349Bf);
        this.A01 = (C0349Bf) HD.A01(c0349Bf2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0347Bd c0347Bd = (C0347Bd) obj;
        return this.A00.equals(c0347Bd.A00) && this.A01.equals(c0347Bd.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 1, 26));
        sb.append(this.A00);
        if (this.A00.equals(this.A01)) {
            str = A00(0, 0, 116);
        } else {
            str = A00(0, 2, 30) + this.A01;
        }
        sb.append(str);
        sb.append(A00(3, 1, 36));
        return sb.toString();
    }
}
