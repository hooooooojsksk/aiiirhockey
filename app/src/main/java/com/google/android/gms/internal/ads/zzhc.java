package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzhc {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzhc(String str, zzaf zzafVar, zzaf zzafVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzdl.zzd(z);
            zzdl.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzafVar);
            this.zzb = zzafVar;
            Objects.requireNonNull(zzafVar2);
            this.zzc = zzafVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzdl.zzd(z);
        zzdl.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzafVar);
        this.zzb = zzafVar;
        Objects.requireNonNull(zzafVar2);
        this.zzc = zzafVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhc zzhcVar = (zzhc) obj;
            if (this.zzd == zzhcVar.zzd && this.zze == zzhcVar.zze && this.zza.equals(zzhcVar.zza) && this.zzb.equals(zzhcVar.zzb) && this.zzc.equals(zzhcVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
