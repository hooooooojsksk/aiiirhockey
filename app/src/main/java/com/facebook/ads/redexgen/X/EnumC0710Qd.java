package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Qd */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC0710Qd {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC0710Qd[] A02;
    public static final EnumC0710Qd A03;
    public static final EnumC0710Qd A04;
    public static final EnumC0710Qd A05;
    public static final EnumC0710Qd A06;
    public static final EnumC0710Qd A07;
    public static final EnumC0710Qd A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, airhockey.J_INVITE, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, ByteCompanionObject.MAX_VALUE, -92, -86, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MIN_VALUE, 123, airhockey.J_WAIT, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, airhockey.J_ENEMYLOSE, -68, -63, -72, -83, airhockey.J_ENEMYLOSE, -73, -82, airhockey.J_ENEMYLOSE, -78, -69, -73, -74, airhockey.J_ENEMYLOSE, -73, -86, -78, -83, -85, -68, airhockey.J_ENEMYLOSE, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        A03 = new EnumC0710Qd(A02(0, 5, 105), 0) { // from class: com.facebook.ads.redexgen.X.HB
            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optJSONArray(i) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return C0711Qe.A01(jSONArray.optJSONArray(i), jSONArray2.optJSONArray(i));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return C0711Qe.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A04 = new EnumC0710Qd(A02(5, 7, 40), 1) { // from class: com.facebook.ads.redexgen.X.H6
            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optBoolean(i, true) == jSONArray.optBoolean(i, false);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optBoolean(i) == jSONArray2.optBoolean(i);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A05 = new EnumC0710Qd(A02(12, 6, 81), 2) { // from class: com.facebook.ads.redexgen.X.H0
            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, 0.0d) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) != jSONArray.optDouble(i, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optDouble(i) == jSONArray2.optDouble(i);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A06 = new EnumC0710Qd(A02(18, 3, 50), 3) { // from class: com.facebook.ads.redexgen.X.Gy
            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, 0.0d) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) == jSONArray.optDouble(i, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optInt(i) == jSONArray2.optInt(i);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A07 = new EnumC0710Qd(A02(21, 6, 18), 4) { // from class: com.facebook.ads.redexgen.X.Gu
            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optJSONObject(i) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return C0711Qe.A02(jSONArray.optJSONObject(i), jSONArray2.optJSONObject(i));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return C0711Qe.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A08 = new EnumC0710Qd(A02(27, 6, 36), 5) { // from class: com.facebook.ads.redexgen.X.Gr
            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optString(i) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optString(i).equals(jSONArray2.optString(i));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0710Qd
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = new EnumC0710Qd[]{A03, A04, A05, A06, A07, A08};
    }

    public EnumC0710Qd(String str, int i) {
        super(str, i);
    }

    public static EnumC0710Qd A00(JSONArray jSONArray, int i) {
        EnumC0710Qd[] values;
        for (EnumC0710Qd type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0710Qd A01(JSONObject jSONObject, String str) {
        EnumC0710Qd[] values;
        for (EnumC0710Qd enumC0710Qd : values()) {
            boolean A062 = enumC0710Qd.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return enumC0710Qd;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0710Qd valueOf(String str) {
        return (EnumC0710Qd) Enum.valueOf(EnumC0710Qd.class, str);
    }

    public static EnumC0710Qd[] values() {
        return (EnumC0710Qd[]) A02.clone();
    }
}
