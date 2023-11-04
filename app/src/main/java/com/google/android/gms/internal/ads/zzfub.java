package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfub extends zzfua {
    private final zzfut zza;

    public zzfub(zzfut zzfutVar) {
        Objects.requireNonNull(zzfutVar);
        this.zza = zzfutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, com.google.android.gms.internal.ads.zzfut
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}
