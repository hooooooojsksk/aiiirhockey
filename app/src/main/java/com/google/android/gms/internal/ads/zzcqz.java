package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcqz implements zzfuf {
    final /* synthetic */ zzfuf zza;
    final /* synthetic */ zzcra zzb;

    public zzcqz(zzcra zzcraVar, zzfuf zzfufVar) {
        this.zzb = zzcraVar;
        this.zza = zzfufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                zzcra.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                zzcra.this.zzd();
            }
        });
        this.zza.zzb((zzcqm) obj);
    }
}
