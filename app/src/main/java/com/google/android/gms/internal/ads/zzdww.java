package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdww extends zzdwz {
    private zzbsr zzh;

    public zzdww(Context context, ScheduledExecutorService scheduledExecutorService) {
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
            this.zzd.zzp().zzf(this.zzh, new zzdwy(this));
        } catch (RemoteException unused) {
            this.zza.zze(new zzdvi(1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwz, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzbza.zze(format);
        this.zza.zze(new zzdvi(1, format));
    }

    public final synchronized zzfut zza(zzbsr zzbsrVar, long j) {
        if (this.zzb) {
            return zzfuj.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbsrVar;
        zzb();
        zzfut zzn = zzfuj.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // java.lang.Runnable
            public final void run() {
                zzdww.this.zzc();
            }
        }, zzbzn.zzf);
        return zzn;
    }
}
