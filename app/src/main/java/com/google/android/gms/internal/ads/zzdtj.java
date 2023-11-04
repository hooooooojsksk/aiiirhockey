package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdtj {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdur zzc;
    private final zzgws zzd;

    public zzdtj(zzfuu zzfuuVar, zzfuu zzfuuVar2, zzdur zzdurVar, zzgws zzgwsVar) {
        this.zza = zzfuuVar;
        this.zzb = zzfuuVar2;
        this.zzc = zzdurVar;
        this.zzd = zzgwsVar;
    }

    public final /* synthetic */ zzfut zza(zzbtn zzbtnVar, int i, zzdvi zzdviVar) throws Exception {
        return ((zzdxp) this.zzd.zzb()).zzc(zzbtnVar, i);
    }

    public final zzfut zzb(final zzbtn zzbtnVar) {
        zzfut zzf;
        String str = zzbtnVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzf = zzfuj.zzg(new zzdvi(1));
        } else {
            zzf = zzfuj.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdtj.this.zzc(zzbtnVar);
                }
            }), ExecutionException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdth
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzfuj.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfuj.zzf(zzf, zzdvi.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdti
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdtj.this.zza(zzbtnVar, callingUid, (zzdvi) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbtn zzbtnVar) throws Exception {
        zzbzs zzbzsVar;
        final zzdur zzdurVar = this.zzc;
        synchronized (zzdurVar.zzb) {
            if (zzdurVar.zzc) {
                zzbzsVar = zzdurVar.zza;
            } else {
                zzdurVar.zzc = true;
                zzdurVar.zze = zzbtnVar;
                zzdurVar.zzf.checkAvailabilityAndConnect();
                zzdurVar.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdur.this.zza();
                    }
                }, zzbzn.zzf);
                zzbzsVar = zzdurVar.zza;
            }
        }
        return (InputStream) zzbzsVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
    }
}
