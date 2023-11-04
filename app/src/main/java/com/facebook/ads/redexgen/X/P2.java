package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum P2 {
    A04,
    A03;
    
    public static byte[] A00;
    public static String[] A01 = {"5OO1eWJNP7Y3s5cQVhBQzuf4m1TAFPYu", "jypq8Huvx", "jrpdYYVceDk6A6K9eES7EYlVVXbr1rnB", "0AH7qFhs7PL8sRdpBGyIu3", "QWErYf377ArBGiXitK75JQXJw", "6gjozywHn1tStRqNZ4amJv", "kQUf5kbyDrtyo", "1dtSAN9pZ"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
            if (A01[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "4K3nSgRyXAG8o";
            strArr[4] = "A3wHnoq4BiJ6LQy7c3XTOTZiL";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, 124, 124, 119, airhockey.J_GAME_EXIT, airhockey.J_BACK, airhockey.J_REWARD, 109, airhockey.J_GAME_EXIT};
    }

    static {
        A01();
    }
}
