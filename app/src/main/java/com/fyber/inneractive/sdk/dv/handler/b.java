package com.fyber.inneractive.sdk.dv.handler;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ AdFormat a;
    public final /* synthetic */ c b;

    /* loaded from: classes.dex */
    public class a extends QueryInfoGenerationCallback {
        public a() {
            b.this = r1;
        }

        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
        public void onFailure(String str) {
            b bVar = b.this;
            c cVar = bVar.b;
            if (cVar.b) {
                return;
            }
            AdFormat adFormat = bVar.a;
            cVar.getClass();
            IAlog.a(String.format("Firing Event 1000 - Fetch error DV - msg  %s", str), new Object[0]);
            q.a aVar = new q.a(o.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (e) null, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message", str);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", str);
            }
            String b = c.b();
            try {
                jSONObject.put(ClientCookie.VERSION_ATTR, b);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", ClientCookie.VERSION_ATTR, b);
            }
            String name = adFormat.name();
            try {
                jSONObject.put("adFormat", name);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "adFormat", name);
            }
            Integer valueOf = Integer.valueOf(cVar.d);
            try {
                jSONObject.put("success_count", valueOf);
            } catch (Exception unused4) {
                IAlog.e("Got exception adding param to json object: %s, %s", "success_count", valueOf);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
            b.this.b.b = true;
        }

        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
        public void onSuccess(QueryInfo queryInfo) {
            IAlog.a("DVHanlder - %s - put query: %s", b.this.a.toString(), queryInfo.getQuery());
            synchronized (b.this.b.c) {
                b bVar = b.this;
                c cVar = bVar.b;
                cVar.d++;
                cVar.a.put(bVar.a, queryInfo);
            }
        }
    }

    public b(c cVar, AdFormat adFormat) {
        this.b = cVar;
        this.a = adFormat;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_3");
            QueryInfo.generate(l.a, this.a, new AdRequest.Builder().setRequestAgent(String.format("FyberMarketplace-v%s", "8.2.3")).addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new a());
        } catch (Throwable unused) {
        }
    }
}
