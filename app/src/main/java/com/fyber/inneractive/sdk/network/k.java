package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k {
    public String a;
    public Map<String, Object> b;
    public String c = null;

    public k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b = new HashMap();
            this.a = str;
            return;
        }
        throw new InvalidParameterException();
    }

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
