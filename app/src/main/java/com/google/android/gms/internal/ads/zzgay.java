package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgay implements zzfvu {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    public zzgay(zzfxb zzfxbVar) {
        zzggm zzggmVar;
        this.zza = zzfxbVar;
        if (zzfxbVar.zzf()) {
            zzggn zzb = zzgdd.zza().zzb();
            zzggs zza = zzgda.zza(zzfxbVar);
            this.zzb = zzb.zza(zza, "daead", "encrypt");
            zzggmVar = zzb.zza(zza, "daead", "decrypt");
        } else {
            zzggmVar = zzgda.zza;
            this.zzb = zzggmVar;
        }
        this.zzc = zzggmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb = zzgmv.zzb(this.zza.zza().zzg(), ((zzfvu) this.zza.zza().zze()).zza(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzb;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
