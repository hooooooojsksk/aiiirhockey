package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H8 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{64, 93, airhockey.P_GAME_EXIT, airhockey.J_PURCHASE, airhockey.P_GAME_REMATCH, 64, 75, 10, 23, 0, 48, 29, 10, 11, 6, 29};
    }

    public static long A00(H7 h7) {
        return h7.A5Z(A02(0, 7, 70), -1L);
    }

    @Nullable
    public static Uri A01(H7 h7) {
        String A5b = h7.A5b(A02(7, 9, 12), null);
        if (A5b == null) {
            return null;
        }
        return Uri.parse(A5b);
    }

    public static void A04(H9 h9) {
        h9.A01(A02(7, 9, 12));
    }

    public static void A05(H9 h9, long j) {
        h9.A02(A02(0, 7, 70), j);
    }

    public static void A06(H9 h9, Uri uri) {
        h9.A03(A02(7, 9, 12), uri.toString());
    }
}
