package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes.dex */
public class c extends h {
    public c() {
        super("child_mode");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        c cVar = new c();
        a(cVar);
        return cVar;
    }

    public int c() {
        Integer b = b("skip_time_sec");
        int intValue = b != null ? b.intValue() : 5;
        if (intValue < 0 || intValue > 8) {
            return 5;
        }
        return intValue;
    }
}
