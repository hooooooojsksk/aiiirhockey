package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0g */
/* loaded from: assets/audience_network.dex */
public final class C00820g {
    public static byte[] A00;
    public static final String A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cd  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.AbstractC00810f A01(com.facebook.ads.redexgen.X.C0887Xc r14, com.facebook.ads.redexgen.X.InterfaceC0505Ia r15, java.lang.String r16, @androidx.annotation.Nullable android.net.Uri r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00820g.A01(com.facebook.ads.redexgen.X.Xc, com.facebook.ads.redexgen.X.Ia, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.redexgen.X.0f");
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, airhockey.P_GAME_EXIT, 91, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 95, 26, 80, airhockey.P_GAME_REMATCH, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 20, 19, 22, 3, 22, 82, 83, 78, 84, airhockey.P_GAME_REMATCH, 88, 65, 94, 75, 64, airhockey.J_BACK, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 64, airhockey.P_GAME_STANDBY, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 96, airhockey.J_SDKVER, 123, 124, airhockey.J_ERROR, 27, 10, 24, 24, 31, 3, 25, 4, 30, 12, 3, 39, 32, 59, 38, 49, 47, 41, 46, 62, 51, 44, 33, 32, 42, 26, 48, 55, 41};
    }

    static {
        A03();
        A01 = C00820g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC00810f A00(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, @Nullable Uri uri, Map<String, String> extraData) {
        return A01(c0887Xc, interfaceC0505Ia, str, uri, extraData, true, false);
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
