package com.fyber.inneractive.sdk.config.enums;

import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT(CookieSpecs.DEFAULT, false);
    
    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        UnitDisplayType[] values;
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = CONSTANTS.get(str);
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
