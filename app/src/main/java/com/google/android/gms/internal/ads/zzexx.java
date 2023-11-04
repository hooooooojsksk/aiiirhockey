package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzexx implements zzeiq {
    final /* synthetic */ zzexz zza;

    public zzexx(zzexz zzexzVar) {
        this.zza = zzexzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdlu zzdluVar;
        zzeyp zzeypVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdlu) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdb)).booleanValue()) {
                zzeyq zzd = ((zzdlu) obj).zzd();
                zzeypVar = this.zza.zzc;
                zzd.zza = zzeypVar;
            }
            zzdluVar = this.zza.zzd;
            zzdluVar.zzj();
        }
    }
}
