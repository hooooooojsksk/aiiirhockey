package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.8c */
/* loaded from: assets/audience_network.dex */
public final class C02728c {
    public static byte[] A02;
    public static String[] A03 = {"x3S2W4LbSFe5E5feiuJV3xvLrDJW5MIT", "c6l", "kksKjEgnZRd2qIBKnSBjD5FFw", "r4XHqvELKUQNiUGngs8vqNM0Mk3b9MGe", "kvUI2sJVOm05aD2rNLnp8ceY2vExoctW", "R5zC7nE0u0bj6wUda1FjOq7V7", "PNiW5N8GwPzy1zueKCYWrY6DC52FHCY", "sp7WuMlrQg67lkIbNPhafgU9zVWwTylU"};
    public final int A00;
    public final int A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -90, -57, -50, -42, -61, -126, -118, -121, -58, -114, -126, -53, -48, -58, -57, -38, -126, -97, -126, -121, -58, -117, -88, -85, -82, -89, airhockey.J_NATION, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, -90, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 126, airhockey.J_NATION, 111, airhockey.J_SAVEDGAME_SAVE, -93, -90, -87, -94, 93, airhockey.J_PURCHASE, 93, airhockey.J_NATION, -95, 93, 99, 99, 93, -90, -85, -95, -94, -75, 93, airhockey.J_PURCHASE, 93, airhockey.J_NATION, -95, -51, -48, -45, -52, -121, -92, -92, -121, -108, -104, -121, -115, -115, -121, -48, -43, -53, -52, -33, -121, -92, -121, -116, -53};
    }

    static {
        A01();
    }

    public C02728c() {
        this(-1, -1);
    }

    public C02728c(int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(35, 14, 31), Integer.valueOf(i)));
        }
        if (i >= 0 && i2 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(49, 23, 26), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i == -1 && i2 != -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 68), Integer.valueOf(i2)));
        }
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(C02728c c02728c) {
        int i = this.A00;
        int i2 = c02728c.A00;
        if (i != i2) {
            return i - i2;
        }
        return this.A01 - c02728c.A01;
    }

    public final C02728c A05(int i) {
        int i2 = this.A01;
        if (i + i2 >= 0) {
            return new C02728c(this.A00, i2 + i);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 35, 63), Integer.valueOf(i), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C02728c) {
            C02728c c02728c = (C02728c) obj;
            int i = c02728c.A00;
            int i2 = this.A00;
            if (A03[4].charAt(2) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "8FF357LC7LaQaiaU3dBgrFv1B";
            strArr[5] = "tq4t252ij5wfM6c4Cr38q8OJQ";
            return i == i2 && c02728c.A01 == this.A01;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}
