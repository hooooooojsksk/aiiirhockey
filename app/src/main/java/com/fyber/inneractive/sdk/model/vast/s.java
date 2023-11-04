package com.fyber.inneractive.sdk.model.vast;

import com.facebook.ads.AdSDKNotificationListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum s {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION(AdSDKNotificationListener.IMPRESSION_EVENT),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_PAUSE("pause"),
    EVENT_RESUME("resume"),
    EVENT_FULLSCREEN("fullscreen"),
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND("expand"),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    UNKNOWN("UnkownEvent");
    
    private static final Map<String, s> sEventsMap = new HashMap();
    private final String mKey;

    static {
        s[] values;
        for (s sVar : values()) {
            sEventsMap.put(sVar.mKey, sVar);
        }
    }

    s(String str) {
        this.mKey = str;
    }

    public static s a(String str) {
        Map<String, s> map = sEventsMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }

    public String e() {
        return this.mKey;
    }
}
