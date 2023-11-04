package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgge implements zzfws {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    public /* synthetic */ zzgge(zzfxb zzfxbVar, zzggd zzggdVar) {
        zzggm zzggmVar;
        this.zza = zzfxbVar;
        if (zzfxbVar.zzf()) {
            zzggn zzb = zzgdd.zza().zzb();
            zzggs zza = zzgda.zza(zzfxbVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzggmVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzggmVar = zzgda.zza;
            this.zzb = zzggmVar;
        }
        this.zzc = zzggmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzfwx zzfwxVar : this.zza.zze(copyOf)) {
            try {
                ((zzfws) zzfwxVar.zze()).zza(copyOfRange, zzfwxVar.zzc().equals(zzgme.LEGACY) ? zzgmv.zzb(bArr2, zzggf.zzb) : bArr2);
                zzfwxVar.zza();
                return;
            } catch (GeneralSecurityException e) {
                zzggf.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (zzfwx zzfwxVar2 : this.zza.zze(zzfvt.zza)) {
            try {
                ((zzfws) zzfwxVar2.zze()).zza(bArr, bArr2);
                zzfwxVar2.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zza().zzc().equals(zzgme.LEGACY)) {
            bArr = zzgmv.zzb(bArr, zzggf.zzb);
        }
        try {
            byte[] zzb = zzgmv.zzb(this.zza.zza().zzg(), ((zzfws) this.zza.zza().zze()).zzb(bArr));
            this.zza.zza().zza();
            return zzb;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
