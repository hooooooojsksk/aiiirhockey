package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.e;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c<T extends com.fyber.inneractive.sdk.response.e> extends com.fyber.inneractive.sdk.metrics.a {
    public static final String e = String.valueOf(24);
    public static final String f = String.valueOf(1);
    public final T b;
    public final InneractiveAdRequest c;
    public final JSONArray d;

    public c(T t, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.b = t;
        this.c = inneractiveAdRequest;
        this.d = jSONArray;
    }
}
