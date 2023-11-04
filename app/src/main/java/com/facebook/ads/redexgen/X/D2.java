package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class D2 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, airhockey.P_GAME_MYSCORE, 75, 78, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 2, 86, 81, 2, 83, 87, airhockey.P_GAME_MYWIN, 84, 91, 2, 87, 80, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 84, 78, 91, 75, 80, airhockey.P_GAME_REMATCH, 2, 79, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.P_GAME_MYSCORE, 2, airhockey.P_GAME_STANDBY, 81, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, airhockey.P_GAME_STANDBY, 85};
    }

    public D2(Throwable th) {
        super(A00(0, 39, 116), th);
    }
}
