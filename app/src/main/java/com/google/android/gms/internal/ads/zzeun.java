package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeun implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzcph zzd;
    final /* synthetic */ zzeuo zze;

    public zzeun(zzeuo zzeuoVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzcph zzcphVar) {
        this.zze = zzeuoVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzcphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzcxd zzcxdVar;
        zzczk zzczkVar;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeum
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeib zzeibVar;
                        zzeun zzeunVar = zzeun.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzeibVar = zzeunVar.zze.zzd;
                        zzeibVar.zza(zzeVar);
                    }
                });
            }
            zzeuo zzeuoVar = this.zze;
            zzcxdVar = zzeuoVar.zzh;
            zzczkVar = zzeuoVar.zzj;
            zzcxdVar.zzd(zzczkVar.zzc());
            zzezr.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzc(zza);
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzi;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzcxd zzcxdVar;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        final zzeib zzeibVar;
        zzeib zzeibVar2;
        zzeif zzeifVar;
        zzcok zzcokVar = (zzcok) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcokVar.zzc() != null) {
                ViewParent parent = zzcokVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zzcokVar.zzl() != null ? zzcokVar.zzl().zzg() : "";
                    zzbza.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcokVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                zzcyt zzn = zzcokVar.zzn();
                zzeibVar2 = this.zze.zzd;
                zzn.zza(zzeibVar2);
                zzeifVar = this.zze.zze;
                zzn.zzc(zzeifVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcokVar.zzc());
            this.zza.zzb(zzcokVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                zzeuo zzeuoVar = this.zze;
                executor = zzeuoVar.zzb;
                zzeibVar = zzeuoVar.zzd;
                zzeibVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeul
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeib.this.zzn();
                    }
                });
            }
            zzcxdVar = this.zze.zzh;
            zzcxdVar.zzd(zzcokVar.zza());
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzf(zzcokVar.zzp().zzb);
                zzfenVar.zze(zzcokVar.zzl().zzg());
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzf(true);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zzi;
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzb(zzcokVar.zzp().zzb);
                zzfecVar2.zzd(zzcokVar.zzl().zzg());
                zzfecVar2.zzf(true);
                zzfepVar.zzb(zzfecVar2.zzl());
            }
        }
    }
}
