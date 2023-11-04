package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8d */
/* loaded from: assets/audience_network.dex */
public enum EnumC02738d {
    A02,
    A04,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, 57, 40, 63, 52, 57, 56, 35, 46, 57, 63, 51, 46, 56, 47, airhockey.P_GAME_MYSCORE, 64, 81, airhockey.P_GAME_BREAKBALLCOUNT, 77, 90, airhockey.P_GAME_MYWIN, 80, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYSCORE, 64, 87, 90, 81, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 90, 86, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, 77, 76, 92, 81, airhockey.P_GAME_BREAKBALLCOUNT, 64, 76, 81, airhockey.P_GAME_MYWIN, 80, 92, 87, 76, 92, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, 87, 64, 75};
    }

    static {
        A01();
    }
}
