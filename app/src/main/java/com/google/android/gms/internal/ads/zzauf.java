package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzauf {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    public zzauf(float f, float f2, float f3, float f4, int i) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f + f3;
        this.zzd = f2 + f4;
        this.zze = i;
    }

    public final float zza() {
        return this.zzd;
    }

    public final float zzb() {
        return this.zza;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }
}
