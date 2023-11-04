package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeix implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzdes zzd;
    final /* synthetic */ zzeiy zze;

    public zzeix(zzeiy zzeiyVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzdes zzdesVar) {
        this.zze = zzeiyVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzdesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzcgd zzcgdVar;
        zzfep zzfepVar;
        zzfen zzfenVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza);
        zzcgdVar = this.zze.zzb;
        zzcgdVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // java.lang.Runnable
            public final void run() {
                zzeio zzeioVar;
                zzeix zzeixVar = zzeix.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzeioVar = zzeixVar.zze.zzd;
                zzeioVar.zza().zza(zzeVar);
            }
        });
        zzezr.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
            zzfepVar = this.zze.zze;
            zzfec zzfecVar = this.zzc;
            zzfecVar.zza(zza);
            zzfecVar.zzg(th);
            zzfecVar.zzf(false);
            zzfepVar.zzb(zzfecVar.zzl());
            return;
        }
        zzfenVar.zzc(zza);
        zzfec zzfecVar2 = this.zzc;
        zzfecVar2.zzg(th);
        zzfecVar2.zzf(false);
        zzfenVar.zza(zzfecVar2);
        zzfenVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeio zzeioVar;
        zzcgd zzcgdVar;
        zzfep zzfepVar;
        zzfen zzfenVar;
        zzcqm zzcqmVar = (zzcqm) obj;
        synchronized (this.zze) {
            zzcyt zzn = zzcqmVar.zzn();
            zzeioVar = this.zze.zzd;
            zzn.zza(zzeioVar.zzd());
            this.zza.zzb(zzcqmVar);
            zzcgdVar = this.zze.zzb;
            zzcgdVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeiv
                @Override // java.lang.Runnable
                public final void run() {
                    zzeio zzeioVar2;
                    zzeioVar2 = zzeix.this.zze.zzd;
                    zzeioVar2.zzb().zzn();
                }
            });
            if (((Boolean) zzbcd.zzc.zze()).booleanValue() && (zzfenVar = this.zzb) != null) {
                zzfenVar.zzf(zzcqmVar.zzp().zzb);
                zzfenVar.zze(zzcqmVar.zzl().zzg());
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzf(true);
                zzfenVar.zza(zzfecVar);
                zzfenVar.zzg();
            } else {
                zzfepVar = this.zze.zze;
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzb(zzcqmVar.zzp().zzb);
                zzfecVar2.zzd(zzcqmVar.zzl().zzg());
                zzfecVar2.zzf(true);
                zzfepVar.zzb(zzfecVar2.zzl());
            }
        }
    }
}
