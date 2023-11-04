package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeuz implements zzevt {
    private final zzevt zza;
    private final zzevt zzb;
    private final zzfbf zzc;
    private final String zzd;
    private zzctw zze;
    private final Executor zzf;

    public zzeuz(zzevt zzevtVar, zzevt zzevtVar2, zzfbf zzfbfVar, String str, Executor executor) {
        this.zza = zzevtVar;
        this.zzb = zzevtVar2;
        this.zzc = zzfbfVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfut zzg(zzfas zzfasVar, zzevu zzevuVar) {
        zzctw zzctwVar = zzfasVar.zza;
        this.zze = zzctwVar;
        if (zzfasVar.zzc != null) {
            if (zzctwVar.zzf() != null) {
                zzfasVar.zzc.zzo().zzbG(zzfasVar.zza.zzf());
            }
            return zzfuj.zzh(zzfasVar.zzc);
        }
        zzctwVar.zzb().zzl(zzfasVar.zzb);
        return ((zzevj) this.zza).zzb(zzevuVar, null, zzfasVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zze;
    }

    public final /* synthetic */ zzfut zzb(zzevu zzevuVar, zzeuy zzeuyVar, zzevs zzevsVar, zzctw zzctwVar, zzeve zzeveVar) throws Exception {
        if (zzeveVar != null) {
            zzeuy zzeuyVar2 = new zzeuy(zzeuyVar.zza, zzeuyVar.zzb, zzeuyVar.zzc, zzeuyVar.zzd, zzeuyVar.zze, zzeuyVar.zzf, zzeveVar.zza);
            if (zzeveVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeuyVar2);
                return zzg(zzeveVar.zzc, zzevuVar);
            }
            zzfut zza = this.zzc.zza(zzeuyVar2);
            if (zza != null) {
                this.zze = null;
                return zzfuj.zzm(zza, new zzftq() { // from class: com.google.android.gms.internal.ads.zzeuv
                    @Override // com.google.android.gms.internal.ads.zzftq
                    public final zzfut zza(Object obj) {
                        return zzeuz.this.zze((zzfbc) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeuyVar2);
            zzevuVar = new zzevu(zzevuVar.zzb, zzeveVar.zzb);
        }
        zzfut zzb = ((zzevj) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar);
        this.zze = zzctwVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzf(zzevuVar, zzevsVar, null);
    }

    public final /* synthetic */ zzfut zze(zzfbc zzfbcVar) throws Exception {
        zzfbe zzfbeVar;
        if (zzfbcVar == null || zzfbcVar.zza == null || (zzfbeVar = zzfbcVar.zzb) == null) {
            throw new zzdtf(1, "Empty prefetch");
        }
        zzawt zza = zzawz.zza();
        zzawr zza2 = zzaws.zza();
        zza2.zzd(2);
        zza2.zzb(zzaww.zzd());
        zza.zza(zza2);
        zzfbcVar.zza.zza.zzb().zzc().zzi((zzawz) zza.zzal());
        return zzg(zzfbcVar.zza, ((zzeuy) zzfbeVar).zzb);
    }

    public final synchronized zzfut zzf(final zzevu zzevuVar, final zzevs zzevsVar, zzctw zzctwVar) {
        zzctv zza = zzevsVar.zza(zzevuVar.zzb);
        zza.zza(new zzeva(this.zzd));
        final zzctw zzctwVar2 = (zzctw) zza.zzh();
        zzctwVar2.zzg();
        zzctwVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzctwVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzeyx zzg = zzctwVar2.zzg();
            final zzeuy zzeuyVar = new zzeuy(zzevsVar, zzevuVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfuj.zzm(zzfua.zzv(((zzevf) this.zzb).zzb(zzevuVar, zzevsVar, zzctwVar2)), new zzftq() { // from class: com.google.android.gms.internal.ads.zzeuw
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzeuz.this.zzb(zzevuVar, zzeuyVar, zzevsVar, zzctwVar2, (zzeve) obj);
                }
            }, this.zzf);
        }
        this.zze = zzctwVar2;
        return ((zzevj) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar2);
    }
}
