package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h implements g {
    public final Map<a, Long> a = new LinkedHashMap();
    public final Map<a, Long> b = new LinkedHashMap();
    public long c;
    public long d;

    /* loaded from: classes.dex */
    public static class a {
        public final String a = UUID.randomUUID().toString();
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public void a() {
        this.d = System.currentTimeMillis();
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public void b() {
        this.c = System.currentTimeMillis();
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public void a(String str) {
        this.b.put(new a(str), Long.valueOf(System.currentTimeMillis() - this.d));
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public void b(String str) {
        this.a.put(new a(str), Long.valueOf(System.currentTimeMillis() - this.c));
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public void a(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, s sVar) {
        q.a aVar = new q.a(p.SDK_BIDDING_METRICS, inneractiveAdRequest, eVar, sVar.c());
        JSONObject jSONObject = new JSONObject();
        JSONArray a2 = a(this.b);
        try {
            jSONObject.put("adl", a2);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "adl", a2);
        }
        JSONArray a3 = a(this.a);
        try {
            jSONObject.put("adml", a3);
        } catch (Exception unused2) {
            IAlog.e("Got exception adding param to json object: %s, %s", "adml", a3);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    public static JSONArray a(Map<a, Long> map) {
        JSONArray jSONArray = new JSONArray();
        for (a aVar : map.keySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("outcome", aVar.b);
                jSONObject.putOpt("time", map.get(aVar));
                jSONObject.putOpt("idx", Integer.valueOf(jSONArray.length()));
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
