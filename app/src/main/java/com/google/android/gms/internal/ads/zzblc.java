package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzblc implements zzbhp {
    final /* synthetic */ zzblq zza;
    final /* synthetic */ zzbkm zzb;
    final /* synthetic */ zzblr zzc;

    public zzblc(zzblr zzblrVar, zzblq zzblqVar, zzbkm zzbkmVar) {
        this.zzc = zzblrVar;
        this.zza = zzblqVar;
        this.zzb = zzbkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        zzbls zzblsVar = (zzbls) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zzc.zzi = 0;
                zzbkm zzbkmVar = this.zzb;
                zzbkmVar.zzq("/log", zzbho.zzg);
                zzbkmVar.zzq("/result", zzbho.zzo);
                this.zza.zzh(this.zzb);
                this.zzc.zzh = this.zza;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
