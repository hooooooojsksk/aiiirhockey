package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Je */
/* loaded from: assets/audience_network.dex */
public final class C0534Je {
    public static C0534Je A00;
    public static byte[] A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0787Tc A01(C0887Xc c0887Xc, JSONObject jSONObject, long j) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(136, 10, 21)).getJSONObject(0);
        C8A c8a = new C8A(C8B.A00(jSONObject2.getJSONObject(A04(100, 10, 87))), jSONObject2.optString(A04(115, 14, 88)), jSONObject2.optString(A04(0, 19, 98)));
        String A04 = A04(26, 3, 57);
        if (jSONObject2.has(A04)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(A04);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                C0515Ik.A06(c0887Xc, jSONObject3, j, null);
                String optString = jSONObject3.optString(A04(19, 7, 39));
                String optString2 = jSONObject3.optString(A04(85, 15, 63));
                JSONObject optJSONObject = jSONObject3.optJSONObject(A04(63, 4, 116));
                JSONArray optJSONArray = jSONObject3.optJSONArray(A04(146, 8, 78));
                if (optJSONObject != null) {
                    c8a.A0A(new AnonymousClass88(optString, optString2, optJSONObject, optJSONArray));
                } else {
                    c0887Xc.A0E().A4c(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(67, 18, 82));
                }
            }
        }
        String A042 = A04(47, 12, 116);
        if (jSONObject2.has(A042)) {
            c8a.A0B(jSONObject2.getJSONObject(A042));
        }
        return new C0787Tc(c8a, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{airhockey.J_DISCONNECT, airhockey.J_BACK, airhockey.P_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, 124, 123, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_EXIT, airhockey.J_REWARD, airhockey.J_PURCHASE, 123, airhockey.J_SAVEDGAME_SAVE, 124, airhockey.J_SAVEDGAME_RELOAD, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, 23, 24, 41, 0, 23, 26, 31, 18, 23, 2, 31, 25, 24, 41, 3, 3, 31, 18, 96, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, airhockey.J_GAME_EXIT, 109, 92, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_NATION, airhockey.J_INVITE, airhockey.J_GOO, 23, 27, 16, 17, airhockey.J_ENEMYWIN, airhockey.J_NATION, 119, airhockey.J_NATION, 65, airhockey.P_GAME_SELECTMAP, 81, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_EXIT, airhockey.P_GAME_MYWIN, 79, 64, airhockey.P_GAME_BREAKBALLCOUNT, 81, 5, 76, 86, 5, 75, 80, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, 44, 41, 60, 41, 23, 37, 39, 44, 45, 36, 23, 60, 49, 56, 45, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, 78, airhockey.P_GAME_REMATCH, 84, airhockey.P_GAME_REMATCH, 79, 78, 84, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYSCORE, 94, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, airhockey.P_GAME_EXIT, 78, 91, 90, 93, airhockey.P_GAME_EXIT, airhockey.J_GOO, 76, 64, 65, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYLOSE, 8, 0, 22, 22, 4, 2, 0, 18, 14, 3, 1, 7, 15, 7, 12, 22, 17, 77, 75, 88, 90, 82, 92, 75, airhockey.P_GAME_EXIT, 89, 84, 93, airhockey.P_GAME_MYLOSE};
    }

    static {
        A05();
        A00 = new C0534Je();
    }

    public static synchronized C0534Je A00() {
        C0534Je c0534Je;
        synchronized (C0534Je.class) {
            c0534Je = A00;
        }
        return c0534Je;
    }

    private C0786Tb A02(JSONObject jSONObject) {
        return new C0786Tb(jSONObject.optString(A04(129, 7, 18), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), null);
    }

    private C0786Tb A03(JSONObject jSONObject) {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(136, 10, 21));
            JSONObject definition = placements.getJSONObject(0);
            C8B A002 = C8B.A00(definition.getJSONObject(A04(100, 10, 87)));
            String featureConfig = definition.optString(A04(115, 14, 88));
            return new C0786Tb(jSONObject.optString(A04(129, 7, 18), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), new C8A(A002, featureConfig, definition.optString(A04(0, 19, 98))));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final C0536Jg A06(C0887Xc c0887Xc, String str, long j) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(154, 4, 90));
            char c = 65535;
            int hashCode = optString.hashCode();
            String A04 = A04(110, 5, 70);
            if (hashCode != 96432) {
                if (hashCode == 96784904 && optString.equals(A04)) {
                    c = 1;
                }
            } else if (optString.equals(A04(26, 3, 57))) {
                c = 0;
            }
            if (c == 0) {
                return A01(c0887Xc, jSONObject, j);
            }
            if (c != 1) {
                JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                if (jsonResponse != null) {
                    return A02(jsonResponse);
                }
            } else {
                return A03(jSONObject);
            }
        }
        return new C0536Jg(EnumC0535Jf.A04);
    }
}
