package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgcu {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzgcu(Class cls, zzgds... zzgdsVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzgds zzgdsVar = zzgdsVarArr[i];
            if (hashMap.containsKey(zzgdsVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgdsVar.zzb().getCanonicalName())));
            }
            hashMap.put(zzgdsVar.zzb(), zzgdsVar);
        }
        this.zzc = zzgdsVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgct zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgkx zzb();

    public abstract zzgrw zzc(zzgpe zzgpeVar) throws zzgqy;

    public abstract String zzd();

    public abstract void zze(zzgrw zzgrwVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgrw zzgrwVar, Class cls) throws GeneralSecurityException {
        zzgds zzgdsVar = (zzgds) this.zzb.get(cls);
        if (zzgdsVar == null) {
            String canonicalName = cls.getCanonicalName();
            throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
        }
        return zzgdsVar.zza(zzgrwVar);
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
