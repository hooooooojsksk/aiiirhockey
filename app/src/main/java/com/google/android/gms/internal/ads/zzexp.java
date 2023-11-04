package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzexp implements zzeir {
    private final Context zza;
    private final Executor zzb;
    private final zzcgd zzc;
    private final zzexf zzd;
    private final zzevt zze;
    private final zzeyp zzf;
    private final zzfep zzg;
    private final zzeyv zzh;
    private zzfut zzi;

    public zzexp(Context context, Executor executor, zzcgd zzcgdVar, zzevt zzevtVar, zzexf zzexfVar, zzeyv zzeyvVar, zzeyp zzeypVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgdVar;
        this.zze = zzevtVar;
        this.zzd = zzexfVar;
        this.zzh = zzeyvVar;
        this.zzf = zzeypVar;
        this.zzg = zzcgdVar.zzy();
    }

    public final zzdly zzk(zzevr zzevrVar) {
        zzexo zzexoVar = (zzexo) zzevrVar;
        zzdly zzh = this.zzc.zzh();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(this.zza);
        zzctxVar.zzh(zzexoVar.zza);
        String str = zzexoVar.zzb;
        zzctxVar.zzg(this.zzf);
        zzh.zzd(zzctxVar.zzi());
        zzh.zzc(new zzczz().zzn());
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeip zzeipVar, zzeiq zzeiqVar) throws RemoteException {
        zzfen zzfenVar;
        zzbuk zzbukVar = new zzbuk(zzlVar, str);
        if (zzbukVar.zzb == null) {
            zzbza.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexi
                @Override // java.lang.Runnable
                public final void run() {
                    zzexp.this.zzi();
                }
            });
        } else {
            zzfut zzfutVar = this.zzi;
            if (zzfutVar == null || zzfutVar.isDone()) {
                if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                    zzevt zzevtVar = this.zze;
                    if (zzevtVar.zzd() != null) {
                        zzfen zzh = ((zzdlz) zzevtVar.zzd()).zzh();
                        zzh.zzh(5);
                        zzh.zzb(zzbukVar.zza.zzp);
                        zzfenVar = zzh;
                        zzezr.zza(this.zza, zzbukVar.zza.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzbukVar.zza.zzf) {
                            this.zzc.zzj().zzm(true);
                        }
                        zzeyv zzeyvVar = this.zzh;
                        zzeyvVar.zzs(zzbukVar.zzb);
                        zzeyvVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                        zzeyvVar.zzE(zzbukVar.zza);
                        zzeyx zzG = zzeyvVar.zzG();
                        zzfec zzb = zzfeb.zzb(this.zza, zzfem.zzf(zzG), 5, zzbukVar.zza);
                        zzexo zzexoVar = new zzexo(null);
                        zzexoVar.zza = zzG;
                        zzexoVar.zzb = null;
                        zzfut zzc = this.zze.zzc(new zzevu(zzexoVar, null), new zzevs() { // from class: com.google.android.gms.internal.ads.zzexj
                            @Override // com.google.android.gms.internal.ads.zzevs
                            public final zzctv zza(zzevr zzevrVar) {
                                zzdly zzk;
                                zzk = zzexp.this.zzk(zzevrVar);
                                return zzk;
                            }
                        }, null);
                        this.zzi = zzc;
                        zzfuj.zzq(zzc, new zzexm(this, zzeiqVar, zzfenVar, zzb, zzexoVar), this.zzb);
                        return true;
                    }
                }
                zzfenVar = null;
                zzezr.zza(this.zza, zzbukVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue()) {
                    this.zzc.zzj().zzm(true);
                }
                zzeyv zzeyvVar2 = this.zzh;
                zzeyvVar2.zzs(zzbukVar.zzb);
                zzeyvVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzeyvVar2.zzE(zzbukVar.zza);
                zzeyx zzG2 = zzeyvVar2.zzG();
                zzfec zzb2 = zzfeb.zzb(this.zza, zzfem.zzf(zzG2), 5, zzbukVar.zza);
                zzexo zzexoVar2 = new zzexo(null);
                zzexoVar2.zza = zzG2;
                zzexoVar2.zzb = null;
                zzfut zzc2 = this.zze.zzc(new zzevu(zzexoVar2, null), new zzevs() { // from class: com.google.android.gms.internal.ads.zzexj
                    @Override // com.google.android.gms.internal.ads.zzevs
                    public final zzctv zza(zzevr zzevrVar) {
                        zzdly zzk;
                        zzk = zzexp.this.zzk(zzevrVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc2;
                zzfuj.zzq(zzc2, new zzexm(this, zzeiqVar, zzfenVar, zzb2, zzexoVar2), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzezx.zzd(6, null, null));
    }

    public final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
