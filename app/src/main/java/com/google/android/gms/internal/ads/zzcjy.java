package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcjy implements zzdly {
    private final zzchy zza;
    private zzevx zzb;
    private zzeva zzc;
    private zzdab zzd;
    private zzctz zze;

    public /* synthetic */ zzcjy(zzchy zzchyVar, zzcjx zzcjxVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* synthetic */ zzctv zza(zzeva zzevaVar) {
        this.zzc = zzevaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* synthetic */ zzctv zzb(zzevx zzevxVar) {
        this.zzb = zzevxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final /* synthetic */ zzdly zzc(zzdab zzdabVar) {
        this.zzd = zzdabVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final /* synthetic */ zzdly zzd(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* renamed from: zze */
    public final zzdlz zzh() {
        zzgxg.zzc(this.zzd, zzdab.class);
        zzgxg.zzc(this.zze, zzctz.class);
        return new zzcka(this.zza, new zzcrv(), new zzfab(), new zzctg(), new zzdpv(), this.zzd, this.zze, new zzeeo(), null, this.zzb, this.zzc, null);
    }
}
