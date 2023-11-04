package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum Q7 {
    A04,
    A08,
    A07,
    A0A,
    A05,
    A02,
    A06,
    A03,
    A09;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-68, -49, -64, -64, -65, -52, -61, -56, -63, -65, -52, -52, -55, -52, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, airhockey.J_BACK, airhockey.J_GAME_EXIT, -74, -89, -69, -71, -85, -86, -95, -99, -110, -86, -109, -110, -108, -100, -80, -108, -96, -98, -95, -99, -106, -91, -106, -107, -107, -105, -118, -107, -122, -105, -118, -119, -73, -71, -84, -73, -88, -71, -80, -75, -82, -124, 124, airhockey.J_PURCHASE, -127, -127, airhockey.J_REWARD, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 82, 99, airhockey.J_GAME_STANDBY, 86, 85};
    }

    static {
        A01();
    }
}
