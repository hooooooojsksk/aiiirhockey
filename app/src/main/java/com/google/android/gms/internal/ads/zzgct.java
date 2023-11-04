package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgct {
    private final Class zza;

    public zzgct(Class cls) {
        this.zza = cls;
    }

    public abstract zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException;

    public abstract zzgrw zzb(zzgpe zzgpeVar) throws zzgqy;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgrw zzgrwVar) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
