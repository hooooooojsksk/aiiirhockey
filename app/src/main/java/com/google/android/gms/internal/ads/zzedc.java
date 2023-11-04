package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedc implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzedc(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzedb((Context) this.zza.zzb(), ((zzcgu) this.zzb).zza(), (zzddw) this.zzc.zzb(), zzfuuVar);
    }
}
