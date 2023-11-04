package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeea extends zzedz {
    private final zzcgd zza;
    private final zzctx zzb;
    private final zzegk zzc;
    private final zzdab zzd;
    private final zzden zze;
    private final zzcxd zzf;
    private final ViewGroup zzg;
    private final zzczk zzh;
    private final zzeeh zzi;

    public zzeea(zzcgd zzcgdVar, zzctx zzctxVar, zzegk zzegkVar, zzdab zzdabVar, zzden zzdenVar, zzcxd zzcxdVar, ViewGroup viewGroup, zzczk zzczkVar, zzeeh zzeehVar) {
        this.zza = zzcgdVar;
        this.zzb = zzctxVar;
        this.zzc = zzegkVar;
        this.zzd = zzdabVar;
        this.zze = zzdenVar;
        this.zzf = zzcxdVar;
        this.zzg = viewGroup;
        this.zzh = zzczkVar;
        this.zzi = zzeehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    protected final zzfut zzc(zzeyx zzeyxVar, Bundle bundle, zzeyc zzeycVar, zzeyo zzeyoVar) {
        zzcpg zzd = this.zza.zzd();
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzh(zzeyxVar);
        zzctxVar.zze(bundle);
        zzctxVar.zzf(new zzctr(zzeyoVar, zzeycVar, this.zzi));
        zzd.zzi(zzctxVar.zzi());
        zzd.zzf(this.zzd);
        zzd.zze(this.zzc);
        zzd.zzd(this.zze);
        zzd.zzg(new zzcqe(this.zzf, this.zzh));
        zzd.zzc(new zzcoh(this.zzg));
        zzcrt zzd2 = zzd.zzj().zzd();
        return zzd2.zzi(zzd2.zzj());
    }
}
