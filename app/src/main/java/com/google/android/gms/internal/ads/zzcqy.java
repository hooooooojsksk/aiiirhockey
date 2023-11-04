package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcqy implements zzfuf {
    final /* synthetic */ zzfuf zza;
    final /* synthetic */ zzcra zzb;

    public zzcqy(zzcra zzcraVar, zzfuf zzfufVar) {
        this.zzb = zzcraVar;
        this.zza = zzfufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                zzcra.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcra.zzb(this.zzb, ((zzcqt) obj).zza, this.zza);
    }
}
