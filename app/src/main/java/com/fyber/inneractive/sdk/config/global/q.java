package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class q extends p {
    public String b;
    public final Map<String, b> c = new HashMap();

    public String toString() {
        return String.format("feature: id=%s, params=%s, exp=%s", this.b, this.a, this.c);
    }
}
