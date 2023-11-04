package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OZ {
    public static byte[] A00;
    public static String[] A01 = {"xPMOoUfbkmQ5kvnU3jbgLL47OcFEjU7z", "1dodMLotzUEJucQn2MWgY64F", "Ei0kY7ZOP", "czo3jP2JN", "", "hHdeWCinA2EaAz86iaUgwk6OrkZVXmHI", "CkfkaUvdCRi5J5AIUl6JSr62iIVQ3RiE", "AT3hLPm3hPYjZ73rxoY4ER"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static OY A00(C0887Xc c0887Xc, JSONObject jSONObject, C6M c6m, C0513Ii c0513Ii, O9 o9, boolean z) {
        boolean z2;
        String str;
        String str2;
        boolean z3 = z;
        String A012 = A01(142, 3, 82);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String optString = jSONObject.optString(A01(92, 26, 126));
        String optString2 = jSONObject.optString(A01(51, 41, 80));
        arrayList3.add(optString);
        arrayList3.add(optString2);
        if (z3) {
            str = c6m.A0R(optString);
            str2 = c6m.A0R(optString2);
            if (optString.equals(str) || optString2.equals(str2)) {
                z3 = false;
                z2 = false;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
            str = optString;
            str2 = optString2;
        }
        c0513Ii.A04(EnumC0512Ih.A0P, null);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(133, 4, 36));
            if (optJSONObject != null && optJSONObject.optString(A012) != null) {
                arrayList.add(optJSONObject.optString(A012));
                if (z2) {
                    optJSONObject.put(A012, c6m.A0Q(optJSONObject.optString(A012)));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(A01(118, 15, 1));
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString3 = optJSONArray.optString(i);
                    arrayList.add(optString3);
                    if (z2) {
                        optJSONArray.put(i, c6m.A0Q(optString3));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 26));
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i2), c6m, z2);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c6m, z2);
            }
        } catch (JSONException unused) {
            o9.A04(C02627s.A15, A01(0, 43, 79));
        }
        return new OY(jSONObject, str, str2, arrayList, arrayList2, arrayList3, z3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{airhockey.P_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_SAVEDGAME_RELOAD, 32, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, 102, 111, airhockey.J_SAVEDGAME_RELOAD, 109, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_ENEMYWIN, 32, airhockey.P_GAME_EXIT, 83, 79, 78, 32, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, 32, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.P_GAME_MYSCORE, airhockey.J_SDKVER, 99, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, 85, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, 54, 52, 39, 58, 32, 38, 48, 57, 123, 102, airhockey.J_BACK, 126, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_REWARD, 124, 64, airhockey.J_GAME_DISCONNECT, 123, airhockey.J_DISCONNECT, 64, airhockey.J_SAVEDGAME_SAVE, 126, 102, airhockey.J_PURCHASE, 109, 64, 124, airhockey.J_GOO, airhockey.J_SAVEDGAME_RELOAD, 111, 126, airhockey.J_BACK, airhockey.J_REWARD, airhockey.J_GOO, airhockey.J_BACK, 64, airhockey.J_GAME_REMATCH, airhockey.J_REWARD, airhockey.J_PURCHASE, airhockey.J_ENEMYLOSE, 64, 119, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 64, airhockey.J_GAME_EXIT, 109, airhockey.J_SAVEDGAME_SAVE, 85, airhockey.P_GAME_MYLOSE, 95, 80, 92, 88, 82, airhockey.J_INVITE, airhockey.P_NATION, 85, 90, airhockey.J_INVITE, 93, 80, airhockey.P_GAME_MYLOSE, 84, airhockey.P_GAME_MYSCORE, airhockey.J_INVITE, 89, airhockey.P_GAME_STANDBY, 92, 93, airhockey.J_INVITE, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 93, 43, 32, 42, 17, 45, 47, 60, 42, 17, 39, 35, 47, 41, 43, 61, 2, 8, 4, 5, 76, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, 64, airhockey.J_ENEMYLOSE, 111, airhockey.J_BACK, 21, 10, 7, 6, 12, 60, 22, 17, 15};
    }

    static {
        A02();
    }

    public static void A03(ArrayList<String> videoUrls, ArrayList<String> arrayList, JSONObject jSONObject, C6M c6m, boolean z) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(137, 5, 106));
        if (optJSONObject != null) {
            String A012 = A01(142, 3, 82);
            if (A01[1].length() == 1) {
                throw new RuntimeException();
            }
            A01[7] = "G1neCcMuoIIVUH8A2yIEObncf";
            if (optJSONObject.optString(A012) != null) {
                String optString = optJSONObject.optString(A012);
                videoUrls.add(optString);
                if (z) {
                    optJSONObject.put(A012, c6m.A0Q(optString));
                }
            }
        }
        String A013 = A01(145, 9, 44);
        if (!TextUtils.isEmpty(jSONObject.optString(A013))) {
            String optString2 = jSONObject.optString(A013);
            arrayList.add(optString2);
            if (z) {
                jSONObject.put(A013, c6m.A0R(optString2));
            }
        }
    }
}
