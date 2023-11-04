package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzecn implements zzfuf {
    final /* synthetic */ zzeco zza;

    public zzecn(zzeco zzecoVar) {
        this.zza = zzecoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzcph zzcphVar;
        zzcuq zzcuqVar;
        zzcphVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcphVar.zzd().zza(th);
        zzcuqVar = this.zza.zzd;
        zzcuqVar.zza(zza);
        zzezr.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcok) obj).zzj();
    }
}
