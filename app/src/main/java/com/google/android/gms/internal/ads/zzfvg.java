package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfvg extends zzftz {
    @CheckForNull
    private zzfut zza;
    @CheckForNull
    private ScheduledFuture zzb;

    private zzfvg(zzfut zzfutVar) {
        Objects.requireNonNull(zzfutVar);
        this.zza = zzfutVar;
    }

    public static zzfut zzg(zzfut zzfutVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvg zzfvgVar = new zzfvg(zzfutVar);
        zzfvd zzfvdVar = new zzfvd(zzfvgVar);
        zzfvgVar.zzb = scheduledExecutorService.schedule(zzfvdVar, j, timeUnit);
        zzfutVar.zzc(zzfvdVar, zzftx.INSTANCE);
        return zzfvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    public final String zza() {
        zzfut zzfutVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfutVar != null) {
            String str = "inputFuture=[" + zzfutVar.toString() + "]";
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
