package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdqt implements zzdqh {
    private final long zza;
    private final zzeij zzb;

    public zzdqt(long j, Context context, zzdqm zzdqmVar, zzcgd zzcgdVar, String str) {
        this.zza = j;
        zzewh zzt = zzcgdVar.zzt();
        zzt.zzc(context);
        zzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzt.zzb(str);
        zzeij zza = zzt.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdqs(this, zzdqmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
