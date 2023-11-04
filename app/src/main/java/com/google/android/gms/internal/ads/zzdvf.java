package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdvf implements zzdvh {
    private final Map zza;
    private final zzfuu zzb;
    private final zzcxh zzc;

    public zzdvf(Map map, zzfuu zzfuuVar, zzcxh zzcxhVar) {
        this.zza = map;
        this.zzb = zzfuuVar;
        this.zzc = zzcxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final zzfut zzb(final zzbtn zzbtnVar) {
        this.zzc.zzbA(zzbtnVar);
        zzfut zzg = zzfuj.zzg(new zzdtf(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhB)).split(",")) {
            final zzgxl zzgxlVar = (zzgxl) this.zza.get(str.trim());
            if (zzgxlVar != null) {
                zzg = zzfuj.zzf(zzg, zzdtf.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvd
                    @Override // com.google.android.gms.internal.ads.zzftq
                    public final zzfut zza(Object obj) {
                        zzgxl zzgxlVar2 = zzgxl.this;
                        zzdtf zzdtfVar = (zzdtf) obj;
                        return ((zzdvh) zzgxlVar2.zzb()).zzb(zzbtnVar);
                    }
                }, this.zzb);
            }
        }
        zzfuj.zzq(zzg, new zzdve(this), zzbzn.zzf);
        return zzg;
    }
}
