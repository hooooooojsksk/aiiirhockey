package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.1Y */
/* loaded from: assets/audience_network.dex */
public final class C1Y {
    public static byte[] A01;
    public static final /* synthetic */ C1Y[] A02;
    public static final C1Y A03;
    public static final C1Y A04;
    public static final C1Y A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, airhockey.J_GAME_STANDBY, airhockey.J_NATION, airhockey.J_REWARD, airhockey.J_GAME_REMATCH, airhockey.J_GAME_STANDBY, 119, ByteCompanionObject.MAX_VALUE, airhockey.J_GOO, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, 99, airhockey.J_SDKVER, 99, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        A05 = new C1Y(A012, 0, A012);
        String A013 = A01(13, 14, 115);
        A04 = new C1Y(A013, 1, A013);
        String A014 = A01(0, 13, 126);
        A03 = new C1Y(A014, 2, A014);
        A02 = new C1Y[]{A05, A04, A03};
    }

    public C1Y(String str, int i, String str2) {
        super(str, i);
        this.A00 = str2;
    }

    public static C1Y A00(String str) {
        C1Y[] values;
        for (C1Y c1y : values()) {
            if (c1y.A00.equalsIgnoreCase(str)) {
                return c1y;
            }
        }
        return A03;
    }

    public static C1Y valueOf(String str) {
        return (C1Y) Enum.valueOf(C1Y.class, str);
    }

    public static C1Y[] values() {
        return (C1Y[]) A02.clone();
    }
}
