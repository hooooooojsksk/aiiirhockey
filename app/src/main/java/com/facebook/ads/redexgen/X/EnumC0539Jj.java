package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jj */
/* loaded from: assets/audience_network.dex */
public enum EnumC0539Jj {
    A0B,
    A09,
    A08,
    A0A,
    A07,
    A0E,
    A0D,
    A0C,
    A02,
    A05,
    A04,
    A06,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-101, -85, -88, -80, -84, -98, -85, -42, -37, -44, -36, -31, -40, -41, -14, -44, -41, -80, -59, -70, -83, -71, -75, -81, -53, -75, -70, -64, -79, -66, -65, -64, -75, -64, -75, -83, -72, -49, -28, -39, -52, -40, -44, -50, -22, -39, -52, -33, -44, -31, -48, -66, -45, -56, -69, -57, -61, -67, -39, -52, -65, -47, -69, -52, -66, -65, -66, -39, -48, -61, -66, -65, -55, -89, -74, -83, -83, -64, -76, -92, -77, -90, -90, -81, -64, -73, -86, -91, -90, -80, -46, -41, -35, -50, -37, -36, -35, -46, -35, -46, -54, -43, -24, -41, -54, -35, -46, -33, -50, -24, -52, -54, -37, -40, -34, -36, -50, -43, -57, -52, -46, -61, -48, -47, -46, -57, -46, -57, -65, -54, -35, -52, -65, -46, -57, -44, -61, -35, -57, -53, -65, -59, -61, -100, -95, -89, -104, -91, -90, -89, -100, -89, -100, -108, -97, -78, -95, -108, -89, -100, -87, -104, -78, -93, -97, -108, -84, -108, -107, -97, -104, airhockey.J_BACK, airhockey.J_REWARD, 124, 109, airhockey.J_PURCHASE, 123, 124, airhockey.J_BACK, 124, airhockey.J_BACK, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, -121, airhockey.J_REWARD, airhockey.J_GAME_REMATCH, 124, airhockey.J_BACK, 126, 109, -121, 126, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, 109, 119, -32, -45, -27, -49, -32, -46, -45, -46, -19, -47, -49, -32, -35, -29, -31, -45, -38, -22, -35, -17, -39, -22, -36, -35, -36, -9, -24, -28, -39, -15, -39, -38, -28, -35, -123, airhockey.J_ACHIEVEMENTCALLBACK, -118, airhockey.J_DISCONNECT, -123, 119, airhockey.J_ACHIEVEMENTCALLBACK, 119, -110, -119, 124, 119, airhockey.J_ACHIEVEMENTCALLBACK, -126};
    }

    static {
        A01();
    }
}
