package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgbm implements zzgbp {
    private final int zza;

    public zzgbm(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            this.zza = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length != this.zza) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
        }
        return new zzgai(bArr, false).zzb(bArr2, bArr3, bArr4);
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zza;
        if (i != 16) {
            if (i == 32) {
                return zzgcc.zzj;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzgcc.zzi;
    }
}
