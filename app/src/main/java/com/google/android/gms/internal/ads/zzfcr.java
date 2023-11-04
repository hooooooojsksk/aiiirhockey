package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfcr {
    final /* synthetic */ zzfcs zza;
    private final Object zzb;
    private final String zzc;
    private final zzfut zzd;
    private final List zze;
    private final zzfut zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public zzfcr(zzfcs zzfcsVar, Object obj, String str, zzfut zzfutVar, List list, zzfut zzfutVar2) {
        this.zza = zzfcsVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfutVar;
        this.zze = list;
        this.zzf = zzfutVar2;
    }

    public final zzfcf zza() {
        zzfct zzfctVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfcf zzfcfVar = new zzfcf(obj, str, this.zzf);
        zzfctVar = this.zza.zzd;
        zzfctVar.zza(zzfcfVar);
        this.zzd.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcl
            @Override // java.lang.Runnable
            public final void run() {
                zzfct zzfctVar2;
                zzfcr zzfcrVar = zzfcr.this;
                zzfcf zzfcfVar2 = zzfcfVar;
                zzfctVar2 = zzfcrVar.zza.zzd;
                zzfctVar2.zzc(zzfcfVar2);
            }
        }, zzbzn.zzf);
        zzfuj.zzq(zzfcfVar, new zzfcp(this, zzfcfVar), zzbzn.zzf);
        return zzfcfVar;
    }

    public final zzfcr zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfcr zzc(Class cls, zzftq zzftqVar) {
        zzfuu zzfuuVar;
        zzfcs zzfcsVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfut zzfutVar = this.zzd;
        List list = this.zze;
        zzfut zzfutVar2 = this.zzf;
        zzfuuVar = zzfcsVar.zzb;
        return new zzfcr(zzfcsVar, obj, str, zzfutVar, list, zzfuj.zzf(zzfutVar2, cls, zzftqVar, zzfuuVar));
    }

    public final zzfcr zzd(final zzfut zzfutVar) {
        return zzg(new zzftq() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfut.this;
            }
        }, zzbzn.zzf);
    }

    public final zzfcr zze(final zzfcd zzfcdVar) {
        return zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzfco
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(zzfcd.this.zza(obj));
            }
        });
    }

    public final zzfcr zzf(zzftq zzftqVar) {
        zzfuu zzfuuVar;
        zzfuuVar = this.zza.zzb;
        return zzg(zzftqVar, zzfuuVar);
    }

    public final zzfcr zzg(zzftq zzftqVar, Executor executor) {
        return new zzfcr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfuj.zzm(this.zzf, zzftqVar, executor));
    }

    public final zzfcr zzh(String str) {
        return new zzfcr(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfcr zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzfcs zzfcsVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfut zzfutVar = this.zzd;
        List list = this.zze;
        zzfut zzfutVar2 = this.zzf;
        scheduledExecutorService = zzfcsVar.zzc;
        return new zzfcr(zzfcsVar, obj, str, zzfutVar, list, zzfuj.zzn(zzfutVar2, j, timeUnit, scheduledExecutorService));
    }
}
