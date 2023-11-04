package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0k */
/* loaded from: assets/audience_network.dex */
public final class C00860k {
    public static byte[] A06;
    public static String[] A07 = {"DvSn6PhmC3i7LdpG0vBUuRZmjagS5as7", "VQCZ7hz", "zA4klKNJM0QxWDxEFTSTi5yKhMV68", "2vimyyNbMv6AohadWhJSDQSQPpWOARjH", "MVolmMMkLKfWmTv", "tHNO368kkNAVpLeIneqpL6ODf8V7me71", "x8Jgc8MGjZsmc", "KvaBSJwcdZeuQnxX6yqoEJJZ8c4KCJ2u"};
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C00860k A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A01(50, 7, 38));
        String optString2 = jSONObject.optString(A01(0, 7, 110));
        String optString3 = jSONObject.optString(A01(7, 11, 76));
        JSONArray optJSONArray = jSONObject.optJSONArray(A01(30, 10, 34));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
                if (A07[5].charAt(9) != 'N') {
                    throw new RuntimeException();
                }
                A07[2] = "wfKFQtpS7p7Zsd7MRi5uYuHrlLf6T";
            }
        }
        return new C00860k(optString, optString2, optString3, arrayList, jSONObject.optString(A01(40, 10, 91)), jSONObject.optString(A01(18, 12, 12)));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{airhockey.P_GAME_MYSCORE, 82, 82, 81, 75, 86, airhockey.P_GAME_MYWIN, airhockey.J_SDKVER, airhockey.J_GOO, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_GAME_STANDBY, 95, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_DISCONNECT, 38, 33, 44, 44, 34, 33, 35, 43, 31, 53, 50, 44, 5, 11, 23, 49, 6, 15, 29, 6, 11, 29, airhockey.J_PURCHASE, airhockey.J_REWARD, airhockey.J_GAME_STANDBY, 124, airhockey.J_SAVEDGAME_RELOAD, 99, airhockey.P_GAME_MYLOSE, airhockey.J_NATION, airhockey.J_GAME_STANDBY, 126, 26, 11, 9, 1, 11, 13, 15};
    }

    static {
        A02();
    }

    public C00860k(String str, String str2, String str3, List<String> mKeyHashes, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = mKeyHashes;
        this.A03 = str4;
        this.A02 = str5;
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A04;
    }
}
