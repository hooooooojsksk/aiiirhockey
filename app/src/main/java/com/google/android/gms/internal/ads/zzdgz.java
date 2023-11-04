package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdgz implements zzgwy {
    private final zzdgu zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdgz(zzdgu zzdguVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdguVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzbwn zzb() {
        return new zzbwn(((zzcgj) this.zzb).zza(), ((zzcuf) this.zzc).zza().zzf);
    }
}
