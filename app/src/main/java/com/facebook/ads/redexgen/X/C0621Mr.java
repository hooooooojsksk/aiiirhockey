package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mr */
/* loaded from: assets/audience_network.dex */
public final class C0621Mr {
    public static byte[] A02;
    public static String[] A03 = {"LmKV0vies2yKzOatCTvdNkioufxejCG9", "NFLVmCZa277818VmZZ44o4VnddjY0G", "VEYTkYrZyGJHkQMFJ6r271ULcITBjkmP", "QAYXVPOyB3q0GFKcmaeo", "Gi5tRpcY", "pjHEhG2Dj870L2LSHBRlpkG", "H2ZPqTwArbqxA8DeWP2m9Ve", "WDxae7s2p2mOylBC2o4p"};
    public boolean A00 = true;
    public final C0775Sq A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[2].charAt(3) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "6YNWQQidVDsdqlc2Mjd0";
            strArr[3] = "jinJQ2QcXnMSMR7RoRBd";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, airhockey.J_GAME_STANDBY, airhockey.P_GAME_EXIT, 93, 111, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ENEMYLOSE, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 95, 78, airhockey.P_GAME_STANDBY, 95, airhockey.J_ENEMYWIN, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_EXIT, 79, 78, 79, 17, 42, 37, 37, 10, 29, 39, 4, 10, 15, 46, 29, 14, 5, 31, 46, 5, 15, 81, 85, 90, 90, airhockey.J_ERROR, airhockey.J_NATION, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_BACK, airhockey.J_ENEMYWIN, airhockey.J_ONREWARDED, 123, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, airhockey.J_BACK, 81, airhockey.J_PURCHASE, airhockey.J_GOO, 46, 36, 61, 59, 54, airhockey.J_PURCHASE, airhockey.J_PURCHASE, 52, 39, 60, 49, 38, 59, 61, 60, airhockey.J_PURCHASE, 123, airhockey.J_SAVEDGAME_RELOAD, 41, 38, 32, 43, airhockey.J_SAVEDGAME_RELOAD, 41, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 59, 52, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_SAVE, 37, 59, 60, 54, 61, 37, 124, 34, 55, 32, 52, 61, 32, 63, 51, 60, 49, 55, airhockey.J_SAVEDGAME_RELOAD, 46, 46, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 37, 59, 60, 54, 61, 37, 124, 34, 55, 32, 52, 61, 32, 63, 51, 60, 49, 55, 124, 38, 59, 63, 59, 60, 53, airhockey.J_SAVEDGAME_RELOAD, 46, 46, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 54, 61, 49, 39, 63, 55, 60, 38, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 46, 46, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 54, 61, 49, 39, 63, 55, 60, 38, 124, 48, 61, 54, 43, airhockey.J_SAVEDGAME_RELOAD, 46, 46, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 54, 61, 49, 39, 63, 55, 60, 38, 124, 48, 61, 54, 43, 124, 49, 58, 59, 62, 54, 32, 55, 60, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 46, 46, airhockey.J_SAVEDGAME_RELOAD, 54, 61, 49, 39, 63, 55, 60, 38, 124, 48, 61, 54, 43, 124, 49, 58, 59, 62, 54, 32, 55, 60, 124, 62, 55, 60, 53, 38, 58, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_INVITE, airhockey.J_SAVEDGAME_RELOAD, 99, 123, airhockey.J_SAVEDGAME_RELOAD, 41, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 32, 55, 38, 39, 32, 60, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 47, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 36, 51, 32, airhockey.J_SAVEDGAME_RELOAD, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_SAVEDGAME_RELOAD, 37, 59, 60, 54, 61, 37, 124, 34, 55, 32, 52, 61, 32, 63, 51, 60, 49, 55, 124, 38, 59, 63, 59, 60, 53, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 59, 52, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 32, 55, 33, 34, 61, 60, 33, 55, 23, 60, 54, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_NATION, 123, airhockey.J_SAVEDGAME_RELOAD, 41, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 49, 61, 60, 33, 61, 62, 55, 124, 62, 61, 53, airhockey.J_PURCHASE, airhockey.J_ERROR, 19, 28, 28, 51, 36, 0, 55, 33, 34, 61, 60, 33, 55, 23, 60, 54, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 32, 55, 33, 34, 61, 60, 33, 55, 23, 60, 54, 123, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 47, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 59, 52, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 54, 61, 63, 17, 61, 60, 38, 55, 60, 38, 30, 61, 51, 54, 55, 54, 23, 36, 55, 60, 38, 1, 38, 51, 32, 38, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_NATION, 123, airhockey.J_SAVEDGAME_RELOAD, 41, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 49, 61, 60, 33, 61, 62, 55, 124, 62, 61, 53, airhockey.J_PURCHASE, airhockey.J_ERROR, 19, 28, 28, 51, 36, 22, 61, 63, 17, 61, 60, 38, 55, 60, 38, 30, 61, 51, 54, 55, 54, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 54, 61, 63, 17, 61, 60, 38, 55, 60, 38, 30, 61, 51, 54, 55, 54, 23, 36, 55, 60, 38, 1, 38, 51, 32, 38, 123, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 47, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 59, 52, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 62, 61, 51, 54, 23, 36, 55, 60, 38, 23, 60, 54, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_NATION, 123, airhockey.J_SAVEDGAME_RELOAD, 41, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 49, 61, 60, 33, 61, 62, 55, 124, 62, 61, 53, airhockey.J_PURCHASE, airhockey.J_ERROR, 19, 28, 28, 51, 36, 30, 61, 51, 54, 23, 36, 55, 60, 38, 23, 60, 54, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, 60, 36, 38, 59, 63, 59, 60, 53, 13, 13, 51, 60, 13, 38, 124, 62, 61, 51, 54, 23, 36, 55, 60, 38, 23, 60, 54, 123, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 47, 47, airhockey.J_SAVEDGAME_RELOAD, 49, 51, 38, 49, 58, airhockey.J_PURCHASE, 55, 32, 32, 123, airhockey.J_SAVEDGAME_RELOAD, 41, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 49, 61, 60, 33, 61, 62, 55, 124, 62, 61, 53, airhockey.J_PURCHASE, airhockey.J_ERROR, 51, 60, 13, 60, 51, 36, 59, 53, 51, 38, 59, 61, 60, 13, 38, 59, 63, 59, 60, 53, 13, 55, 32, 32, 61, 32, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, 55, 32, 32, 124, 63, 55, 33, 33, 51, 53, 55, 123, airhockey.J_GAME_REMATCH, 47, 47, 123, airhockey.J_PURCHASE, 123, 123, airhockey.J_GAME_REMATCH};
    }

    static {
        A02();
    }

    public C0621Mr(C0775Sq c0775Sq) {
        this.A01 = c0775Sq;
    }

    public static long A00(String str, String str2) {
        String substring = str.substring(str2.length());
        if (TextUtils.isEmpty(substring)) {
            return -1L;
        }
        try {
            long parseLong = Long.parseLong(substring);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A05(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (this.A00) {
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "lMaXHRAU";
            strArr2[1] = "QM70xrbmIGMjqTbaypH7CHN9HGfK3S";
            String A01 = A01(40, 17, 17);
            if (str.startsWith(A01)) {
                this.A01.A0H(A00(str, A01));
                return;
            }
            String A012 = A01(0, 22, 46);
            if (str.startsWith(A012)) {
                this.A01.A0F(A00(str, A012));
                return;
            }
            String A013 = A01(22, 18, 110);
            if (!str.startsWith(A013)) {
                return;
            }
            this.A01.A0G(A00(str, A013));
        }
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
