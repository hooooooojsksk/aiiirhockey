package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgcf implements zzgbt {
    private final zzgbo zza;

    public zzgcf(zzgbo zzgboVar) {
        this.zza = zzgboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final zzgbu zza(byte[] bArr) throws GeneralSecurityException {
        byte[] zzb = zzgoh.zzb();
        byte[] zza = zzgoh.zza(zzb, bArr);
        byte[] zzc = zzgoh.zzc(zzb);
        byte[] zzb2 = zzgmv.zzb(zzc, bArr);
        byte[] zzd = zzgcc.zzd(zzgcc.zzb);
        zzgbo zzgboVar = this.zza;
        return new zzgbu(zzgboVar.zzb(null, zza, "eae_prk", zzb2, "shared_secret", zzd, zzgboVar.zza()), zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzgcc.zzf)) {
            return zzgcc.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
