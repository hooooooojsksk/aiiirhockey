package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public enum zzffr {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    private final String zzj;

    zzffr(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
