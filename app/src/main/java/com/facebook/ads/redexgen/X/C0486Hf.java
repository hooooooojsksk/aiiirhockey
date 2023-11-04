package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hf */
/* loaded from: assets/audience_network.dex */
public class C0486Hf extends IOException {
    public static byte[] A00;
    public static String[] A01 = {"9oUH6IggskzJ9KRnNq9fhlyXZqfLC7qm", "O", "6vBLsFlXvIsZh7TCn1R3IT4lCv45HTaK", "MDpcepjwzWMs517m4Ih6aUQSJk", "3hrQycwauA7dGDeH7qJo", "b1qkSdZDeqb", "rPde78X67wgfjzgLBIP3X6whAm", "c"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].length() != 20) {
                throw new RuntimeException();
            }
            A01[5] = "xrQk8FQC87O";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{102, airhockey.J_GAME_EXIT, 34, 35, 45, 34, 47, 57, 62, 119, 51, 17, 10, 12, 17, 10, 23, 26, airhockey.P_GAME_MYSCORE, 23, 12, 12, airhockey.P_GAME_MYSCORE, 15, 12, 20, airhockey.P_GAME_MYSCORE, 56, 19, 17, 10, 12, 17, 10, 23, 26, 94, 62};
    }

    static {
        A01();
    }

    public C0486Hf(int i, int i2) {
        super(A00(10, 27, 95) + i + A00(0, 10, 118) + i2 + A00(37, 1, 95));
    }
}
