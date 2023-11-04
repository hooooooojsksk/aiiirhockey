package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgne {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzgcj.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair zzb(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzgnn.zzf.zza("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void zzc(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzd(eCPublicKey, eCPrivateKey);
        zzgcj.zzb(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void zzd(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (zzgcj.zzc(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] zze(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        BigInteger bigInteger;
        zzd(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        zzgcj.zzb(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) zzgnn.zze.zza("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger2 = new BigInteger(1, generateSecret);
            if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zzgcj.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger zza = zzgcj.zza(curve);
            BigInteger mod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(zza);
            if (zza.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger mod2 = mod.mod(zza);
            if (mod2.equals(BigInteger.ZERO)) {
                bigInteger = BigInteger.ZERO;
            } else {
                BigInteger bigInteger3 = null;
                if (!zza.testBit(0) || !zza.testBit(1)) {
                    if (zza.testBit(0) && !zza.testBit(1)) {
                        BigInteger bigInteger4 = BigInteger.ONE;
                        BigInteger shiftRight = zza.subtract(BigInteger.ONE).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(zza);
                            if (mod3.equals(BigInteger.ZERO)) {
                                bigInteger = bigInteger4;
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, zza);
                            if (!modPow.add(BigInteger.ONE).equals(zza)) {
                                if (modPow.equals(BigInteger.ONE)) {
                                    bigInteger4 = bigInteger4.add(BigInteger.ONE);
                                    i++;
                                    if (i == 128 && !zza.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                BigInteger shiftRight2 = zza.add(BigInteger.ONE).shiftRight(1);
                                BigInteger bigInteger5 = BigInteger.ONE;
                                BigInteger bigInteger6 = bigInteger4;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                    BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(zza).multiply(mod3)).mod(zza);
                                    BigInteger mod5 = multiply.add(multiply).mod(zza);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(zza);
                                        bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(zza);
                                        bigInteger6 = mod6;
                                    } else {
                                        bigInteger6 = mod4;
                                        bigInteger5 = mod5;
                                    }
                                }
                                bigInteger3 = bigInteger6;
                            }
                        }
                    }
                } else {
                    bigInteger3 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(zza).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger = bigInteger3;
            }
            if (!bigInteger.testBit(0)) {
                zza.subtract(bigInteger).mod(zza);
            }
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static ECPrivateKey zzf(int i, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), zzh(i)));
    }

    public static ECPublicKey zzg(ECParameterSpec eCParameterSpec, int i, byte[] bArr) throws GeneralSecurityException {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int zza = zza(curve);
        int length = bArr.length;
        if (length != zza + zza + 1) {
            throw new GeneralSecurityException("invalid point size");
        }
        if (bArr[0] != 4) {
            throw new GeneralSecurityException("invalid point format");
        }
        int i2 = zza + 1;
        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, length)));
        zzgcj.zzb(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static byte[] zzi(int i, int i2, ECPoint eCPoint) throws GeneralSecurityException {
        return zzj(zzh(i).getCurve(), 1, eCPoint);
    }

    public static byte[] zzj(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) throws GeneralSecurityException {
        zzgcj.zzb(eCPoint, ellipticCurve);
        int zza = zza(ellipticCurve);
        int i2 = i - 1;
        if (i2 == 0) {
            int i3 = zza + zza + 1;
            byte[] bArr = new byte[i3];
            byte[] zza2 = zzgci.zza(eCPoint.getAffineX());
            byte[] zza3 = zzgci.zza(eCPoint.getAffineY());
            int length = zza3.length;
            System.arraycopy(zza3, 0, bArr, i3 - length, length);
            int length2 = zza2.length;
            System.arraycopy(zza2, 0, bArr, (zza + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (i2 != 2) {
            int i4 = zza + 1;
            byte[] bArr2 = new byte[i4];
            byte[] zza4 = zzgci.zza(eCPoint.getAffineX());
            int length3 = zza4.length;
            System.arraycopy(zza4, 0, bArr2, i4 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        int i5 = zza + zza;
        byte[] bArr3 = new byte[i5];
        byte[] zza5 = zzgci.zza(eCPoint.getAffineX());
        int length4 = zza5.length;
        if (length4 > zza) {
            zza5 = Arrays.copyOfRange(zza5, length4 - zza, length4);
        }
        byte[] zza6 = zzgci.zza(eCPoint.getAffineY());
        int length5 = zza6.length;
        if (length5 > zza) {
            zza6 = Arrays.copyOfRange(zza6, length5 - zza, length5);
        }
        int length6 = zza6.length;
        System.arraycopy(zza6, 0, bArr3, i5 - length6, length6);
        int length7 = zza5.length;
        System.arraycopy(zza5, 0, bArr3, zza - length7, length7);
        return bArr3;
    }

    public static ECParameterSpec zzh(int i) throws NoSuchAlgorithmException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return zzgcj.zzb;
            }
            return zzgcj.zzc;
        }
        return zzgcj.zza;
    }
}
