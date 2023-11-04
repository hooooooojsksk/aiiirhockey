package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdda implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;

    public zzdda(zzdcz zzdczVar, zzgxl zzgxlVar) {
        this.zza = zzdczVar;
        this.zzb = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdbu((zzctm) this.zzb.zzb(), zzbzn.zzf));
        zzgxg.zzb(singleton);
        return singleton;
    }
}
