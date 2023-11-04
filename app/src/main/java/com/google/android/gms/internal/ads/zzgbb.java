package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgbb extends zzgct {
    final /* synthetic */ zzgbc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbb(zzgbc zzgbcVar, Class cls) {
        super(cls);
        this.zza = zzgbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjg zzgjgVar = (zzgjg) zzgrwVar;
        KeyPair zzb = zzgne.zzb(zzgne.zzh(zzgbk.zzc(zzgjgVar.zze().zzf().zzg())));
        ECPoint w = ((ECPublicKey) zzb.getPublic()).getW();
        zzgjo zzd = zzgjp.zzd();
        zzd.zzb(0);
        zzd.zza(zzgjgVar.zze());
        zzd.zzc(zzgpe.zzv(w.getAffineX().toByteArray()));
        zzd.zzd(zzgpe.zzv(w.getAffineY().toByteArray()));
        zzgjl zzc = zzgjm.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgjp) zzd.zzal());
        zzc.zza(zzgpe.zzv(((ECPrivateKey) zzb.getPrivate()).getS().toByteArray()));
        return (zzgjm) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgjg.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        zzfwh zza = zzfwi.zza("AES128_GCM");
        bArr = zzgbc.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgbc.zzh(4, 5, 3, zza, bArr, 1));
        zzfwh zza2 = zzfwi.zza("AES128_GCM");
        bArr2 = zzgbc.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgbc.zzh(4, 5, 3, zza2, bArr2, 3));
        zzfwh zza3 = zzfwi.zza("AES128_GCM");
        bArr3 = zzgbc.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgbc.zzh(4, 5, 4, zza3, bArr3, 1));
        zzfwh zza4 = zzfwi.zza("AES128_GCM");
        bArr4 = zzgbc.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgbc.zzh(4, 5, 4, zza4, bArr4, 3));
        zzfwh zza5 = zzfwi.zza("AES128_GCM");
        bArr5 = zzgbc.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgbc.zzh(4, 5, 4, zza5, bArr5, 3));
        zzfwh zza6 = zzfwi.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzgbc.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgbc.zzh(4, 5, 3, zza6, bArr6, 1));
        zzfwh zza7 = zzfwi.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzgbc.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgbc.zzh(4, 5, 3, zza7, bArr7, 3));
        zzfwh zza8 = zzfwi.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzgbc.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgbc.zzh(4, 5, 4, zza8, bArr8, 1));
        zzfwh zza9 = zzfwi.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzgbc.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgbc.zzh(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgbk.zza(((zzgjg) zzgrwVar).zze());
    }
}
