package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdvg implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdvg(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzdvf zzb() {
        Map zzd = ((zzgxf) this.zza).zzd();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdvf(zzd, zzfuuVar, ((zzcxi) this.zzc).zzb());
    }
}
