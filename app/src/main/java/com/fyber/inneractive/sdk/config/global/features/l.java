package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class l extends h {
    public l() {
        super("omsdk");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        l lVar = new l();
        a(lVar);
        return lVar;
    }

    public boolean c() {
        boolean a = a("enable", false);
        IAlog.a("OMSDK AB %s", String.valueOf(a));
        return a;
    }
}
