package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfvj extends zzftz implements RunnableFuture {
    @CheckForNull
    private volatile zzfus zza;

    public zzfvj(zzftp zzftpVar) {
        this.zza = new zzfvh(this, zzftpVar);
    }

    public static zzfvj zzf(Runnable runnable, Object obj) {
        return new zzfvj(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfus zzfusVar = this.zza;
        if (zzfusVar != null) {
            zzfusVar.run();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    public final String zza() {
        zzfus zzfusVar = this.zza;
        if (zzfusVar != null) {
            String obj = zzfusVar.toString();
            return "task=[" + obj + "]";
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzfus zzfusVar;
        if (zzu() && (zzfusVar = this.zza) != null) {
            zzfusVar.zzh();
        }
        this.zza = null;
    }

    public zzfvj(Callable callable) {
        this.zza = new zzfvi(this, callable);
    }
}
