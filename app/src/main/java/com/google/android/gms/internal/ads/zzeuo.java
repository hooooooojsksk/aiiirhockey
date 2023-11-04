package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeuo implements zzeir {
    private final Context zza;
    private final Executor zzb;
    private final zzcgd zzc;
    private final zzeib zzd;
    private final zzeif zze;
    private final ViewGroup zzf;
    private zzbbp zzg;
    private final zzcxd zzh;
    private final zzfep zzi;
    private final zzczk zzj;
    private final zzeyv zzk;
    private zzfut zzl;

    public zzeuo(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcgd zzcgdVar, zzeib zzeibVar, zzeif zzeifVar, zzeyv zzeyvVar, zzczk zzczkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgdVar;
        this.zzd = zzeibVar;
        this.zze = zzeifVar;
        this.zzk = zzeyvVar;
        this.zzh = zzcgdVar.zze();
        this.zzi = zzcgdVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzczkVar;
        zzeyvVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        zzfut zzfutVar = this.zzl;
        return (zzfutVar == null || zzfutVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeip zzeipVar, zzeiq zzeiqVar) throws RemoteException {
        zzcph zzj;
        zzfen zzfenVar;
        if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuk
                @Override // java.lang.Runnable
                public final void run() {
                    zzeuo.this.zzm();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzj().zzm(true);
            }
            zzeyv zzeyvVar = this.zzk;
            zzeyvVar.zzs(str);
            zzeyvVar.zzE(zzlVar);
            zzeyx zzG = zzeyvVar.zzG();
            zzfec zzb = zzfeb.zzb(this.zza, zzfem.zzf(zzG), 3, zzlVar);
            if (((Boolean) zzbcq.zzd.zze()).booleanValue() && this.zzk.zzg().zzk) {
                zzeib zzeibVar = this.zzd;
                if (zzeibVar != null) {
                    zzeibVar.zza(zzezx.zzd(7, null, null));
                }
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                zzcpg zzd = this.zzc.zzd();
                zzctx zzctxVar = new zzctx();
                zzctxVar.zzd(this.zza);
                zzctxVar.zzh(zzG);
                zzd.zzi(zzctxVar.zzi());
                zzczz zzczzVar = new zzczz();
                zzczzVar.zzj(this.zzd, this.zzb);
                zzczzVar.zzk(this.zzd, this.zzb);
                zzd.zzf(zzczzVar.zzn());
                zzd.zze(new zzegk(this.zzg));
                zzd.zzd(new zzden(zzdgt.zza, null));
                zzd.zzg(new zzcqe(this.zzh, this.zzj));
                zzd.zzc(new zzcoh(this.zzf));
                zzj = zzd.zzj();
            } else {
                zzcpg zzd2 = this.zzc.zzd();
                zzctx zzctxVar2 = new zzctx();
                zzctxVar2.zzd(this.zza);
                zzctxVar2.zzh(zzG);
                zzd2.zzi(zzctxVar2.zzi());
                zzczz zzczzVar2 = new zzczz();
                zzczzVar2.zzj(this.zzd, this.zzb);
                zzczzVar2.zza(this.zzd, this.zzb);
                zzczzVar2.zza(this.zze, this.zzb);
                zzczzVar2.zzl(this.zzd, this.zzb);
                zzczzVar2.zzd(this.zzd, this.zzb);
                zzczzVar2.zze(this.zzd, this.zzb);
                zzczzVar2.zzf(this.zzd, this.zzb);
                zzczzVar2.zzb(this.zzd, this.zzb);
                zzczzVar2.zzk(this.zzd, this.zzb);
                zzczzVar2.zzi(this.zzd, this.zzb);
                zzd2.zzf(zzczzVar2.zzn());
                zzd2.zze(new zzegk(this.zzg));
                zzd2.zzd(new zzden(zzdgt.zza, null));
                zzd2.zzg(new zzcqe(this.zzh, this.zzj));
                zzd2.zzc(new zzcoh(this.zzf));
                zzj = zzd2.zzj();
            }
            zzcph zzcphVar = zzj;
            if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                zzfen zzj2 = zzcphVar.zzj();
                zzj2.zzh(3);
                zzj2.zzb(zzlVar.zzp);
                zzfenVar = zzj2;
            } else {
                zzfenVar = null;
            }
            zzcrt zzd3 = zzcphVar.zzd();
            zzfut zzi = zzd3.zzi(zzd3.zzj());
            this.zzl = zzi;
            zzfuj.zzq(zzi, new zzeun(this, zzeiqVar, zzfenVar, zzb, zzcphVar), this.zzb);
            return true;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzeyv zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzezx.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzcxe zzcxeVar) {
        this.zzh.zzm(zzcxeVar, this.zzb);
    }

    public final void zzq(zzbbp zzbbpVar) {
        this.zzg = zzbbpVar;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzT(view, view.getContext());
        }
        return false;
    }
}
