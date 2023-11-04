package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedg implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzedg(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzedf zzb() {
        return new zzedf((Context) this.zza.zzb(), (zzddw) this.zzb.zzb());
    }
}
