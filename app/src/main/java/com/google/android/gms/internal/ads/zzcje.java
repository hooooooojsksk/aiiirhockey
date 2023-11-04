package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcje implements zzdqq {
    private final zzchy zza;
    private Context zzb;
    private zzbim zzc;

    public /* synthetic */ zzcje(zzchy zzchyVar, zzcjd zzcjdVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqq
    public final /* synthetic */ zzdqq zza(zzbim zzbimVar) {
        Objects.requireNonNull(zzbimVar);
        this.zzc = zzbimVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqq
    public final /* synthetic */ zzdqq zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqq
    public final zzdqr zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, zzbim.class);
        return new zzcjg(this.zza, this.zzb, this.zzc, null);
    }
}
