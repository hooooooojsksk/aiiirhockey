package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b0 extends d0<com.fyber.inneractive.sdk.response.e> implements m {
    public final InneractiveAdRequest i;
    public Map<String, String> j;
    public StringBuffer k;
    public final com.fyber.inneractive.sdk.serverapi.c l;
    public com.fyber.inneractive.sdk.dv.g m;
    public boolean n;

    public b0(u<com.fyber.inneractive.sdk.response.e> uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s sVar) {
        this(uVar, inneractiveAdRequest, new com.fyber.inneractive.sdk.serverapi.b(sVar), v.a().c(), sVar);
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        int i = com.fyber.inneractive.sdk.config.f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String a = TextUtils.isEmpty(property) ? "https://" + IAConfigManager.M.i.f : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        InneractiveAdRequest inneractiveAdRequest = this.i;
        com.fyber.inneractive.sdk.serverapi.c cVar = this.l;
        c0 c0Var = new c0(inneractiveAdRequest, cVar);
        c0Var.c = new HashMap();
        c0Var.a("fromSDK", Boolean.toString(true));
        c0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        c0Var.a(ClientCookie.SECURE_ATTR, (com.fyber.inneractive.sdk.util.p.a() ^ true) || IAConfigManager.M.r ? "1" : "0");
        c0Var.a("spotid", inneractiveAdRequest.getSpotId());
        String property2 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property2 == null) {
            property2 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.a0) inneractiveAdRequest.getSelectedUnitConfig()).a;
        }
        c0Var.a("uid", property2);
        IAConfigManager iAConfigManager = IAConfigManager.M;
        if (!TextUtils.isEmpty(iAConfigManager.o)) {
            c0Var.a("med", String.format("%s_%s", iAConfigManager.m, iAConfigManager.o));
        } else {
            c0Var.a("med", iAConfigManager.m);
        }
        cVar.getClass();
        c0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.b bVar = (com.fyber.inneractive.sdk.serverapi.b) cVar;
        List<Integer> list = com.fyber.inneractive.sdk.serverapi.b.d;
        if (!list.isEmpty()) {
            c0Var.a("protocols", com.fyber.inneractive.sdk.util.l.a(",", list));
        }
        List<String> list2 = com.fyber.inneractive.sdk.serverapi.b.e;
        if (!list2.isEmpty()) {
            c0Var.a("mimes", com.fyber.inneractive.sdk.util.l.b(",", list2));
        }
        List<Integer> list3 = com.fyber.inneractive.sdk.serverapi.b.c;
        if (!list3.isEmpty()) {
            c0Var.a("api", com.fyber.inneractive.sdk.util.l.a(",", list3));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            c0Var.a("zip", iAConfigManager.j.getZipCode());
        }
        c0Var.a("a", Integer.toString(iAConfigManager.j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            c0Var.a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            c0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        c0Var.a("k", iAConfigManager.k);
        c0Var.a("t", Long.toString(System.currentTimeMillis()));
        c0Var.a("v", bVar.a("2.2.0"));
        Boolean a2 = iAConfigManager.D.a();
        if (a2 != null) {
            c0Var.a("gdpr_privacy_consent", a2.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.d dVar = iAConfigManager.D;
        if (dVar != null) {
            Boolean bool = com.fyber.inneractive.sdk.util.l.a == null ? null : dVar.f;
            if (bool != null) {
                c0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.D.g;
            if (bool2 != null && bool2.booleanValue()) {
                c0Var.a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property3 = System.getProperty("ia.testEnvironmentConfiguration.device");
            String str = com.fyber.inneractive.sdk.config.l.b() ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property3)) {
                property3 = com.fyber.inneractive.sdk.config.l.a();
            }
            c0Var.a(str, property3);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            c0Var.a("dnt", Boolean.toString(com.fyber.inneractive.sdk.config.l.c()));
        }
        c0Var.a("dml", bVar.b());
        int c = com.fyber.inneractive.sdk.util.l.c(com.fyber.inneractive.sdk.util.l.e());
        int c2 = com.fyber.inneractive.sdk.util.l.c(com.fyber.inneractive.sdk.util.l.d());
        if (c > 0 && c2 > 0) {
            c0Var.a("w", Integer.toString(c));
            c0Var.a("h", Integer.toString(c2));
        }
        int c3 = com.fyber.inneractive.sdk.util.l.c();
        c0Var.a("o", c3 == 1 ? "p" : c3 == 2 ? "l" : "u");
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            c0Var.a("ciso", com.fyber.inneractive.sdk.util.j.g());
            c0Var.a("mcc", bVar.c());
            c0Var.a("mnc", bVar.d());
            c0Var.a("nt", com.fyber.inneractive.sdk.util.f0.e().key);
            c0Var.a("crn", bVar.a());
        }
        c0Var.a("os", "Android");
        c0Var.a("lng", iAConfigManager.p);
        List<String> list4 = iAConfigManager.q;
        if (list4 != null && !list4.isEmpty()) {
            c0Var.a("in_lng", com.fyber.inneractive.sdk.util.l.b(",", list4));
        }
        c0Var.a("bid", com.fyber.inneractive.sdk.util.l.a.getPackageName());
        c0Var.a("appv", bVar.f());
        com.fyber.inneractive.sdk.config.d dVar2 = iAConfigManager.D;
        dVar2.getClass();
        c0Var.a("gdpr_consent_data", com.fyber.inneractive.sdk.util.l.a == null ? null : dVar2.b);
        com.fyber.inneractive.sdk.config.d dVar3 = iAConfigManager.D;
        dVar3.getClass();
        c0Var.a("us_privacy", com.fyber.inneractive.sdk.util.l.a == null ? null : dVar3.e);
        c0Var.a("mute_video", Boolean.toString(iAConfigManager.l));
        c0Var.a("osv", Build.VERSION.RELEASE);
        c0Var.a("ignitep", iAConfigManager.E.c);
        c0Var.a("ignitev", iAConfigManager.E.d);
        HashMap hashMap = new HashMap();
        bVar.a(hashMap, inneractiveAdRequest.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            c0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            c0Var.a("childMode", "1");
        }
        Map<String, String> map = c0Var.c;
        StringBuilder sb = new StringBuilder(a);
        boolean z = true;
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            sb.append(z ? "?" : "&");
            sb.append(entry2.getKey());
            sb.append("=");
            sb.append(Uri.encode(entry2.getValue()));
            z = false;
        }
        String sb2 = sb.toString();
        if (!this.n) {
            int i2 = IAlog.a;
            IAlog.a(1, null, "%s %s", "AD_REQUEST", sb2);
            this.n = true;
        }
        return sb2;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public StringBuffer d() {
        return this.k;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public q0 k() {
        com.fyber.inneractive.sdk.config.global.features.b bVar;
        com.fyber.inneractive.sdk.config.global.s sVar = this.h;
        if (sVar != null && (bVar = (com.fyber.inneractive.sdk.config.global.features.b) sVar.a(com.fyber.inneractive.sdk.config.global.features.b.class)) != null) {
            Integer b = bVar.b("connect_timeout");
            int max = Math.max(b != null ? b.intValue() : 5000, 1);
            Integer b2 = bVar.b("read_timeout");
            return new q0(max, Math.max(b2 != null ? b2.intValue() : 5000, 1));
        }
        return super.k();
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean l() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public Map<String, String> p() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public Map<String, String> s() {
        int i = com.fyber.inneractive.sdk.config.f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return hashMap;
    }

    public b0(u<com.fyber.inneractive.sdk.response.e> uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.c cVar, g gVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(uVar, gVar, sVar);
        this.m = null;
        this.n = false;
        this.i = inneractiveAdRequest;
        this.l = cVar;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public byte[] q() {
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.s sVar = ((com.fyber.inneractive.sdk.serverapi.b) this.l).a;
            JSONArray d = sVar != null ? sVar.d() : null;
            if (d != null && d.length() > 0) {
                jSONObject2.put("experiments", d);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a = com.fyber.inneractive.sdk.serverapi.a.a(this.i.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.M;
            JSONArray a2 = iAConfigManager.x.a(a);
            if (a2 != null && a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            int a3 = iAConfigManager.u.b.a("dv_enabled_v2", 0, 0);
            if (a != null && a3 == 1) {
                com.fyber.inneractive.sdk.dv.g a4 = iAConfigManager.F.a(a);
                this.m = a4;
                if (a4 != null) {
                    jSONObject.put("gdem_signal", a4.a.getQuery());
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = jSONObject.toString().getBytes("UTF-8");
            }
            IAlog.a("request json body - %s", jSONObject.toString());
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0076 A[Catch: Exception -> 0x0085, TryCatch #0 {Exception -> 0x0085, blocks: (B:76:0x0054, B:78:0x0058, B:80:0x006c, B:85:0x0076, B:87:0x007c), top: B:93:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007b  */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, com.fyber.inneractive.sdk.response.e] */
    @Override // com.fyber.inneractive.sdk.network.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.network.z a(com.fyber.inneractive.sdk.network.j r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L3a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L10
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L10
            int r4 = r3.size()
            if (r4 <= 0) goto L10
            java.lang.String r2 = r2.toLowerCase()
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L10
        L38:
            r5.j = r0
        L3a:
            java.io.InputStream r6 = r6.c
            r7 = 0
            if (r6 == 0) goto L4f
            java.lang.StringBuffer r6 = com.fyber.inneractive.sdk.util.q.a(r6, r8)     // Catch: java.lang.Exception -> L44
            goto L4d
        L44:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "failed create response builder in network request ad"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r6, r0)
            r6 = r7
        L4d:
            r5.k = r6
        L4f:
            com.fyber.inneractive.sdk.network.z r6 = new com.fyber.inneractive.sdk.network.z
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.j     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L73
            com.fyber.inneractive.sdk.network.l r1 = com.fyber.inneractive.sdk.network.l.RETURNED_AD_TYPE     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = r1.key     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Exception -> L85
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L85
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L85
            if (r1 != 0) goto L73
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch: java.lang.Exception -> L85
            if (r1 == 0) goto L73
            goto L74
        L73:
            r0 = r7
        L74:
            if (r0 == 0) goto L7b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L85
            goto L7c
        L7b:
            r0 = 6
        L7c:
            com.fyber.inneractive.sdk.dv.g r1 = r5.m     // Catch: java.lang.Exception -> L85
            com.fyber.inneractive.sdk.response.e r7 = r5.a(r0, r5, r7, r1)     // Catch: java.lang.Exception -> L85
            r6.a = r7     // Catch: java.lang.Exception -> L85
            return r6
        L85:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.a(r8, r6, r7)
            com.fyber.inneractive.sdk.network.y r7 = new com.fyber.inneractive.sdk.network.y
            r7.<init>(r6)
            goto L94
        L93:
            throw r7
        L94:
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.b0.a(com.fyber.inneractive.sdk.network.j, java.util.Map, int):com.fyber.inneractive.sdk.network.z");
    }
}
