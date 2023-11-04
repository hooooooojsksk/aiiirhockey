package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public enum PM {
    A04(A00(147, 33, 28)),
    A05(A00(180, 36, 56)),
    A06(A00(216, 29, 15)),
    A03(A00(78, 32, 93)),
    A07(A00(110, 37, 32));
    
    public static byte[] A01;
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{79, 64, 85, airhockey.P_GAME_MYLOSE, 87, airhockey.P_GAME_SELECTMAP, 94, 64, airhockey.P_GAME_STANDBY, 94, airhockey.P_NATION, 77, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, airhockey.P_GAME_EXIT, 45, 34, 55, 42, 53, 38, 60, 32, 44, 46, 51, 47, 38, 55, 38, airhockey.J_BACK, 126, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GAME_REMATCH, airhockey.J_PURCHASE, 96, airhockey.J_PURCHASE, airhockey.J_BACK, 123, 96, 126, 124, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GAME_REMATCH, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, 102, 60, 51, 38, 59, 36, 55, 45, 55, 32, 32, 61, 32, airhockey.J_WAIT, airhockey.J_REWARD, 99, 126, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYLOSE, 126, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, 126, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, airhockey.J_WAIT, airhockey.J_ERROR, 119, 52, 124, 123, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_ERROR, airhockey.J_BACK, 52, 123, 126, airhockey.J_GAME_REMATCH, 52, airhockey.J_DISCONNECT, 123, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, 52, 123, 126, airhockey.P_GAME_STANDBY, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_SAVEDGAME_SAVE, airhockey.J_WAIT, airhockey.J_BACK, 4, 8, 10, airhockey.P_GAME_REMATCH, 1, 6, 4, 2, 5, 8, 8, 12, airhockey.P_GAME_REMATCH, 6, 3, 20, airhockey.P_GAME_REMATCH, 9, 6, 19, 14, 17, 2, airhockey.P_GAME_REMATCH, 6, 3, 56, 14, 10, 23, 21, 2, 20, 20, 14, 8, 9, 56, 52, 54, airhockey.J_ERROR, 61, 58, 56, 62, 57, 52, 52, 48, airhockey.J_ERROR, 58, 63, 40, airhockey.J_ERROR, 53, 58, 47, 50, 45, 62, airhockey.J_ERROR, 56, 52, 54, 43, 55, 62, 47, 62, 63, 28, 16, 18, 81, 25, 30, 28, 26, 29, 16, 16, 20, 81, 30, 27, 12, 81, 17, 30, 11, 22, 9, 26, 81, 26, 17, 27, 32, 30, 28, 11, 22, 9, 22, 11, 6, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 38, 41, 60, 33, 62, 45, 102, 45, 58, 58, 39, 58};
    }

    static {
        A01();
    }

    PM(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
