package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class XK implements QE {
    public static byte[] A01;
    public final C0886Xb A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, airhockey.J_ONREWARDED, 86, 99, 30, 82, 88, 86, 95, airhockey.J_GAME_STANDBY};
    }

    public XK(C0886Xb c0886Xb) {
        this.A00 = c0886Xb;
    }

    @Override // com.facebook.ads.redexgen.X.QE
    public final Map<String, String> A5Y(boolean z) {
        HashMap hashMap = new HashMap();
        if (!C02265y.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C8N.A00().A01(this.A00, true).A7k());
        }
        hashMap.put(A00(23, 10, 114), C8R.A06(new AnonymousClass82(this.A00), this.A00, z));
        return hashMap;
    }
}
