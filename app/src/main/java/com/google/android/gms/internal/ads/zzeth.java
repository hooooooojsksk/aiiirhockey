package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeth implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzetj zzd;
    final /* synthetic */ zzetk zze;

    public zzeth(zzetk zzetkVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzetj zzetjVar) {
        this.zze = zzetkVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzetjVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcnu, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzevt zzevtVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzeua zzeuaVar;
        zzctv zzm;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        zzevtVar = this.zze.zze;
        zzcnu zzcnuVar = (zzcnu) zzevtVar.zzd();
        if (zzcnuVar == null) {
            zza = zzezx.zzb(th, null);
        } else {
            zza = zzcnuVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcnuVar != null) {
                zzcnuVar.zzc().zza(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeua zzeuaVar2;
                            zzeth zzethVar = zzeth.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                            zzeuaVar2 = zzethVar.zze.zzd;
                            zzeuaVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzeuaVar = this.zze.zzd;
                zzeuaVar.zza(zza);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzd();
            }
            zzezr.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzc(zza);
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzh;
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
        zzfep zzfepVar;
        zzfen zzfenVar;
        zzeua zzeuaVar;
        zzcqm zzcqmVar = (zzcqm) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
                zzcyt zzn = zzcqmVar.zzn();
                zzeuaVar = this.zze.zzd;
                zzn.zzb(zzeuaVar);
            }
            this.zza.zzb(zzcqmVar);
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzf(zzcqmVar.zzp().zzb);
                zzfenVar.zze(zzcqmVar.zzl().zzg());
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzf(true);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzh;
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzb(zzcqmVar.zzp().zzb);
                zzfecVar2.zzd(zzcqmVar.zzl().zzg());
                zzfecVar2.zzf(true);
                zzfepVar.zzb(zzfecVar2.zzl());
            }
        }
    }
}
