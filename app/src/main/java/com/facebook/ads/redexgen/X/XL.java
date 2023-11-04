package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class XL implements K7 {
    public static byte[] A01;
    public final /* synthetic */ C0886Xb A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.P_GAME_SELECTMAP, 64, airhockey.P_GAME_MYSCORE, 119, 102, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, 76, airhockey.J_ENEMYWIN, airhockey.J_REWARD, airhockey.J_ERROR, 109, airhockey.J_GOO, airhockey.J_GAME_REMATCH, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, airhockey.J_PURCHASE, 63, 40, 40, 53, 40, airhockey.J_DISCONNECT, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, 123, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_STANDBY, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, airhockey.J_REWARD, 126};
    }

    public XL(C0886Xb c0886Xb) {
        this.A00 = c0886Xb;
    }

    @Override // com.facebook.ads.redexgen.X.K7
    public final void A94(int i, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A07().A9C(A00(34, 12, 21), i, new C02637t(th));
    }
}
