package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class d extends h {
    public com.fyber.inneractive.sdk.model.vast.a e;

    public d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        d dVar = new d();
        a(dVar);
        return dVar;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str) || this.e != null) {
            return;
        }
        String a = a("install_" + str, (String) null);
        String a2 = a("skip_ad_" + str, (String) null);
        this.e = new com.fyber.inneractive.sdk.model.vast.a(a, a2, a("skip_in_" + str, (String) null));
    }
}
