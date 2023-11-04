package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzexs implements zzeiq {
    final /* synthetic */ zzext zza;

    public zzexs(zzext zzextVar) {
        this.zza = zzextVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdlu zzdluVar;
        zzeyp zzeypVar;
        synchronized (this.zza) {
            this.zza.zzh = (zzdlu) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdb)).booleanValue()) {
                zzeyq zzd = ((zzdlu) obj).zzd();
                zzeypVar = this.zza.zzd;
                zzd.zza = zzeypVar;
            }
            zzdluVar = this.zza.zzh;
            zzdluVar.zzj();
        }
    }
}
