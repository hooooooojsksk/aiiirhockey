package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfzh extends zzgct {
    final /* synthetic */ zzfzi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzh(zzfzi zzfziVar, Class cls) {
        super(cls);
        this.zza = zzfziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgii zzc = zzgij.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(((zzgim) zzgrwVar).zza())));
        zzc.zzb(0);
        return (zzgij) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgim.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzfzi.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzfzi.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzfzi.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzfzi.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgog.zza(((zzgim) zzgrwVar).zza());
    }
}
