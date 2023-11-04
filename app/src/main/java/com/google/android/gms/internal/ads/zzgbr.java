package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgbr implements zzfvv {
    private final zzgbv zza;
    private final zzgbt zzb;
    private final zzgbp zzc;
    private final zzgbo zzd;

    private zzgbr(zzgbv zzgbvVar, zzgbt zzgbtVar, zzgbo zzgboVar, zzgbp zzgbpVar, int i, byte[] bArr) {
        this.zza = zzgbvVar;
        this.zzb = zzgbtVar;
        this.zzd = zzgboVar;
        this.zzc = zzgbpVar;
    }

    public static zzgbr zza(zzgkq zzgkqVar) throws GeneralSecurityException {
        int i;
        zzgbv zza;
        if (!zzgkqVar.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzgkqVar.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzgkqVar.zzg().zzD()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzgkn zzc = zzgkqVar.zzf().zzc();
        zzgbt zzb = zzgbw.zzb(zzc);
        zzgbo zzc2 = zzgbw.zzc(zzc);
        zzgbp zza2 = zzgbw.zza(zzc);
        int zzg = zzc.zzg();
        int i2 = zzg - 2;
        if (i2 == 1) {
            i = 32;
        } else if (i2 == 2) {
            i = 65;
        } else if (i2 == 3) {
            i = 97;
        } else if (i2 != 4) {
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgkh.zza(zzg)));
        } else {
            i = 133;
        }
        int zzg2 = zzgkqVar.zzf().zzc().zzg() - 2;
        if (zzg2 == 1) {
            zza = zzgcg.zza(zzgkqVar.zzg().zzE());
        } else if (zzg2 == 2 || zzg2 == 3 || zzg2 == 4) {
            zza = zzgce.zza(zzgkqVar.zzg().zzE(), zzgkqVar.zzf().zzh().zzE(), zzgcc.zzg(zzgkqVar.zzf().zzc().zzg()));
        } else {
            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
        }
        return new zzgbr(zza, zzb, zzc2, zza2, i, null);
    }
}
