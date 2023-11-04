package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class IL {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{123, 126, airhockey.J_DISCONNECT, 109, airhockey.P_GAME_STANDBY, 123, airhockey.J_DISCONNECT, 126, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, 126, airhockey.P_GAME_STANDBY, 123, airhockey.J_REWARD, airhockey.J_REWARD, airhockey.J_ERROR, 109, airhockey.P_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, 123, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_STANDBY, airhockey.J_WAIT, airhockey.J_ERROR, airhockey.J_DISCONNECT, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_INVITE, airhockey.P_GAME_STANDBY, 109, airhockey.J_ENEMYLOSE, 123, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, airhockey.P_GAME_STANDBY, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, 123, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, airhockey.J_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, 90, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SDKVER, 119, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, 90, 96, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, 96, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 90, airhockey.J_ONREWARDED, airhockey.J_ERROR, airhockey.J_ERROR, 90, airhockey.J_ENEMYWIN, 119, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_REWARD, 96, 119, 90, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, 96, 90, 102, 109, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_REWARD, 96, 119, 119, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SDKVER, airhockey.P_GAME_REMATCH, 119, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, 119, airhockey.J_DISCONNECT, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_REMATCH, 119, 102, 102, airhockey.P_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_SDKVER, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.P_GAME_REMATCH, airhockey.J_ACHIEVEMENTCALLBACK, 119, 96, ByteCompanionObject.MAX_VALUE, airhockey.J_BACK, 119, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, 96, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_SAVE, 91, airhockey.J_GAME_STANDBY, airhockey.J_GAME_EXIT, 96, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, 109, 96, 91, 109, airhockey.J_GAME_STANDBY, 102, 91, 109, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SDKVER, 91, 102, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_SAVE, 119, 109, airhockey.J_GAME_EXIT, 99, 91, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, airhockey.J_GAME_STANDBY, 102, 109, airhockey.J_ENEMYLOSE, 109, airhockey.J_GOO, 109, airhockey.J_SDKVER, 119, 76, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYSCORE, 90, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 76, 79, 65, airhockey.P_GAME_MYLOSE, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_SELECTMAP, 76, 79};
    }

    public static boolean A02(Context context) {
        return IK.A0P(context).A2N(A00(0, 47, 108), true);
    }

    public static boolean A03(Context context) {
        return IK.A0P(context).A2N(A00(47, 47, 115), false);
    }

    public static boolean A04(Context context) {
        return IK.A0P(context).A2N(A00(139, 46, 114), false);
    }

    public static boolean A05(Context context) {
        return Build.VERSION.SDK_INT >= 19 && IK.A0P(context).A2N(A00(185, 15, 91), false);
    }

    public static boolean A06(Context context) {
        return IK.A0P(context).A2N(A00(94, 45, 96), false);
    }
}
