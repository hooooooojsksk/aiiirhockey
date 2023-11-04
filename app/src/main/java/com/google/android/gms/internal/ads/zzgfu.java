package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgfu extends zzggc {
    private final int zza;
    private final int zzb;
    private final zzgfs zzc;
    private final zzgfr zzd;

    public /* synthetic */ zzgfu(int i, int i2, zzgfs zzgfsVar, zzgfr zzgfrVar, zzgft zzgftVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgfsVar;
        this.zzd = zzgfrVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgfu) {
            zzgfu zzgfuVar = (zzgfu) obj;
            return zzgfuVar.zza == this.zza && zzgfuVar.zzb() == zzb() && zzgfuVar.zzc == this.zzc && zzgfuVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int i = this.zzb;
        int i2 = this.zza;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgfs zzgfsVar = this.zzc;
        if (zzgfsVar == zzgfs.zzd) {
            return this.zzb;
        }
        if (zzgfsVar == zzgfs.zza || zzgfsVar == zzgfs.zzb || zzgfsVar == zzgfs.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgfs zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgfs.zzd;
    }
}
