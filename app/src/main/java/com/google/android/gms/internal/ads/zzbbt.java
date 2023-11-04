package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbbt {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfen zze;
    private final zzbbv zzf;

    public zzbbt(Context context, ScheduledExecutorService scheduledExecutorService, zzbbv zzbbvVar, zzfen zzfenVar, byte[] bArr) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbbvVar;
        this.zze = zzfenVar;
    }

    public final zzfut zza() {
        return (zzfua) zzfuj.zzn(zzfua.zzv(zzfuj.zzh(null)), ((Long) zzbcj.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || motionEvent.getEventTime() <= this.zza.getEventTime()) {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = MotionEvent.obtain(motionEvent);
            return;
        }
        this.zza = MotionEvent.obtain(motionEvent);
    }
}
