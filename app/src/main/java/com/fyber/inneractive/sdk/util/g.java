package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes.dex */
public class g {
    public static boolean a(UnitDisplayType unitDisplayType, com.fyber.inneractive.sdk.config.i iVar) {
        return !(unitDisplayType == null || unitDisplayType.isFullscreenUnit()) || iVar.a("use_fraud_detection_fullscreen", true);
    }
}
