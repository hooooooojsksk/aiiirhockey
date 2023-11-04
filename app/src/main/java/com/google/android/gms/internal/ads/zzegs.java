package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzegs implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzegs(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzegr zzb() {
        return new zzegr((Context) this.zza.zzb(), (zzddw) this.zzb.zzb());
    }
}
