package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfwi {
    public static zzfwh zza(String str) throws GeneralSecurityException {
        zzfwh zzfwhVar = (zzfwh) zzfxf.zzl().get(str);
        if (zzfwhVar != null) {
            return zzfwhVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
