package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcmy implements zzbhp {
    final /* synthetic */ zzcnb zza;

    public zzcmy(zzcnb zzcnbVar) {
        this.zza = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcnb.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmx
                @Override // java.lang.Runnable
                public final void run() {
                    zzcng zzcngVar;
                    zzcngVar = zzcmy.this.zza.zzd;
                    zzcngVar.zzg();
                }
            });
        }
    }
}
