package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzasm implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzaqx zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzamv zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzasm(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        this.zzb = zzaqxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzamvVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        long nanoTime;
        Method zzj;
        int i;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzapr zzd = this.zzb.zzd();
        if (zzd != null && (i = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
