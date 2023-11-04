package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzewe implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzddw zzd;
    final /* synthetic */ zzewf zze;

    public zzewe(zzewf zzewfVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzddw zzddwVar) {
        this.zze = zzewfVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzddwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeib zzeibVar;
                        zzewe zzeweVar = zzewe.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzeibVar = zzeweVar.zze.zzd;
                        zzeibVar.zza(zzeVar);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexf zzexfVar;
                        zzewe zzeweVar = zzewe.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzexfVar = zzeweVar.zze.zze;
                        zzexfVar.zza(zzeVar);
                    }
                });
            }
            zzezr.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
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
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        Executor executor2;
        zzeib zzeibVar;
        zzexf zzexfVar;
        zzdcv zzdcvVar = (zzdcv) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                zzcyt zzn = zzdcvVar.zzn();
                zzeibVar = this.zze.zzd;
                zzn.zza(zzeibVar);
                zzexfVar = this.zze.zze;
                zzn.zzd(zzexfVar);
            }
            this.zza.zzb(zzdcvVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewa
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeib zzeibVar2;
                        zzeibVar2 = zzewe.this.zze.zzd;
                        zzeibVar2.zzn();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexf zzexfVar2;
                        zzexfVar2 = zzewe.this.zze.zze;
                        zzexfVar2.zzn();
                    }
                });
            }
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzf(zzdcvVar.zzp().zzb);
                zzfenVar.zze(zzdcvVar.zzl().zzg());
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzf(true);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzg;
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzb(zzdcvVar.zzp().zzb);
                zzfecVar2.zzd(zzdcvVar.zzl().zzg());
                zzfecVar2.zzf(true);
                zzfepVar.zzb(zzfecVar2.zzl());
            }
        }
    }
}
