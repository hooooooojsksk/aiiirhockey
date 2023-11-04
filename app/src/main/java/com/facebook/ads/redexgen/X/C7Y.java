package com.facebook.ads.redexgen.X;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.7Y */
/* loaded from: assets/audience_network.dex */
public enum C7Y {
    A09(GamesStatusCodes.STATUS_VIDEO_NOT_ACTIVE, A00(0, 30, 116)),
    A07(3001, A00(160, 29, 56)),
    A06(3002, A00(125, 35, 6)),
    A08(3003, A00(189, 33, 36)),
    A05(AuthApiStatusCodes.AUTH_TOKEN_ERROR, A00(90, 35, 71));
    
    public static byte[] A02;
    public static String[] A03 = {"dUypCp5ZH75", "x5Qm8f9lc", "sq2W39eKqgwqqOWlIAV", "igK", "bv2fGbu4PZe4QDTt94R09bPmX6", "Gs0WF5WWQbMJ1GPXWCa", "E1e7Uw5ci0LxHvCHKGZ7MMTImO0krz0e", "59L0PM8TZSDfga3AwgwmMzwLrxdyp45T"};
    public final int A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].length() != 26) {
                throw new RuntimeException();
            }
            A03[5] = "61vyGPsquycEeLbb0w4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = copyOfRange[i4];
            if (A03[6].charAt(17) != '3') {
                A03[3] = "XBx";
                copyOfRange[i4] = (byte) ((b ^ i3) ^ 105);
                i4++;
            } else {
                A03[3] = "7Eu";
                copyOfRange[i4] = (byte) ((b ^ i3) ^ 105);
                i4 += 0;
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{92, airhockey.J_SAVEDGAME_SAVE, 61, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_SAVE, 61, airhockey.J_ACHIEVEMENTCALLBACK, 111, 111, airhockey.J_SAVEDGAME_RELOAD, 111, 61, airhockey.J_ERROR, 124, airhockey.J_INVITE, 61, airhockey.J_SAVEDGAME_RELOAD, 126, 126, airhockey.J_ENEMYLOSE, 111, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, 51, airhockey.J_DISCONNECT, airhockey.J_BACK, airhockey.J_ONREWARDED, airhockey.J_BACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_BACK, 99, airhockey.J_ERROR, 111, airhockey.J_DISCONNECT, airhockey.J_ERROR, 124, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_ERROR, 56, 61, 40, 61, 62, 61, 47, 57, 35, 53, 50, 47, 57, 46, 40, 39, 34, 55, 34, 33, 34, 48, 38, 60, 48, 38, 47, 38, 32, 55, 92, 89, 76, 89, 90, 89, 75, 93, airhockey.P_GAME_MYWIN, 77, airhockey.P_GAME_MYLOSE, 92, 89, 76, 93, airhockey.J_ENEMYLOSE, 79, airhockey.P_GAME_MYWIN, airhockey.P_NATION, 75, airhockey.P_GAME_EXIT, 14, 90, 65, 14, airhockey.P_GAME_EXIT, 75, airhockey.P_NATION, 75, 90, 75, 14, 92, 65, 89, 14, airhockey.P_GAME_MYLOSE, 92, 65, airhockey.P_GAME_MYSCORE, 14, airhockey.P_GAME_EXIT, 79, 90, 79, 76, 79, 93, 75, 0, 41, 14, 6, 3, 10, 11, 79, 27, 0, 79, 6, 1, 28, 10, 29, 27, 79, 29, 0, 24, 79, 6, 1, 27, 0, 79, 11, 14, 27, 14, 13, 14, 28, 10, 65, 23, 48, 56, 61, 52, 53, airhockey.J_BACK, 37, 62, airhockey.J_BACK, 35, 52, 48, 53, airhockey.J_BACK, 55, 35, 62, 60, airhockey.J_BACK, 53, 48, 37, 48, 51, 48, 34, 52, ByteCompanionObject.MAX_VALUE, 11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 56, 61, 41, 44, 57, 40, 109, 63, 34, 58, 109, 36, 35, 109, 41, 44, 57, 44, 47, 44, 62, 40, 99, airhockey.J_NATION, airhockey.J_WAIT, 124, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 96, airhockey.J_WAIT};
    }

    static {
        A01();
    }

    C7Y(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final int A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A01;
    }
}
