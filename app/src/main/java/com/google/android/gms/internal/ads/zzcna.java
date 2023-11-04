package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcna implements zzbhp {
    final /* synthetic */ zzcnb zza;

    public zzcna(zzcnb zzcnbVar) {
        this.zza = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcnb.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
                @Override // java.lang.Runnable
                public final void run() {
                    zzcng zzcngVar;
                    zzcngVar = zzcna.this.zza.zzd;
                    zzcngVar.zzj();
                }
            });
        }
    }
}
