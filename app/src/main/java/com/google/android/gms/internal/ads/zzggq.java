package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzggq {
    private final zzfwg zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzggq(zzfwg zzfwgVar, int i, String str, String str2, zzggp zzggpVar) {
        this.zza = zzfwgVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzggq) {
            zzggq zzggqVar = (zzggq) obj;
            return this.zza == zzggqVar.zza && this.zzb == zzggqVar.zzb && this.zzc.equals(zzggqVar.zzc) && this.zzd.equals(zzggqVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
