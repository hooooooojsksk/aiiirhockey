package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgmu implements zzfvu {
    private static final Collection zza = Arrays.asList(64);
    private static final byte[] zzb = new byte[16];
    private final zzgnz zzc;
    private final byte[] zzd;

    public zzgmu(byte[] bArr) throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            Collection collection = zza;
            int length = bArr.length;
            if (!collection.contains(Integer.valueOf(length))) {
                throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
            }
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.zzd = Arrays.copyOfRange(bArr, i, length);
            this.zzc = new zzgnz(copyOfRange);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzc;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) zzgnn.zza.zza("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] zza2 = this.zzc.zza(zzb, 16);
        for (int i = 0; i <= 0; i++) {
            byte[] bArr4 = bArr3[i];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            zza2 = zzgmv.zzc(zzggg.zzb(zza2), this.zzc.zza(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = zza2.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            zzc = Arrays.copyOf(bArr5, length);
            for (int i2 = 0; i2 < zza2.length; i2++) {
                int i3 = (length - length2) + i2;
                zzc[i3] = (byte) (zzc[i3] ^ zza2[i2]);
            }
        } else {
            zzc = zzgmv.zzc(zzggg.zza(bArr5), zzggg.zzb(zza2));
        }
        byte[] zza3 = this.zzc.zza(zzc, 16);
        byte[] bArr6 = (byte[]) zza3.clone();
        bArr6[8] = (byte) (bArr6[8] & ByteCompanionObject.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr6));
        return zzgmv.zzb(zza3, cipher.doFinal(bArr));
    }
}
