package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzob {
    private final Handler zza;
    private final zzoc zzb;

    public zzob(Handler handler, zzoc zzocVar) {
        this.zza = zzocVar == null ? null : handler;
        this.zzb = zzocVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznr
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznx
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznw
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzj(str, j, j2);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzny
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzhb zzhbVar) {
        zzhbVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzns
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzl(zzhbVar);
                }
            });
        }
    }

    public final void zzf(final zzhb zzhbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznt
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzm(zzhbVar);
                }
            });
        }
    }

    public final void zzg(final zzaf zzafVar, final zzhc zzhcVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznz
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzn(zzafVar, zzhcVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzh(Exception exc) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzb(exc);
    }

    public final /* synthetic */ void zzi(Exception exc) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzi(exc);
    }

    public final /* synthetic */ void zzj(String str, long j, long j2) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzc(str, j, j2);
    }

    public final /* synthetic */ void zzk(String str) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzd(str);
    }

    public final /* synthetic */ void zzl(zzhb zzhbVar) {
        zzhbVar.zza();
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zze(zzhbVar);
    }

    public final /* synthetic */ void zzm(zzhb zzhbVar) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzf(zzhbVar);
    }

    public final /* synthetic */ void zzn(zzaf zzafVar, zzhc zzhcVar) {
        int i = zzew.zza;
        this.zzb.zzg(zzafVar, zzhcVar);
    }

    public final /* synthetic */ void zzo(long j) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzh(j);
    }

    public final /* synthetic */ void zzp(boolean z) {
        zzoc zzocVar = this.zzb;
        int i = zzew.zza;
        zzocVar.zzm(z);
    }

    public final /* synthetic */ void zzq(int i, long j, long j2) {
        zzoc zzocVar = this.zzb;
        int i2 = zzew.zza;
        zzocVar.zzj(i, j, j2);
    }

    public final void zzr(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznu
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzo(j);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznv
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzp(z);
                }
            });
        }
    }

    public final void zzt(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoa
                @Override // java.lang.Runnable
                public final void run() {
                    zzob.this.zzq(i, j, j2);
                }
            });
        }
    }
}
