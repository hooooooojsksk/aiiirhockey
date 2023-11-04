package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Qp */
/* loaded from: assets/audience_network.dex */
public enum EnumC0722Qp {
    A04(A01(37, 3, 86)),
    A05(A01(40, 7, 117));
    
    public static byte[] A01;
    public static String[] A02 = {"kIaQKGqX2ZTqEjvfJkZOl1WwOBoH9uFY", "x", "Fa9eXDyIy4elyWfec912IKE0nqoR5HQV", "", "DfNaQJeOEpNPwVx", "9", "0vF5Kqqkw0y14nBhXHX4F0aBgr7OScbz", ""};
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{21, 23, 31, -34, 3, 11, -10, 1, -2, -7, -75, 8, -6, 7, 11, -6, 7, -75, 7, -6, 8, 5, 4, 3, 8, -6, -49, -75, -70, 8, -6, -13, -16, -13, -12, -4, -13, 29, 31, 39, 80, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, airhockey.P_GAME_EXIT, 82, airhockey.P_GAME_REMATCH};
    }

    static {
        A02();
    }

    EnumC0722Qp(String str) {
        this.A00 = str;
    }

    public static EnumC0722Qp A00(String str) {
        EnumC0722Qp[] valuesCustom;
        for (EnumC0722Qp enumC0722Qp : valuesCustom()) {
            if (enumC0722Qp.A00.equals(str)) {
                return enumC0722Qp;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 47), str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC0722Qp[] valuesCustom() {
        EnumC0722Qp[] enumC0722QpArr = (EnumC0722Qp[]) values().clone();
        String[] strArr = A02;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "";
        strArr2[3] = "";
        return enumC0722QpArr;
    }
}
