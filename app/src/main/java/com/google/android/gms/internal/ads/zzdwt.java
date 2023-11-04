package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdwt extends zzdwz {
    private zzbsv zzh;

    public zzdwt(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            this.zzd.zzp().zze(this.zzh, new zzdwy(this));
        } catch (RemoteException unused) {
            this.zza.zze(new zzdvi(1));
        }
    }

    public final synchronized zzfut zza(zzbsv zzbsvVar, long j) {
        if (this.zzb) {
            return zzfuj.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbsvVar;
        zzb();
        zzfut zzn = zzfuj.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdws
            @Override // java.lang.Runnable
            public final void run() {
                zzdwt.this.zzc();
            }
        }, zzbzn.zzf);
        return zzn;
    }
}
