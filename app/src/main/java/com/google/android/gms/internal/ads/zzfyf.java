package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfyf extends zzfxk {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzfyd zzd;

    public /* synthetic */ zzfyf(int i, int i2, int i3, zzfyd zzfydVar, zzfye zzfyeVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzfydVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyf) {
            zzfyf zzfyfVar = (zzfyf) obj;
            if (zzfyfVar.zza == this.zza && zzfyfVar.zzb == this.zzb) {
                int i = zzfyfVar.zzc;
                if (zzfyfVar.zzd == this.zzd) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int i2 = this.zza;
        return "AesEax Parameters (variant: " + valueOf + ", " + i + "-byte IV, 16-byte tag, and " + i2 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfyd zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzfyd.zzc;
    }
}
