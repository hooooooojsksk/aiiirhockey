package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfci {
    final /* synthetic */ zzfcs zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfci(zzfcs zzfcsVar, Object obj, List list, zzfch zzfchVar) {
        this.zza = zzfcsVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfcr zza(Callable callable) {
        zzfuu zzfuuVar;
        zzfui zzb = zzfuj.zzb(this.zzc);
        zzfut zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbzn.zzf);
        zzfcs zzfcsVar = this.zza;
        Object obj = this.zzb;
        List list = this.zzc;
        zzfuuVar = zzfcsVar.zzb;
        return new zzfcr(zzfcsVar, obj, zza, list, zzb.zza(callable, zzfuuVar));
    }
}
