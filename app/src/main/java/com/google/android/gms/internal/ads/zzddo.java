package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzddo implements zzgwy {
    private final zzgxl zza;

    public zzddo(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdbu((zzdeh) this.zza.zzb(), zzbzn.zzf));
        zzgxg.zzb(singleton);
        return singleton;
    }
}
