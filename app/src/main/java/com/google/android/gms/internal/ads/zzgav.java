package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgav extends zzgct {
    final /* synthetic */ zzgaw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgav(zzgaw zzgawVar, Class cls) {
        super(cls);
        this.zza = zzgawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgio zzc = zzgip.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(((zzgis) zzgrwVar).zza())));
        zzc.zzb(0);
        return (zzgip) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgis.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgir zzc = zzgis.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgcs((zzgis) zzc.zzal(), 1));
        zzgir zzc2 = zzgis.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgcs((zzgis) zzc2.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgis zzgisVar = (zzgis) zzgrwVar;
        if (zzgisVar.zza() == 64) {
            return;
        }
        int zza = zzgisVar.zza();
        throw new InvalidAlgorithmParameterException("invalid key size: " + zza + ". Valid keys must have 64 bytes.");
    }
}
