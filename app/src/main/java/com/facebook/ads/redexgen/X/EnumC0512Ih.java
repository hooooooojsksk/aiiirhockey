package com.facebook.ads.redexgen.X;

import com.google.android.gms.drive.DriveStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Ih */
/* loaded from: assets/audience_network.dex */
public enum EnumC0512Ih {
    A0D(A00(978, 20, 95)),
    A08(A00(869, 18, 119)),
    A04(A00(998, 15, 38)),
    A0H(A00(1075, 13, 43)),
    A0G(A00(1062, 13, 54)),
    A0c(A00(1435, 14, 2)),
    A0T(A00(1271, 10, 68)),
    A0a(A00(1390, 25, 125)),
    A0b(A00(1415, 20, 22)),
    A0V(A00(1297, 37, 76)),
    A06(A00(860, 9, 8)),
    A07(A00(844, 16, 64)),
    A0X(A00(1344, 10, 30)),
    A0h(A00(1494, 14, 73)),
    A0g(A00(1483, 11, 2)),
    A0W(A00(1334, 10, 74)),
    A0I(A00(1088, 16, 95)),
    A0j(A00(1529, 14, 102)),
    A0i(A00(DriveStatusCodes.DRIVE_CONTENTS_TOO_LARGE, 21, 82)),
    A0Y(A00(1354, 16, 127)),
    A0J(A00(1104, 11, 32)),
    A0Z(A00(1370, 20, 77)),
    A0U(A00(1281, 16, 24)),
    A0S(A00(1257, 14, 40)),
    A0q(A00(1625, 14, 90)),
    A0l(A00(1558, 11, 59)),
    A0k(A00(1543, 15, 89)),
    A0m(A00(1569, 10, 110)),
    A0o(A00(1591, 10, 90)),
    A0n(A00(1579, 12, 68)),
    A0p(A00(1601, 24, 37)),
    A0f(A00(1475, 8, 125)),
    A0e(A00(1466, 9, 15)),
    A0d(A00(1449, 17, 37)),
    A0r(A00(1639, 18, 38)),
    A05(A00(826, 18, 83)),
    A0A(A00(887, 17, 42)),
    A0C(A00(934, 33, 61)),
    A0B(A00(904, 30, 37)),
    A09(A00(967, 11, 122)),
    A0E(A00(1013, 23, 67)),
    A0F(A00(1036, 26, 119)),
    A0K(A00(1115, 14, 44)),
    A0P(A00(1200, 20, 122)),
    A0O(A00(1189, 11, 34)),
    A0R(A00(1238, 19, 23)),
    A0M(A00(1152, 25, 93)),
    A0L(A00(1129, 23, 99)),
    A0Q(A00(1220, 18, 26)),
    A0N(A00(1177, 12, 55));
    
    public static byte[] A01;
    public static String[] A02 = {"xf7Unrk6vTQzEkMC", "vKITx3IWvQKkFLmjQGxCBJXBbaEzbyA1", "cThsnxXPxwbSdRlfETw3Y5ierdxYTHRM", "J3jH7tWf7SO0z7OSK7ULDo6C1", "I7y1ZenhSrXhIhId1NsXZp8eskpSXT89", "9PVJQ3IXsUcABNlhPZfYMIRDAFEvqeV3", "9G2r59BoUl91An7yhO6AwIMh4F2sXT3r", "W4xt1YhK3CDmCgAn"};
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[2].charAt(31) != 'M') {
                throw new RuntimeException();
            }
            A02[2] = "mmPym4lpWgK7OAi14ovsdO61E0NwpnnM";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{32, 37, 32, 49, 53, 36, 51, 62, 53, 40, 44, 36, 46, 52, 53, 40, 45, 54, 42, 33, 38, 32, 42, 44, 58, 54, 42, 37, 32, 42, 34, 44, 45, airhockey.P_GAME_STANDBY, 64, 91, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, 75, 87, 65, 64, 95, 90, 65, 93, 82, 81, 77, 91, 65, 93, 82, 87, 93, 85, 91, 90, 92, 89, airhockey.P_NATION, 81, 82, 92, 89, 88, 89, airhockey.P_NATION, 94, 92, 81, 81, 95, 92, 94, 86, 28, 25, 2, 15, 24, 13, 18, 15, 9, 24, 25, 15, 10, 17, 28, 11, 30, 1, 28, 26, 17, 13, 2, 7, 13, 5, 11, 10, 111, airhockey.J_GAME_EXIT, airhockey.J_BACK, 124, airhockey.J_GAME_ENEMYEXIT, 126, airhockey.J_SDKVER, 124, airhockey.J_PURCHASE, airhockey.J_BACK, 99, 111, 96, 111, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 126, 124, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, 125, airhockey.J_BACK, 109, airhockey.J_NATION, airhockey.J_ENEMYWIN, 109, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 92, 81, airhockey.P_GAME_BREAKBALLCOUNT, 83, 76, 81, 87, 92, 84, 75, 90, 92, 80, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 77, airhockey.P_GAME_SELECTMAP, 92, 87, 75, airhockey.P_GAME_EXIT, 80, 92, 64, 79, airhockey.P_GAME_EXIT, 64, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 123, 126, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_EXIT, airhockey.J_ERROR, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, 126, 78, 95, 95, 80, airhockey.P_NATION, 64, 89, airhockey.P_GAME_EXIT, 75, 80, 91, 64, 80, 77, 78, 76, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 93, 64, 90, 65, 75, 3, 18, 18, 29, 16, 7, 22, 23, 16, 12, 7, 6, 29, 22, 13, 29, 4, 13, 16, 7, 5, 16, 13, 23, 12, 6, 8, 10, 8, 3, 14, 20, 13, 10, 2, 7, 30, 25, 14, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_NATION, 111, airhockey.J_ERROR, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_REMATCH, 111, airhockey.J_WAIT, airhockey.J_WAIT, 77, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, airhockey.P_GAME_STANDBY, airhockey.P_GAME_REMATCH, 91, 79, 92, airhockey.P_GAME_EXIT, 81, 77, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, airhockey.P_GAME_STANDBY, 2, 21, 0, 30, 2, 13, 8, 2, 10, 4, 5, 77, 76, 95, 64, airhockey.P_GAME_EXIT, 76, 86, 91, airhockey.P_GAME_BREAKBALLCOUNT, 93, airhockey.P_GAME_MYLOSE, 93, 76, 77, 84, airhockey.P_GAME_MYSCORE, 92, 79, 85, airhockey.P_GAME_BREAKBALLCOUNT, 81, 92, airhockey.P_GAME_STANDBY, 81, airhockey.P_GAME_SELECTMAP, 85, 79, 90, airhockey.P_GAME_MYSCORE, 91, 76, 83, 64, 86, 81, 75, 77, 80, 64, 94, 81, 86, 82, 94, 75, 86, 80, 81, 64, 90, 81, 91, 90, 91, airhockey.J_GOO, airhockey.J_ENEMYWIN, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_ENEMYEXIT, 126, airhockey.J_ENEMYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 102, 102, 123, 102, 35, 52, 43, 56, 52, 34, 51, 56, 50, 53, 43, 30, 9, 22, 5, 14, 8, 27, 20, 9, 28, 21, 8, 23, 5, 27, 9, 9, 31, 14, 9, 62, 41, 54, 37, 45, 63, 56, 37, 44, 51, 63, 45, 37, 63, 40, 40, 53, 40, 76, 91, airhockey.P_GAME_SELECTMAP, 87, 95, 77, airhockey.P_GAME_EXIT, 87, 94, 65, 77, 95, 87, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, airhockey.P_GAME_REMATCH, 76, 77, 76, 37, 46, 36, 63, 35, 33, 50, 36, 63, 51, 40, 47, 55, 46, 55, 51, 46, 44, 59, 45, 45, 55, 49, 48, 78, airhockey.P_GAME_REMATCH, 83, 85, airhockey.P_GAME_MYLOSE, 88, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, 85, airhockey.P_GAME_MYSCORE, 88, 84, 79, airhockey.P_GAME_MYLOSE, 80, airhockey.P_GAME_REMATCH, 35, 42, 60, 60, 48, 60, 59, 61, 38, 44, 59, 48, 60, 42, 44, 32, 33, 43, 48, 44, 39, 46, 33, 33, 42, 35, 48, 38, 34, 63, 61, 42, 60, 60, 38, 32, 33, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 65, airhockey.P_GAME_SELECTMAP, 80, 76, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 76, airhockey.P_GAME_SELECTMAP, 119, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_GOO, 126, airhockey.J_ACHIEVEMENTCALLBACK, 109, airhockey.J_GOO, airhockey.J_REWARD, 119, 56, 49, 49, 40, 35, 54, 37, 48, 50, 35, 40, 52, 59, 62, 52, 60, airhockey.P_GAME_REMATCH, 85, 88, 64, 88, 91, 85, 92, airhockey.P_GAME_BREAKBALLCOUNT, 90, 77, 88, airhockey.P_GAME_BREAKBALLCOUNT, 90, 85, 80, 90, 82, 92, 93, 15, 25, 31, 19, 18, 24, 3, 31, 20, 29, 18, 18, 25, 16, 3, 21, 17, 12, 14, 25, 15, 15, 21, 19, 18, 2, 20, 18, 30, 31, 21, 14, 18, 25, 16, 31, 31, 20, 29, 14, 7, 24, 21, 20, 30, 53, 46, 41, 49, 57, 39, 34, 57, 37, 39, 42, 42, 35, 34, 123, airhockey.J_ENEMYWIN, 125, 102, airhockey.J_GAME_DISCONNECT, 119, airhockey.J_GAME_EXIT, 125, 124, 124, airhockey.J_ENEMYWIN, 102, 119, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, 109, 123, 123, 109, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYSCORE, 95, airhockey.P_GAME_STANDBY, 94, 84, 79, 95, 86, 86, 46, 50, 40, 51, 57, 34, 50, 51, 80, 87, 76, 81, airhockey.P_GAME_BREAKBALLCOUNT, 92, 64, 79, airhockey.P_GAME_EXIT, 64, airhockey.P_GAME_MYLOSE, 76, airhockey.P_GAME_MYLOSE, 86, 79, 90, 64, 75, 80, 64, 92, 83, 86, 92, 84, 90, 89, 65, 81, 93, 90, 75, 94, 81, 77, 79, 64, 77, 75, airhockey.P_NATION, 81, 77, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, airhockey.P_GAME_STANDBY, 51, 48, 40, 56, 52, 51, 34, 55, 56, 36, 43, 46, 36, 44, 57, 38, 43, 42, 32, 48, 44, 32, 34, 63, 35, 42, 59, 42, 43, 40, 55, 58, 59, 49, 33, 59, 44, 44, 49, 44, 4, 27, 22, 23, 29, 13, 27, 22, 30, 23, 10, 21, 24, 25, 19, 3, 12, 29, 9, 15, 25, 24, 63, 32, 45, 44, 38, 54, 57, 37, 40, 48, 2, 29, 16, 17, 27, 11, 4, 24, 21, 13, 11, 4, 21, 1, 7, 17, 11, 23, 24, 29, 23, 31, 17, 16, airhockey.J_GAME_EXIT, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, airhockey.J_SAVEDGAME_SAVE, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, 96, airhockey.J_GAME_EXIT, airhockey.J_PURCHASE, airhockey.J_REWARD, airhockey.J_INVITE, airhockey.J_GAME_DISCONNECT, airhockey.J_ERROR, airhockey.J_PURCHASE, 102, airhockey.J_GAME_REMATCH, airhockey.J_GAME_DISCONNECT, 102, airhockey.J_INVITE, 96, airhockey.J_SDKVER, 123, 126, airhockey.P_GAME_STANDBY, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, airhockey.P_GAME_STANDBY, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_SAVEDGAME_SAVE, airhockey.J_WAIT, airhockey.J_BACK, ByteCompanionObject.MAX_VALUE, 126, airhockey.J_ENEMYLOSE, 109, 86, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, 102, airhockey.J_PURCHASE, airhockey.J_GAME_DISCONNECT, 86, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, 96, airhockey.J_GAME_EXIT, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, 109, 32, 37, 30, 34, 45, 46, 50, 36, 37, 95, 90, airhockey.J_SDKVER, 82, 81, 95, 90, 91, 90, airhockey.J_SDKVER, 93, 95, 82, 82, 92, 95, 93, 85, 2, 7, 60, 17, 6, 19, 12, 17, 23, 60, 0, 15, 10, 0, 8, 6, 7, 13, 8, 51, 30, 9, 28, 3, 30, 24, 51, 1, 13, 2, 13, 11, 9, 51, 28, 30, 9, 10, 31, 51, 15, 0, 5, 15, 7, 9, 8, 21, 16, 43, 6, 17, 4, 27, 6, 0, 43, 3, 28, 13, 43, 7, 17, 17, 29, 26, 19, 43, 0, 28, 29, 7, 43, 23, 24, 29, 23, 31, 17, 16, 82, 87, airhockey.J_GAME_DISCONNECT, 65, 86, airhockey.P_GAME_MYSCORE, 92, 65, airhockey.P_GAME_MYWIN, 86, 87, 119, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_STANDBY, 102, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, 96, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, 14, 11, 
        14, 31, 27, 10, 29, 48, 27, 6, 2, 10, 0, 26, 27, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, airhockey.J_PURCHASE, 85, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, 124, 111, airhockey.J_INVITE, 85, 126, airhockey.J_GAME_STANDBY, 85, airhockey.J_ENEMYLOSE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER, 109, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_INVITE, 95, 78, 78, airhockey.J_SDKVER, 76, 91, airhockey.P_GAME_EXIT, 75, 76, 80, 91, 90, airhockey.J_SDKVER, airhockey.P_GAME_EXIT, 81, airhockey.J_SDKVER, 88, 81, 76, 91, 89, 76, 81, 75, 80, 90, 28, 30, 28, 23, 26, 32, 25, 30, 22, 19, 10, 13, 26, 1, 3, 1, 10, 7, 61, 17, 23, 1, 1, 7, 17, 17, airhockey.J_ERROR, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, 125, airhockey.J_BACK, 99, 119, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_REMATCH, airhockey.J_ERROR, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, 125, 10, 29, 8, 54, 10, 5, 0, 10, 2, 12, 13, 1, 0, 19, 12, 6, 0, 58, 23, 10, 17, 4, 17, 0, 1, 78, 89, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ERROR, 79, 92, 75, airhockey.P_GAME_BREAKBALLCOUNT, 95, 75, 94, 79, airhockey.J_ERROR, 64, 75, 92, 75, 89, airhockey.P_GAME_REMATCH, 88, airhockey.P_GAME_MYSCORE, 90, 94, airhockey.J_GOO, airhockey.J_ENEMYWIN, airhockey.J_ACHIEVEMENTCALLBACK, 75, 125, airhockey.J_PURCHASE, 96, 102, 123, 75, airhockey.J_ERROR, airhockey.J_PURCHASE, 125, airhockey.J_WAIT, airhockey.J_ERROR, 96, 125, 123, airhockey.J_PURCHASE, 75, airhockey.J_BACK, airhockey.J_PURCHASE, airhockey.J_GOO, airhockey.J_BACK, airhockey.J_GOO, 26, 13, 18, 33, 20, 13, 33, 27, 12, 12, 17, 12, 15, 24, 7, 52, 24, 14, 31, 52, 30, 25, 7, 87, 64, 95, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYWIN, 65, 82, 93, 64, 85, 92, 65, 94, airhockey.J_GAME_DISCONNECT, 82, 64, 64, 86, airhockey.P_GAME_MYWIN, 64, 55, 32, 63, 12, 36, 54, 49, 12, 37, 58, 54, 36, 12, 54, 33, 33, 60, 33, 58, 45, 50, 1, 41, 59, 60, 1, 40, 55, 59, 41, 1, 50, 49, 63, 58, 59, 58, 4, 15, 5, 62, 2, 0, 19, 5, 62, 18, 9, 14, 22, 15, airhockey.J_ONREWARDED, 96, 125, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, 126, 126, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, 56, 63, 37, 35, 62, 14, 50, 48, 35, 53, 14, 34, 57, 62, 38, 63, airhockey.J_GAME_REMATCH, 96, airhockey.J_REWARD, airhockey.J_REWARD, 90, airhockey.J_REWARD, airhockey.J_BACK, 119, airhockey.J_GAME_DISCONNECT, 102, airhockey.J_BACK, 90, airhockey.J_REWARD, 96, 102, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SDKVER, 90, 102, 109, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_GAME_REMATCH, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, 119, 96, airhockey.J_REWARD, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 111, airhockey.J_GAME_EXIT, 109, airhockey.J_ENEMYLOSE, 92, 96, 111, airhockey.J_GAME_EXIT, 96, airhockey.J_ENEMYLOSE, 57, 54, 33, 62, 48, 54, 35, 62, 56, 57, 89, 80, 80, airhockey.J_GAME_REMATCH, airhockey.P_NATION, 87, airhockey.P_GAME_SELECTMAP, 81, 83, airhockey.P_NATION, airhockey.J_GAME_REMATCH, 85, 90, 95, 85, 93, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, 125, airhockey.J_GAME_STANDBY, 102, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 91, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_GAME_STANDBY, 91, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, 109, airhockey.J_ENEMYWIN, 111, airhockey.J_SDKVER, 96, airhockey.P_GAME_MYWIN, 81, 87, 91, 90, 80, airhockey.J_GAME_ENEMYEXIT, 87, 92, 85, 90, 90, 81, 88, airhockey.J_GAME_ENEMYEXIT, 93, 89, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYWIN, 93, 91, 90, 44, 58, 60, 48, 49, 59, 0, 60, 55, 62, 49, 49, 58, 51, 0, 41, 54, 59, 58, 48, 56, 35, 36, 60, 20, 42, 47, 20, 40, 42, 39, 39, 46, 47, 31, 3, 25, 2, 8, 51, 14, 24, 2, 51, 28, 30, 9, 31, 31, 9, 8, 53, 41, 51, 40, 34, 25, 41, 32, 32, airhockey.P_GAME_MYWIN, 91, 65, 90, 80, airhockey.J_GAME_ENEMYEXIT, 91, 90, 56, 63, 36, 57, 46, 20, 40, 39, 34, 40, 32, airhockey.J_SAVEDGAME_SAVE, 119, airhockey.J_GAME_REMATCH, airhockey.J_GOO, airhockey.J_GAME_STANDBY, 95, airhockey.J_DISCONNECT, 111, 95, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, 99, airhockey.J_GAME_ENEMYEXIT, 111, airhockey.J_GAME_DISCONNECT, airhockey.J_DISCONNECT, airhockey.P_GAME_SELECTMAP, airhockey.J_ENEMYLOSE, 111, 126, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_SELECTMAP, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, 126, 119, airhockey.P_GAME_SELECTMAP, airhockey.J_ACHIEVEMENTCALLBACK, 119, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GOO, 91, 88, 64, airhockey.J_GOO, 92, 91, airhockey.P_GAME_EXIT, 95, airhockey.J_GOO, 76, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 76, airhockey.P_GAME_SELECTMAP, 102, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.J_ERROR, ByteCompanionObject.MAX_VALUE, 79, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, 125, 96, 124, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_ERROR, airhockey.J_DISCONNECT, 4, 27, 22, 23, 29, 45, 23, 0, 0, 29, 0, 81, 78, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, airhockey.J_ACHIEVEMENTCALLBACK, 78, airhockey.P_GAME_MYSCORE, 75, airhockey.P_NATION, 123, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, airhockey.J_NATION, 82, 125, airhockey.J_GAME_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, 126, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, 119, airhockey.J_REWARD, 124, 76, 99, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, 26, 5, 8, 9, 3, 51, 28, 0, 13, 21, 51, 28, 13, 25, 31, 9, 51, 15, 0, 5, 15, 7, 9, 8, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, 119, airhockey.J_REWARD, 124, 76, 99, airhockey.J_SDKVER, airhockey.J_REWARD, 99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SDKVER, airhockey.J_REWARD, 119, 25, 6, 11, 10, 0, 48, 28, 4, 6, 31, 48, 12, 3, 6, 12, 4, 10, 11};
    }

    static {
        A01();
    }

    EnumC0512Ih(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
