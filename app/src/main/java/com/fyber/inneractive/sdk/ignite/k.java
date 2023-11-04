package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum k {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE("none");
    
    private static final Map<String, k> CONSTANTS = new HashMap();
    private final String value;

    static {
        k[] values;
        for (k kVar : values()) {
            CONSTANTS.put(kVar.value, kVar);
        }
    }

    k(String str) {
        this.value = str;
    }

    public static k a(String str) {
        return CONSTANTS.get(str);
    }

    public boolean e() {
        return this == TRUE_SINGLE_TAP;
    }

    public String f() {
        return this.value;
    }
}
