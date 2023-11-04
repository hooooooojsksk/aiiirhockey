package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzevp {
    private final zzfaj zza;
    private final zzctw zzb;
    private final Executor zzc;
    private zzevo zzd;

    public zzevp(zzfaj zzfajVar, zzctw zzctwVar, Executor executor) {
        this.zza = zzfajVar;
        this.zzb = zzctwVar;
        this.zzc = executor;
    }

    @Deprecated
    public final zzfat zze() {
        zzeyx zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfut zzc() {
        zzfut zze;
        zzevo zzevoVar = this.zzd;
        if (zzevoVar == null) {
            if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
                zzevo zzevoVar2 = new zzevo(null, zze(), null);
                this.zzd = zzevoVar2;
                zze = zzfuj.zzh(zzevoVar2);
            } else {
                zze = zzfuj.zze(zzfuj.zzl(zzfua.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzevm(this), this.zzc), zzdvi.class, new zzevl(this), this.zzc);
            }
            return zzfuj.zzl(zze, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzevk
                @Override // com.google.android.gms.internal.ads.zzfnj
                public final Object apply(Object obj) {
                    return (zzevo) obj;
                }
            }, this.zzc);
        }
        return zzfuj.zzh(zzevoVar);
    }
}
