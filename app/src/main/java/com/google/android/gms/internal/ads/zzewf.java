package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzewf implements zzeir {
    private final Context zza;
    private final Executor zzb;
    private final zzcgd zzc;
    private final zzeib zzd;
    private final zzexf zze;
    private zzbbp zzf;
    private final zzfep zzg;
    private final zzeyv zzh;
    private zzfut zzi;

    public zzewf(Context context, Executor executor, zzcgd zzcgdVar, zzeib zzeibVar, zzexf zzexfVar, zzeyv zzeyvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgdVar;
        this.zzd = zzeibVar;
        this.zzh = zzeyvVar;
        this.zze = zzexfVar;
        this.zzg = zzcgdVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        zzfut zzfutVar = this.zzi;
        return (zzfutVar == null || zzfutVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeip zzeipVar, zzeiq zzeiqVar) {
        zzddw zzf;
        zzfen zzfenVar;
        if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevz
                @Override // java.lang.Runnable
                public final void run() {
                    zzewf.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzj().zzm(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzevy) zzeipVar).zza;
            zzeyv zzeyvVar = this.zzh;
            zzeyvVar.zzs(str);
            zzeyvVar.zzr(zzqVar);
            zzeyvVar.zzE(zzlVar);
            zzeyx zzG = zzeyvVar.zzG();
            zzfec zzb = zzfeb.zzb(this.zza, zzfem.zzf(zzG), 4, zzlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                zzddv zzf2 = this.zzc.zzf();
                zzctx zzctxVar = new zzctx();
                zzctxVar.zzd(this.zza);
                zzctxVar.zzh(zzG);
                zzf2.zze(zzctxVar.zzi());
                zzczz zzczzVar = new zzczz();
                zzczzVar.zzj(this.zzd, this.zzb);
                zzczzVar.zzk(this.zzd, this.zzb);
                zzf2.zzd(zzczzVar.zzn());
                zzf2.zzc(new zzegk(this.zzf));
                zzf = zzf2.zzf();
            } else {
                zzczz zzczzVar2 = new zzczz();
                zzexf zzexfVar = this.zze;
                if (zzexfVar != null) {
                    zzczzVar2.zze(zzexfVar, this.zzb);
                    zzczzVar2.zzf(this.zze, this.zzb);
                    zzczzVar2.zzb(this.zze, this.zzb);
                }
                zzddv zzf3 = this.zzc.zzf();
                zzctx zzctxVar2 = new zzctx();
                zzctxVar2.zzd(this.zza);
                zzctxVar2.zzh(zzG);
                zzf3.zze(zzctxVar2.zzi());
                zzczzVar2.zzj(this.zzd, this.zzb);
                zzczzVar2.zze(this.zzd, this.zzb);
                zzczzVar2.zzf(this.zzd, this.zzb);
                zzczzVar2.zzb(this.zzd, this.zzb);
                zzczzVar2.zza(this.zzd, this.zzb);
                zzczzVar2.zzl(this.zzd, this.zzb);
                zzczzVar2.zzk(this.zzd, this.zzb);
                zzczzVar2.zzi(this.zzd, this.zzb);
                zzczzVar2.zzc(this.zzd, this.zzb);
                zzf3.zzd(zzczzVar2.zzn());
                zzf3.zzc(new zzegk(this.zzf));
                zzf = zzf3.zzf();
            }
            zzddw zzddwVar = zzf;
            if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                zzfen zzf4 = zzddwVar.zzf();
                zzf4.zzh(4);
                zzf4.zzb(zzlVar.zzp);
                zzfenVar = zzf4;
            } else {
                zzfenVar = null;
            }
            zzcrt zza = zzddwVar.zza();
            zzfut zzi = zza.zzi(zza.zzj());
            this.zzi = zzi;
            zzfuj.zzq(zzi, new zzewe(this, zzeiqVar, zzfenVar, zzb, zzddwVar), this.zzb);
            return true;
        }
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzezx.zzd(6, null, null));
    }

    public final void zzi(zzbbp zzbbpVar) {
        this.zzf = zzbbpVar;
    }
}
