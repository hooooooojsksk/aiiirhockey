package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgcx extends zzfwu {
    private final zzgea zza;

    public zzgcx(zzgea zzgeaVar) {
        this.zza = zzgeaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgcx) {
            zzgea zzgeaVar = ((zzgcx) obj).zza;
            return this.zza.zzb().zze().equals(zzgeaVar.zzb().zze()) && this.zza.zzb().zzg().equals(zzgeaVar.zzb().zzg()) && this.zza.zzb().zzf().equals(zzgeaVar.zzb().zzf());
        }
        return false;
    }

    public final int hashCode() {
        zzgea zzgeaVar = this.zza;
        return Arrays.hashCode(new Object[]{zzgeaVar.zzb(), zzgeaVar.zzd()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzb().zzg();
        zzgme zze = this.zza.zzb().zze();
        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzgea zza() {
        return this.zza;
    }
}
