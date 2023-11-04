package com.fyber.inneractive.sdk.model.vast;

import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum p {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);
    
    private static final Map<String, p> sMediaTypeMap = new HashMap();
    public final String mimeType;

    static {
        p[] values;
        for (p pVar : values()) {
            sMediaTypeMap.put(pVar.mimeType, pVar);
        }
    }

    p(String str) {
        this.mimeType = str;
    }

    public static p a(String str) {
        Map<String, p> map = sMediaTypeMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
