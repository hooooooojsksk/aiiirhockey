package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzchq extends zzequ {
    private final zzesa zza;
    private final zzchy zzb;
    private final zzchq zzc = this;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;
    private final zzgxl zzl;
    private final zzgxl zzm;
    private final zzgxl zzn;

    public /* synthetic */ zzchq(zzchy zzchyVar, zzesa zzesaVar, zzchp zzchpVar) {
        zzgxl zzgxlVar;
        zzgxl zzgxlVar2;
        zzgxl zzgxlVar3;
        this.zzb = zzchyVar;
        this.zza = zzesaVar;
        zzesc zzescVar = new zzesc(zzesaVar);
        this.zzd = zzescVar;
        zzgxl zzc = zzgwx.zzc(zzdoh.zza());
        this.zze = zzc;
        zzgxl zzc2 = zzgwx.zzc(zzdof.zza());
        this.zzf = zzc2;
        zzgxl zzc3 = zzgwx.zzc(zzdoj.zza());
        this.zzg = zzc3;
        zzgxl zzc4 = zzgwx.zzc(zzdol.zza());
        this.zzh = zzc4;
        zzgxb zzc5 = zzgxc.zzc(4);
        zzc5.zzb(zzfcu.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfcu.BUILD_URL, zzc2);
        zzc5.zzb(zzfcu.HTTP, zzc3);
        zzc5.zzb(zzfcu.PRE_PROCESS, zzc4);
        zzgxc zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzgxlVar = zzchyVar.zzh;
        zzgxl zzc7 = zzgwx.zzc(new zzdom(zzescVar, zzgxlVar, zzfbv.zza(), zzc6));
        this.zzj = zzc7;
        zzgxi zza = zzgxj.zza(0, 1);
        zza.zza(zzc7);
        zzgxj zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfdd zzfddVar = new zzfdd(zzc8);
        this.zzl = zzfddVar;
        zzfbv zza2 = zzfbv.zza();
        zzgxlVar2 = zzchyVar.zzn;
        this.zzm = zzgwx.zzc(new zzfdc(zza2, zzgxlVar2, zzfddVar));
        zzgxlVar3 = zzchyVar.zzH;
        this.zzn = zzgwx.zzc(new zzfeo(zzgxlVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final zzepq zza() {
        zzcgg zzcggVar;
        zzgxl zzgxlVar;
        zzgxl zzgxlVar2;
        zzcggVar = this.zzb.zza;
        Context zza = zzcggVar.zza();
        zzgxg.zzb(zza);
        zzbxx zzbxxVar = new zzbxx();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        zzeru zzeruVar = new zzeru(zzbxxVar, zzfuuVar, zzesb.zza(this.zza), null);
        zzfuu zzfuuVar2 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar2);
        zzgxlVar = this.zzb.zzn;
        zzfen zzfenVar = (zzfen) this.zzn.zzb();
        zzgxlVar2 = this.zzb.zzZ;
        zzdpi zzdpiVar = (zzdpi) zzgxlVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzent(zzeruVar, 0L, (ScheduledExecutorService) zzgxlVar.zzb()));
        return new zzepq(zza, zzfuuVar2, hashSet, zzfenVar, zzdpiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final zzfda zzb() {
        return (zzfda) this.zzm.zzb();
    }
}
