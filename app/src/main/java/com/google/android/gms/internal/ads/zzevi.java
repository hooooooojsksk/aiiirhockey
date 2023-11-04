package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzevi implements zzevt {
    private zzctw zza;

    @Override // com.google.android.gms.internal.ads.zzevt
    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }

    public final synchronized zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, zzctw zzctwVar) {
        zzcrt zzb;
        if (zzctwVar == null) {
            this.zza = (zzctw) zzevsVar.zza(zzevuVar.zzb).zzh();
        } else {
            this.zza = zzctwVar;
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }
}
