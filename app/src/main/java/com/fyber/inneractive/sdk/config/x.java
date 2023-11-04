package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.h0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x implements h0.a {
    public Set<Track> a = null;

    @Override // com.fyber.inneractive.sdk.util.h0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.a;
        if (set != null) {
            for (Track track : set) {
                jSONArray.put(track);
            }
        }
        h0.a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
