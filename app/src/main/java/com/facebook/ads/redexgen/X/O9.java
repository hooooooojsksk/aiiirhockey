package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class O9 {
    public static byte[] A03;
    public static String[] A04 = {"fp2CaqTj", "LAEvMYTNrmfm1C97qtviMkf2yRu1DYDl", "t6JdD3of0IxrOsKa9BA81q59Uli9AsT8", "gJC7p3UN", "wkhfqpsDh9pZ7alJINp4k3fYjwmP5ybd", "PXJ05dfTFyjTm8LhPchB38r6NC9RTsQv", "bBNwT5q5CTYqEWiLjNbWq9cYv9", "kUvPfRU87m3C3sqCb"};
    public final int A00;
    public final String A01;
    public final String A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{37, 50, 45, 45, 14, 6, 6, 4, 19, 65, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_REWARD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_BACK, 52, 96, 123, 52, 119, 102, airhockey.J_BACK, airhockey.J_ERROR, 96, airhockey.J_BACK, 52, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_GOO, 125, 96, 125, 123, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, 93, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_RELOAD, 123, 89, 92, airhockey.J_ENEMYWIN, 91, airhockey.P_GAME_EXIT, 93, 89, 76, 81, 78, 93, airhockey.J_ENEMYWIN, 76, 65, airhockey.P_GAME_MYLOSE, 93, 12, 9, 50, 11, 2, 31, 0, 12, 25, 50, 25, 20, 29, 8, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, 82, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, 124, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ENEMYLOSE, 126, airhockey.J_WAIT, 82, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, 99, 124, 111, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, 99, 21, 10, 7, 6, 12};
    }

    static {
        A03();
    }

    public O9(String str, String str2, int i) {
        String A01;
        this.A02 = str;
        this.A00 = i;
        if (!TextUtils.isEmpty(str2)) {
            A01 = A01(91, 5, 62);
        } else {
            A01 = A01(86, 5, 91);
        }
        this.A01 = A01;
    }

    private C02637t A00(String str) {
        C02637t c02637t = new C02637t(str);
        c02637t.A05(A02());
        c02637t.A03(1);
        return c02637t;
    }

    private JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 48), this.A00);
            jSONObject.put(A01(70, 13, 80), this.A02);
            jSONObject.put(A01(40, 16, 101), this.A01);
        } catch (JSONException e) {
            Log.w(A01(0, 9, 60), A01(9, 31, 73), e);
        }
        return jSONObject;
    }

    public final void A04(int i, String str) {
        C0886Xb sdkContext = C7M.A00();
        if (sdkContext != null) {
            InterfaceC02617r A07 = sdkContext.A07();
            String[] strArr = A04;
            if (strArr[2].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            A04[1] = "oo4WYpYrHyZLXSXdo0EivsHVHotPm1t3";
            A07.A9C(A01(83, 3, 77), i, A00(str));
        }
    }
}
