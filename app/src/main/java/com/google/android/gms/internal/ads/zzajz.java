package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzajz implements Runnable {
    final /* synthetic */ zzako zza;
    final /* synthetic */ zzaka zzb;

    public zzajz(zzaka zzakaVar, zzako zzakoVar) {
        this.zzb = zzakaVar;
        this.zza = zzakoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
