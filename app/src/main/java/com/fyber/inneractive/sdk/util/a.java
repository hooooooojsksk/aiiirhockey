package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.network.q;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public InneractiveAdSpot a;
    public boolean c;
    public boolean b = false;
    public long d = 0;
    public long e = 0;
    public long f = 0;

    public void a(boolean z) {
        this.c = z;
        if (!this.b) {
            Object[] objArr = new Object[2];
            objArr[0] = "AdExperienceLatency: ";
            objArr[1] = z ? "skip" : "close";
            IAlog.a("%s%s timer started", objArr);
            this.d = System.currentTimeMillis();
            this.b = true;
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = "AdExperienceLatency: ";
        objArr2[1] = z ? "skip" : "close";
        IAlog.a("%s%s timer could not start. Timer is in action!", objArr2);
    }

    public void b() {
        if (!this.b || this.e <= 0) {
            return;
        }
        this.f += System.currentTimeMillis() - this.e;
        this.e = 0L;
    }

    public void a() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.b = false;
    }

    public void a(String str) {
        com.fyber.inneractive.sdk.config.global.s sVar;
        if (this.b) {
            String a = w.a(this.d, this.f);
            InneractiveAdSpot inneractiveAdSpot = this.a;
            com.fyber.inneractive.sdk.flow.o adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            q.a aVar = new q.a(this.c ? com.fyber.inneractive.sdk.network.p.USER_SKIP_ACTION_LATENCY : com.fyber.inneractive.sdk.network.p.USER_CLOSE_ACTION_LATENCY, adContent != null ? adContent.a : null, adContent != null ? adContent.d() : null, (adContent == null || (sVar = adContent.c) == null) ? null : sVar.c());
            JSONObject jSONObject = new JSONObject();
            String str2 = this.c ? "skip_action_latency" : "close_action_latency";
            try {
                jSONObject.put(str2, a);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", str2, a);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject.put("origin", str);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "origin", str);
                }
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
            a();
        }
    }
}
