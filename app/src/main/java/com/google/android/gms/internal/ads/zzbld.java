package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbld implements zzbhp {
    final /* synthetic */ zzbkm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    final /* synthetic */ zzblr zzc;

    public zzbld(zzblr zzblrVar, zzapw zzapwVar, zzbkm zzbkmVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzblrVar;
        this.zza = zzbkmVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbhp, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i;
        zzbls zzblsVar = (zzbls) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            zzbza.zzi("JS Engine is requesting an update");
            i = this.zzc.zzi;
            if (i == 0) {
                zzbza.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
