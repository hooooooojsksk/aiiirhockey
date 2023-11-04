package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbvv implements zzfuf {
    final /* synthetic */ zzfut zza;

    public zzbvv(zzbvw zzbvwVar, zzfut zzfutVar) {
        this.zza = zzfutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        List list;
        list = zzbvw.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = zzbvw.zzc;
        list.remove(this.zza);
    }
}
