package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.13 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass13 {
    public static byte[] A00;
    public static String[] A01 = {"qHmRz", "buvn2cesYrN8zmkoMAJdpkbnyQRY3iAF", "x7vS8I9TWcDRkC3QyQGWlMzhObF4g2wW", "AIjy2jeTbkREqnWnmOA9dVfWABJZ", "IfUpOWHYsX9n2UOxpamTmBNI3XVXxi7a", "s9Ktc", "3piv7SWQV7vtTtwTZRFeo4G9v1NaSSob", "iW7v8IxehIW1LC67DBoujqNPrB3dw9pM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AnonymousClass11 A01(C0887Xc c0887Xc, JSONObject jSONObject, String str, boolean z, int i, int i2) {
        ArrayList arrayList;
        if (jSONObject == null) {
            return new AnonymousClass11();
        }
        KZ.A02(c0887Xc, A02(0, 23, 77));
        String optString = jSONObject.optString(A02(371, 10, 84));
        int optInt = jSONObject.optInt(A02(116, 12, 73), 0);
        String optString2 = jSONObject.optString(A02(253, 13, 84));
        String A02 = C0568Kq.A02(jSONObject, A02(266, 12, 117));
        Uri A002 = TextUtils.isEmpty(A02) ? null : KT.A00(A02);
        String A022 = C0568Kq.A02(jSONObject, A02(128, 4, 27));
        String A012 = L5.A01(A022);
        String A023 = C0568Kq.A02(jSONObject, A02(101, 15, 115));
        String A024 = C0568Kq.A02(jSONObject, A02(485, 5, 93));
        String A025 = C0568Kq.A02(jSONObject, A02(477, 8, 5));
        String A026 = C0568Kq.A02(jSONObject, A02(278, 8, 19));
        String A027 = C0568Kq.A02(jSONObject, A02(431, 14, 38));
        String A028 = C0568Kq.A02(jSONObject, A02(295, 16, 116));
        String A029 = C0568Kq.A02(jSONObject, A02(445, 21, 93));
        String A0210 = C0568Kq.A02(jSONObject, A02(87, 14, 42));
        String A0211 = C0568Kq.A02(jSONObject, A02(351, 20, 77));
        String A0212 = C0568Kq.A02(jSONObject, A02(335, 16, 70));
        String A0213 = C0568Kq.A02(jSONObject, A02(318, 17, 98));
        String A0214 = C0568Kq.A02(jSONObject, A02(132, 14, 22));
        C0428Ev A0215 = C0428Ev.A02(jSONObject, c0887Xc);
        C0529Iy A003 = C0529Iy.A00(jSONObject.optJSONObject(A02(286, 4, 64)));
        C0529Iy A004 = C0529Iy.A00(jSONObject.optJSONObject(A02(290, 5, 93)));
        C0530Iz A005 = C0530Iz.A00(jSONObject.optJSONObject(A02(466, 11, 125)));
        String A0216 = C0568Kq.A02(jSONObject, A02(490, 15, 84));
        boolean optBoolean = jSONObject.optBoolean(A02(238, 15, 6));
        boolean optBoolean2 = jSONObject.optBoolean(A02(219, 19, 21));
        int optInt2 = jSONObject.optInt(A02(HttpStatus.SC_NOT_ACCEPTABLE, 25, 21), 4);
        int optInt3 = jSONObject.optInt(A02(381, 25, 112), 0);
        int optInt4 = jSONObject.optInt(A02(569, 31, 30), 0);
        int optInt5 = jSONObject.optInt(A02(600, 26, 108), 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(53, 15, 6));
        C0529Iy A006 = optJSONObject != null ? C0529Iy.A00(optJSONObject) : null;
        String A0217 = C0568Kq.A02(jSONObject, A02(68, 19, 17));
        EnumC00830h A007 = C00850j.A00(jSONObject);
        Collection<String> A03 = C00850j.A03(c0887Xc, jSONObject);
        String A0218 = C0568Kq.A02(jSONObject, A02(560, 9, 56));
        long optLong = jSONObject.optLong(A02(536, 24, 95), -1L);
        String A0219 = C0568Kq.A02(jSONObject, A02(527, 9, 77));
        String A0220 = A02(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 22, 61);
        J3 j3 = !jSONObject.has(A0220) ? J3.A03 : jSONObject.optBoolean(A0220) ? J3.A05 : J3.A04;
        boolean optBoolean3 = jSONObject.optBoolean(A02(190, 29, 72));
        int optInt6 = jSONObject.optInt(A02(154, 36, 110), 100);
        ArrayList arrayList2 = null;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(A02(146, 8, 0));
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                arrayList = null;
            } else {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        arrayList.add(A01(c0887Xc, optJSONArray.getJSONObject(i3), str, true, i3, length));
                    } catch (JSONException e) {
                        e = e;
                        if (A01[6].charAt(19) != 'e') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A01;
                        strArr[0] = "nA4Cb";
                        strArr[5] = "npWbY";
                        arrayList2 = arrayList;
                        c0887Xc.A07().A9C(A02(311, 7, 91), C02627s.A29, new C02637t(e));
                        Log.e(C0967a7.A0C, A02(23, 30, 50), e);
                        return new AnonymousClass11(A0217, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A006, A0215, A003, A004, A005, A0218, A0219, optLong, j3, z, i, i2, arrayList2, str, optString, optInt, optString2, A002, A0216, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A007, A03, optInt6, optBoolean3);
                    }
                }
            }
            arrayList2 = arrayList;
        } catch (JSONException e2) {
            e = e2;
        }
        return new AnonymousClass11(A0217, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A006, A0215, A003, A004, A005, A0218, A0219, optLong, j3, z, i, i2, arrayList2, str, optString, optInt, optString2, A002, A0216, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A007, A03, optInt6, optBoolean3);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, 50, 33, 38, 34, 43, 32, 34, -35, 11, 34, 49, 52, 44, 47, 40, -35, 9, 44, 30, 33, 34, 33, -9, 16, 3, 4, 14, 7, -62, 22, 17, -62, 18, 3, 20, 21, 7, -62, 5, 3, 20, 17, 23, 21, 7, 14, -62, 6, 3, 22, 3, -48, -41, -38, -43, -39, -34, -27, -33, -39, -37, -23, -43, -33, -39, -27, -28, -30, -27, -32, -28, -23, -16, -22, -28, -26, -12, -32, -19, -22, -17, -20, -32, -10, -13, -19, -5, -2, -7, 14, 12, -5, 8, 13, 6, -5, 14, 3, 9, 8, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, 89, airhockey.P_GAME_MYLOSE, 85, 87, 76, 86, airhockey.P_GAME_MYLOSE, 85, airhockey.P_NATION, 81, airhockey.P_GAME_SELECTMAP, 80, airhockey.P_GAME_MYLOSE, 26, 39, 24, 37, 40, 32, 40, 24, 45, 50, 41, 30, -19, -6, -17, 4, -23, -25, -14, -14, -27, -6, -11, -27, -25, -23, -6, -17, -11, -12, -45, -47, -30, -33, -27, -29, -43, -36, 65, 77, 76, 82, 63, airhockey.P_GAME_MYWIN, 76, airhockey.P_GAME_MYSCORE, 80, 61, 84, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYSCORE, 85, 63, 64, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 82, 87, 61, 65, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYSCORE, 65, airhockey.P_GAME_REMATCH, 61, airhockey.P_GAME_MYWIN, 76, 82, airhockey.P_GAME_MYSCORE, 80, 84, 63, airhockey.P_GAME_EXIT, 27, 39, 38, 44, 25, 33, 38, 29, 42, 23, 46, 33, 29, 47, 25, 26, 33, 36, 33, 44, 49, 23, 29, 38, 25, 26, 36, 29, 28, -22, -13, -26, -25, -15, -22, -28, -8, -13, -26, -11, -8, -19, -12, -7, -28, -15, -12, -20, -37, -28, -41, -40, -30, -37, -43, -20, -33, -37, -19, -43, -30, -27, -35, 41, 50, 39, 54, 61, 52, 56, 41, 40, 35, 39, 52, 49, 75, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 84, 82, 82, airhockey.P_GAME_BREAKBALLCOUNT, 83, airhockey.P_GAME_REMATCH, -21, -24, -28, -25, -17, -20, -15, -24, 25, 19, 31, 30, 54, 58, 46, 52, 50, 80, 77, 82, 79, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 87, airhockey.P_GAME_MYWIN, 86, 77, 84, 88, 77, 83, 82, 59, 44, 61, 62, 52, 57, 50, airhockey.P_NATION, 51, airhockey.P_GAME_MYWIN, airhockey.P_GAME_STANDBY, 55, 49, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 51, 64, airhockey.P_GAME_STANDBY, 62, 51, airhockey.P_GAME_BREAKBALLCOUNT, 59, 65, 64, 38, 34, 23, 47, 21, 42, 40, 23, 36, 41, 34, 23, 42, 31, 37, 36, 45, 47, 44, 42, 44, 49, 34, 33, 28, 49, 47, 30, 43, 48, 41, 30, 49, 38, 44, 43, 54, 41, 53, 57, 41, 55, 56, 35, 45, 40, 83, 78, 65, 80, 83, airhockey.P_GAME_MYLOSE, 79, 84, 63, airhockey.P_GAME_MYSCORE, 79, 77, 80, 82, airhockey.P_GAME_STANDBY, 83, 83, 63, 81, 85, 65, 76, airhockey.P_GAME_REMATCH, 84, 89, -8, -13, -26, -11, -8, -19, -12, -7, -28, -15, -12, -20, -28, -23, -22, -15, -26, -2, -28, -8, -22, -24, -12, -13, -23, 9, 5, -7, -1, -9, 2, -11, -7, 5, 4, 10, -5, 14, 10, 64, 61, 60, 59, 64, 60, 63, 50, 49, 44, 65, 63, 46, 59, 64, 57, 46, 65, 54, 60, 59, 96, airhockey.J_SDKVER, 78, 95, 76, 95, 78, airhockey.J_SDKVER, 86, 91, 84, -24, -22, -41, -23, -34, -23, -31, -38, 65, 54, 65, 57, 50, 57, 55, 41, 40, 35, 54, 41, 52, 51, 54, 56, 35, 57, 54, 48, 35, 22, 17, 18, 28, 12, 14, 34, 33, 28, 29, 25, 14, 38, 12, 18, 27, 14, 15, 25, 18, 17, 51, 38, 33, 34, 44, 28, 42, 45, 33, airhockey.P_GAME_STANDBY, 56, 51, 52, 62, 46, 63, 65, 52, 59, 62, 48, 51, 46, airhockey.P_NATION, 56, airhockey.P_GAME_REMATCH, 52, 46, 49, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 52, airhockey.P_NATION, 30, 17, 12, 13, 23, 7, 29, 26, 20, 4, -9, -13, 5, -17, -16, -9, -6, -9, 2, 7, -19, -15, -10, -13, -15, -7, -19, -9, -4, -9, 2, -9, -17, -6, -19, -14, -13, -6, -17, 7, 82, airhockey.P_GAME_STANDBY, 65, 83, 61, 62, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, 80, 85, 59, 63, airhockey.P_GAME_SELECTMAP, 65, 63, airhockey.P_GAME_MYWIN, 59, airhockey.P_GAME_STANDBY, airhockey.P_GAME_EXIT, 80, 65, 78, 82, 61, airhockey.P_GAME_MYLOSE};
        String[] strArr = A01;
        if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aYUm7";
        strArr2[5] = "aSssW";
    }

    static {
        A03();
    }

    public static AnonymousClass11 A00(C0887Xc c0887Xc, JSONObject jSONObject, String str) {
        return A01(c0887Xc, jSONObject, str, false, -1, 0);
    }
}
