package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IJ {
    public static byte[] A00;
    public static String[] A01 = {"z7fl6yLDnX", "I6ms8PC1R", "9l2yniCsNs", "ncU3wODxdj", "6", "W2f8yLUdf", "uAQeVH6Pts8Oja8tshXK2PPYPpxDyirV", "v"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{airhockey.P_GAME_SELECTMAP, 65, 75, 82, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 75, airhockey.P_GAME_MYSCORE, 76, airhockey.P_NATION, airhockey.J_PURCHASE, 86, 64, 75, 65, airhockey.J_PURCHASE, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, airhockey.P_GAME_REMATCH, airhockey.P_GAME_EXIT, airhockey.P_NATION, 76, 75, airhockey.J_PURCHASE, airhockey.P_GAME_SELECTMAP, 86, 76, 65, 75, 78, airhockey.P_GAME_SELECTMAP, 93, airhockey.J_ERROR, airhockey.P_GAME_MYSCORE, 78, 76, 75, airhockey.J_ERROR, 88, 79, 76, 88, 79, 89, airhockey.P_NATION, airhockey.J_ERROR, 94, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, 79, airhockey.J_ERROR, airhockey.P_GAME_MYWIN, 89, 64, airhockey.P_GAME_STANDBY, 79, 86, 126, 82, airhockey.P_GAME_REMATCH, 78, 84, 77, airhockey.P_GAME_STANDBY, 126, 82, airhockey.P_GAME_SELECTMAP, 79, airhockey.P_GAME_STANDBY, 126, 64, 81, 81, 126, airhockey.P_GAME_MYLOSE, 79, airhockey.P_GAME_MYWIN, 78, 126, airhockey.P_GAME_MYLOSE, 79, 126, 84, 82, airhockey.P_GAME_SELECTMAP, 83, 126, 64, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 79, 85, 19, 22, 28, 5, 45, 7, 1, 23, 45, 20, 16, airhockey.P_GAME_BREAKBALLCOUNT, 19, 45, 27, 22, 78, 75, 65, 88, airhockey.J_GOO, 90, 92, airhockey.P_GAME_EXIT, airhockey.J_GOO, airhockey.P_GAME_REMATCH, 77, 27, 78, airhockey.J_GOO, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.J_GOO, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, 93, 92, 91, airhockey.P_GAME_EXIT, 79, airhockey.P_GAME_STANDBY, 92, airhockey.J_DISCONNECT, 94, 88, 78, 89, airhockey.J_DISCONNECT, airhockey.P_GAME_EXIT, 76, 78, airhockey.P_GAME_STANDBY, 95, airhockey.J_DISCONNECT, 89, 78, 77, 89, 78, 88, airhockey.P_GAME_MYSCORE, airhockey.J_DISCONNECT, 95, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, 78, airhockey.J_DISCONNECT, airhockey.P_GAME_BREAKBALLCOUNT, 88};
        String[] strArr = A01;
        if (strArr[3].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "p5GsoscRd";
        strArr2[5] = "RXaFE6KJ1";
    }

    static {
        A03();
    }

    public static long A00(Context context) {
        return IK.A0P(context).A2J(A02(29, 25, 4), -1L);
    }

    public static long A01(Context context) {
        return IK.A0P(context).A2J(A02(131, 31, 5), -1L);
    }

    public static boolean A04(Context context) {
        return IK.A0P(context).A2N(A02(54, 39, 15), true);
    }

    public static boolean A05(Context context) {
        return IK.A0P(context).A2N(A02(0, 29, 11), false);
    }

    public static boolean A06(Context context) {
        return IK.A0P(context).A2N(A02(93, 16, 92), false);
    }

    public static boolean A07(Context context) {
        return IK.A0P(context).A2N(A02(109, 22, 1), false);
    }
}
