package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfgy implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfhb.zzc;
        if (handler != null) {
            handler2 = zzfhb.zzc;
            runnable = zzfhb.zzd;
            handler2.post(runnable);
            handler3 = zzfhb.zzc;
            runnable2 = zzfhb.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
