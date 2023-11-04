package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzyo {
    private final Handler zza;
    private final zzyp zzb;

    public zzyo(Handler handler, zzyp zzypVar) {
        this.zza = zzypVar == null ? null : handler;
        this.zzb = zzypVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhb zzhbVar) {
        zzhbVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyj
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzi(zzhbVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzye
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzhb zzhbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyi
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzk(zzhbVar);
                }
            });
        }
    }

    public final void zzf(final zzaf zzafVar, final zzhc zzhcVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzl(zzafVar, zzhcVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j, long j2) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzo(str, j, j2);
    }

    public final /* synthetic */ void zzh(String str) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzp(str);
    }

    public final /* synthetic */ void zzi(zzhb zzhbVar) {
        zzhbVar.zza();
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzq(zzhbVar);
    }

    public final /* synthetic */ void zzj(int i, long j) {
        zzyp zzypVar = this.zzb;
        int i2 = zzew.zza;
        zzypVar.zzk(i, j);
    }

    public final /* synthetic */ void zzk(zzhb zzhbVar) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzr(zzhbVar);
    }

    public final /* synthetic */ void zzl(zzaf zzafVar, zzhc zzhcVar) {
        int i = zzew.zza;
        this.zzb.zzt(zzafVar, zzhcVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzl(obj, j);
    }

    public final /* synthetic */ void zzn(long j, int i) {
        zzyp zzypVar = this.zzb;
        int i2 = zzew.zza;
        zzypVar.zzs(j, i);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzn(exc);
    }

    public final /* synthetic */ void zzp(zzda zzdaVar) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzu(zzdaVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyf
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyh
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyg
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzda zzdaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzym
                @Override // java.lang.Runnable
                public final void run() {
                    zzyo.this.zzp(zzdaVar);
                }
            });
        }
    }
}
