package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.q;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b<T extends com.fyber.inneractive.sdk.response.e> extends com.fyber.inneractive.sdk.metrics.a {
    public static final String g = String.valueOf(24);
    public static final String h = String.valueOf(3);
    public static final String i = String.valueOf(24);
    public static final String j = String.valueOf(3);
    public final String b;
    public final UnitDisplayType c;
    public final T d;
    public final InneractiveAdRequest e;
    public final JSONArray f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ f a;
        public final /* synthetic */ Map b;

        public a(f fVar, Map map) {
            b.this = r1;
            this.a = fVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnitDisplayType unitDisplayType;
            int a;
            int a2;
            String str;
            IAlog.a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
            b bVar = b.this;
            if (bVar.b == null || (unitDisplayType = bVar.c) == null) {
                return;
            }
            UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
            if (unitDisplayType != unitDisplayType2 && unitDisplayType != UnitDisplayType.MRECT && !unitDisplayType.isFullscreenUnit()) {
                IAlog.a("Unit display type %s is not supported for metric event", b.this.c.value());
                return;
            }
            IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.a.toString());
            UnitDisplayType unitDisplayType3 = b.this.c;
            if (unitDisplayType3 != unitDisplayType2 && unitDisplayType3 != UnitDisplayType.MRECT) {
                IAConfigManager iAConfigManager = IAConfigManager.M;
                i iVar = iAConfigManager.u.b;
                String str2 = b.i;
                if (iVar.a.containsKey("ad_metrics_interval_interstitial")) {
                    str2 = iVar.a.get("ad_metrics_interval_interstitial");
                }
                i iVar2 = iAConfigManager.u.b;
                String str3 = b.j;
                if (iVar2.a.containsKey("ad_metrics_limit_interstitial")) {
                    str3 = iVar2.a.get("ad_metrics_limit_interstitial");
                }
                a = q.a(str2, 24);
                a2 = q.a(str3, 3);
                str = "LastSentMetricsInterstitial";
            } else {
                IAConfigManager iAConfigManager2 = IAConfigManager.M;
                i iVar3 = iAConfigManager2.u.b;
                String str4 = b.g;
                if (iVar3.a.containsKey("ad_metrics_interval_banner")) {
                    str4 = iVar3.a.get("ad_metrics_interval_banner");
                }
                i iVar4 = iAConfigManager2.u.b;
                String str5 = b.h;
                if (iVar4.a.containsKey("ad_metrics_limit_banner")) {
                    str5 = iVar4.a.get("ad_metrics_limit_banner");
                }
                a = q.a(str4, 24);
                a2 = q.a(str5, 3);
                str = "LastSentMetricsBanner";
            }
            Application application = l.a;
            if (application != null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
                } catch (JSONException unused) {
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                b bVar2 = b.this;
                bVar2.getClass();
                if (IAConfigManager.M.u.b.a(bVar2.a, false) && !com.fyber.inneractive.sdk.metrics.a.a(a, a2, jSONArray, copyOnWriteArrayList)) {
                    copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                    b bVar3 = b.this;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.e;
                    T t = bVar3.d;
                    Map map = this.b;
                    bVar3.getClass();
                    try {
                        q.a aVar = new q.a(p.METRIC_MEASUREMENTS_EVENT, inneractiveAdRequest, t, bVar3.f);
                        JSONObject jSONObject = new JSONObject();
                        for (String str6 : map.keySet()) {
                            Object obj = map.get(str6);
                            try {
                                jSONObject.put(str6, obj);
                            } catch (Exception unused2) {
                                IAlog.e("Got exception adding param to json object: %s, %s", str6, obj);
                            }
                        }
                        aVar.f.put(jSONObject);
                        aVar.a((String) null);
                    } catch (Exception unused3) {
                    }
                }
                sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
            }
        }
    }

    public b(T t, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.d = t;
        this.e = inneractiveAdRequest;
        this.b = str;
        this.c = unitDisplayType;
        this.f = jSONArray;
    }

    public void a() {
        c cVar = c.d;
        f a2 = cVar.a(this.b);
        Map<String, Long> j2 = a2.j();
        if (!a2.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", cVar.a(this.b).toString());
            return;
        }
        cVar.a.remove(this.b);
        m.a(new a(a2, j2));
    }
}
