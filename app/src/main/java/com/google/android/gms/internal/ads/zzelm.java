package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzelm implements zzepn {
    private final zzfuu zza;

    public zzelm(zzfuu zzfuuVar) {
        this.zza = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeln(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zza()).longValue());
            }
        });
    }
}
