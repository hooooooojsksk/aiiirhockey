package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeil implements zzeiq {
    final /* synthetic */ zzeim zza;

    public zzeil(zzeim zzeimVar) {
        this.zza = zzeimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcqm) obj).zzl();
            ((zzcqm) obj).zzj();
        }
    }
}
