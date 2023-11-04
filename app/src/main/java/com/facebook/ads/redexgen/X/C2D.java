package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.adreportingconfig.AdReportingReason;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.2D */
/* loaded from: assets/audience_network.dex */
public final class C2D {
    public static byte[] A01;
    public static String[] A02 = {"9okEwBsJnxm4XP2uMdCs1TTs0ipxbCrx", "KwR5WWC5sufK43WzM862skA54ooPALBv", "gy93sI55ZIYYvh5J8OUT9qm2p9", "dxYBmhUa98SUIpbIHX6MiqZ5bWUPty4B", "67xZp2aOxtSOd7RgrTL8HL2Ne7", "07dtCbgrw0W8dRsWClXlOnRD4KzojNVd", "fNc2y58JlCy0XZUWB5ryiRvO0DobwJiD", "gLrzPSgUGRY8V9c6gRfYWq9AMfEa3UYZ"};
    public static final String[] A03;
    public final C2J A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{-90, -45, -25, -8, -15, -90, -25, -22, -90, -25, -7, -90, -11, -20, -20, -21, -12, -7, -17, -4, -21, -90, -11, -8, -90, -17, -12, -25, -10, -10, -8, -11, -10, -8, -17, -25, -6, -21, -69, -34, -102, -30, -29, -34, -34, -33, -24, -88, -86, -51, -119, -37, -50, -39, -40, -37, -35, -50, -51, -105, 33, 62, airhockey.P_GAME_STANDBY, airhockey.P_GAME_REMATCH, -7, 78, 76, -7, 78, airhockey.P_GAME_MYWIN, 61, 62, 75, 76, 77, 58, airhockey.P_GAME_MYWIN, 61, -7, 80, 65, 58, 77, -7, airhockey.P_NATION, 76, -7, 65, 58, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, 62, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 64, 7, -7, 48, 65, 82, -7, 61, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, 0, 77, -7, 82, airhockey.P_GAME_MYLOSE, 78, -7, 80, 58, airhockey.P_GAME_MYWIN, 77, -7, 77, airhockey.P_GAME_MYLOSE, -7, 76, 62, 62, -7, 77, 65, airhockey.P_NATION, 76, 24, -54, -25, -18, -14, -94, -9, -11, -94, -9, -16, -26, -25, -12, -11, -10, -29, -16, -26, -94, -7, -22, -29, -10, -94, -21, -11, -94, -22, -29, -14, -14, -25, -16, -21, -16, -23, -80, -94, -39, -22, -5, -94, -21, -11, -94, -10, -22, -21, -11, -94, -21, -16, -29, -14, -14, -12, -15, -14, -12, -21, -29, -10, -25, -63, -61, -28, -33, -32, -101, -68, -33, 8, 28, 41, 28, 34, 32, -37, 28, 31, -37, 43, 45, 32, 33, 32, 45, 32, 41, 30, 32, 46, -72, -39, -118, -46, -45, -50, -49, -118, -53, -50, -118, -39, -38, -34, -45, -39, -40, -35, 19, 52, -27, 55, 42, 53, 52, 55, 57, -27, 38, 41, -27, 52, 53, 57, 46, 52, 51, 56, -37, -18, -7, -8, -5, -3, -87, -54, -19, -18, 0, 0, -69, 1, 0, 18, 0, 13, -69, -4, -1, 14, -69, 7, 4, 6, 0, -69, 15, 3, 4, 14, -56, -39, -22, -111, -46, -34, -111, -70, -111, -28, -42, -42, -38, -33, -40, -111, -27, -39, -38, -28, -80, 0, 22, 28, 25, -57, 26, 28, 9, 20, 16, 26, 26, 16, 22, 21, -57, 16, 26, -57, 21, 22, 30, -57, 9, 12, 16, 21, 14, -57, 25, 12, 29, 16, 12, 30, 12, 11, -43, -4, -2, -17, -14, -19, -15, -10, -3, -9, -15, -13, 1, -19, 3, 0, -9, -44, -39, -38, -35, -43, -29, -42, -33, -48, -39, -42, -46, -43, -38, -33, -40, 39, 44, 45, 48, 40, 54, 41, 50, 35, 51, 52, 56, 45, 51, 50, 55, 20, 23, 28, 23, 33, 22, 19, 18, 13, 18, 19, 33, 17, 32, 23, 30, 34, 23, 29, 28, 25, 28, 33, 28, 38, 27, 24, 23, 18, 27, 28, 23, 24, 18, 20, 23, 33, 36, 41, 36, 46, 35, 32, 31, 26, 45, 32, 43, 42, 45, 47, 26, 28, 31, -36, -35, -40, -39, -45, -43, -40, 49, 50, 45, 46, 40, 42, 45, 40, 45, 46, 60, 44, 59, 50, 57, 61, 50, 56, 55, 40, 41, 36, 37, 31, 33, 36, 31, 38, 47, 44, 44, 47, 55, 31, 53, 48, 31, 40, 37, 33, 36, 41, 46, 39, -26, -25, -30, -29, -35, -33, -30, -35, -19, -18, -14, -25, -19, -20, -15, airhockey.P_GAME_SELECTMAP, 57, 75, 76, 55, 77, airhockey.P_GAME_MYLOSE, 60, 57, 76, 61, 60, 55, 76, 65, airhockey.P_GAME_STANDBY, 61, 75, 76, 57, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, -28, -40, -27, -40, -34, -36, -42, -40, -37, -42, -25, -23, -36, -35, -36, -23, -36, -27, -38, -36, -22, 61, 49, 62, 49, 55, 53, 47, 49, 52, 47, 64, airhockey.P_NATION, 53, 54, 53, airhockey.P_NATION, 53, 62, 51, 53, airhockey.P_GAME_MYSCORE, 47, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 57, -11, -4, -13, -13, -16, -15, -11, -22, -16, -17, -32, -11, -26, -7, -11, airhockey.P_GAME_EXIT, 75, 79, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, 58, 81, 60, airhockey.P_GAME_MYWIN, 80, 64, 53, 40, 51, 50, 53, 55, 34, 36, 39, -38, -51, -40, -41, -38, -36, -57, -55, -52, -57, -52, -51, -37, -53, -38, -47, -40, -36, -47, -41, -42, 22, 9, 20, 19, 22, 24, 3, 5, 8, 3, 10, 19, 16, 16, 19, 27, 3, 25, 20, 3, 12, 9, 5, 8, 13, 18, 11, 7, -6, 5, 4, 7, 9, -12, -10, -7, -12, 4, 5, 9, -2, 4, 3, 8, -41, -54, -43, -44, -41, -39, -50, -45, -52, 75, 60, 77, 51, 53, 65, 51, 61, 51, airhockey.P_GAME_MYWIN, 57, 57, 61, airhockey.P_NATION, 59, 51, airhockey.P_GAME_MYLOSE, 60, 61, airhockey.P_GAME_MYWIN};
    }

    static {
        A06();
        A03 = new String[]{A02(452, 7, 20), A02(459, 19, 105), A02(478, 25, 96), A02(HttpStatus.SC_SERVICE_UNAVAILABLE, 15, 30), A02(613, 9, 99), A02(622, 21, 8), A02(643, 27, 68), A02(670, 17, 53), A02(540, 21, 23), A02(418, 16, 83), A02(434, 18, 91), A02(398, 20, 78), A02(696, 20, 116), A02(352, 14, 46), A02(561, 25, 112)};
    }

    public C2D(C2J c2j) {
        this.A00 = c2j;
    }

    private String A00() {
        return A03(A02(478, 25, 96), A02(60, 69, 121));
    }

    private String A01() {
        return A03(A02(643, 27, 68), A02(129, 64, 34));
    }

    private String A03(String str, String str2) {
        String A7o = this.A00.A7o(str, str2);
        if (A7o != null) {
            String value = A02(586, 4, 39);
            return A7o.equals(value) ? str2 : A7o;
        }
        return str2;
    }

    public static List<C2H> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(586, 4, 39))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        List<AdReportingReason> children = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            C2H c2h = new C2H(jSONObject.getInt(A02(601, 12, 123)), jSONObject.getString(A02(590, 11, 33)), jSONObject.optString(A02(366, 16, 17)));
            for (C2H c2h2 : A04(jSONObject.optString(A02(382, 16, 100)))) {
                c2h.A06(c2h2);
            }
            children.add(c2h);
            if (A02[0].charAt(8) == 'D') {
                throw new RuntimeException();
            }
            A02[1] = "UoOnH9Hv65m0hYQCpY1Dh";
        }
        return children;
    }

    @Nullable
    public static Map<String, String> A05(@Nullable String str) {
        String[] strArr;
        if (str == null || str.isEmpty() || str.equals(A02(350, 2, 65))) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (String str2 : A03) {
                if (!jSONObject.has(str2)) {
                    return null;
                }
                hashMap.put(str2, jSONObject.getString(str2));
            }
            if (A04(jSONObject.getString(A02(670, 17, 53))).size() == 0) {
                A08(C02627s.A27, new C02637t(A02(239, 20, 101)));
                return null;
            } else if (A04(jSONObject.getString(A02(HttpStatus.SC_SERVICE_UNAVAILABLE, 15, 30))).size() == 0) {
                A08(C02627s.A24, new C02637t(A02(221, 18, 10)));
                return null;
            } else {
                return hashMap;
            }
        } catch (JSONException e) {
            A08(C02627s.A26, new C02637t(e));
            return null;
        }
    }

    private final void A07() {
        C2I A5A = this.A00.A5A();
        A5A.ADj(A02(518, 22, 120), 0L);
        A5A.A3O();
    }

    public static void A08(int i, C02637t c02637t) {
        C0886Xb sdkContext = C7M.A00();
        if (sdkContext != null) {
            sdkContext.A07().A9C(A02(687, 9, 5), i, c02637t);
        }
    }

    public final long A09() {
        return this.A00.A71(A02(518, 22, 120), 0L);
    }

    public final C2H A0A() {
        C2H c2h = new C2H(A00());
        try {
            for (C2H hideAdParent : A04(A03(A02(HttpStatus.SC_SERVICE_UNAVAILABLE, 15, 30), A02(0, 0, 94)))) {
                c2h.A06(hideAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(C02627s.A25, new C02637t(e));
        }
        return c2h;
    }

    public final C2H A0B() {
        C2H c2h = new C2H(A01());
        try {
            for (C2H reportAdParent : A04(A03(A02(670, 17, 53), A02(0, 0, 94)))) {
                c2h.A06(reportAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(C02627s.A28, new C02637t(e));
        }
        return c2h;
    }

    public final String A0C() {
        return A03(A02(352, 14, 46), A02(0, 0, 94));
    }

    public final String A0D() {
        return A03(A02(398, 20, 78), A02(312, 38, 71));
    }

    public final String A0E() {
        return A03(A02(418, 16, 83), A02(38, 10, 26));
    }

    public final String A0F() {
        return A03(A02(434, 18, 91), A02(48, 12, 9));
    }

    public final String A0G() {
        return A03(A02(459, 19, 105), A02(268, 23, 59));
    }

    public final String A0H() {
        return A03(A02(452, 7, 20), A02(193, 7, 27));
    }

    public final String A0I() {
        return A03(A02(561, 25, 112), A02(0, 0, 94));
    }

    public final String A0J() {
        return A03(A02(540, 21, 23), A02(200, 21, 91));
    }

    public final String A0K() {
        return A03(A02(622, 21, 8), A02(0, 38, 38));
    }

    public final String A0L() {
        return A03(A02(613, 9, 99), A02(259, 9, 41));
    }

    public final String A0M() {
        return A03(A02(696, 20, 116), A02(291, 21, 17));
    }

    public final void A0N(@Nullable String str) {
        String[] strArr;
        Map<String, String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        C2I A5A = this.A00.A5A();
        for (String str2 : A03) {
            A5A.ADk(str2, A05.get(str2));
        }
        A5A.ADj(A02(518, 22, 120), System.currentTimeMillis());
        A5A.A3O();
    }

    public final boolean A0O(Context context, boolean z) {
        return (z || IK.A1y(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
