package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ud */
/* loaded from: assets/audience_network.dex */
public final class C0813Ud extends C0462Gh {
    public static byte[] A01;
    public final String A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.J_ACHIEVEMENTCALLBACK, -99, -91, -112, -101, -104, -109, 79, -110, -98, -99, -93, -108, -99, -93, 79, -93, -88, -97, -108, airhockey.J_GAME_REMATCH, 79};
    }

    public C0813Ud(String str, C0458Gb c0458Gb) {
        super(A00(0, 22, 24) + str, c0458Gb, 1);
        this.A00 = str;
    }
}
