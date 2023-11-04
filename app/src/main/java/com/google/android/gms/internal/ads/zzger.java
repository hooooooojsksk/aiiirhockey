package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzger extends zzgct {
    public zzger(zzges zzgesVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzggz zzggzVar = (zzggz) zzgrwVar;
        zzggv zzc = zzggw.zzc();
        zzc.zzc(0);
        zzc.zza(zzgpe.zzv(zzgoe.zza(zzggzVar.zza())));
        zzc.zzb(zzggzVar.zzf());
        return (zzggw) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzggz.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzggy zzc = zzggz.zzc();
        zzc.zza(32);
        zzghb zzc2 = zzghc.zzc();
        zzc2.zza(16);
        zzc.zzb((zzghc) zzc2.zzal());
        hashMap.put("AES_CMAC", new zzgcs((zzggz) zzc.zzal(), 1));
        zzggy zzc3 = zzggz.zzc();
        zzc3.zza(32);
        zzghb zzc4 = zzghc.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzghc) zzc4.zzal());
        hashMap.put("AES256_CMAC", new zzgcs((zzggz) zzc3.zzal(), 1));
        zzggy zzc5 = zzggz.zzc();
        zzc5.zza(32);
        zzghb zzc6 = zzghc.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzghc) zzc6.zzal());
        hashMap.put("AES256_CMAC_RAW", new zzgcs((zzggz) zzc5.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzggz zzggzVar = (zzggz) zzgrwVar;
        zzges.zzn(zzggzVar.zzf());
        zzges.zzo(zzggzVar.zza());
    }
}
