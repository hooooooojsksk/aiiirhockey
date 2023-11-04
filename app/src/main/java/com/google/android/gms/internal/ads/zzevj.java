package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzevj implements zzevt {
    private final zzevt zza;
    private zzctw zzb;

    public zzevj(zzevt zzevtVar) {
        this.zza = zzevtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zzb;
    }

    public final synchronized zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, zzctw zzctwVar) {
        this.zzb = zzctwVar;
        if (zzevuVar.zza != null) {
            zzcrt zzb = this.zzb.zzb();
            return zzb.zzi(zzb.zzk(zzfuj.zzh(zzevuVar.zza)));
        }
        return ((zzevi) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }
}
