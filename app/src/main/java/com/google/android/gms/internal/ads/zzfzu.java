package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfzu extends zzgct {
    final /* synthetic */ zzfzv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzu(zzfzv zzfzvVar, Class cls) {
        super(cls);
        this.zza = zzfzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgiy zzgiyVar = (zzgiy) zzgrwVar;
        zzgiu zzc = zzgiv.zzc();
        zzc.zzb(0);
        zzc.zza(zzgpe.zzv(zzgoe.zza(32)));
        return (zzgiv) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgiy.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgcs(zzgiy.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgcs(zzgiy.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgiy zzgiyVar = (zzgiy) zzgrwVar;
    }
}
