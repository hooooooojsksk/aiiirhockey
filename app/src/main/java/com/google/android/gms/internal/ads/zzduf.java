package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzduf implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzduf(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzdue zzb() {
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        zzfuu zzfuuVar2 = zzbzn.zzb;
        zzgxg.zzb(zzfuuVar2);
        return new zzdue((ScheduledExecutorService) this.zza.zzb(), zzfuuVar, zzfuuVar2, ((zzduw) this.zzd).zzb(), zzgwx.zza(this.zze));
    }
}
