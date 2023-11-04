package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ InneractiveError a;
    public final /* synthetic */ c b;

    public b(c cVar, InneractiveError inneractiveError) {
        this.b = cVar;
        this.a = inneractiveError;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        T t = this.b.b;
        if (t == 0 || (str = t.h) == null) {
            return;
        }
        Map<String, String> map = t.p;
        if (map == null && t.q == null) {
            return;
        }
        IAConfigManager iAConfigManager = IAConfigManager.M;
        com.fyber.inneractive.sdk.config.i iVar = iAConfigManager.u.b;
        String str3 = c.e;
        if (iVar.a.containsKey("max_failed_creatives_interval_hours")) {
            str3 = iVar.a.get("max_failed_creatives_interval_hours");
        }
        com.fyber.inneractive.sdk.config.i iVar2 = iAConfigManager.u.b;
        String str4 = c.f;
        if (iVar2.a.containsKey("max_failed_creatives_per_interval")) {
            str4 = iVar2.a.get("max_failed_creatives_per_interval");
        }
        int a = com.fyber.inneractive.sdk.util.q.a(str3, 24);
        int a2 = com.fyber.inneractive.sdk.util.q.a(str4, 1);
        Application application = com.fyber.inneractive.sdk.util.l.a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            c cVar = this.b;
            cVar.getClass();
            if (IAConfigManager.M.u.b.a(cVar.a, false) && !com.fyber.inneractive.sdk.metrics.a.a(a, a2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    try {
                        str2 = new JSONObject(map).toString();
                    } catch (Throwable unused2) {
                        str2 = "";
                    }
                } else {
                    str2 = this.b.b.q;
                }
                c cVar2 = this.b;
                InneractiveAdRequest inneractiveAdRequest = cVar2.c;
                T t2 = cVar2.b;
                InneractiveError inneractiveError = this.a;
                q.a aVar = new q.a(com.fyber.inneractive.sdk.network.p.IA_AD_FAILURE_DATA, inneractiveAdRequest, t2, cVar2.d);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (Exception unused3) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", str2);
                } catch (Exception unused4) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "headers", str2);
                }
                String description = inneractiveError.description();
                try {
                    jSONObject.put("error_code", description);
                } catch (Exception unused5) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "error_code", description);
                }
                aVar.f.put(jSONObject);
                aVar.a((String) null);
            }
            sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
