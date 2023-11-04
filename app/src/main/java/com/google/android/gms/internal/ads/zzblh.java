package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzblh implements zzbzu {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ zzblr zzc;

    public zzblh(zzblr zzblrVar, zzblq zzblqVar, zzfec zzfecVar) {
        this.zzc = zzblrVar;
        this.zza = zzblqVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zza() {
        Object obj;
        zzfep zzfepVar;
        zzfep zzfepVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
                zzblr zzblrVar = this.zzc;
                zzfepVar = zzblrVar.zze;
                if (zzfepVar != null) {
                    zzfepVar2 = zzblrVar.zze;
                    zzfec zzfecVar = this.zzb;
                    zzfecVar.zzf(false);
                    zzfepVar2.zzb(zzfecVar.zzl());
                }
            }
        }
    }
}
