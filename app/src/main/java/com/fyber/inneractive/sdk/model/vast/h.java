package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum h {
    Jpeg("image/jpeg"),
    Jpg("image/jpg"),
    Gif("image/gif"),
    Png("image/png");
    
    private static final Map<String, h> sCreativeTypeMap = new HashMap();
    private String mMimeType;

    static {
        h[] values;
        for (h hVar : values()) {
            sCreativeTypeMap.put(hVar.mMimeType, hVar);
        }
    }

    h(String str) {
        this.mMimeType = str;
    }

    public static h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sCreativeTypeMap.get(str.toLowerCase());
    }

    public String e() {
        return this.mMimeType;
    }
}
