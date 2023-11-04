package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CI {
    public static byte[] A05;
    public final int A00;
    public final C0350Bg A01;
    @Nullable
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{airhockey.J_INVITE, airhockey.J_ERROR, airhockey.J_ENEMYWIN, -120, -70, -70, -68, -76, -80, -75, -82, airhockey.J_ENEMYWIN, -120, -116, -102, airhockey.J_DISCONNECT, -118, -101, -103, airhockey.J_ENEMYWIN, -86, -71, -64, -73, -69, -74, airhockey.J_ENEMYWIN, -76, -74, -85, -84, airhockey.J_ERROR, -102, -72, -89, -87, -79, -117, -76, -87, -72, -65, -74, -70, -81, -75, -76, -120, -75, -66, -103, -78, -73, -71, -76, -76, -77, -74, -72, -87, -88, airhockey.J_ONREWARDED, -76, -74, -77, -72, -87, -89, -72, -83, -77, -78, airhockey.J_ONREWARDED, -73, -89, -84, -87, -79, -87, airhockey.J_ONREWARDED, -72, -67, -76, -87, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, -118, -119, -118, 88, -76, -77, -76, -60, -64, -62, -53, -64, -54, -52, -43, -38};
    }

    public CI(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        HD.A03((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new C0350Bg(A00(str), bArr, i2, i3);
    }

    public static int A00(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 37))) {
                    c = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 79))) {
                    c = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 91))) {
                    c = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 101))) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2 || c == 3) {
            return 2;
        }
        Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
        return 1;
    }
}
