package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgnz implements zzggt {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgnz(byte[] bArr) throws GeneralSecurityException {
        zzgog.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zzb2 = zzggg.zzb(zzb.doFinal(new byte[16]));
        this.zzb = zzb2;
        this.zzc = zzggg.zzb(zzb2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (!zzgas.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        return (Cipher) zzgnn.zza.zza("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzc;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zzb = zzb();
        zzb.init(1, this.zza);
        int length = bArr.length;
        double d = length;
        Double.isNaN(d);
        int max = Math.max(1, (int) Math.ceil(d / 16.0d));
        if (max * 16 == length) {
            zzc = zzgmv.zzd(bArr, (max - 1) * 16, this.zzb, 0, 16);
        } else {
            zzc = zzgmv.zzc(zzggg.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = zzb.doFinal(zzgmv.zzd(bArr2, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(zzb.doFinal(zzgmv.zzc(zzc, bArr2)), i);
    }
}
