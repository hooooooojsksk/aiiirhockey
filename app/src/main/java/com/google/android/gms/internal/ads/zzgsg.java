package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgsg implements zzgrt {
    private final zzgrw zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzgsg(zzgrw zzgrwVar, String str, Object[] objArr) {
        this.zza = zzgrwVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2 = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final zzgrw zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
