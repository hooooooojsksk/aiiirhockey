package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfva {
    public static zzfuu zza(ExecutorService executorService) {
        zzfuu zzfuwVar;
        if (executorService instanceof zzfuu) {
            return (zzfuu) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfuwVar = new zzfuz((ScheduledExecutorService) executorService);
        } else {
            zzfuwVar = new zzfuw(executorService);
        }
        return zzfuwVar;
    }

    public static Executor zzb() {
        return zzftx.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzfsx zzfsxVar) {
        Objects.requireNonNull(executor);
        return executor == zzftx.INSTANCE ? executor : new zzfuv(executor, zzfsxVar);
    }
}
