package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcgo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcgo(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdrm zzdrmVar = (zzdrm) this.zza.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbw)).booleanValue()) {
            emptySet = Collections.singleton(new zzdbu(zzdrmVar, zzfuuVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgxg.zzb(emptySet);
        return emptySet;
    }
}
