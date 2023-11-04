package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgcg implements zzgbv {
    private final zzgoj zza;
    private final zzgoj zzb;

    private zzgcg(byte[] bArr, byte[] bArr2) {
        this.zza = zzgoj.zzb(bArr);
        this.zzb = zzgoj.zzb(bArr2);
    }

    public static zzgcg zza(byte[] bArr) throws GeneralSecurityException {
        return new zzgcg(bArr, zzgoh.zzc(bArr));
    }
}
