package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    public UnitDisplayType a;

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        g gVar = new g();
        UnitDisplayType fromValue = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (fromValue != null) {
            gVar.a = fromValue;
            return gVar;
        }
        return null;
    }
}
