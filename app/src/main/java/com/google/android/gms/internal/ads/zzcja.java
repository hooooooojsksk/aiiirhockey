package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcja implements zzdqi {
    private final zzchy zza;
    private final zzcjg zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcja(zzchy zzchyVar, zzcjg zzcjgVar, zzciz zzcizVar) {
        this.zza = zzchyVar;
        this.zzb = zzcjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqi
    public final /* synthetic */ zzdqi zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqi
    public final /* bridge */ /* synthetic */ zzdqi zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqi
    public final zzdqj zzc() {
        zzgxg.zzc(this.zzc, Long.class);
        zzgxg.zzc(this.zzd, String.class);
        return new zzcjc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
