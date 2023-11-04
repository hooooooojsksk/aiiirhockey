package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeew implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzeew(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzeev zzb() {
        return new zzeev((Context) this.zza.zzb(), (zzdlz) this.zzb.zzb());
    }
}
