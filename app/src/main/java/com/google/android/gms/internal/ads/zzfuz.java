package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfuz extends zzfuw implements ScheduledExecutorService, zzfuu {
    final ScheduledExecutorService zza;

    public zzfuz(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfvj zzf = zzfvj.zzf(runnable, null);
        return new zzfux(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfuy zzfuyVar = new zzfuy(runnable);
        return new zzfux(zzfuyVar, this.zza.scheduleAtFixedRate(zzfuyVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfuy zzfuyVar = new zzfuy(runnable);
        return new zzfux(zzfuyVar, this.zza.scheduleWithFixedDelay(zzfuyVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfvj zzfvjVar = new zzfvj(callable);
        return new zzfux(zzfvjVar, this.zza.schedule(zzfvjVar, j, timeUnit));
    }
}
