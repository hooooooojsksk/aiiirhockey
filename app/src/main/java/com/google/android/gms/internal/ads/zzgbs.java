package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgbs implements zzfvw {
    private static final byte[] zza = new byte[0];
    private final zzgkt zzb;
    private final zzgbt zzc;
    private final zzgbp zzd;
    private final zzgbo zze;

    private zzgbs(zzgkt zzgktVar, zzgbt zzgbtVar, zzgbo zzgboVar, zzgbp zzgbpVar, byte[] bArr) {
        this.zzb = zzgktVar;
        this.zzc = zzgbtVar;
        this.zze = zzgboVar;
        this.zzd = zzgbpVar;
    }

    public static zzgbs zzb(zzgkt zzgktVar) throws GeneralSecurityException {
        if (zzgktVar.zzh().zzD()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzgkn zzc = zzgktVar.zzc();
        return new zzgbs(zzgktVar, zzgbw.zzb(zzc), zzgbw.zzc(zzc), zzgbw.zza(zzc), null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgkt zzgktVar = this.zzb;
        zzgbt zzgbtVar = this.zzc;
        zzgbo zzgboVar = this.zze;
        zzgbp zzgbpVar = this.zzd;
        zzgbu zza2 = zzgbtVar.zza(zzgktVar.zzh().zzE());
        zzgbq zzc = zzgbq.zzc(zza2.zza(), zza2.zzb(), zzgbtVar, zzgboVar, zzgbpVar, bArr3);
        return zzgmv.zzb(zzc.zza(), zzc.zzb(bArr, zza));
    }
}
