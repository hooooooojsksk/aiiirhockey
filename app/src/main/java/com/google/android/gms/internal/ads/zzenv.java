package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzenv implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzenv(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzenu(((zzdtr) this.zza).zzb(), (PackageInfo) this.zzb.zzb());
    }
}
