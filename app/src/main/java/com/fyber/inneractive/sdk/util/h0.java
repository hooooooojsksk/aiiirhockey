package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 {

    /* loaded from: classes.dex */
    public interface a {
        JSONObject a();
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof a) {
                    jSONObject.putOpt(str, ((a) obj).a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
