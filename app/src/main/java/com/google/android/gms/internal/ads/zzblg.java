package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzblg implements zzbzw {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzfec zzb;
    final /* synthetic */ zzblr zzc;

    public zzblg(zzblr zzblrVar, zzblq zzblqVar, zzfec zzfecVar) {
        this.zzc = zzblrVar;
        this.zza = zzblqVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzblq zzblqVar;
        zzfep zzfepVar;
        zzfep zzfepVar2;
        zzblq zzblqVar2;
        zzblq zzblqVar3;
        zzbkm zzbkmVar = (zzbkm) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzblr zzblrVar = this.zzc;
            zzblqVar = zzblrVar.zzh;
            if (zzblqVar != null) {
                zzblq zzblqVar4 = this.zza;
                zzblqVar2 = zzblrVar.zzh;
                if (zzblqVar4 != zzblqVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzblqVar3 = this.zzc.zzh;
                    zzblqVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbcd.zzd.zze()).booleanValue()) {
                zzblr zzblrVar2 = this.zzc;
                zzfepVar = zzblrVar2.zze;
                if (zzfepVar != null) {
                    zzfepVar2 = zzblrVar2.zze;
                    zzfec zzfecVar = this.zzb;
                    zzfecVar.zzf(true);
                    zzfepVar2.zzb(zzfecVar.zzl());
                }
            }
        }
    }
}
