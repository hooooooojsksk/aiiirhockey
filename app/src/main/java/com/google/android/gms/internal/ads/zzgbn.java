package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgbn implements zzgbp {
    @Override // com.google.android.gms.internal.ads.zzgbp
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final byte[] zzb() {
        return zzgcc.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        return new zzgal(bArr).zzd(bArr2, bArr3, bArr4);
    }
}
