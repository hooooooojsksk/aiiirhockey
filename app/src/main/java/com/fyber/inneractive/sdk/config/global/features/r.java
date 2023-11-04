package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
public class r extends h {
    public static final b e = b.NONE;
    public static final c f = c.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE("none"),
        OPEN("open");
        
        public String mKey;

        b(String str) {
            this.mKey = str;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE("none"),
        ZOOM_IN("endcard_zoom_in");
        
        public String mKey;

        c(String str) {
            this.mKey = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LEGACY("legacy"),
        EXTRACTOR("extractor"),
        NONE("none");
        
        public String key;

        d(String str) {
            this.key = str;
        }
    }

    public r() {
        super("video_player");
    }

    public int a(UnitDisplayType unitDisplayType) {
        if (unitDisplayType == UnitDisplayType.INTERSTITIAL) {
            Integer b2 = b("prebuffer_interstitial");
            if (b2 != null) {
                return b2.intValue();
            }
            return 3;
        }
        Integer b3 = b("prebuffer_rewarded");
        if (b3 != null) {
            return b3.intValue();
        }
        return 3;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public h b() {
        r rVar = new r();
        a(rVar);
        return rVar;
    }

    public boolean c() {
        return a("cta_text_all_caps", false);
    }

    public int d() {
        Integer b2 = b("dl_retries");
        if (b2 != null) {
            return b2.intValue();
        }
        return 10;
    }

    public int e() {
        Integer b2 = b("dl_retry_delay");
        return b2 != null ? b2.intValue() : HttpStatus.SC_INTERNAL_SERVER_ERROR;
    }

    public int f() {
        Integer b2 = b("max_tries");
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    public int g() {
        Integer b2 = b("second_checkpoint");
        if (b2 != null) {
            return b2.intValue();
        }
        return 25;
    }
}
