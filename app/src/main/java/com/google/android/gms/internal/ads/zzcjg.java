package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcjg implements zzdqr {
    private final Context zza;
    private final zzbim zzb;
    private final zzchy zzc;
    private final zzcjg zzd = this;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;

    public /* synthetic */ zzcjg(zzchy zzchyVar, Context context, zzbim zzbimVar, zzcjf zzcjfVar) {
        this.zzc = zzchyVar;
        this.zza = context;
        this.zzb = zzbimVar;
        zzgwy zza = zzgwz.zza(this);
        this.zze = zza;
        zzgwy zza2 = zzgwz.zza(zzbimVar);
        this.zzf = zza2;
        zzdqn zzdqnVar = new zzdqn(zza2);
        this.zzg = zzdqnVar;
        this.zzh = zzgwx.zzc(new zzdqp(zza, zzdqnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdqr
    public final zzdqi zzb() {
        return new zzcja(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqr
    public final zzdqo zzd() {
        return (zzdqo) this.zzh.zzb();
    }
}
