package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeiy implements zzeir {
    private final zzeyv zza;
    private final zzcgd zzb;
    private final Context zzc;
    private final zzeio zzd;
    private final zzfep zze;
    private zzcra zzf;

    public zzeiy(zzcgd zzcgdVar, Context context, zzeio zzeioVar, zzeyv zzeyvVar) {
        this.zzb = zzcgdVar;
        this.zzc = context;
        this.zzd = zzeioVar;
        this.zza = zzeyvVar;
        this.zze = zzcgdVar.zzy();
        zzeyvVar.zzu(zzeioVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        zzcra zzcraVar = this.zzf;
        return zzcraVar != null && zzcraVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeip zzeipVar, zzeiq zzeiqVar) throws RemoteException {
        zzfen zzfenVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            zzbza.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeit
                @Override // java.lang.Runnable
                public final void run() {
                    zzeiy.this.zzf();
                }
            });
            return false;
        } else if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeiu
                @Override // java.lang.Runnable
                public final void run() {
                    zzeiy.this.zzg();
                }
            });
            return false;
        } else {
            zzezr.zza(this.zzc, zzlVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzlVar.zzf) {
                this.zzb.zzj().zzm(true);
            }
            int i = ((zzeis) zzeipVar).zza;
            zzeyv zzeyvVar = this.zza;
            zzeyvVar.zzE(zzlVar);
            zzeyvVar.zzz(i);
            zzeyx zzG = zzeyvVar.zzG();
            zzfec zzb = zzfeb.zzb(this.zzc, zzfem.zzf(zzG), 8, zzlVar);
            com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzG.zzn;
            if (zzcbVar != null) {
                this.zzd.zzd().zzi(zzcbVar);
            }
            zzder zzg = this.zzb.zzg();
            zzctx zzctxVar = new zzctx();
            zzctxVar.zzd(this.zzc);
            zzctxVar.zzh(zzG);
            zzg.zzf(zzctxVar.zzi());
            zzczz zzczzVar = new zzczz();
            zzczzVar.zzk(this.zzd.zzd(), this.zzb.zzA());
            zzg.zze(zzczzVar.zzn());
            zzg.zzd(this.zzd.zzc());
            zzg.zzc(new zzcoh(null));
            zzdes zzg2 = zzg.zzg();
            if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                zzfen zzf = zzg2.zzf();
                zzf.zzh(8);
                zzf.zzb(zzlVar.zzp);
                zzfenVar = zzf;
            } else {
                zzfenVar = null;
            }
            this.zzb.zzw().zzc(1);
            zzfuu zzfuuVar = zzbzn.zza;
            zzgxg.zzb(zzfuuVar);
            ScheduledExecutorService zzB = this.zzb.zzB();
            zzcrt zza = zzg2.zza();
            zzcra zzcraVar = new zzcra(zzfuuVar, zzB, zza.zzi(zza.zzj()));
            this.zzf = zzcraVar;
            zzcraVar.zze(new zzeix(this, zzeiqVar, zzfenVar, zzb, zzg2));
            return true;
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzezx.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzezx.zzd(6, null, null));
    }
}
