package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfzs {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzb2 = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfzo
        }, zzfzn.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzfzp
        }, zzb2, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzfzq
        }, zzfzf.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzfzr
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) {
                zzfzl zzfzlVar;
                int i = zzfzs.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    zzgij zze2 = zzgij.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zze2.zza() == 0) {
                        zzfzk zzfzkVar = new zzfzk(null);
                        zzfzkVar.zza(zze2.zzf().zzd());
                        zzgme zzc2 = ((zzgdz) zzgebVar).zzc();
                        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                        int ordinal = zzc2.ordinal();
                        if (ordinal == 1) {
                            zzfzlVar = zzfzl.zza;
                        } else {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    zzfzlVar = zzfzl.zzc;
                                } else if (ordinal != 4) {
                                    int zza2 = zzc2.zza();
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                                }
                            }
                            zzfzlVar = zzfzl.zzb;
                        }
                        zzfzkVar.zzb(zzfzlVar);
                        zzfzn zzc3 = zzfzkVar.zzc();
                        zzfzd zzfzdVar = new zzfzd(null);
                        zzfzdVar.zzc(zzc3);
                        zzfzdVar.zzb(zzgok.zzb(zze2.zzf().zzE(), zzfxgVar));
                        zzfzdVar.zza(((zzgdz) zzgebVar).zzf());
                        return zzfzdVar.zzd();
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzgqy unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        }, zzb2, zzgdz.class);
    }

    public static void zza() throws GeneralSecurityException {
        zzgdf zzb2 = zzgdf.zzb();
        zzb2.zzf(zzc);
        zzb2.zze(zzd);
        zzb2.zzd(zze);
        zzb2.zzc(zzf);
    }
}
