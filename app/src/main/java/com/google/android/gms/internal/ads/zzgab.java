package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgab extends zzgct {
    final /* synthetic */ zzgac zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgab(zzgac zzgacVar, Class cls) {
        super(cls);
        this.zza = zzgacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgly zzc = zzglz.zzc();
        zzc.zza((zzgmc) zzgrwVar);
        zzc.zzb(0);
        return (zzglz) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgmc.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgmc zzgmcVar = (zzgmc) zzgrwVar;
        if (zzgmcVar.zzf().isEmpty() || !zzgmcVar.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
