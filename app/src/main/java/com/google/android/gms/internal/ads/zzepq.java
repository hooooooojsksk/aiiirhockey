package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzepq {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfen zzd;
    private final zzdpi zze;

    public zzepq(Context context, Executor executor, Set set, zzfen zzfenVar, zzdpi zzdpiVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfenVar;
        this.zze = zzdpiVar;
    }

    public final zzfut zza(final Object obj) {
        zzfec zza = zzfeb.zza(this.zza, 8);
        zza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        for (final zzepn zzepnVar : this.zzb) {
            zzfut zzb = zzepnVar.zzb();
            final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepo
                @Override // java.lang.Runnable
                public final void run() {
                    zzepq.this.zzb(elapsedRealtime, zzepnVar);
                }
            }, zzbzn.zzf);
            arrayList.add(zzb);
        }
        zzfut zza2 = zzfuj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzepp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfut> list = arrayList;
                Object obj2 = obj;
                for (zzfut zzfutVar : list) {
                    zzepm zzepmVar = (zzepm) zzfutVar.get();
                    if (zzepmVar != null) {
                        zzepmVar.zzh(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfep.zza()) {
            zzfem.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j, zzepn zzepnVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbco.zza.zze()).booleanValue()) {
            String zzc = zzfoj.zzc(zzepnVar.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzc + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbQ)).booleanValue()) {
            zzdph zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzepnVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza.zzh();
        }
    }
}
