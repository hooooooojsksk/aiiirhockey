package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zq */
/* loaded from: assets/audience_network.dex */
public final class C0950Zq extends C1B implements Serializable {
    public static byte[] A06 = null;
    public static String[] A07 = {"Y1a5U13ty71QFnyeZB3YxisAAvg7l3fM", "vP", "roZ2Db2w31DgWTY1oGehTdyGNewX8eXS", "I2NTYMYLYsNyCs0logd6ULXXnbjyHCad", "3brQnbpmNBxYuH5lF741sBi9dGi0pOZr", "3fAMLw4w5Yud0wL2utfDbR4mKZlWQuB2", "wSrWvvXZ9ekOd4qM7VWdouqMZx6NVgDc", "r9"};
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final String A04 = UUID.randomUUID().toString();
    public final List<C0427Eu> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "ksKrUe0otL7CQDvNz8iG7T5OcxZuVq1Y";
            strArr2[4] = "xaZ8PqWmutKQFInRkVw3BesrM2XhV7TN";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
            i4++;
        }
    }

    public static void A04() {
        A06 = new byte[]{-17, -14, 1, -7, -2, -9, -1, 4, -11, 6, -9, 8, -9, 3, 9, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.P_GAME_SELECTMAP, 76, 81, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, 86, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, 82, 88, 81, 87, 76, 81, airhockey.P_GAME_EXIT, 82, 87, 78, 77, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_EXIT, 77, 92, airhockey.P_GAME_MYLOSE, 86, airhockey.P_GAME_EXIT, airhockey.J_SDKVER, airhockey.P_GAME_MYLOSE, 77, 94, 91, airhockey.P_GAME_EXIT, 93, 82, 88, 87, airhockey.P_GAME_EXIT, 79, airhockey.P_GAME_MYLOSE, 80, 85, 76, 75, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYLOSE, 75, 90, airhockey.P_GAME_BREAKBALLCOUNT, 93, airhockey.P_GAME_MYLOSE, 89, 80, 76, 85, 91, -38, -29, -39, -44, -40, -42, -25, -39, -44, -42, -22, -23, -28, -44, -40, -31, -28, -24, -38, -44, -23, -34, -30, -38};
    }

    static {
        A04();
    }

    public C0950Zq(List<C0427Eu> list) {
        this.A05 = list;
    }

    public static C0950Zq A02(JSONObject jSONObject, C0887Xc c0887Xc) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A03(0, 3, 35));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(C0427Eu.A02(jSONArray.getJSONObject(i), c0887Xc));
        }
        C0950Zq c0950Zq = new C0950Zq(arrayList);
        JSONObject jSONObject2 = jSONObject.getJSONObject(A03(3, 12, 43));
        c0950Zq.A01 = jSONObject2.optInt(A03(15, 17, 120), arrayList.size());
        c0950Zq.A03 = jSONObject2.optInt(A03(32, 24, 126), 0);
        c0950Zq.A02 = jSONObject2.optInt(A03(75, 24, 10), 0);
        c0950Zq.A00 = jSONObject2.optInt(A03(56, 19, 124), 2);
        c0950Zq.A0U(jSONObject2);
        return c0950Zq;
    }

    @Override // com.facebook.ads.redexgen.X.C1B
    public final int A0C() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.C1B
    public final int A0D() {
        return this.A03 + this.A02;
    }

    public final int A0b() {
        return this.A00;
    }

    public final int A0c() {
        return this.A01;
    }

    public final int A0d() {
        return this.A02;
    }

    public final C0427Eu A0e(int i) {
        return this.A05.get(i);
    }

    public final String A0f() {
        return this.A04;
    }

    public final void A0g(int i) {
        this.A05.remove(i);
        this.A01--;
    }

    public final boolean A0h() {
        return this.A00 == 0;
    }
}
