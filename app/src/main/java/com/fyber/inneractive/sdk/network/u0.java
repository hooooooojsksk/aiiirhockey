package com.fyber.inneractive.sdk.network;

/* loaded from: classes.dex */
public enum u0 {
    EVENT_TABLE("sdk_event_"),
    ERROR_TABLE("sdk_error_");
    
    private final String tableName;

    u0(String str) {
        this.tableName = str;
    }

    public String e() {
        return this.tableName;
    }
}
