package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pg */
/* loaded from: assets/audience_network.dex */
public enum EnumC0687Pg {
    A04,
    A03,
    A06,
    A05;
    
    public static byte[] A00;
    public static String[] A01 = {"DteKWBudESjDtqSUyoTC5E", "I5FSM6v9D3qkRXnarws6dVsmQqtQoJdF", "2aIeIMdS22Kqsjw8nHnHH5KV6oj1373E", "g", "GOJ9oRRABJfcwjAA770tm42MgykplS5Q", "ccCRkU4tJU1cPhlyS12s2rOBaxNg0sA2", "PEuaDw0tTVC0zIT2D0mW6", "B"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {41, 38, 33, 37, 41, 60, 45, 44, 85, 90, 93, 89, 85, 64, 93, 90, 83, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_NATION, 81, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 81, 75, 85, 90, 93, 89, 85, 64, 81, 80, 81, airhockey.P_GAME_BREAKBALLCOUNT, 85, airhockey.P_GAME_BREAKBALLCOUNT, 81, 80, airhockey.P_GAME_BREAKBALLCOUNT, 92, airhockey.P_NATION, 77, airhockey.P_GAME_EXIT, 78, airhockey.P_NATION, 87, airhockey.P_GAME_EXIT, 77, airhockey.P_GAME_SELECTMAP};
        String[] strArr = A01;
        if (strArr[3].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Z";
        strArr2[7] = "Z";
        A00 = bArr;
    }

    static {
        A01();
    }
}
