package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzep implements zzdm {
    @Override // com.google.android.gms.internal.ads.zzdm
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdv zzb(Looper looper, Handler.Callback callback) {
        return new zzes(new Handler(looper, callback));
    }
}
