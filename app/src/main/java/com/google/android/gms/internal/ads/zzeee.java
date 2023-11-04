package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzeee extends zzedz {
    private final zzcgd zza;
    private final zzctx zzb;
    private final zzdab zzc;
    private final zzeeh zzd;
    @Nullable
    private final zzeyp zze;

    public zzeee(zzcgd zzcgdVar, zzctx zzctxVar, zzdab zzdabVar, @Nullable zzeyp zzeypVar, zzeeh zzeehVar) {
        this.zza = zzcgdVar;
        this.zzb = zzctxVar;
        this.zzc = zzdabVar;
        this.zze = zzeypVar;
        this.zzd = zzeehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    protected final zzfut zzc(zzeyx zzeyxVar, Bundle bundle, zzeyc zzeycVar, zzeyo zzeyoVar) {
        zzeyp zzeypVar;
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzh(zzeyxVar);
        zzctxVar.zze(bundle);
        zzctxVar.zzf(new zzctr(zzeyoVar, zzeycVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdc)).booleanValue() && (zzeypVar = this.zze) != null) {
            this.zzb.zzg(zzeypVar);
        }
        zzdly zzh = this.zza.zzh();
        zzh.zzd(this.zzb.zzi());
        zzh.zzc(this.zzc);
        zzcrt zzb = zzh.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
