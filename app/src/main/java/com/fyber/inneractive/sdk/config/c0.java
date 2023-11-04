package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c0 implements d0, h0.a {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public Orientation e;
    public Integer f;
    public Integer g;
    public Skip h;
    public TapAction i;
    public UnitDisplayType j;
    public List<Integer> k;

    public c0() {
        Boolean bool = Boolean.TRUE;
        this.a = bool;
        this.b = 5000;
        this.c = 0;
        this.d = bool;
        this.f = 0;
        this.g = 2048;
        this.h = Skip.fromValue(0);
        this.k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.h0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        h0.a(jSONObject, "autoPlay", this.a);
        h0.a(jSONObject, "maxBitrate", this.b);
        h0.a(jSONObject, "minBitrate", this.c);
        h0.a(jSONObject, "muted", this.d);
        h0.a(jSONObject, "orientation", this.e);
        h0.a(jSONObject, "padding", this.f);
        h0.a(jSONObject, "pivotBitrate", this.g);
        h0.a(jSONObject, "skip", this.h);
        h0.a(jSONObject, "tapAction", this.i);
        h0.a(jSONObject, "unitDisplayType", this.j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        h0.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    public Boolean b() {
        return this.a;
    }
}
