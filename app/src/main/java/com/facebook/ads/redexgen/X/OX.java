package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OX {
    public static byte[] A08;
    public WeakReference<OM> A00;
    public WeakReference<S0> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C0887Xc A03;
    public final O9 A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC0505Ia> A07;

    static {
        A09();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, 63, 78, airhockey.P_GAME_MYWIN, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, 27, 57, 43, 56, 83, 84, 65, 84, airhockey.P_GAME_STANDBY, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public OX(C0887Xc c0887Xc, OM om, InterfaceC0505Ia interfaceC0505Ia, O9 o9, String str, String str2) {
        this.A03 = c0887Xc;
        this.A00 = new WeakReference<>(om);
        this.A07 = new WeakReference<>(interfaceC0505Ia);
        this.A04 = o9;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        S0 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        S0 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8E();
    }

    private void A06() {
        S0 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8w();
    }

    private void A07() {
        this.A03.A0E().A4x();
        this.A02 = true;
        S0 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AFS();
        if (IK.A1Q(this.A03)) {
            this.A03.A0A().AAg();
        }
    }

    private void A08() {
        S0 uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AB4();
    }

    private void A0A(OM om, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C0541Jm.A00(this.A03);
        String A01 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(A01(57, 5, 81), A01);
        String opId = A01(54, 3, 10);
        String key = jSONObject.optString(opId, A01(7, 7, 50));
        String string = A00.getString(A01(14, 4, 103) + key, A01);
        if (string != null) {
            A01 = string;
        }
        om.A0g(storageValue, A01);
    }

    private void A0B(OM om, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(98, 5, 12), A01);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A01);
        String optString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        SharedPreferences.Editor edit = C0541Jm.A00(this.A03).edit();
        edit.putString(A01(14, 4, 103) + optString3, optString).apply();
        om.A0f(optString2);
    }

    public void A0C(OV ov, String str) throws JSONException {
        switch (ov) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0E().A59(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(ov, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        OM om = this.A00.get();
        if (om == null) {
            return;
        }
        switch (ov) {
            case A06:
                om.A0S();
                return;
            case A05:
                om.A0R();
                return;
            case A0P:
                A0B(om, str);
                return;
            case A0L:
                A0A(om, str);
                return;
            case A0F:
                om.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(OV ov, String str) throws JSONException {
        S0 s0 = this.A01.get();
        if (s0 == null) {
            return;
        }
        switch (ov) {
            case A0C:
                s0.AB8();
                return;
            case A0N:
                s0.ACZ();
                return;
            case A0K:
                A0G(s0, str);
                return;
            case A0J:
                A0F(s0, str);
                return;
            case A0G:
                A0E(s0, str);
                return;
            default:
                return;
        }
    }

    private void A0E(S0 s0, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        s0.ABm(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(S0 s0, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        s0.AD5(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(S0 s0, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        s0.AD7(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        S0 s0 = this.A01.get();
        if (s0 == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            s0.A89();
        } else {
            s0.A8A(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        S0 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC0505Ia interfaceC0505Ia = this.A07.get();
        if (interfaceC0505Ia == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C0513Ii(this.A06, interfaceC0505Ia).A05(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String optString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.A03.A0E().A9A(optInt, optString);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        S0 s0 = this.A01.get();
        if (s0 == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        s0.ADL(optString);
    }

    public final void A0N(S0 s0) {
        this.A01 = new WeakReference<>(s0);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        LF.A00(new OT(this, str));
    }
}
