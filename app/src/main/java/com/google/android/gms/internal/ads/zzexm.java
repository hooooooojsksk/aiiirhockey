package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzexm implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzexo zzd;
    final /* synthetic */ zzexp zze;

    public zzexm(zzexp zzexpVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzexo zzexoVar) {
        this.zze = zzexpVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzexoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzevt zzevtVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzexf zzexfVar;
        zzdly zzk;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        zzevtVar = this.zze.zze;
        zzdlz zzdlzVar = (zzdlz) zzevtVar.zzd();
        if (zzdlzVar == null) {
            zza = zzezx.zzb(th, null);
        } else {
            zza = zzdlzVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdlzVar != null) {
                zzdlzVar.zza().zza(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexf zzexfVar2;
                        zzexm zzexmVar = zzexm.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzexfVar2 = zzexmVar.zze.zzd;
                        zzexfVar2.zza(zzeVar);
                    }
                });
            } else {
                zzexfVar = this.zze.zzd;
                zzexfVar.zza(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzd();
            }
            zzezr.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzc(zza);
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzg;
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zza(zza);
                zzfecVar2.zzg(th);
                zzfecVar2.zzf(false);
                zzfepVar.zzb(zzfecVar2.zzl());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzexf zzexfVar;
        Executor executor;
        final zzexf zzexfVar2;
        zzexf zzexfVar3;
        zzfep zzfepVar;
        zzfen zzfenVar;
        zzdlu zzdluVar = (zzdlu) obj;
        synchronized (this.zze) {
            zzcyt zzn = zzdluVar.zzn();
            zzexfVar = this.zze.zzd;
            zzn.zzd(zzexfVar);
            this.zza.zzb(zzdluVar);
            zzexp zzexpVar = this.zze;
            executor = zzexpVar.zzb;
            zzexfVar2 = zzexpVar.zzd;
            zzexfVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexk
                @Override // java.lang.Runnable
                public final void run() {
                    zzexf.this.zzn();
                }
            });
            zzexfVar3 = this.zze.zzd;
            zzexfVar3.onAdMetadataChanged();
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzf(zzdluVar.zzp().zzb);
                zzfenVar.zze(zzdluVar.zzl().zzg());
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzf(true);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzg;
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzb(zzdluVar.zzp().zzb);
                zzfecVar2.zzd(zzdluVar.zzl().zzg());
                zzfecVar2.zzf(true);
                zzfepVar.zzb(zzfecVar2.zzl());
            }
        }
    }
}
