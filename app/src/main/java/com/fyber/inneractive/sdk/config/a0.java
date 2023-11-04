package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.h0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a0 implements b0 {
    public String a;
    public String b;
    public t c;
    public x d;
    public y e;
    public c0 f;
    public e0 g;

    public d0 a() {
        return this.f;
    }

    public e0 b() {
        return this.g;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        h0.a(jSONObject, FacebookMediationAdapter.KEY_ID, this.a);
        h0.a(jSONObject, "spotId", this.b);
        h0.a(jSONObject, "display", this.c);
        h0.a(jSONObject, "monitor", this.d);
        h0.a(jSONObject, "native", this.e);
        h0.a(jSONObject, "video", this.f);
        h0.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }
}
