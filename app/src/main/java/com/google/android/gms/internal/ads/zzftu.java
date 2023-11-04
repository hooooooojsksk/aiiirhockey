package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzftu extends zzftv {
    final /* synthetic */ zzftw zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftu(zzftw zzftwVar, Callable callable, Executor executor) {
        super(zzftwVar, executor);
        this.zza = zzftwVar;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftv
    final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
