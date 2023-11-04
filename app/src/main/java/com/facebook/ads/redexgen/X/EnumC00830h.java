package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.0h */
/* loaded from: assets/audience_network.dex */
public enum EnumC00830h {
    A03,
    A02,
    A04;
    
    public static byte[] A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{37, 34, 63, 56, 45, 32, 32, 41, 40, 37, 36, 37, 46, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_ENEMYWIN, airhockey.J_INVITE, 111};
    }

    static {
        A02();
    }

    public static EnumC00830h A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}
