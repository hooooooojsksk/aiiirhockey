package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdue {
    private final ScheduledExecutorService zza;
    private final zzfuu zzb;
    private final zzfuu zzc;
    private final zzduv zzd;
    private final zzgws zze;

    public zzdue(ScheduledExecutorService scheduledExecutorService, zzfuu zzfuuVar, zzfuu zzfuuVar2, zzduv zzduvVar, zzgws zzgwsVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfuuVar;
        this.zzc = zzfuuVar2;
        this.zzd = zzduvVar;
        this.zze = zzgwsVar;
    }

    public final /* synthetic */ zzfut zza(zzbtn zzbtnVar, int i, Throwable th) throws Exception {
        return ((zzdxp) this.zze.zzb()).zzd(zzbtnVar, i);
    }

    public final zzfut zzb(final zzbtn zzbtnVar) {
        zzfut zzb;
        String str = zzbtnVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzb = zzfuj.zzg(new zzdvi(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhc)).booleanValue()) {
                zzb = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzduc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdue.this.zzc(zzbtnVar);
                    }
                });
            } else {
                zzb = this.zzd.zzb(zzbtnVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfuj.zzf((zzfua) zzfuj.zzn(zzfua.zzv(zzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdud
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdue.this.zza(zzbtnVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ InputStream zzc(zzbtn zzbtnVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbtnVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
    }
}
