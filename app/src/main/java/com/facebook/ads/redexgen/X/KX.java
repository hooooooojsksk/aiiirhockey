package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;

/* loaded from: assets/audience_network.dex */
public enum KX {
    A06(0),
    A0F(1),
    A07(2),
    A0G(3),
    A08(4),
    A05(5),
    A0D(6),
    A0E(7),
    A0J(8),
    A0C(9),
    A09(10),
    A0H(11),
    A0I(16),
    A0B(17),
    A0A(18);
    
    public static byte[] A01;
    public static final KX[] A02;
    public static final String A03;
    public final int A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-77, -74, -47, -75, -70, -63, -69, -75, -73, -59, -115, -100, -100, -85, -115, -112, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_BACK, ByteCompanionObject.MIN_VALUE, airhockey.J_NATION, airhockey.J_GAME_STANDBY, ByteCompanionObject.MIN_VALUE, 119, 83, -120, -105, -105, -90, -116, -107, -114, -120, -114, -116, -108, -116, -107, -101, -90, -120, -117, airhockey.J_GOO, 111, 124, 124, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MIN_VALUE, -115, -126, 125, -115, 119, 124, -126, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MIN_VALUE, -127, -126, 119, -126, 119, 111, airhockey.J_PURCHASE, -68, -56, -69, -57, -53, -69, -60, -71, -49, -43, -71, -73, -58, -58, -65, -60, -67, airhockey.J_ONREWARDED, airhockey.J_GOO, airhockey.J_GOO, airhockey.J_GAME_DISCONNECT, 123, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, 111, airhockey.J_ENEMYLOSE, 109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, 109, airhockey.J_ONREWARDED, 126, airhockey.J_ERROR, airhockey.J_ENEMYLOSE, 99, airhockey.J_ONREWARDED, airhockey.J_INVITE, 126, 96, 99, -73, -64, -52, -63, -65, -74, -76, -76, -78, -65, -122, -113, -101, -112, -114, -123, -125, -125, -127, -114, -101, -118, -117, -101, 125, -111, -112, -117, -101, -123, -119, -116, -101, -120, -117, -125, -125, -123, -118, -125, -110, -113, -108, -111, -91, -121, -118, -43, -46, -41, -44, -24, -54, -51, -24, -33, -69, -47, -60, -41, -52, -39, -56, -30, -58, -49, -46, -42, -56, -30, -59, -40, -41, -41, -46, -47, -72, -79, -84, -87, -84, -88, -89, -62, -81, -78, -86, -86, -84, -79, -86, -123, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, 126, -114, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE};
    }

    static {
        A03();
        A02 = new KX[]{A0G, A08, A05, A0E, A0H, A0I, A0B, A0A};
        JSONArray jSONArray = new JSONArray();
        for (KX kx : A02) {
            jSONArray.put(kx.A00());
        }
        A03 = jSONArray.toString();
    }

    KX(int i) {
        this.A00 = i;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A03;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
