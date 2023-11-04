package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Il */
/* loaded from: assets/audience_network.dex */
public final class C0516Il {
    public static byte[] A00;
    public static String[] A01 = {"8rCQ87LDNJC1DhxZ6fCr2sl9z", "5Hodpo98FOR", "IALBcgKUANLjYRQ96HtZ7fzkbeR9jBcx", "zTQAh3vDqOojvZYlgAqVeqBvFcLoF4J3", "z7HIEgV6NC3", "WxYOl0mgWg7jzfrY8MiYRxzCEbOVsE5E", "Fx", "GTrmlcJrnfi84XLQulxC5fcTBIr6OicG"};
    public static final String A02;
    public static final Map<String, Integer> A03;
    public static final AtomicInteger A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{57, 43, 89, airhockey.J_GOO, -126, 43, -127, airhockey.J_GAME_DISCONNECT, 119, ByteCompanionObject.MIN_VALUE, airhockey.J_GOO, airhockey.P_GAME_STANDBY, 43, 96, 111, 87, 124, -122, -125, airhockey.J_DISCONNECT, -121, airhockey.J_REWARD, 123, 124, -127, airhockey.J_PURCHASE, 51, ByteCompanionObject.MAX_VALUE, -126, airhockey.J_REWARD, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, 51, airhockey.J_REWARD, -126, -120, -127, -121, airhockey.J_ACHIEVEMENTCALLBACK, -123, -122, 77, 51, airhockey.J_PURCHASE, -97, -108, -93, -106, -98, -106, -97, -91, -102, -97, -104, 81, -108, -96, -90, -97, -91, -106, -93, airhockey.J_GAME_ENEMYEXIT, 81, -56, -21, -33, -35, -24, -65, -21, -15, -22, -16, -31, -18, -17, airhockey.J_DISCONNECT, 119, 119, 124, -121, 124, -126, -127, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, 124, -127, airhockey.J_WAIT, -126, -43, -24, -24, -39, -31, -28, -24, -111, -113, -93, -107, -106, -94, -115, -109, -90, -111, -109, -98, -94, -105, -99, -100, -46, -34, -36, -99, -43, -48, -46, -44, -47, -34, -34, -38, -99, -48, -45, -30, -99, -69, -66, -78, -80, -69, -50, -78, -66, -60, -67, -61, -76, -63, -62, -103, -106, -87, -106, -42, -25, -42, -33, -27, -28, -49, -46, -58, -60, -49, -62, -58, -46, -40, -47, -41, -56, -43, -42, -121, airhockey.J_ACHIEVEMENTCALLBACK, -112, -125, -122, airhockey.J_ACHIEVEMENTCALLBACK, 123, -95, -94, -113, -111, -103, -94, -96, -113, -111, -109, -124, -122, airhockey.J_SAVEDGAME_SAVE, -123, -118, -127, airhockey.J_REWARD, -37, -35, -54, -36, -31, -40, -51, -57, -53, -41, -52, -51};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(C7N c7n, QG qg, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(93, 7, 109), A01(13, 1, 41));
        A09(c7n, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(188, 7, 10), A01(157, 14, 92));
        hashMap2.put(A01(195, 12, 97), String.valueOf(3501));
        hashMap2.put(A01(100, 16, 39), A01(14, 1, 55));
        hashMap2.put(A01(178, 10, 39), A01(65, 13, 117));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (c7n.A04().A8f()) {
            String str = A01(15, 28, 12) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 12), jSONObject.toString());
        A09(c7n, hashMap2);
        C8I A08 = c7n.A08();
        JSONObject A05 = C02647u.A05(new C02667w(A08.A01(), A08.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 46), new JSONObject(hashMap));
        jSONObject2.put(A01(151, 6, 106), jSONArray);
        QU qu = new QU();
        qu.put(A01(171, 7, 16), jSONObject2.toString());
        qg.ADU(c7n.A04().A6l(), qu.A08(), new U8(c7n));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A09(C7N c7n, Map<String, String> map) {
        map.putAll(c7n.A03().A4W());
    }

    static {
        A04();
        A02 = C0516Il.class.getSimpleName();
        A04 = new AtomicInteger(0);
        A03 = new HashMap();
    }

    public static /* synthetic */ String A00() {
        String str = A02;
        if (A01[0].length() != 25) {
            throw new RuntimeException();
        }
        A01[5] = "AE0Gj58Mw00GT5T1b1OvPEW6lBfcUrG3";
        return str;
    }

    public static /* synthetic */ Map A02() {
        Map<String, Integer> map = A03;
        if (A01[2].charAt(23) != '7') {
            String[] strArr = A01;
            strArr[1] = "kE3yWNDHHw7";
            strArr[4] = "pIXzG0En7nL";
            return map;
        }
        throw new RuntimeException();
    }

    public static void A05(C7N c7n) {
        if (A0B(c7n)) {
            return;
        }
        synchronized (C0516Il.class) {
            if (A04.get() != 0) {
                return;
            }
            A04.set(1);
            LQ.A06.execute(new U9(c7n));
        }
    }

    public static void A08(C7N c7n, String str) {
        int value;
        if (A0B(c7n)) {
            return;
        }
        synchronized (C0516Il.class) {
            if (A04.get() != 2) {
                value = (A03.containsKey(str) ? A03.get(str).intValue() : 0) + 1;
                A03.put(str, Integer.valueOf(value));
            } else {
                SharedPreferences sharedPreferences = c7n.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 104), c7n), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (c7n.A04().A8f()) {
                String str2 = A01(43, 22, 42) + str + A01(0, 13, 4) + value;
            }
        }
    }

    @VisibleForTesting
    public static boolean A0A(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A0B(C7N c7n) {
        if (c7n.A04().A8f()) {
            return false;
        }
        if (!IM.A0U(c7n)) {
            return true;
        }
        return A0A(c7n.A08().A00(), IM.A0C(c7n));
    }
}
