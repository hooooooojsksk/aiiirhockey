package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.response.i {
    public g a;
    public h b;
    public int c;
    public int d;
    public String e;
    public String f;
    public String g;
    public Map<s, List<String>> h = new HashMap();

    public c(g gVar, int i, int i2, String str) {
        this.a = gVar;
        this.c = i;
        this.d = i2;
        this.e = str;
    }

    public void a(s sVar, String str) {
        List<String> list = this.h.get(sVar);
        if (list == null) {
            list = new ArrayList<>();
            this.h.put(sVar, list);
        }
        list.add(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Companion: ");
        sb.append(" w:");
        sb.append(this.c);
        sb.append(" h:");
        sb.append(this.d);
        sb.append(" type:");
        sb.append(this.a.toString());
        sb.append(" creativeType: ");
        h hVar = this.b;
        sb.append(hVar != null ? hVar.e() : "none");
        sb.append(" ctr:");
        sb.append(this.g);
        sb.append(" events:");
        sb.append(this.h);
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(s sVar) {
        Map<s, List<String>> map = this.h;
        if (map == null) {
            return null;
        }
        return map.get(sVar);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.c);
            jSONObject.put("h", this.d);
            jSONObject.put("type", this.a.toString());
            h hVar = this.b;
            jSONObject.put("creativeType", hVar != null ? hVar.e() : "none");
            jSONObject.put(FirebaseAnalytics.Param.CONTENT, this.f);
        } catch (JSONException e) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }
}
