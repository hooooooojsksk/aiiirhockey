package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.10 */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass10 {
    A04(A00(37, 9, 87)),
    A06(A00(65, 9, 105)),
    A05(A00(46, 19, 116));
    
    public static byte[] A01;
    public static String[] A02 = {"YotGzB", "vsIS7NXYgiAbF4rLaahac", "Gskj2bStDtfNdzDdRe0hP24NDR2IpNEh", "oK8ItqR6UoxvIOFM7x85SOaiyNHULhPY", "o1G33SUpx5mnfpgWjDd1nYNG2RlEgzpj", "XWwbNlOGXItiEE2sGKxxfB9q5lH48KSv", "87nuLIKIZqBBcXVSFSOV", "vURZxB8V7SUFjdRy9aiCBcJV1"};
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, airhockey.J_DISCONNECT, 99, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, 99, 96, airhockey.J_INVITE, airhockey.J_ENEMYWIN, 125, 124, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, airhockey.J_GAME_STANDBY, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, 119, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, 124, 102, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_NATION, airhockey.J_INVITE, airhockey.J_GOO, 124, airhockey.J_BACK, airhockey.J_BACK, 0, 23, 0, 8, 13, 0, 3, 13, 4, 44, 45, 29, 44, 35, 54, 43, 52, 39, 29, 35, 38, 29, 46, 35, 59, 45, 55, 54, 43, 48, 48, 0, 44, 50, 62, 51, 51};
        if (A02[3].charAt(28) != 'L') {
            throw new RuntimeException();
        }
        A02[6] = "yw";
    }

    static {
        A01();
    }

    AnonymousClass10(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
