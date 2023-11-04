package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfyq extends zzgct {
    final /* synthetic */ zzfyr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyq(zzfyr zzfyrVar, Class cls) {
        super(cls);
        this.zza = zzfyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgic zzc = zzgid.zzc();
        zzc.zza(zzgpe.zzv(zzgoe.zza(((zzgig) zzgrwVar).zza())));
        zzc.zzb(0);
        return (zzgid) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgig.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzfyr.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzfyr.zzg(16, 3));
        hashMap.put("AES256_GCM", zzfyr.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzfyr.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgog.zza(((zzgig) zzgrwVar).zza());
    }
}
