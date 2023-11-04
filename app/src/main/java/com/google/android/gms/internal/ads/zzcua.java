package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcua implements zzgwy {
    private final zzctz zza;
    private final zzgxl zzb;

    public zzcua(zzctz zzctzVar, zzgxl zzgxlVar) {
        this.zza = zzctzVar;
        this.zzb = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzcgj) this.zzb).zza());
        zzgxg.zzb(zza);
        return zza;
    }
}
