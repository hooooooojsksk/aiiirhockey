package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f0 implements g0 {
    public com.fyber.inneractive.sdk.cache.session.d a;
    public a d;
    public final Map<UnitDisplayType, Map<String, String>> b = new HashMap();
    public final Map<String, String> c = new HashMap();
    public boolean e = false;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public enum b {
        NO_CLICK("0"),
        CTA_BUTTON("1"),
        COMPANION("2"),
        VIDEO("3"),
        APP_INFO("4");
        
        public String value;

        b(String str) {
            this.value = str;
        }
    }

    public String a(UnitDisplayType unitDisplayType, String str) {
        Map<String, String> map = this.b.get(unitDisplayType);
        return (map == null || map.get(str) == null) ? "" : map.get(str);
    }

    public void a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map<String, String> map = this.b.get(unitDisplayType);
        if (map == null) {
            map = new HashMap<>();
            this.b.put(unitDisplayType, map);
        }
        map.put(str, str2);
        a aVar = this.d;
        if (aVar == null || !this.e) {
            return;
        }
        ((com.fyber.inneractive.sdk.bidder.a) aVar).b();
    }

    public JSONArray a(UnitDisplayType unitDisplayType) {
        com.fyber.inneractive.sdk.cache.session.enums.b[] values;
        com.fyber.inneractive.sdk.cache.session.d dVar = this.a;
        if (dVar != null) {
            dVar.getClass();
            JSONArray jSONArray = new JSONArray();
            try {
                for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
                    if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.NONE && (unitDisplayType == null || bVar.e() == unitDisplayType)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", bVar.e().value());
                        jSONObject.put("subType", bVar.name().toLowerCase().contains("video") ? "video" : "display");
                        com.fyber.inneractive.sdk.cache.session.h hVar = dVar.b.get(bVar);
                        int a2 = dVar.a();
                        if (a2 > 0 && hVar != null && hVar.size() >= a2) {
                            boolean f = bVar.f();
                            JSONArray jSONArray2 = new JSONArray();
                            ArrayList arrayList = new ArrayList(hVar);
                            Collections.sort(arrayList, new com.fyber.inneractive.sdk.cache.session.g(hVar));
                            Iterator it = arrayList.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                jSONArray2.put(((com.fyber.inneractive.sdk.cache.session.e) it.next()).a(false, f));
                                i++;
                                if (i >= a2) {
                                    break;
                                }
                            }
                            jSONObject.put("sessionData", jSONArray2);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            } catch (Exception unused) {
                return jSONArray;
            }
        }
        return null;
    }

    public void a(com.fyber.inneractive.sdk.cache.session.enums.b bVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar) {
        com.fyber.inneractive.sdk.cache.session.d dVar = this.a;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.cache.session.c(dVar, aVar, bVar));
        }
    }

    public void a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String str : strArr) {
            a(unitDisplayType, str, "0");
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }
}
