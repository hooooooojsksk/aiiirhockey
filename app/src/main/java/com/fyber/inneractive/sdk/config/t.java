package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t implements h0.a {
    public Integer a = null;
    public UnitDisplayType b;
    public Boolean c;
    public Integer d;

    @Override // com.fyber.inneractive.sdk.util.h0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        h0.a(jSONObject, "refresh", this.a);
        h0.a(jSONObject, "unitDisplayType", this.b);
        h0.a(jSONObject, "close", this.c);
        h0.a(jSONObject, "hideDelay", this.d);
        return jSONObject;
    }
}
