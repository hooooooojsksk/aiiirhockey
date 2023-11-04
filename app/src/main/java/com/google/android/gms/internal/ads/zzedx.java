package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedx extends zzedz {
    private final zzcgd zza;
    private final zzden zzb;
    private final zzctx zzc;
    private final zzdab zzd;
    private final zzeeh zze;

    public zzedx(zzcgd zzcgdVar, zzden zzdenVar, zzctx zzctxVar, zzdab zzdabVar, zzeeh zzeehVar) {
        this.zza = zzcgdVar;
        this.zzb = zzdenVar;
        this.zzc = zzctxVar;
        this.zzd = zzdabVar;
        this.zze = zzeehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    protected final zzfut zzc(zzeyx zzeyxVar, Bundle bundle, zzeyc zzeycVar, zzeyo zzeyoVar) {
        zzder zzg = this.zza.zzg();
        zzctx zzctxVar = this.zzc;
        zzctxVar.zzh(zzeyxVar);
        zzctxVar.zze(bundle);
        zzctxVar.zzf(new zzctr(zzeyoVar, zzeycVar, this.zze));
        zzg.zzf(zzctxVar.zzi());
        zzg.zze(this.zzd);
        zzg.zzd(this.zzb);
        zzg.zzc(new zzcoh(null));
        zzcrt zza = zzg.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
