package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class UA implements IY {
    public static byte[] A02;
    public static String[] A03 = {"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    public static final String A04;
    public C0886Xb A00;
    public X6 A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{21, 83, 90, airhockey.P_GAME_MYWIN, 21, 80, airhockey.P_GAME_MYSCORE, 80, 91, 65, 124, 81, 21, 60, 111, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, 111, 111, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, airhockey.J_GOO, airhockey.J_GOO, airhockey.J_GAME_STANDBY, 50, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 77, airhockey.P_GAME_SELECTMAP, 85, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 1, airhockey.P_GAME_SELECTMAP, 87, airhockey.P_GAME_SELECTMAP, 79, 85, 82, 1, airhockey.P_GAME_SELECTMAP, 89, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 1, 83, airhockey.P_GAME_SELECTMAP, 85, 83, 88, 1, 77, airhockey.P_GAME_MYLOSE, 76, airhockey.P_GAME_MYLOSE, 85, 15, 1, airhockey.J_NATION, 78, 84, 79, 85, 27, 1, airhockey.P_GAME_MYLOSE, 123, airhockey.J_ENEMYLOSE, 99, airhockey.J_WAIT, 45, airhockey.J_WAIT, airhockey.J_DISCONNECT, 125, airhockey.J_ENEMYLOSE, 45, 125, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, 126, 126, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 45, 111, airhockey.J_DISCONNECT, 45, airhockey.J_WAIT, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, 45, 126, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, 123, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, 55, 45, 84, airhockey.J_SAVEDGAME_SAVE, 123, 126, 119, airhockey.J_REWARD, 50, 102, 125, 50, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 96, airhockey.J_SDKVER, 119, 50, airhockey.J_SAVEDGAME_SAVE, 124, 50, 119, airhockey.J_ONREWARDED, 119, 124, 102, 50, 123, 124, 50, 119, airhockey.J_ONREWARDED, 119, 124, 102, airhockey.J_SDKVER, 50, airhockey.J_SAVEDGAME_SAVE, 96, 96, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_ENEMYEXIT, 50, airhockey.J_DISCONNECT, 125, 96, 50, airhockey.J_REWARD, 123, airhockey.J_SDKVER, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 102, airhockey.J_BACK, airhockey.J_PURCHASE, 50, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, 123, 126, airhockey.J_ENEMYWIN, 96, 119, 60, 65, 119, 96, airhockey.J_ONREWARDED, 119, 96, 50, airhockey.J_NATION, 96, 125, airhockey.J_BACK, 119, airhockey.J_SDKVER, airhockey.J_SDKVER, 119, airhockey.J_REWARD, 50, 119, airhockey.J_ONREWARDED, 119, 124, 102, 91, airhockey.J_REWARD, 50, 50, 4, 19, 23, 4, 19, 65, 19, 4, 21, 20, 19, 15, 4, 5, 65, 15, 14, 15, 76, 19, 4, 21, 19, 24, 0, 3, 13, 4, 65, 4, 19, 19, 14, 19, 65, 2, 14, 5, 4, 65, 42, 28, 11, 15, 28, 11, 89, 11, 28, 13, 12, 11, 23, 28, 29, 89, 11, 28, 13, 11, 0, 24, 27, 21, 28, 89, 28, 11, 11, 22, 11, 89, 26, 22, 29, 28, 89, 86, 109, airhockey.J_NATION, airhockey.J_SDKVER, 111, 102, 35, 119, airhockey.J_GAME_DISCONNECT, 35, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_GOO, 102, 35, airhockey.J_ENEMYWIN, 102, airhockey.J_SDKVER, airhockey.J_REWARD, airhockey.J_ONREWARDED, 79, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ERROR, 102, 109, 119, 35, airhockey.J_NATION, 119, 35, 6, 61, 50, 49, 63, 54, airhockey.J_SAVEDGAME_SAVE, 39, 60, airhockey.J_SAVEDGAME_SAVE, 35, 50, 33, 32, 54, airhockey.J_SAVEDGAME_SAVE, 54, 37, 54, 61, 39, airhockey.J_SAVEDGAME_SAVE, 50, 39, airhockey.J_SAVEDGAME_SAVE, 111, 84, 91, 88, 86, 95, 26, 78, 85, 26, airhockey.P_GAME_EXIT, 91, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 95, 26, airhockey.P_GAME_REMATCH, 95, airhockey.P_GAME_MYLOSE, 76, 95, airhockey.P_GAME_MYLOSE, 26, airhockey.P_GAME_MYLOSE, 95, airhockey.P_GAME_REMATCH, airhockey.P_GAME_EXIT, 85, 84, airhockey.P_GAME_REMATCH, 95, 26, 91, 78, 26, airhockey.P_GAME_EXIT, 85, airhockey.P_GAME_REMATCH, 83, 78, 83, 85, 84, 26, 80, 92, 87, 86, airhockey.J_ENEMYLOSE, 109, airhockey.J_ACHIEVEMENTCALLBACK, 109, airhockey.J_INVITE, 109, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, 17, 2, 17, 26, 0, 7, 6, 5, 1, 20, 21, 18, 5, 77, 3, 15, 14, 6, 9, 7, 77, 5, 22, 5, 14, 20, 77, 13, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, 24, 36, 40, 41, 33, 46, 32, 44, 33, airhockey.P_GAME_MYWIN, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    static {
        A05();
        A04 = UA.class.getSimpleName();
    }

    public UA(C0886Xb c0886Xb, X6 x6) {
        this.A00 = c0886Xb;
        this.A01 = x6;
    }

    public static JSONArray A01(C0886Xb c0886Xb, JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i += limit2;
        }
        return A02(c0886Xb, jSONArray, jSONArray2, i);
    }

    public static JSONArray A02(C0886Xb c0886Xb, JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int limit = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int debugIdx = 0;
        int i2 = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        while (true) {
            if ((debugIdx < length || i2 < limit) && i > 0) {
                String[] strArr = A03;
                if (strArr[0].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "aN";
                strArr2[3] = "P5";
                String A00 = A00(435, 4, 91);
                if (debugIdx < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray.getJSONObject(debugIdx);
                        d = jSONObject.getDouble(A00);
                    } catch (JSONException e) {
                        if (c0886Xb.A04().A8f()) {
                            Log.e(A04, A00(273, 33, 107) + debugIdx, e);
                        }
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    debugIdx++;
                }
                if (i2 < limit && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(i2);
                        d2 = jSONObject2.getDouble(A00);
                    } catch (JSONException e2) {
                        if (c0886Xb.A04().A8f()) {
                            Log.e(A04, A00(306, 25, 59) + i2, e2);
                        }
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    }
                    i2++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d2 < d) {
                        jSONArray3.put(jSONObject2);
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    } else {
                        jSONArray3.put(jSONObject);
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    i--;
                }
            }
        }
        if (i > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    private JSONObject A03() {
        JSONArray A032;
        JSONObject A5i = this.A01.A5i();
        JSONArray A5h = this.A01.A5h();
        if (IM.A0P(this.A00) && (A032 = C02647u.A03(this.A00)) != null && A032.length() > 0) {
            C0886Xb c0886Xb = this.A00;
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "DqeH9SIpXFi3b8zfs8mhzwqF8zVFhPmm";
            strArr2[2] = "TV1z9woSYeZeWz7dxNs9KlrMFeTbS55S";
            A5h = A01(c0886Xb, A032, A5h);
        }
        JSONObject jSONObject = null;
        if (A5h != null) {
            try {
                jSONObject = new JSONObject();
                if (A5i != null) {
                    jSONObject.put(A00(439, 6, 32), A5i);
                }
                jSONObject.put(A00(387, 6, 28), A5h);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i) {
        int A08;
        JSONArray A042;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A7r(i);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray debugLogEvents = (JSONArray) tokensAndEvents.second;
        if (IM.A0P(this.A00) && (A042 = C02647u.A04(this.A00, (A08 = IM.A08(this.A00)))) != null && A042.length() > 0) {
            debugLogEvents = A02(this.A00, A042, debugLogEvents, i + A08);
        }
        JSONObject payload = null;
        if (debugLogEvents != null) {
            try {
                payload = new JSONObject();
                if (jSONObject != null) {
                    payload.put(A00(439, 6, 32), jSONObject);
                }
                payload.put(A00(387, 6, 28), debugLogEvents);
            } catch (JSONException unused) {
                return null;
            }
        }
        return payload;
    }

    private void A06(String str) {
        if (C02647u.A0I(str)) {
            C02647u.A0B(this.A00, str);
        } else {
            this.A01.A8T(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final JSONObject A4K() {
        int eventLimit = IM.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final boolean A8p() {
        int eventCount = IM.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int A6h = this.A01.A6h();
        int eventLimit = C02647u.A00(this.A00);
        return A6h + eventLimit > eventCount;
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final void AAA() {
        int A42 = this.A01.A42(IM.A0G(this.A00));
        if (A42 > 0) {
            InterfaceC02617r A07 = this.A00.A07();
            int i = C02627s.A10;
            A07.A9C(A00(379, 8, 100), i, new C02637t(A00(28, 44, 73) + A42));
        }
        C0886Xb c0886Xb = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int attemptsExceededEventsCount = str.length();
        int retryLimit = str2.length();
        if (attemptsExceededEventsCount == retryLimit) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        C02647u.A0F(c0886Xb);
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final void AAh(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                A06(jSONArray.getJSONObject(i).getString(A00(433, 2, 45)));
            } catch (JSONException e) {
                if (this.A00.A04().A8f()) {
                    String str = A04;
                    String[] strArr = A03;
                    String str2 = strArr[5];
                    String str3 = strArr[6];
                    int i2 = str2.length();
                    int length2 = str3.length();
                    if (i2 == length2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final boolean AAj(JSONArray jSONArray) {
        String A00 = A00(27, 1, 40);
        boolean z = true;
        boolean A0P = IM.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(errorCode);
                String eventId = jSONObject.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(eventId)) {
                    IK.A0P(this.A00).A2L(jSONObject.getString(A00(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 14, 47)));
                    this.A00.A03().A9i();
                } else {
                    int i = jSONObject.getInt(A00(375, 4, 91));
                    if (i == 1) {
                        if (this.A00.A04().A8f()) {
                            String str = A00(170, 25, 122) + eventId + A00(13, 14, 116);
                            String A6k = this.A01.A6k(eventId);
                            if (A6k != null) {
                                String str2 = A00(72, 36, 101) + A6k;
                            }
                        }
                        if (!this.A01.A4m(eventId) && A0P) {
                            C02647u.A0D(eventId);
                        }
                    } else {
                        String A002 = A00(0, 13, 93);
                        if (i >= 1000 && i < 2000) {
                            if (this.A00.A04().A8f()) {
                                Log.e(A04, A00(236, 37, 17) + i + A002 + eventId + A00);
                            }
                            A06(eventId);
                            z = false;
                        } else if (i >= 2000 && i < 3000) {
                            if (this.A00.A04().A8f()) {
                                Log.e(A04, A00(195, 41, 9) + i + A002 + eventId + A00);
                            }
                            if (!this.A01.A4m(eventId) && A0P) {
                                C02647u.A0D(eventId);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (this.A00.A04().A8f()) {
                    Log.e(A04, A00(331, 44, 82) + errorCode + A00, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final void ACG() {
        this.A01.A43();
        C02647u.A07(this.A00);
    }
}
