package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ InneractiveAdRequest b;
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e c;
    public final /* synthetic */ r d;

    public t(r rVar, String str, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this.d = rVar;
        this.a = str;
        this.b = inneractiveAdRequest;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IAlog.a("Firing Event 803 - Stack trace - %s", this.a);
        com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.IA_AD_DESTROYED_WITHOUT_SHOW;
        InneractiveAdRequest inneractiveAdRequest = this.b;
        com.fyber.inneractive.sdk.response.e eVar = this.c;
        r rVar = this.d;
        q.a aVar = new q.a(oVar, inneractiveAdRequest, eVar, com.fyber.inneractive.sdk.config.global.s.a(rVar.h, rVar.e));
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        try {
            jSONObject.put("stack_trace", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "stack_trace", str);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }
}
