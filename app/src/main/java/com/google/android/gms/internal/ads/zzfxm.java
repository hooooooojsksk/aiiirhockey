package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfxm implements zzfvo {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    public /* synthetic */ zzfxm(zzfxb zzfxbVar, zzfxl zzfxlVar) {
        zzggm zzggmVar;
        this.zza = zzfxbVar;
        if (zzfxbVar.zzf()) {
            zzggn zzb = zzgdd.zza().zzb();
            zzggs zza = zzgda.zza(zzfxbVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzggmVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzggmVar = zzgda.zza;
            this.zzb = zzggmVar;
        }
        this.zzc = zzggmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwxVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzfvo) zzfwxVar.zze()).zza(copyOfRange, bArr2);
                    zzfwxVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException e) {
                    logger = zzfxn.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzfwx zzfwxVar2 : this.zza.zze(zzfvt.zza)) {
            try {
                byte[] zza2 = ((zzfvo) zzfwxVar2.zze()).zza(bArr, bArr2);
                zzfwxVar2.zza();
                int length3 = bArr.length;
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb = zzgmv.zzb(this.zza.zza().zzg(), ((zzfvo) this.zza.zza().zze()).zzb(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzb;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
