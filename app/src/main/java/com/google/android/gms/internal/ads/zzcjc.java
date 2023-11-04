package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcjc implements zzdqj {
    private final Long zza;
    private final String zzb;
    private final zzchy zzc;
    private final zzcjg zzd;
    private final zzcjc zze = this;

    public /* synthetic */ zzcjc(zzchy zzchyVar, zzcjg zzcjgVar, Long l, String str, zzcjb zzcjbVar) {
        this.zzc = zzchyVar;
        this.zzd = zzcjgVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdqt zza() {
        Context context;
        zzdqm zzc;
        long longValue = this.zza.longValue();
        zzcjg zzcjgVar = this.zzd;
        context = zzcjgVar.zza;
        zzc = zzdqn.zzc(zzcjgVar.zzb);
        return zzdqu.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdqx zzb() {
        Context context;
        zzdqm zzc;
        long longValue = this.zza.longValue();
        zzcjg zzcjgVar = this.zzd;
        context = zzcjgVar.zza;
        zzc = zzdqn.zzc(zzcjgVar.zzb);
        return zzdqy.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
