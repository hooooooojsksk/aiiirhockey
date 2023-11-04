package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdfo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdfo(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzg zza = ((zzcgu) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzatb(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
