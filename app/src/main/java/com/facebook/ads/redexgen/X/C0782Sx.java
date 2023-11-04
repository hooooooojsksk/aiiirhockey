package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Sx */
/* loaded from: assets/audience_network.dex */
public final class C0782Sx implements MC {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{50, 62, 60, ByteCompanionObject.MAX_VALUE, 55, 48, 50, 52, 51, 62, 62, 58, ByteCompanionObject.MAX_VALUE, 48, 53, 34, ByteCompanionObject.MAX_VALUE, 56, 63, 37, 52, 35, 34, 37, 56, 37, 56, 48, 61, ByteCompanionObject.MAX_VALUE, 50, 61, 56, 50, 58, 52, 53, airhockey.J_ENEMYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, 42, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, 102, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, 111, 42, airhockey.J_GAME_STANDBY, 96, 119, 42, 109, airhockey.J_GAME_EXIT, airhockey.J_GOO, airhockey.J_SDKVER, airhockey.J_REWARD, 119, airhockey.J_GOO, 109, airhockey.J_GOO, 109, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, 42, airhockey.J_SDKVER, airhockey.J_REWARD, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, 54, 58, 56, 123, 51, 52, 54, 48, 55, 58, 58, 62, 123, 52, 49, 38, 123, 60, 59, 33, 48, 39, 38, 33, 60, 33, 60, 52, 57, 123, 51, 60, 59, 60, 38, 61, 10, 52, 54, 33, 60, 35, 60, 33, 44, airhockey.P_NATION, 78, 76, 15, airhockey.P_GAME_MYWIN, 64, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 78, 78, airhockey.P_GAME_EXIT, 15, 64, airhockey.P_GAME_STANDBY, 82, 15, airhockey.P_GAME_MYLOSE, 79, 85, airhockey.P_GAME_SELECTMAP, 83, 82, 85, airhockey.P_GAME_MYLOSE, 85, airhockey.P_GAME_MYLOSE, 64, 77, 15, airhockey.P_GAME_MYLOSE, 76, 81, 83, airhockey.P_GAME_SELECTMAP, 82, 82, airhockey.P_GAME_MYLOSE, 78, 79, 15, 77, 78, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 29, 17, 19, 80, 24, 31, 29, 27, 28, 17, 17, 21, 80, 31, 26, 13, 80, 23, 16, 10, 27, 12, 13, 10, 23, 10, 23, 31, 18, 80, 12, 27, 9, 31, 12, 26, 32, 44, 46, 109, 37, 34, 32, 38, 33, 44, 44, 40, 109, 34, 39, 48, 109, 42, 45, 55, 38, 49, 48, 55, 42, 55, 42, 34, 47, 109, 49, 38, 52, 34, 49, 39, 28, 48, 38, 49, 53, 38, 49, 28, 37, 34, 42, 47, 54, 49, 38, 10, 6, 4, airhockey.P_GAME_MYWIN, 15, 8, 10, 12, 11, 6, 6, 2, airhockey.P_GAME_MYWIN, 8, 13, 26, airhockey.P_GAME_MYWIN, 0, 7, 29, 12, 27, 26, 29, 0, 29, 0, 8, 5, airhockey.P_GAME_MYWIN, 27, 12, 30, 8, 27, 13, 54, 26, 12, 27, 31, 12, 27, 54, 26, 28, 10, 10, 12, 26, 26};
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A5c() {
        return A00(164, 36, 13);
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A6A() {
        return A00(0, 37, 34);
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A6b() {
        return A00(72, 45, 38);
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A6g() {
        return A00(37, 35, 119);
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A6t() {
        return A00(117, 47, 82);
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A7M() {
        return AdPlacementType.INTERSTITIAL.toString();
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A7d() {
        return A00(200, 51, 48);
    }

    @Override // com.facebook.ads.redexgen.X.MC
    public final String A7e() {
        return A00(251, 51, 26);
    }
}
