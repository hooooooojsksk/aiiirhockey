package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {
    public static void a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        q.a aVar = new q.a(p.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar, (JSONArray) null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (Exception unused2) {
            IAlog.e("Got exception adding param to json object: %s, %s", "description", str2);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    public static void a(Throwable th, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        String a = com.fyber.inneractive.sdk.util.q.a(th);
        q.a aVar = new q.a(p.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar, (JSONArray) null);
        JSONObject jSONObject = new JSONObject();
        String cls = th.getClass().toString();
        try {
            jSONObject.put("exception_name", cls);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "exception_name", cls);
        }
        String message = th.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (Exception unused2) {
            IAlog.e("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", a);
        } catch (Exception unused3) {
            IAlog.e("Got exception adding param to json object: %s, %s", "stack_trace", a);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }
}
