package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum NB {
    A06(0),
    A05(1),
    A04(2);
    
    public static byte[] A01;
    public static String[] A02 = {"rZGvvZMI6I", "wpdicw5jfWUP9Cs9nncu65zzvPXSjTXh", "qXEMgnv7Ct425l7In8PWxhOPFYVbEYpB", "dTodKdBY68fO6HNBSU3LN7qZJ4nOCEpk", "Hkjhu", "mY7TKQYFYXm3BBS2pDypGTbdY20sKsEk", "u0FGaDIimXxXG0l3UqPLAtx16Sc8Y059", "GEphX9PDUn8ir5euMIdeMTZrm9gVIFzw"};
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{46, 35, 44, 38, 49, 33, 35, 50, 39, 77, 82, 79, airhockey.P_GAME_REMATCH, 79, 92, 84, airhockey.P_GAME_REMATCH, 102, 125, 96, 99, airhockey.J_REWARD, airhockey.J_GOO, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_PURCHASE, airhockey.J_REWARD, 119};
    }

    static {
        A02();
    }

    NB(int i) {
        this.A00 = i;
    }

    public static NB A00(int i) {
        NB[] valuesCustom;
        for (NB nb : valuesCustom()) {
            if (nb.A00 == i) {
                return nb;
            }
        }
        return A05;
    }

    public final int A03() {
        return this.A00;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static NB[] valuesCustom() {
        Object clone = values().clone();
        if (A02[4].length() != 18) {
            A02[4] = "9YF3oPenjmVnddjujEMQmJq4m";
            return (NB[]) clone;
        }
        throw new RuntimeException();
    }
}
