package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcqe {
    private final zzcxd zza;
    private final zzczk zzb;

    public zzcqe(zzcxd zzcxdVar, zzczk zzczkVar) {
        this.zza = zzcxdVar;
        this.zzb = zzczkVar;
    }

    public final zzcxd zza() {
        return this.zza;
    }

    public final zzczk zzb() {
        return this.zzb;
    }

    public final zzdbu zzc() {
        zzczk zzczkVar = this.zzb;
        return zzczkVar != null ? new zzdbu(zzczkVar, zzbzn.zzf) : new zzdbu(new zzcqd(this), zzbzn.zzf);
    }
}
