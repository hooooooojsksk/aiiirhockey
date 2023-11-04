package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfue extends zzfuc implements zzfut {
    @Override // com.google.android.gms.internal.ads.zzfuc
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    public final void zzc(Runnable runnable, Executor executor) {
        zzd().zzc(runnable, executor);
    }

    protected abstract zzfut zzd();
}
