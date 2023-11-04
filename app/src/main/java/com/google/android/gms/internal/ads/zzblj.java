package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzblj implements zzbzw {
    final /* synthetic */ zzbll zza;

    public zzblj(zzbll zzbllVar) {
        this.zza = zzbllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzblq zzblqVar;
        zzbls zzblsVar = (zzbls) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzblqVar = this.zza.zzb;
        zzblqVar.zzd();
    }
}
