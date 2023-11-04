package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.StringTokenizer;

/* loaded from: assets/audience_network.dex */
public final class L5 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{25, 65, 65, 65};
    }

    public static String A01(String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, A00(0, 1, 88), true);
            int i = 0;
            int maxLength = str.length();
            if (maxLength > 90) {
                int tokenLength = str.length();
                String A002 = A00(1, 3, 14);
                if (tokenLength > 93 || !str.endsWith(A002)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int length = stringTokenizer.nextToken().length();
                        int maxLength2 = i + length;
                        if (maxLength2 < 90) {
                            i += length;
                        }
                    }
                    if (i == 0) {
                        return str.substring(0, 90) + A002;
                    }
                    return str.substring(0, i) + A002;
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
