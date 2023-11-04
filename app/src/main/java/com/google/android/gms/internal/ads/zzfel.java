package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfel implements zzfuf {
    final /* synthetic */ zzfen zza;
    final /* synthetic */ zzfec zzb;

    public zzfel(zzfen zzfenVar, zzfec zzfecVar) {
        this.zza = zzfenVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar = this.zza;
        zzfec zzfecVar = this.zzb;
        zzfecVar.zzg(th);
        zzfecVar.zzf(false);
        zzfenVar.zza(zzfecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
    }
}
