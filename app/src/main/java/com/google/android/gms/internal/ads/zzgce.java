package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgce implements zzgbv {
    private final zzgoj zza;
    private final zzgoj zzb;

    private zzgce(byte[] bArr, byte[] bArr2) {
        this.zza = zzgoj.zzb(bArr);
        this.zzb = zzgoj.zzb(bArr2);
    }

    public static zzgce zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        zzgne.zzc(zzgne.zzg(zzgne.zzh(i), 1, bArr2), zzgne.zzf(i, bArr));
        return new zzgce(bArr, bArr2);
    }
}
