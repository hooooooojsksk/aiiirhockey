package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzddm implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzddm(zzdcz zzdczVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdczVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzbwn zzb() {
        return new zzbwn(((zzcgj) this.zzb).zza(), ((zzcuf) this.zzc).zza().zzf);
    }
}
