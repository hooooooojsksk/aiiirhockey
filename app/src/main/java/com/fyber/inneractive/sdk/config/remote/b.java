package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public UnitDisplayType a;
    public Boolean b;
    public Integer c;
    public Integer d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("hide", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("refresh", Integer.MIN_VALUE));
        bVar.a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.d = valueOf;
        bVar.c = valueOf2.intValue() != Integer.MIN_VALUE ? valueOf2 : null;
        return bVar;
    }
}
