package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class X1 implements IY {
    public static byte[] A02;
    public static String[] A03 = {"T62Ry0cHQcXSDxKL7NhTV4RGJa1EK", "DJGQMadZkB17LVbr", "iOkG4K13Hjl0NUqXuJlVUejicjlk1nzW", "33srKXABt3KwFUuhEJwkq3ZAZBzDwUgt", "PLu8UfSRSTd2rcgSm6FUEhoaf9WcktnC", "1tfjOobuNxYUsDgE6aIuCnswgchDbiIE", "3cN0JgpVgSdwOhRQcWnO1AlK5DQJr2L6", "ilEunU5aQdATmqkKFrVV7R1hAU4VbdID"};
    public static final String A04;
    public C0886Xb A00;
    public X2 A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{86, 16, 25, 4, 86, 19, 0, 19, 24, 2, 63, 18, 86, airhockey.J_SAVEDGAME_SAVE, 32, 38, 48, 48, 54, 32, 32, 53, 38, 63, 63, 42, 125, 32, 34, 3, 10, 3, 18, 3, 2, airhockey.P_GAME_BREAKBALLCOUNT, 3, 16, 3, 8, 18, 21, airhockey.P_GAME_BREAKBALLCOUNT, 3, 30, 5, 3, 3, 2, 3, 2, airhockey.P_GAME_BREAKBALLCOUNT, 20, 3, 18, 20, 31, airhockey.P_GAME_BREAKBALLCOUNT, 10, 15, 11, 15, 18, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_BREAKBALLCOUNT, 37, 9, 19, 8, 18, 92, airhockey.P_GAME_BREAKBALLCOUNT, 65, 102, airhockey.J_INVITE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 99, 39, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, 39, 119, 102, airhockey.J_ERROR, airhockey.J_DISCONNECT, airhockey.J_NATION, 39, 102, airhockey.J_GAME_REMATCH, 39, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_NATION, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, 39, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, 39, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_NATION, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, 39, 102, airhockey.J_ERROR, airhockey.J_ERROR, 102, 126, 39, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, 39, 99, airhockey.J_INVITE, airhockey.J_DISCONNECT, 119, 102, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, 111, 39, airhockey.J_SDKVER, 102, airhockey.J_INVITE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, airhockey.J_NATION, 41, airhockey.J_GOO, 87, 95, 90, 83, 82, 22, airhockey.P_NATION, 89, 22, airhockey.P_GAME_BREAKBALLCOUNT, 87, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 83, 22, 87, 88, 22, 83, 64, 83, 88, airhockey.P_NATION, 22, 95, 88, 22, 83, 64, 83, 88, airhockey.P_NATION, airhockey.P_GAME_STANDBY, 22, 90, 95, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 22, 65, 94, 83, 88, 22, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 83, airhockey.P_GAME_BREAKBALLCOUNT, 87, airhockey.P_GAME_SELECTMAP, 95, 88, 81, 22, 82, 95, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, 87, airhockey.P_NATION, 85, 94, 22, airhockey.P_GAME_BREAKBALLCOUNT, 87, 79, 90, 89, 87, 82, 24, 7, 49, 38, 34, 49, 38, airhockey.J_DISCONNECT, 36, 38, 59, 55, 49, 39, 39, 49, 48, airhockey.J_DISCONNECT, 49, 34, 49, 58, 32, 29, 48, airhockey.J_DISCONNECT, 17, 39, 48, 52, 39, 48, airhockey.J_NATION, 48, 39, 54, 55, 48, 44, 39, 38, airhockey.J_NATION, 44, 45, 44, 111, 48, 39, 54, 48, 59, 35, 32, 46, 39, airhockey.J_NATION, 39, 48, 48, 45, 48, airhockey.J_NATION, 33, 45, 38, 39, airhockey.J_NATION, 88, airhockey.J_INVITE, airhockey.J_WAIT, 125, airhockey.J_INVITE, airhockey.J_WAIT, 43, airhockey.J_WAIT, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, 126, airhockey.J_WAIT, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, 111, 43, airhockey.J_WAIT, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYWIN, airhockey.J_INVITE, 43, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_WAIT, 43, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, 111, airhockey.J_INVITE, 43, airhockey.P_GAME_SELECTMAP, ByteCompanionObject.MAX_VALUE, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, 125, airhockey.J_DISCONNECT, 49, airhockey.J_GAME_STANDBY, 126, 49, airhockey.J_SDKVER, airhockey.J_GOO, 99, airhockey.J_NATION, airhockey.J_DISCONNECT, 49, airhockey.J_NATION, airhockey.J_DISCONNECT, 99, airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, 99, 49, 99, airhockey.J_DISCONNECT, airhockey.J_NATION, airhockey.J_SDKVER, 126, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_DISCONNECT, 49, airhockey.J_GOO, airhockey.J_GAME_STANDBY, 49, airhockey.J_SDKVER, 126, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 126, ByteCompanionObject.MAX_VALUE, 49, airhockey.J_ERROR, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 13, 30, 13, 6, 28, 27, 56, 59, 63, 42, 43, 44, 59, airhockey.J_SAVEDGAME_SAVE, 61, 49, 48, 56, 55, 57, airhockey.J_SAVEDGAME_SAVE, 59, 40, 59, 48, 42, airhockey.J_SAVEDGAME_SAVE, 51, 63, 57, 55, 61, 95, 92, 88, 77, 76, 75, 92, 102, 90, 86, 87, 95, 80, 94, airhockey.J_DISCONNECT, airhockey.J_WAIT, airhockey.J_ERROR, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, 99, 88, 99, 102, airhockey.J_SAVEDGAME_SAVE, 102, airhockey.J_GAME_STANDBY, 102, airhockey.J_DISCONNECT, airhockey.J_NATION, 60, 39, 35, 45, 38, 58, 33, 37, 43, 32, 17, 39, 42, 32, 59, 63, 49, 58, 39};
    }

    static {
        A01();
        A04 = X1.class.getSimpleName();
    }

    public X1(C0886Xb c0886Xb, X2 x2) {
        this.A00 = c0886Xb;
        this.A01 = x2;
    }

    private void A02(Set<String> eventsToRetry, Set<String> eventsToDelete) {
        int A0B = this.A01.A0B(IM.A0G(this.A00), eventsToRetry, eventsToDelete);
        if (A0B > 0) {
            InterfaceC02617r A07 = this.A00.A07();
            int i = C02627s.A10;
            A07.A9C(A00(HttpStatus.SC_METHOD_NOT_ALLOWED, 15, 79), i, new C02637t(A00(28, 44, 46) + A0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.IY
    @Nullable
    public final JSONObject A4K() {
        int A0F = IM.A0F(this.A00);
        List<JSONObject> A0C = this.A01.A0C(A0F);
        JSONObject jSONObject = new JSONObject();
        Iterator<JSONObject> it = A0C.iterator();
        while (true) {
            if (it.hasNext()) {
                JSONObject event = it.next();
                try {
                    String optString = event.optString(A00(HttpStatus.SC_METHOD_FAILURE, 5, 0));
                    String uuid = UUID.randomUUID().toString();
                    jSONObject.put(uuid, optString);
                    event.put(A00(425, 8, 6), uuid);
                } catch (JSONException e) {
                    C7S A042 = this.A00.A04();
                    if (A03[2].charAt(22) != 'j') {
                        throw new RuntimeException();
                    }
                    A03[7] = "eMFgGe3BwzjIEwfr0eq56CqWHHfmSWyD";
                    if (A042.A8f()) {
                        Log.e(A04, A00(134, 72, 126), e);
                    }
                }
            } else {
                JSONArray jSONArray = new JSONArray((Collection) A0C);
                if (IM.A0P(this.A00)) {
                    int A08 = IM.A08(this.A00);
                    JSONArray eventsJson = C02647u.A04(this.A00, A08);
                    if (A03[7].charAt(31) == 'D') {
                        String[] strArr = A03;
                        strArr[3] = "31pn7rS79XEbH8v4aDva0zyRbLn9ex8z";
                        strArr[6] = "3BqVDGT4msLu1Rtl2iVh8DraLvTqVCKW";
                        if (eventsJson != null) {
                            int eventLimit = eventsJson.length();
                            if (eventLimit > 0) {
                                jSONArray = UA.A02(this.A00, eventsJson, jSONArray, A0F + A08);
                            }
                        }
                    }
                }
                JSONObject jSONObject2 = null;
                try {
                    int eventLimit2 = jSONArray.length();
                    if (eventLimit2 > 0) {
                        jSONObject2 = new JSONObject();
                        int eventLimit3 = jSONObject.length();
                        if (eventLimit3 > 0) {
                            jSONObject2.put(A00(433, 6, 28), jSONObject);
                        }
                        jSONObject2.put(A00(357, 6, 32), jSONArray);
                    }
                    return jSONObject2;
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final boolean A8p() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final void AAA() {
        C02647u.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final void AAh(JSONArray jSONArray) {
        int length = jSONArray.length();
        HashSet hashSet = new HashSet(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject eventJson = jSONArray.getJSONObject(i);
                String string = eventJson.getString(A00(HttpStatus.SC_FORBIDDEN, 2, 85));
                if (C02647u.A0I(string)) {
                    C02647u.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (JSONException e) {
                if (this.A00.A04().A8f()) {
                    Log.e(A04, A00(72, 62, 79), e);
                }
            }
        }
        A02(hashSet, new HashSet());
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final boolean AAj(JSONArray jSONArray) {
        String A00 = A00(27, 1, 70);
        boolean z = true;
        boolean A0P = IM.A0P(this.A00);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(A00(HttpStatus.SC_FORBIDDEN, 2, 85));
                if (A00(363, 26, 22).equals(string)) {
                    IK.A0P(this.A00).A2L(jSONObject.getString(A00(389, 14, 113)));
                    this.A00.A03().A9i();
                } else {
                    int i2 = jSONObject.getInt(A00(353, 4, 94));
                    if (i2 == 1) {
                        if (this.A00.A04().A8f()) {
                            String str = A00(HttpStatus.SC_PARTIAL_CONTENT, 25, 28) + string + A00(13, 14, 27);
                        }
                        if (A0P) {
                            C02647u.A0D(string);
                        }
                        hashSet.add(string);
                    } else {
                        String A002 = A00(0, 13, 62);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (this.A00.A04().A8f()) {
                                Log.e(A04, A00(272, 37, 67) + i2 + A002 + string + A00);
                            }
                            if (C02647u.A0I(string)) {
                                C02647u.A0B(this.A00, string);
                            } else {
                                hashSet2.add(string);
                            }
                            z = false;
                        } else if (i2 >= 2000 && i2 < 3000) {
                            if (this.A00.A04().A8f()) {
                                Log.e(A04, A00(231, 41, 10) + i2 + A002 + string + A00);
                            }
                            hashSet.add(string);
                            if (A0P) {
                                C02647u.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (this.A00.A04().A8f()) {
                    Log.e(A04, A00(309, 44, 89) + i + A00, e);
                }
                z = false;
            }
        }
        A02(hashSet2, hashSet);
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.IY
    public final void ACG() {
        this.A01.A43();
        C02647u.A07(this.A00);
    }
}
