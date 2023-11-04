package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uc */
/* loaded from: assets/audience_network.dex */
public final class C0812Uc extends C0462Gh {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{48, 7, 17, 18, 13, 12, 17, 7, airhockey.P_NATION, 1, 13, 6, 7, 88, airhockey.P_NATION};
    }

    public C0812Uc(int i, Map<String, List<String>> map, C0458Gb c0458Gb) {
        super(A00(0, 15, 121) + i, c0458Gb, 1);
        this.A00 = i;
        this.A01 = map;
    }
}
