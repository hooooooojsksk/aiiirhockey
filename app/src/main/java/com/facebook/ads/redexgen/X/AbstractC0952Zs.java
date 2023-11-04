package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zs */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0952Zs extends C1B implements Serializable {
    public static JSONObject A0D = null;
    public static byte[] A0E = null;
    public static String[] A0F = {"1gqRR9im7tmNjhPy8NnQpjCX4rd8Ielc", "ZkOx7RNEMabKvQ7fgN15WIbWDw11JZFu", "ifeh8sROmLFDdOYqa0sy0eFfj5RHH1gU", "fnDzwAhU6GMUs0cCq2fTQuWEzv5lBJki", "OVtNfYqIZ80xqW4zrHdkYxbTKYgYXHc", "chIpxbYwiAOd1RIHlv8aEwW7ihQHRwI", "GnSiEcQE", "uApEYGhuY9oy1RN675k2bDQ9FUD4oA7y"};
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass18 A05;
    public C1S A06;
    public C1V A07;
    public C01021b A08;
    public String A09;
    public final List<C1C> A0B;
    public boolean A0A = false;
    public final Map<String, String> A0C = new HashMap();

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0F;
        if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
            throw new RuntimeException();
        }
        A0F[5] = "bfB1pGz3pHLReaUGKuLSmGsyYLYBAtW";
        A0E = new byte[]{40, 45, 22, 42, 33, 38, 32, 42, 44, 58, 22, 37, 32, 39, 34, 22, 60, 59, 37, airhockey.J_REWARD, airhockey.J_WAIT, airhockey.P_GAME_MYLOSE, 123, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GOO, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_MYLOSE, 99, airhockey.J_INVITE, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, 81, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 95, 83, 92, 89, 83, 91, 111, 83, 95, airhockey.P_GAME_STANDBY, 94, airhockey.P_GAME_SELECTMAP, 84, 95, airhockey.P_GAME_MYWIN, 94, 111, airhockey.P_GAME_SELECTMAP, 89, 93, 85, 89, 77, 76, 87, 91, 84, 81, 91, 83, airhockey.J_ENEMYWIN, 91, 76, 89, airhockey.J_ENEMYWIN, 76, 81, 85, 93, 37, 49, 48, 43, 39, 40, 45, 39, 47, 27, 34, 40, 37, 50, 43, 54, 0, 2, 0, 11, 6, 60, 2, 16, 16, 6, 23, 16, 34, 32, 51, 46, 52, 50, 36, 45, 9, 2, 11, 3, 4, 53, 11, 14, 25, 53, 12, 24, 15, 27, 31, 15, 4, 9, 19, 102, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, 43, 99, airhockey.J_ONREWARDED, 102, 96, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_INVITE, 43, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_REWARD, 43, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 96, 119, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, 43, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_REWARD, 109, 90, airhockey.J_ONREWARDED, 102, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, 124, 81, airhockey.P_GAME_BREAKBALLCOUNT, 35, 52, 43, 24, 38, 55, 55, 24, 37, 40, 50, 41, 35, 24, 50, 53, 43, 52, 93, 87, 91, 90, 10, 13, 23, 6, 17, 16, 23, 10, 23, 10, 2, 15, 40, 37, 42, 32, 55, 39, 37, 52, 33, 94, 83, 75, 93, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 82, 77, 80, 86, 80, airhockey.P_GAME_MYSCORE, 75, 86, 87, 64, 82, airhockey.P_GAME_SELECTMAP, 87, 65, 64, 65, airhockey.J_PURCHASE, 83, 76, 65, 64, airhockey.P_GAME_EXIT, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_ENEMYLOSE, airhockey.J_GOO, airhockey.J_WAIT, 53, 50, 44};
    }

    static {
        A08();
    }

    public AbstractC0952Zs(List<C1C> list) {
        this.A0B = list;
    }

    private HashMap<String, String> A06(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(175, 18, 123));
        HashMap<String, String> hashMap = new HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                hashMap.put(next, optJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static List<C1C> A07(JSONObject jSONObject, C0887Xc c0887Xc, C1O c1o) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A05(101, 8, 125));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return C1K.A01(optJSONArray, jSONObject, c0887Xc, c1o);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1C A00 = C1C.A00(jSONObject);
        c1o.A3C(A00, jSONObject);
        adInfoList.add(A00);
        return adInfoList;
    }

    private void A09(int i) {
        this.A00 = i;
    }

    private final void A0A(int i) {
        this.A04 = i;
    }

    private void A0B(AnonymousClass18 anonymousClass18) {
        this.A05 = anonymousClass18;
    }

    private void A0C(C1S c1s) {
        this.A06 = c1s;
    }

    private final void A0D(C1V c1v) {
        this.A07 = c1v;
    }

    private void A0E(C01021b c01021b) {
        this.A08 = c01021b;
    }

    private void A0F(String str) {
        this.A09 = str;
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

    public final int A0e() {
        return this.A03;
    }

    public final int A0f() {
        return this.A04;
    }

    public final AnonymousClass18 A0g() {
        return this.A05;
    }

    public final C1C A0h() {
        return this.A0B.get(0);
    }

    @Nullable
    public final C1C A0i(int i) {
        if (i < 0 || i >= this.A0B.size()) {
            return null;
        }
        return this.A0B.get(i);
    }

    public final C1S A0j() {
        return this.A06;
    }

    public final C1V A0k() {
        return this.A07;
    }

    public final C01021b A0l() {
        return this.A08;
    }

    public final String A0m() {
        return this.A09;
    }

    @Nullable
    public final String A0n(String str) {
        return this.A0C.get(str);
    }

    public final List<C1C> A0o() {
        return Collections.unmodifiableList(this.A0B);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0p(com.facebook.ads.redexgen.X.InterfaceC0587Lj r9) {
        /*
            r8 = this;
            java.lang.String r4 = r8.A0K()
            int r1 = r4.hashCode()
            r0 = -1364000502(0xffffffffaeb3010a, float:-8.140162E-11)
            r3 = 1
            if (r1 == r0) goto L62
            r0 = 604727084(0x240b672c, float:3.022821E-17)
            if (r1 == r0) goto L30
        L13:
            r0 = -1
        L14:
            if (r0 == 0) goto L19
            if (r0 == r3) goto L26
        L18:
            return
        L19:
            r2 = 128(0x80, float:1.8E-43)
            r1 = 45
            r0 = 57
            java.lang.String r0 = A05(r2, r1, r0)
            r9.A3t(r0)
        L26:
            com.facebook.ads.redexgen.X.PN r0 = com.facebook.ads.redexgen.X.PN.A08
            java.lang.String r0 = r0.A02()
            r9.A3t(r0)
            goto L18
        L30:
            r7 = 197(0xc5, float:2.76E-43)
            r6 = 12
            r5 = 95
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC0952Zs.A0F
            r0 = 2
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC0952Zs.A0F
            java.lang.String r1 = "ynfghRupyY8lJ5WDqUPqAC0JO3E4ojqs"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "OEwRxUcpVPGJQFz3LRrAkRkf0LWdVsmf"
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = A05(r7, r6, r5)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L13
            r0 = 0
            goto L14
        L62:
            r2 = 232(0xe8, float:3.25E-43)
            r1 = 14
            r0 = 25
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L74:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0952Zs.A0p(com.facebook.ads.redexgen.X.Lj):void");
    }

    public final void A0q(JSONObject jSONObject) {
        String A05;
        JSONObject layoutObject;
        A0D = jSONObject.optJSONObject(A05(89, 12, 95));
        C1U A06 = new C1U().A06(jSONObject.optString(A05(246, 5, 32)));
        String A052 = A05(193, 4, 8);
        if (jSONObject.optJSONObject(A052) != null) {
            A05 = jSONObject.optJSONObject(A052).optString(A05(251, 3, 124));
        } else {
            A05 = A05(0, 0, 70);
        }
        A0D(A06.A05(A05).A04(jSONObject.optString(A05(0, 19, 117))).A07(C1W.A03(jSONObject)).A08());
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(218, 6, 14));
        if (optJSONObject != null) {
            String A053 = A05(224, 8, 30);
            if (A0F[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[2] = "L9OC0yGJthGch16tOTqUcqcE9MnsMaz6";
            strArr[1] = "n6CgIEssquLp46jPM2UWfBhL1rINMjIc";
            layoutObject = optJSONObject.optJSONObject(A053);
        } else {
            layoutObject = null;
        }
        A0B(new AnonymousClass18(C1L.A01(layoutObject), C1L.A01(optJSONObject != null ? optJSONObject.optJSONObject(A05(209, 9, 120)) : null)));
        A0E(C1W.A01(jSONObject));
        A0C(C1W.A00(jSONObject));
        A09(jSONObject.optInt(A05(19, 12, 43), 0));
        A0A(jSONObject.optInt(A05(109, 19, 86), -1));
        this.A0C.putAll(A06(jSONObject));
        this.A03 = jSONObject.optInt(A05(55, 18, 4), 0);
        this.A01 = jSONObject.optInt(A05(73, 16, 120), 1);
        this.A02 = jSONObject.optInt(A05(31, 24, 12), this.A03);
        A0F(jSONObject.optString(A05(173, 2, 14)));
        A0U(jSONObject);
    }

    public final void A0r(boolean z) {
        this.A0A = z;
    }

    public final boolean A0s() {
        return this.A0A;
    }
}
