package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.dv.g;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.fyber.inneractive.sdk.dv.handler.a<QueryInfo> {
    public final HashMap<AdFormat, QueryInfo> a = new HashMap<>();
    public boolean b = false;
    public final Object c = new Object();
    public int d = 0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.handler.a
    public void a() {
        AdFormat[] values;
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                m.a(new b(this, adFormat));
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0022 -> B:28:0x0024). Please submit an issue!!! */
    public static String b() {
        try {
            try {
                Object invoke = Class.forName("com.google.android.gms.ads.MobileAds").getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
                if (invoke != null) {
                    return invoke.toString();
                }
            } catch (NoSuchMethodException unused) {
                return MobileAds.getVersionString();
            }
        } catch (Throwable unused2) {
        }
        return "na";
    }

    @Override // com.fyber.inneractive.sdk.dv.handler.a
    public g a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        g gVar;
        int i = a.a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = this.a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.c) {
                this.a.remove(adFormat);
            }
            gVar = new g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.a("DVHanlder - get query: %s", gVar);
        m.a(new b(this, adFormat));
        return gVar;
    }

    public static void a(String str, com.fyber.inneractive.sdk.dv.enums.a aVar, InneractiveAdRequest inneractiveAdRequest, e eVar, String str2) {
        IAlog.a(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", aVar.name(), str2), new Object[0]);
        q.a aVar2 = new q.a(o.DV_ERROR_PHASE, inneractiveAdRequest, eVar, (JSONArray) null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spot_id", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "spot_id", str);
        }
        String lowerCase = aVar.name().toLowerCase();
        try {
            jSONObject.put("phase", lowerCase);
        } catch (Exception unused2) {
            IAlog.e("Got exception adding param to json object: %s, %s", "phase", lowerCase);
        }
        String b = b();
        try {
            jSONObject.put(ClientCookie.VERSION_ATTR, b);
        } catch (Exception unused3) {
            IAlog.e("Got exception adding param to json object: %s, %s", ClientCookie.VERSION_ATTR, b);
        }
        try {
            jSONObject.put("message", str2);
        } catch (Exception unused4) {
            IAlog.e("Got exception adding param to json object: %s, %s", "message", str2);
        }
        aVar2.f.put(jSONObject);
        aVar2.a((String) null);
    }
}
