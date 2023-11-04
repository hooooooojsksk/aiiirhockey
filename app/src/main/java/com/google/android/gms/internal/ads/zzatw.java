package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzatw implements Runnable {
    final /* synthetic */ zzatx zza;

    public zzatw(zzatx zzatxVar) {
        this.zza = zzatxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzaty> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzatx zzatxVar = this.zza;
            z = zzatxVar.zzd;
            if (z) {
                z2 = zzatxVar.zze;
                if (z2) {
                    zzatxVar.zzd = false;
                    zzbza.zze("App went background");
                    list = this.zza.zzf;
                    for (zzaty zzatyVar : list) {
                        try {
                            zzatyVar.zza(false);
                        } catch (Exception e) {
                            zzbza.zzh("", e);
                        }
                    }
                }
            }
            zzbza.zze("App is still foreground");
        }
    }
}
