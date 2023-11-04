package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfxz extends zzgct {
    final /* synthetic */ zzfya zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxz(zzfya zzfyaVar, Class cls) {
        super(cls);
        this.zza = zzfyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghx zzghxVar = (zzghx) zzgrwVar;
        zzght zzc = zzghu.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(zzghxVar.zza())));
        zzc.zzb(zzghxVar.zzf());
        zzc.zzc(0);
        return (zzghu) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzghx.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfya.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfya.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfya.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfya.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghx zzghxVar = (zzghx) zzgrwVar;
        zzgog.zza(zzghxVar.zza());
        if (zzghxVar.zzf().zza() != 12 && zzghxVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
