package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfut;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        if (zzbyz.zzk(context) && !zzbyz.zzm()) {
            zzfut zzb = new zzc(context).zzb();
            zzbza.zzi("Updating ad debug logging enablement.");
            zzbzq.zza(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
