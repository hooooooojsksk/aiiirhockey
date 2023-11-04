package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgrr {
    public static final int zza(int i, Object obj, Object obj2) {
        zzgrq zzgrqVar = (zzgrq) obj;
        zzgrp zzgrpVar = (zzgrp) obj2;
        if (zzgrqVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgrqVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgrq) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgrq zzgrqVar = (zzgrq) obj;
        zzgrq zzgrqVar2 = (zzgrq) obj2;
        if (!zzgrqVar2.isEmpty()) {
            if (!zzgrqVar.zze()) {
                zzgrqVar = zzgrqVar.zzb();
            }
            zzgrqVar.zzd(zzgrqVar2);
        }
        return zzgrqVar;
    }
}
