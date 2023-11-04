package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8J */
/* loaded from: assets/audience_network.dex */
public final class C8J {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, airhockey.J_REWARD, airhockey.J_ENEMYWIN, airhockey.J_ENEMYWIN, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_RELOAD, 27, 10, 10, 12, 31, 8, 9, 14, 25, 2, 8, 0, 9, 47, 45, 38, 39, 46, 15, 19, 53, 41, 44, 63, 40, 41, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_GAME_EXIT, 126, 119, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, 111, 126, airhockey.J_ENEMYLOSE, 126, 126, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, 51, 60, 54, 32, 61, 59, 54};
    }

    public static synchronized Map<String, String> A01(C7N c7n) {
        synchronized (C8J.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            A00 = new HashMap<>();
            A00.put(A00(22, 6, 41), c7n.getPackageName());
            A02(c7n, A00);
            return new HashMap(A00);
        }
    }

    public static synchronized Map<String, String> A02(C7N c7n, Map<String, String> map) {
        synchronized (C8J.class) {
            map.put(A00(41, 3, 83), A00(65, 7, 55));
            map.put(A00(44, 11, 68), c7n.A04().A80());
            map.put(A00(33, 2, 37), c7n.A04().A7z());
            map.put(A00(35, 6, 31), AnonymousClass82.A03);
            AnonymousClass82 anonymousClass82 = new AnonymousClass82(c7n);
            map.put(A00(15, 7, 63), anonymousClass82.A06());
            map.put(A00(8, 7, 82), anonymousClass82.A05());
            map.put(A00(0, 8, 27), String.valueOf(anonymousClass82.A04()));
            map.put(A00(28, 5, 7), anonymousClass82.A0A());
            map.put(A00(55, 10, 72), c7n.A08().A02());
        }
        return map;
    }
}
