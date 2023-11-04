package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q extends k {

    /* loaded from: classes.dex */
    public static class a {
        public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        public InneractiveAdRequest a;
        public o b;
        public p c;
        public JSONArray d;
        public com.fyber.inneractive.sdk.response.e e;
        public JSONArray f;
        public boolean g;

        /* renamed from: com.fyber.inneractive.sdk.network.q$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0023a implements Runnable {
            public final /* synthetic */ q a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;
            public final /* synthetic */ Object f;
            public final /* synthetic */ String g;

            public RunnableC0023a(q qVar, String str, String str2, String str3, String str4, Object obj, String str5) {
                a.this = r1;
                this.a = qVar;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = obj;
                this.g = str5;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String valueOf;
                boolean z;
                Map<String, Object> map;
                com.fyber.inneractive.sdk.response.e eVar;
                this.a.a("contentid", this.b);
                this.a.a("fairbidv", this.c);
                a aVar = a.this;
                o oVar = aVar.b;
                if (oVar != null) {
                    this.a.a(NotificationCompat.CATEGORY_ERROR, Integer.valueOf(oVar.val));
                    a.this.b.getClass();
                    str = u0.ERROR_TABLE.e();
                    IAlog.a("Event dispatcher - dispatching error: %s", a.this.b);
                    int i = IAlog.a;
                    IAlog.a(1, null, "%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(a.this.b.val));
                } else {
                    p pVar = aVar.c;
                    if (pVar != null) {
                        this.a.a(NotificationCompat.CATEGORY_EVENT, Integer.valueOf(pVar.val));
                        a.this.c.getClass();
                        str = u0.EVENT_TABLE.e();
                        IAlog.a("Event dispatcher - dispatching event: %s", a.this.c);
                        int i2 = IAlog.a;
                        IAlog.a(1, null, "%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(a.this.c.val));
                    } else {
                        str = null;
                    }
                }
                if (!TextUtils.isEmpty(this.d)) {
                    this.a.a("placement_type", this.d);
                }
                if (!TextUtils.isEmpty(this.e)) {
                    this.a.a("spot_id", this.e);
                }
                if (!InneractiveAdManager.isCurrentUserAChild()) {
                    this.a.a("ciso", com.fyber.inneractive.sdk.util.j.g());
                }
                this.a.a("ad_type", this.f);
                if (a.this.g && !TextUtils.isEmpty(this.g)) {
                    this.a.c = this.g;
                }
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                this.a.a("n", com.fyber.inneractive.sdk.util.f0.e().key);
                this.a.a("date_created", Long.valueOf(calendar.getTimeInMillis()));
                try {
                    this.a.a("day", a.h.format(calendar.getTime()));
                } catch (Throwable unused) {
                }
                this.a.a("hour", Integer.valueOf(calendar.get(11)));
                q qVar = this.a;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                a aVar2 = a.this;
                o oVar2 = aVar2.b;
                if (oVar2 != null) {
                    valueOf = String.valueOf(oVar2.val);
                } else {
                    valueOf = String.valueOf(aVar2.c.val);
                }
                sb.append(valueOf);
                qVar.a("table", sb.toString());
                JSONArray jSONArray = a.this.d;
                if (jSONArray != null && jSONArray.length() > 0) {
                    this.a.a("experiments", a.this.d);
                }
                com.fyber.inneractive.sdk.response.e eVar2 = a.this.e;
                if (eVar2 != null && eVar2.B) {
                    this.a.a("sdk_bidding", "1");
                }
                if (InneractiveAdManager.isCurrentUserAChild()) {
                    this.a.a("child_mode", "1");
                }
                IAConfigManager iAConfigManager = IAConfigManager.M;
                this.a.a("ignite", iAConfigManager.E.d() && (eVar = a.this.e) != null && eVar.F != com.fyber.inneractive.sdk.ignite.k.NONE ? "1" : "0");
                this.a.a("ignitep", iAConfigManager.E.c);
                this.a.a("ignitev", iAConfigManager.E.d);
                JSONArray c = iAConfigManager.L.c();
                if (c != null && c.length() > 0) {
                    this.a.a("s_experiments", c);
                }
                JSONArray jSONArray2 = a.this.f;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        if (jSONArray2.optJSONObject(i3).length() >= 1) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    this.a.a("extra", a.this.f);
                }
                q qVar2 = this.a;
                qVar2.getClass();
                if ((TextUtils.isEmpty(qVar2.a) || (map = qVar2.b) == null || map.size() == 0) ? false : true) {
                    c cVar = IAConfigManager.M.H;
                    cVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    Map<String, Object> map2 = qVar2.b;
                    for (String str2 : map2.keySet()) {
                        Object obj = map2.get(str2);
                        if (obj != null) {
                            try {
                                jSONObject.put(str2, obj);
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                    String str3 = qVar2.c;
                    if (str3 != null) {
                        int length = str3.length();
                        if (length > 51200) {
                            int indexOf = str3.indexOf("iawrapper");
                            if (indexOf == -1) {
                                indexOf = 0;
                            }
                            str3 = str3.substring(indexOf, 51199);
                            IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
                        }
                        try {
                            jSONObject.put("ad", str3);
                        } catch (JSONException e) {
                            IAlog.a("Failed inserting ad body to json", e, new Object[0]);
                        }
                    }
                    int i4 = IAlog.a;
                    int i5 = IAlog.a;
                    if (i4 == 1) {
                        try {
                            IAlog.a(1, null, "%s, Event: %s", "SDK_EVENT", jSONObject.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                    cVar.a.offer(jSONObject);
                    if (cVar.a.size() > 30) {
                        Handler handler = cVar.d;
                        if (handler != null && handler.hasMessages(12312329)) {
                            cVar.d.removeMessages(12312329);
                        }
                        cVar.a(12312329, 0L);
                    }
                }
            }
        }

        public a(o oVar) {
            this(oVar, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
        }

        public a a(Object... objArr) {
            if (objArr.length > 0) {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length - 1; i += 2) {
                    String obj = objArr[i].toString();
                    Object obj2 = objArr[i + 1];
                    try {
                        jSONObject.put(obj, obj2);
                    } catch (Exception unused) {
                        IAlog.e("Got exception adding param to json object: %s, %s", obj, obj2);
                    }
                }
                this.f.put(jSONObject);
            }
            return this;
        }

        public a(o oVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
            this(eVar);
            this.b = oVar;
            this.a = inneractiveAdRequest;
            this.d = jSONArray;
        }

        public a(p pVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
            this(eVar);
            this.c = pVar;
            this.a = inneractiveAdRequest;
            this.d = jSONArray;
        }

        /* JADX WARN: Removed duplicated region for block: B:179:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x013d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.String r20) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.q.a.a(java.lang.String):void");
        }

        public a(com.fyber.inneractive.sdk.response.e eVar) {
            this.g = false;
            this.e = eVar;
            this.f = new JSONArray();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public JSONObject a = new JSONObject();

        public b a(String str, Object obj) {
            try {
                this.a.put(str, obj);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    public q(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        super(com.fyber.inneractive.sdk.config.a.b());
        a("osn", "Android");
        a("osv", Build.VERSION.RELEASE);
        a("model", com.fyber.inneractive.sdk.util.j.h());
        a("sdkv", str7 == null ? "8.2.3" : str7);
        a("pkgn", com.fyber.inneractive.sdk.util.j.k());
        a("pkgv", com.fyber.inneractive.sdk.util.j.l());
        a("appid", str);
        a("session", str2);
        a("adnt", str3);
        a("adnt_id", l);
        a("creative_id", str4);
        a("adomain", str5);
        a("campaign_id", str6);
    }
}
