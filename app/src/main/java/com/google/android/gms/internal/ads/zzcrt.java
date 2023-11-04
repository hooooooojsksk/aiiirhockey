package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcrt {
    private final zzduo zza;
    private final zzeyx zzb;
    private final zzfda zzc;
    private final zzclq zzd;
    private final zzeem zze;
    private final zzczt zzf;
    private zzeyo zzg;
    private final zzdvt zzh;
    private final zzctt zzi;
    private final Executor zzj;
    private final zzdvf zzk;
    private final zzeay zzl;
    private final zzdwj zzm;
    private final zzdwq zzn;

    public zzcrt(zzduo zzduoVar, zzeyx zzeyxVar, zzfda zzfdaVar, zzclq zzclqVar, zzeem zzeemVar, zzczt zzcztVar, zzeyo zzeyoVar, zzdvt zzdvtVar, zzctt zzcttVar, Executor executor, zzdvf zzdvfVar, zzeay zzeayVar, zzdwj zzdwjVar, zzdwq zzdwqVar) {
        this.zza = zzduoVar;
        this.zzb = zzeyxVar;
        this.zzc = zzfdaVar;
        this.zzd = zzclqVar;
        this.zze = zzeemVar;
        this.zzf = zzcztVar;
        this.zzg = zzeyoVar;
        this.zzh = zzdvtVar;
        this.zzi = zzcttVar;
        this.zzj = executor;
        this.zzk = zzdvfVar;
        this.zzl = zzeayVar;
        this.zzm = zzdwjVar;
        this.zzn = zzdwqVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzezx.zzb(th, this.zzl);
    }

    public final zzczt zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzeyo zzd(zzeyo zzeyoVar) throws Exception {
        this.zzd.zza(zzeyoVar);
        return zzeyoVar;
    }

    public final zzfut zze(final zzfaq zzfaqVar) {
        zzfcf zza = this.zzc.zzb(zzfcu.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzcrq
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzcrt.this.zzf(zzfaqVar, (zzbtn) obj);
            }
        }).zza();
        zzfuj.zzq(zza, new zzcrr(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ zzfut zzf(zzfaq zzfaqVar, zzbtn zzbtnVar) throws Exception {
        zzbtnVar.zzi = zzfaqVar;
        return this.zzh.zza(zzbtnVar);
    }

    public final /* synthetic */ zzfut zzg(zzfut zzfutVar, zzfut zzfutVar2, zzfut zzfutVar3) throws Exception {
        return this.zzn.zzc((zzbtn) zzfutVar.get(), (JSONObject) zzfutVar2.get(), (zzbtq) zzfutVar3.get());
    }

    public final zzfut zzh(zzbtn zzbtnVar) {
        zzfcf zza = this.zzc.zzb(zzfcu.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbtnVar)).zza();
        zzfuj.zzq(zza, new zzcrs(this), this.zzj);
        return zza;
    }

    public final zzfut zzi(zzfut zzfutVar) {
        zzfcr zzf = this.zzc.zzb(zzfcu.RENDERER, zzfutVar).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzcrp
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                zzeyo zzeyoVar = (zzeyo) obj;
                zzcrt.this.zzd(zzeyoVar);
                return zzeyoVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfb)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final zzfut zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx != null || zzlVar.zzs != null) {
            zzfda zzfdaVar = this.zzc;
            return zzfck.zzc(this.zza.zza(), zzfcu.PRELOADED_LOADER, zzfdaVar).zza();
        }
        return zzk(this.zzi.zzc());
    }

    public final zzfut zzk(final zzfut zzfutVar) {
        if (this.zzg != null) {
            return zzfck.zzc(zzfuj.zzh(this.zzg), zzfcu.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjG)).booleanValue() || ((Boolean) zzbcq.zzb.zze()).booleanValue()) {
            zzfcr zzb = this.zzc.zzb(zzfcu.SERVER_TRANSACTION, zzfutVar);
            final zzdvf zzdvfVar = this.zzk;
            return zzb.zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzcro
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzdvf.this.zzb((zzbtn) obj);
                }
            }).zza();
        }
        final zzdwj zzdwjVar = this.zzm;
        final zzfut zzm = zzfuj.zzm(zzfutVar, new zzftq() { // from class: com.google.android.gms.internal.ads.zzcrk
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdwj.this.zza((zzbtn) obj);
            }
        }, this.zzj);
        zzfcr zzb2 = this.zzc.zzb(zzfcu.BUILD_URL, zzm);
        final zzdvt zzdvtVar = this.zzh;
        final zzfcf zza = zzb2.zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzcrl
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdvt.this.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfcu.SERVER_TRANSACTION, zzfutVar, zzm, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcrm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcrt.this.zzg(zzfutVar, zzm, zza);
            }
        }).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzcrn
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return (zzfut) obj;
            }
        }).zza();
    }

    public final void zzl(zzeyo zzeyoVar) {
        this.zzg = zzeyoVar;
    }
}
