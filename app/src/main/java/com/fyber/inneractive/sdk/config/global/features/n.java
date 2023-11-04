package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes.dex */
public class n extends h {
    public n() {
        super("single_tap");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        n nVar = new n();
        a(nVar);
        return nVar;
    }

    public String c() {
        String a = a("app_info_button_text", "App Info");
        return (a == null || a.length() <= 30) ? a : a.substring(0, 30);
    }
}
