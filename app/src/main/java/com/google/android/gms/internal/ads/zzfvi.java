package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfvi extends zzfus {
    final /* synthetic */ zzfvj zza;
    private final Callable zzb;

    public zzfvi(zzfvj zzfvjVar, Callable callable) {
        this.zza = zzfvjVar;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final boolean zzg() {
        return this.zza.isDone();
    }
}
