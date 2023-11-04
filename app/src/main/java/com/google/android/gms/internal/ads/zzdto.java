package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdto implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdto(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzapw zzapwVar = (zzapw) this.zza.zzb();
        final Context zza = ((zzcgj) this.zzb).zza();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        zzfut zzb = zzfuuVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzapw zzapwVar2 = zzapw.this;
                return zzapwVar2.zzc().zzg(zza);
            }
        });
        zzgxg.zzb(zzb);
        return zzb;
    }
}
