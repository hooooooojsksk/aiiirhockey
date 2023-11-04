package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbwi implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzbwi(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzbwh zzb() {
        return new zzbwh((Clock) this.zza.zzb(), (zzbwf) this.zzb.zzb());
    }
}
