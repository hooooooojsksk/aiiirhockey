package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y implements h0.a {
    public UnitDisplayType a;

    @Override // com.fyber.inneractive.sdk.util.h0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        h0.a(jSONObject, "unitDisplayType", this.a);
        return jSONObject;
    }
}
