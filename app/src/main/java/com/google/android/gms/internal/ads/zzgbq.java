package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgbq {
    private static final byte[] zza = new byte[0];
    private final zzgbp zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgbq(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgbp zzgbpVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgbpVar;
    }

    public static zzgbq zzc(byte[] bArr, byte[] bArr2, zzgbt zzgbtVar, zzgbo zzgboVar, zzgbp zzgbpVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] zzb = zzgcc.zzb(zzgbtVar.zzb(), zzgboVar.zzc(), zzgbpVar.zzb());
        byte[] bArr4 = zzgcc.zzl;
        byte[] bArr5 = zza;
        byte[] zzb2 = zzgmv.zzb(zzgcc.zza, zzgboVar.zze(bArr4, bArr5, "psk_id_hash", zzb), zzgboVar.zze(zzgcc.zzl, bArr3, "info_hash", zzb));
        byte[] zze = zzgboVar.zze(bArr2, bArr5, "secret", zzb);
        return new zzgbq(bArr, zzgboVar.zzd(zze, zzb2, "key", zzb, zzgbpVar.zza()), zzgboVar.zzd(zze, zzb2, "base_nonce", zzb, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzgbpVar);
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzc;
        byte[] bArr = this.zze;
        BigInteger bigInteger = this.zzg;
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length == 13) {
                if (byteArray[0] == 0) {
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                } else {
                    throw new GeneralSecurityException("integer too large");
                }
            } else {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            }
        }
        zzc = zzgmv.zzc(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzg = this.zzg.add(BigInteger.ONE);
        return zzc;
    }

    public final byte[] zza() {
        return this.zzf;
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
