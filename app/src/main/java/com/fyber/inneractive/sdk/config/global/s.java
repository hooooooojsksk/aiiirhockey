package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s {
    public Map<Class<? extends com.fyber.inneractive.sdk.config.global.features.h>, com.fyber.inneractive.sdk.config.global.features.h> c;
    public JSONArray d;
    public String b = "";
    public final r a = new r();

    public s() {
        e();
        Map<Class<? extends com.fyber.inneractive.sdk.config.global.features.h>, com.fyber.inneractive.sdk.config.global.features.h> a = a();
        this.c = a;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", a);
    }

    public static s b() {
        boolean f = f();
        s sVar = new s();
        if (f) {
            IAConfigManager iAConfigManager = IAConfigManager.M;
            iAConfigManager.L.a("", true);
            iAConfigManager.E.a(iAConfigManager.L);
        }
        return sVar;
    }

    public static boolean f() {
        int i = com.fyber.inneractive.sdk.config.f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        if (TextUtils.isEmpty(property)) {
            return false;
        }
        try {
            IAConfigManager.M.z.a = l.a(new JSONObject(property));
            return true;
        } catch (Exception unused) {
            IAlog.a("failed parsing local features json", new Object[0]);
            return false;
        }
    }

    public Map<Class<? extends com.fyber.inneractive.sdk.config.global.features.h>, com.fyber.inneractive.sdk.config.global.features.h> a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class<? extends com.fyber.inneractive.sdk.config.global.features.h>, com.fyber.inneractive.sdk.config.global.features.h> entry : this.c.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().b());
        }
        return hashMap;
    }

    public JSONArray c() {
        if (this.d == null) {
            JSONArray a = g.a(this.c, false);
            this.d = a;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        }
        return this.d;
    }

    public JSONArray d() {
        JSONArray a = g.a(this.c, true);
        IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a);
        return a;
    }

    public void e() {
        this.a.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.q.class, new com.fyber.inneractive.sdk.config.global.features.q());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.i.class, new com.fyber.inneractive.sdk.config.global.features.i());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.p.class, new com.fyber.inneractive.sdk.config.global.features.p());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.a.class, new com.fyber.inneractive.sdk.config.global.features.a());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        this.c = hashMap;
        this.d = null;
    }

    public void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.h hVar : this.c.values()) {
            List<b> list = hVar.c;
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = list.get(size);
                List<d> list2 = bVar.d;
                if (list2 != null) {
                    Iterator<d> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d next = it.next();
                        if (next.a(eVar)) {
                            hVar.c.remove(bVar);
                            hVar.d.remove(bVar.a);
                            this.d = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.a, next);
                            break;
                        }
                    }
                }
            }
        }
    }

    public <T extends com.fyber.inneractive.sdk.config.global.features.h> T a(Class<T> cls) {
        if (this.c.containsKey(cls)) {
            T t = (T) this.c.get(cls);
            if (cls.isInstance(t)) {
                return t;
            }
        }
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            IAlog.a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    public static JSONArray a(com.fyber.inneractive.sdk.flow.h hVar, com.fyber.inneractive.sdk.flow.o<?> oVar) {
        s sVar;
        s sVar2;
        if (hVar == null || (sVar2 = hVar.f) == null) {
            if (oVar == null || (sVar = oVar.c) == null) {
                return null;
            }
            return sVar.c();
        }
        return sVar2.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0165 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.s.a(java.lang.String, boolean):void");
    }
}
