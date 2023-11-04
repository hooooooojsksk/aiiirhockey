package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzemh implements zzepn {
    private final zzfuu zza;

    public zzemh(zzfuu zzfuuVar) {
        this.zza = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemi(com.google.android.gms.ads.internal.zzt.zzs().zzb(), com.google.android.gms.ads.internal.zzt.zzs().zzm());
            }
        });
    }
}
