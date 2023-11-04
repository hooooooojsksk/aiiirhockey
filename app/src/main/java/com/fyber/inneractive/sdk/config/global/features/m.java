package com.fyber.inneractive.sdk.config.global.features;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m extends h implements o {
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;

    /* loaded from: classes.dex */
    public enum a {
        EXPONENTIAL("EXPONENTIAL"),
        STATIC("STATIC");
        
        public final String stringName;

        a(String str) {
            this.stringName = str;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DEFAULT("DEFAULT"),
        OKHTTP("OKHTTP");
        
        public final String stringName;

        b(String str) {
            this.stringName = str;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e = timeUnit.toMillis(45L);
        f = timeUnit.toMillis(5L);
        g = timeUnit.toMillis(5L);
        h = timeUnit.toMillis(45L);
        i = timeUnit.toMillis(10L);
        j = timeUnit.toMillis(2L);
        k = timeUnit.toMillis(15L);
        l = timeUnit.toMillis(8L);
    }

    public m() {
        super("bid_net");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        m mVar = new m();
        a(mVar);
        return mVar;
    }

    public b c() {
        b[] values;
        String a2 = a("layer", "DEFAULT");
        for (b bVar : b.values()) {
            String str = bVar.stringName;
            Locale locale = Locale.ROOT;
            if (str.toLowerCase(locale).equals(a2.toLowerCase(locale))) {
                return bVar;
            }
        }
        return b.DEFAULT;
    }

    public int d() {
        Integer b2 = b("retries");
        if (b2 == null || b2.intValue() < 1 || b2.intValue() > 20) {
            return 0;
        }
        return b2.intValue();
    }

    public boolean e() {
        return a("dreloading", false);
    }
}
