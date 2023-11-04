package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.al */
/* loaded from: assets/audience_network.dex */
public enum EnumC1002al {
    A02,
    A05,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{124, airhockey.J_BACK, airhockey.J_GAME_EXIT, 124, airhockey.J_ONREWARDED, airhockey.J_INVITE, 21, 25, 1, 26, 29, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, airhockey.J_DISCONNECT, 111, airhockey.J_GAME_EXIT, 111, airhockey.J_INVITE, airhockey.J_REWARD, 111};
    }

    static {
        A01();
    }
}
