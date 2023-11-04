package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgdx {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgdx(zzgdt zzgdtVar, zzgdw zzgdwVar) {
        Map map;
        Map map2;
        map = zzgdtVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgdtVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            String obj = cls.toString();
            throw new GeneralSecurityException("No input primitive class for " + obj + " available");
        }
        return ((zzfxc) this.zzb.get(cls)).zza();
    }

    public final Object zzb(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        zzgdv zzgdvVar = new zzgdv(zzfvxVar.getClass(), cls, null);
        if (!this.zza.containsKey(zzgdvVar)) {
            String obj = zzgdvVar.toString();
            throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
        }
        return ((zzgdr) this.zza.get(zzgdvVar)).zza(zzfvxVar);
    }

    public final Object zzc(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzfxc zzfxcVar = (zzfxc) this.zzb.get(cls);
        if (!zzfxbVar.zzc().equals(zzfxcVar.zza()) || !zzfxcVar.zza().equals(zzfxbVar.zzc())) {
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        return zzfxcVar.zzc(zzfxbVar);
    }
}
