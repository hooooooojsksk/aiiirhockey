package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbzx implements zzfuf {
    final /* synthetic */ zzbzz zza;

    public zzbzx(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(1);
    }
}
