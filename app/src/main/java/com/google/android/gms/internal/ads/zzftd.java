package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzftd extends zzftf {
    public zzftd(zzfut zzfutVar, zzftq zzftqVar) {
        super(zzfutVar, zzftqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzftq zzftqVar = (zzftq) obj;
        zzfut zza = zzftqVar.zza(obj2);
        zzfnu.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzftqVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    final /* synthetic */ void zzg(Object obj) {
        zzt((zzfut) obj);
    }
}
