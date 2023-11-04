package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b0 {
    public final String a;
    public final String b;
    public final Map<String, String> c;

    public b0(WebResourceRequest webResourceRequest) {
        this.a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        this.c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.a.equals(b0Var.a) && this.b.equals(b0Var.b)) {
            return this.c.equals(b0Var.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
