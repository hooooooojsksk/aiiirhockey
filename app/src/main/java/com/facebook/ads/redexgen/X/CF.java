package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CF {
    public static byte[] A00;
    public static String[] A01 = {"bdaFL9zMZ", "I63pCoSBBbO7fDlHhIa7BrZ6Ava1cIF3", "x5nJfB3W8HSDeHix", "yyLZDQNtNFC811gZWNvs8tiPSoT", "kE4kWLsRx96QKHczqOKboI9lp", "rJUZcTDeN", "z735Hr0viTdtcy9jRTmcNapxWooAX9zU", "rl5X7GmnpjWHRCYLou0FtooQfFV"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "MWn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
            if (A01[7].length() == 12) {
                throw new RuntimeException();
            }
            A01[7] = "KMAr4";
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-44, 8, -45, 2, 25, 77, 24, airhockey.P_GAME_MYLOSE, -8, 44, 42, -5, 22, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 25, -49, 3, 12, -20, 32, 43, -17, 14, airhockey.P_NATION, 78, 17, -42, -67, -54, -87, 63, 38, airhockey.P_GAME_MYLOSE, 18, 63, 38, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, -41, -35, -40, -32, 4, 25, 6, -44, 19, -31, 35, -51, 27, 24, 41, -28, 12, 26, 7, -43, 23, 33, 29, -32, 55, 65, 61, 1, 62, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_SELECTMAP, 9, -9, 1, -3, -61, 9, 19, 15, -42, 40, 50, 46, 44, 14, 7, 7, 12, 24, 27, -33, -36, airhockey.J_SDKVER, airhockey.J_ONREWARDED, 40, 38, -10, -7, -91, -91};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.ads.redexgen.X.BW r16, boolean r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CF.A05(com.facebook.ads.redexgen.X.BW, boolean):boolean");
    }

    static {
        A01();
        A02 = new int[]{C0499Hs.A08(A00(79, 4, 69)), C0499Hs.A08(A00(59, 4, 52)), C0499Hs.A08(A00(63, 4, 84)), C0499Hs.A08(A00(67, 4, 91)), C0499Hs.A08(A00(71, 4, 20)), C0499Hs.A08(A00(75, 4, 38)), C0499Hs.A08(A00(43, 4, 41)), C0499Hs.A08(A00(55, 4, 42)), C0499Hs.A08(A00(51, 4, 57)), C0499Hs.A08(A00(87, 4, 49)), C0499Hs.A08(A00(91, 4, 122)), C0499Hs.A08(A00(0, 4, 39)), C0499Hs.A08(A00(4, 4, 108)), C0499Hs.A08(A00(19, 4, 63)), C0499Hs.A08(A00(23, 4, 97)), C0499Hs.A08(A00(8, 4, 75)), C0499Hs.A08(A00(12, 4, 105)), C0499Hs.A08(A00(31, 4, 120)), C0499Hs.A08(A00(27, 4, 15)), C0499Hs.A08(A00(47, 4, 51)), C0499Hs.A08(A00(83, 4, 41)), C0499Hs.A08(A00(35, 4, 120)), C0499Hs.A08(A00(95, 4, 11)), C0499Hs.A08(A00(39, 4, 16))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == C0499Hs.A08(A00(16, 3, 34))) {
            return true;
        }
        for (int i2 : A02) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(BW bw) throws IOException, InterruptedException {
        return A05(bw, true);
    }

    public static boolean A04(BW bw) throws IOException, InterruptedException {
        return A05(bw, false);
    }
}
