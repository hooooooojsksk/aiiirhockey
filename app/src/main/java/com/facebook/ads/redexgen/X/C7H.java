package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.7H */
/* loaded from: assets/audience_network.dex */
public enum C7H {
    A04,
    A05,
    A0J,
    A0C,
    A0E,
    A06,
    A0B,
    A08,
    A0M,
    A0F,
    A0G,
    A03,
    A07,
    A09,
    A0K,
    A0N,
    A0I,
    A0A,
    A0H,
    A0L,
    A0D;
    
    public static byte[] A00;
    public static String[] A01 = {"SXlbL1CY1HnlFue4Epuvc3q4430g41ka", "Q7EHaqXEYxiQEOiIyqjopxzkHRhZVKtw", "xNF", "uYQgnyI7xn5N5GOR4jmA1ry4yxIflSMQ", "rwtSlkdLuH5KaJR0oY6wYi8G8Rc4X5Yb", "KhrHqa8env5LHobs7dTfjp4HGZPf1i5f", "07o3NElFbIdfTqORF47AUY47", "YWtiaLPvBkX5SyS9ALyLBNGqlxgBLMMn"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(11) == strArr[7].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "W4gBMubxKiZM5LLivtLPs396PBqN8ReM";
            strArr2[0] = "lPif8zo0BCGymIa9nsJJXRn9Vdfcrwfz";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
            i4++;
        }
    }

    public static void A01() {
        byte[] bArr = {airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_ENEMYWIN, ByteCompanionObject.MAX_VALUE, 20, 25, 25, 26, 19, 23, 24, 64, 91, 86, airhockey.P_GAME_MYWIN, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_ENEMYEXIT, 84, 85, 83, 92, 81, airhockey.P_NATION, 85, 84, 48, 59, 33, 54, 56, 49, 21, 2, 2, 31, 2, 15, 18, 15, 9, 31, 30, 11, 8, 6, 15, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYSCORE, 64, 78, 91, 11, 12, 22, airhockey.J_ONREWARDED, 99, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, 126, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, 102, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, 109, 78, 79, 78, airhockey.P_GAME_STANDBY, 84, 79, 86, 86, 95, airhockey.P_GAME_SELECTMAP, 88, 85, airhockey.P_NATION, 28, 13, 15, 7, 13, 11, 9, 55, 44, 43, 54, 48, 20, 25, 16, 5, 22, 1, 18, airhockey.J_SDKVER, airhockey.J_PURCHASE, 125, 123, airhockey.J_PURCHASE, 64, 89, 95, 82, 90, airhockey.P_GAME_SELECTMAP, 65, airhockey.P_GAME_REMATCH, 78, 76, 95, airhockey.P_GAME_REMATCH};
        String[] strArr = A01;
        if (strArr[4].charAt(5) == strArr[0].charAt(5)) {
            throw new RuntimeException();
        }
        A01[6] = "Uq";
        A00 = bArr;
    }

    static {
        A01();
    }
}
