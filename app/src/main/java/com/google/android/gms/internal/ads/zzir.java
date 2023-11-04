package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzir {
    public static zzno zza(Context context, zzjc zzjcVar, boolean z) {
        zznk zzb = zznk.zzb(context);
        if (zzb == null) {
            zzee.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzno(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzjcVar.zzC(zzb);
        }
        return new zzno(zzb.zza());
    }
}
