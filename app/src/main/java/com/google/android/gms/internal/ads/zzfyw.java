package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfyw extends zzfxk {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzfyu zzd;

    public /* synthetic */ zzfyw(int i, int i2, int i3, zzfyu zzfyuVar, zzfyv zzfyvVar) {
        this.zza = i;
        this.zzd = zzfyuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyw) {
            zzfyw zzfywVar = (zzfyw) obj;
            if (zzfywVar.zza == this.zza) {
                int i = zzfywVar.zzb;
                int i2 = zzfywVar.zzc;
                if (zzfywVar.zzd == this.zzd) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zza;
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + i + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfyu zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzfyu.zzc;
    }
}
