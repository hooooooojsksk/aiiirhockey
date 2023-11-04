package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcra {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfut zzc;
    private volatile boolean zzd = true;

    public zzcra(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfut zzfutVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfutVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzcra zzcraVar, List list, final zzfuf zzfufVar) {
        if (list == null || list.isEmpty()) {
            zzcraVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                @Override // java.lang.Runnable
                public final void run() {
                    zzfuf.this.zza(new zzdtf(3));
                }
            });
            return;
        }
        zzfut zzh = zzfuj.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final zzfut zzfutVar = (zzfut) it.next();
            zzh = zzfuj.zzm(zzfuj.zzf(zzh, Throwable.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzcqv
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    zzfuf.this.zza((Throwable) obj);
                    return zzfuj.zzh(null);
                }
            }, zzcraVar.zza), new zzftq() { // from class: com.google.android.gms.internal.ads.zzcqw
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzcra.this.zza(zzfufVar, zzfutVar, (zzcqm) obj);
                }
            }, zzcraVar.zza);
        }
        zzfuj.zzq(zzh, new zzcqz(zzcraVar, zzfufVar), zzcraVar.zza);
    }

    public final /* synthetic */ zzfut zza(zzfuf zzfufVar, zzfut zzfutVar, zzcqm zzcqmVar) throws Exception {
        if (zzcqmVar != null) {
            zzfufVar.zzb(zzcqmVar);
        }
        return zzfuj.zzn(zzfutVar, ((Long) zzbcx.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfuf zzfufVar) {
        zzfuj.zzq(this.zzc, new zzcqy(this, zzfufVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
