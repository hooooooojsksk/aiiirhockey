package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.fyber.inneractive.sdk.response.b {
    @Override // com.fyber.inneractive.sdk.response.b
    public void a(String str, a0 a0Var) {
        try {
            ((f) this.a).I = new JSONObject(str).getString("adm");
        } catch (JSONException e) {
            com.fyber.inneractive.sdk.dv.handler.c.a(a0Var != null ? a0Var.b : null, com.fyber.inneractive.sdk.dv.enums.a.Parse, null, null, e.getLocalizedMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public com.fyber.inneractive.sdk.response.e a() {
        return new f();
    }
}
