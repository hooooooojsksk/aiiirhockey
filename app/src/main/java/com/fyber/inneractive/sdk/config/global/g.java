package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    public static JSONArray a(Map<Class<? extends com.fyber.inneractive.sdk.config.global.features.h>, com.fyber.inneractive.sdk.config.global.features.h> map, boolean z) {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : map.values()) {
                List<b> list = hVar.c;
                Map<String, k> map2 = hVar.d;
                for (b bVar : list) {
                    JSONObject jSONObject = new JSONObject();
                    String str = bVar.a;
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = map2.get(str);
                        jSONObject.put(FacebookMediationAdapter.KEY_ID, str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z) {
                            Iterator<d> it = bVar.d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    dVar = null;
                                    break;
                                }
                                dVar = it.next();
                                if (c.class.equals(dVar.getClass())) {
                                    break;
                                }
                            }
                            if (dVar != null && ((c) dVar).b) {
                                Set<Long> set = ((c) dVar).a;
                                JSONArray jSONArray2 = new JSONArray();
                                for (Long l : set) {
                                    jSONArray2.put(l);
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
