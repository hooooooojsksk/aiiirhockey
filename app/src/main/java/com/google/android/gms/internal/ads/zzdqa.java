package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdqa implements zzgwy {
    private final zzdpv zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdqa(zzdpv zzdpvVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdpvVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set zze = zzdpv.zze((zzdqf) this.zzb.zzb(), zzfuuVar);
        zzgxg.zzb(zze);
        return zze;
    }
}
