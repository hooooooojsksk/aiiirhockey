package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzesx implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;

    public zzesx(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbyj zzbyjVar = (zzbyj) this.zza.zzb();
        boolean booleanValue = ((zzesl) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzesm) this.zzc).zzb().booleanValue();
        zzbxy zzbxyVar = new zzbxy();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzesv(zzbyjVar, booleanValue, booleanValue2, zzbxyVar, zzfuuVar, ((zzesi) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb(), null);
    }
}
