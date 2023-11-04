package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgby extends zzgct {
    final /* synthetic */ zzgbz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgby(zzgbz zzgbzVar, Class cls) {
        super(cls);
        this.zza = zzgbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        byte[] zzb;
        byte[] zzc;
        zzgkk zzgkkVar = (zzgkk) zzgrwVar;
        int zzg = zzgkkVar.zze().zzg() - 2;
        if (zzg == 1) {
            zzb = zzgoh.zzb();
            zzc = zzgoh.zzc(zzb);
        } else if (zzg == 2 || zzg == 3 || zzg == 4) {
            int zzg2 = zzgcc.zzg(zzgkkVar.zze().zzg());
            KeyPair zzb2 = zzgne.zzb(zzgne.zzh(zzg2));
            zzc = zzgne.zzi(zzg2, 1, ((ECPublicKey) zzb2.getPublic()).getW());
            zzb = ((ECPrivateKey) zzb2.getPrivate()).getS().toByteArray();
        } else {
            throw new GeneralSecurityException("Invalid KEM");
        }
        zzgks zzd = zzgkt.zzd();
        zzd.zzc(0);
        zzd.zza(zzgkkVar.zze());
        zzd.zzb(zzgpe.zzv(zzc));
        zzgkp zzc2 = zzgkq.zzc();
        zzc2.zzc(0);
        zzc2.zzb((zzgkt) zzd.zzal());
        zzc2.zza(zzgpe.zzv(zzb));
        return (zzgkq) zzc2.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgkk.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgbz.zzg(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgbz.zzg(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgbz.zzg(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgbz.zzg(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgbz.zzg(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgbz.zzg(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgbz.zzg(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgbz.zzg(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgbz.zzg(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgbz.zzg(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzgbz.zzg(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzgbz.zzg(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzgbz.zzg(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzgbz.zzg(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzgbz.zzg(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzgbz.zzg(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzgbz.zzg(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzgbz.zzg(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgcc.zza(((zzgkk) zzgrwVar).zze());
    }
}
