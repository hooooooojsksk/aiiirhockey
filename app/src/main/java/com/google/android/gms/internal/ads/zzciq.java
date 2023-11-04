package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzciq implements zzeuq {
    private final zzchy zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzciq(zzchy zzchyVar, zzcip zzcipVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final /* synthetic */ zzeuq zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final /* synthetic */ zzeuq zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final /* synthetic */ zzeuq zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final zzeur zzd() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, String.class);
        zzgxg.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcis(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
