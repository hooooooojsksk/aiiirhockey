package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgfm extends zzgds {
    public zzgfm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    public final /* bridge */ /* synthetic */ Object zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjz zzgjzVar = (zzgjz) zzgrwVar;
        int zzg = zzgjzVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgjzVar.zzh().zzE(), "HMAC");
        int zza = zzgjzVar.zzg().zza();
        int i = zzg - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new zzgoc(new zzgob("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgoc(new zzgob("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgoc(new zzgob("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgoc(new zzgob("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgoc(new zzgob("HMACSHA1", secretKeySpec), zza);
    }
}
