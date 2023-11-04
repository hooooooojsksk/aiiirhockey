package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Id */
/* loaded from: assets/audience_network.dex */
public enum EnumC0508Id {
    A0S(A01(710, 4, 82)),
    A06(A01(431, 15, 117)),
    A08(A01(457, 5, 6)),
    A0P(A01(680, 14, 112)),
    A0D(A01(490, 10, 22)),
    A0N(A01(635, 25, 113)),
    A0O(A01(660, 20, 107)),
    A0F(A01(512, 37, 57)),
    A0E(A01(HttpStatus.SC_INTERNAL_SERVER_ERROR, 12, 14)),
    A0Q(A01(694, 5, 109)),
    A0J(A01(576, 16, 59)),
    A0K(A01(592, 9, 70)),
    A0G(A01(549, 11, 57)),
    A0W(A01(764, 5, 48)),
    A0V(A01(744, 11, 79)),
    A04(A01(790, 5, 30)),
    A0M(A01(617, 18, 15)),
    A05(A01(HttpStatus.SC_UNAUTHORIZED, 12, 106)),
    A07(A01(446, 11, 118)),
    A0T(A01(729, 15, 32)),
    A0U(A01(714, 15, 4)),
    A0R(A01(699, 11, 73)),
    A09(A01(HttpStatus.SC_REQUEST_TOO_LONG, 18, 110)),
    A0X(A01(769, 21, 25)),
    A0C(A01(755, 9, 112)),
    A0L(A01(601, 16, 96)),
    A0B(A01(467, 23, 54)),
    A0I(A01(570, 6, 97)),
    A0A(A01(462, 5, 24)),
    A0H(A01(560, 10, 33));
    
    public static byte[] A01;
    public static String[] A02 = {"pTWsWF2qz8Xr2QvNaoeX4WQy7B5K1AFD", "7iAt0ZQxlGPQ5tCLEuhHxDXKOxsROBn5", "RGBijebKMO9pnGzWLafy", "8GKiNnUVprvv3BQA7RRGlTYk7sqsrZd2", "dbszNjxVwRAY2WZF", "mcSvbra1TWloRdhWTFL80td7BovB7Z6D", "FcsNCE2HBJuao8xA2rTiJTUxq38jGWif", "poMRnmB7rAFaE3bMUxI6O2dxmVQ0Moe"};
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{36, 33, 58, 55, 32, 53, 42, 55, 49, 44, 43, 34, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, 126, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, 43, 59, 38, 62, 58, 44, 59, 54, 58, 44, 58, 58, 32, 38, 39, 53, 58, 63, 53, 61, 41, 49, 35, 55, 36, 50, 26, 21, 22, 10, 28, 8, 7, 4, 24, 14, 20, 9, 25, 4, 28, 24, 14, 20, 29, 2, 14, 28, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, airhockey.J_NATION, airhockey.J_ERROR, airhockey.J_ENEMYWIN, 41, 52, 35, 44, 32, 36, 46, 50, 62, 41, 38, 50, 33, 44, 52, 40, 63, 50, 40, 59, 40, 35, 57, 21, 6, 29, 29, 22, 31, 12, 31, 28, 20, 20, 26, 29, 20, 41, 45, 48, 50, 37, 51, 51, 41, 47, 46, airhockey.P_GAME_REMATCH, 78, 86, 65, 76, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 65, 84, airhockey.P_GAME_REMATCH, 79, 78, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, airhockey.J_INVITE, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_DISCONNECT, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 99, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ONREWARDED, 111, 102, airhockey.J_GAME_REMATCH, airhockey.J_GAME_REMATCH, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_INVITE, airhockey.J_GAME_EXIT, 119, airhockey.J_ERROR, airhockey.J_NATION, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, airhockey.J_NATION, 109, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, airhockey.J_GAME_STANDBY, airhockey.J_GAME_REMATCH, 123, 49, 62, 41, 54, 56, 62, 43, 54, 48, 49, 5, 9, 31, 6, 31, 25, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, 102, 109, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_ENEMYEXIT, 126, 124, 109, 102, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_RELOAD, 29, 2, 23, 28, 13, 30, 27, 28, 25, 12, 16, 29, 5, 29, 30, 16, 25, 3, 17, 25, 8, 14, 21, 31, 15, 65, airhockey.P_GAME_MYSCORE, 84, airhockey.P_GAME_MYWIN, 88, 84, airhockey.P_GAME_BREAKBALLCOUNT, 78, 88, 92, 65, airhockey.P_GAME_MYSCORE, 84, airhockey.P_NATION, airhockey.P_NATION, 88, 94, 95, 11, 29, 27, 23, 22, 28, 7, 27, 16, 25, 22, 22, 29, 20, 7, 17, 21, 8, 10, 29, 11, 11, 17, 23, 22, 40, 62, 56, 52, 53, 63, 36, 56, 51, 58, 53, 53, 62, 55, 36, 45, 50, 63, 62, 52, 52, 47, 40, 48, 56, 38, 35, 56, 36, 38, 43, 43, 34, 35, 95, 88, airhockey.P_GAME_MYSCORE, 94, airhockey.P_GAME_REMATCH, 109, airhockey.J_GAME_REMATCH, 119, airhockey.J_INVITE, 123, airhockey.J_SDKVER, airhockey.J_GAME_EXIT, airhockey.J_BACK, airhockey.J_SDKVER, 125, airhockey.J_SAVEDGAME_RELOAD, 119, 125, airhockey.J_ERROR, 99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, 99, 20, 23, 15, 31, 19, 20, 5, 16, airhockey.J_ACHIEVEMENTCALLBACK, 123, 99, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, 124, airhockey.J_SAVEDGAME_SAVE, 111, 109, airhockey.J_NATION, 111, airhockey.J_GAME_REMATCH, 96, 44, 42, 60, 43, 38, 43, 60, 45, 44, 43, 55, airhockey.J_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 102, airhockey.J_ENEMYWIN, 109, 10, 28, 9, 30, 21, 2, 28, 19, 25, 2, 5, 2, 16, 20, 19, 20, 16, 20, 7, 24, 25, 23, 18, 41, 5, 19, 26, 19, 21, 2, 31, 25, 24, 16, 0, 29, 5, 1, 23, 45, 4, 27, 23, 5, 45, 17, 30, 29, 1, 23, 22, 11, 27, 6, 30, 26, 12, 27, 54, 26, 12, 26, 26, 0, 6, 7, 9, 6, 3, 9, 1, 53, 13, 31, 11, 24, 14, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_ERROR, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, 96, airhockey.J_SDKVER, 102, airhockey.J_BACK, 99, 78, 83, airhockey.P_GAME_SELECTMAP, 75, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, airhockey.J_ERROR, 89, 78, 65, airhockey.J_ERROR, airhockey.P_GAME_BREAKBALLCOUNT, 75, 83, 79, 88, airhockey.J_ERROR, 79, 92, 79, airhockey.P_GAME_SELECTMAP, 94, 99, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_WAIT, airhockey.J_WAIT, 99, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, 123, 124, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, 126, 123, airhockey.J_REWARD, airhockey.J_SAVEDGAME_SAVE, 102, 123, 125, 124, airhockey.P_GAME_REMATCH, 64, 86, 86, airhockey.J_PURCHASE, 86, 81, 87, 76, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.J_PURCHASE, 86, 64, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 75, 65, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, 77, airhockey.P_GAME_SELECTMAP, 75, 75, 64, airhockey.P_GAME_REMATCH, airhockey.J_PURCHASE, 76, airhockey.P_GAME_MYLOSE, 85, 87, 64, 86, 86, 76, airhockey.P_GAME_EXIT, 75, 75, airhockey.P_GAME_SELECTMAP, 81, 76, 83, 64, airhockey.J_PURCHASE, 83, 76, 64, 82, 83, 92, 75, 84, 90, 92, airhockey.P_GAME_REMATCH, 84, 82, 83, 18, 30, 8, 17, 8, 14, airhockey.P_GAME_MYLOSE, 65, 65, airhockey.J_ACHIEVEMENTCALLBACK, 83, airhockey.P_GAME_BREAKBALLCOUNT, 85, 64, airhockey.P_NATION, 83, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_SELECTMAP, 75, 78, airhockey.P_GAME_SELECTMAP, 76, 53, 42, 63, 52, 5, 54, 51, 52, 49, 12, 16, 29, 5, 29, 30, 16, 25, 35, 17, 25, 8, 14, 21, 31, 15, 99, airhockey.J_SDKVER, airhockey.J_REWARD, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.J_REWARD, airhockey.J_ONREWARDED, 76, airhockey.J_PURCHASE, 126, 99, airhockey.J_SDKVER, airhockey.J_REWARD, 96, 96, airhockey.J_PURCHASE, 124, 125, 30, 8, 14, 2, 3, 9, 50, 14, 5, 12, 3, 3, 8, 1, 50, 4, 0, 29, 31, 8, 30, 30, 4, 2, 3, 4, 18, 20, 24, 25, 19, 40, 20, 31, 22, 25, 25, 18, 27, 40, 1, 30, 19, 18, 24, 31, 4, 3, 27, 51, 13, 8, 51, 15, 13, 0, 0, 9, 8, 2, 5, 30, 3, 20, 38, 34, 60, 37, 48, 10, 54, 57, 60, 54, 62, 58, 43, 61, 58, airhockey.J_GAME_DISCONNECT, 111, 119, airhockey.P_GAME_MYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_ENEMYLOSE, airhockey.P_GAME_MYWIN, 123, airhockey.J_WAIT, airhockey.J_REWARD, 123, 125, airhockey.J_DISCONNECT, airhockey.P_GAME_MYLOSE, 75, 83, 99, 79, airhockey.P_GAME_MYLOSE, 89, 76, 99, 88, 85, 93, 80, 83, 91, 38, 32, 54, 33, 12, 33, 54, 39, 38, 33, 61, 25, 20, 51, 10, 25, 2, 2, 9, 0, 90, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYSCORE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, airhockey.J_BACK, 102, 109, 90, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SDKVER, 90, 125, 90, airhockey.J_ENEMYLOSE, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, 96, airhockey.J_SDKVER, airhockey.J_PURCHASE, 93, 109, 119, airhockey.J_REWARD};
    }

    static {
        A02();
    }

    EnumC0508Id(String str) {
        this.A00 = str;
    }

    public static EnumC0508Id A00(String str) {
        EnumC0508Id[] values;
        for (EnumC0508Id enumC0508Id : values()) {
            if (enumC0508Id.A00.equalsIgnoreCase(str)) {
                return enumC0508Id;
            }
        }
        String[] strArr = A02;
        if (strArr[3].charAt(21) != strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        A02[7] = "xhmlKR2vVr43obLaG";
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
