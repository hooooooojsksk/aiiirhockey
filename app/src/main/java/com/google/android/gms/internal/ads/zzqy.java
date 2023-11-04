package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzqy {
    public static void zza(zzqs zzqsVar, zzno zznoVar) {
        LogSessionId zza = zznoVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqsVar.zzb.setString("log-session-id", zza.getStringId());
    }
}
