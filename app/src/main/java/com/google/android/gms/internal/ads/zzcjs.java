package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcjs implements zzexv {
    private final zzchy zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjs(zzchy zzchyVar, zzcjr zzcjrVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* synthetic */ zzexv zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* synthetic */ zzexv zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final zzexw zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        return new zzcju(this.zza, this.zzb, this.zzc, null);
    }
}
