package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzffj {
    private boolean zza;

    public final void zza(Context context) {
        zzfgr.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfgf.zzb().zzc(context);
        zzfga zza = zzfga.zza();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zza);
        }
        zzfgp.zzg(context);
        zzfgc.zzb().zzc(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
