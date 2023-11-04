package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzchd implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzchd(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzbty zzb() {
        Context zza = ((zzcgj) this.zza).zza();
        zzfep zzfepVar = (zzfep) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzbzg.zza(), zzfepVar).zza("google.afma.request.getAdDictionary", zzbmc.zza, zzbmc.zza);
        zzbmf zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzbzg.zza(), zzfepVar);
        zzblz zzblzVar = zzbmc.zza;
        return new zzbtx(zza, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzblzVar, zzblzVar));
    }
}
