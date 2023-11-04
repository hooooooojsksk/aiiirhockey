package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.k0;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {
    public String a;
    public Map<String, String> b;
    public com.fyber.inneractive.sdk.web.i c;
    public k0 d;

    public b(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        this.b = map;
        this.d = k0Var;
        this.c = iVar;
    }

    public int a(String str) {
        String str2 = this.b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void a();

    public abstract boolean b();
}
