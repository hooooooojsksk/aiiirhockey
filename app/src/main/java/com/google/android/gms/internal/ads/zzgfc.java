package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgfc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzb2 = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgey
        }, zzgex.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzgez
        }, zzb2, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzgfa
        }, zzgeo.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzgfb
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) {
                zzgev zzgevVar;
                int i = zzgfc.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    zzggw zze2 = zzggw.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zze2.zza() == 0) {
                        zzgeu zzgeuVar = new zzgeu(null);
                        zzgeuVar.zza(zze2.zzg().zzd());
                        zzgeuVar.zzb(zze2.zzf().zza());
                        zzgme zzc2 = ((zzgdz) zzgebVar).zzc();
                        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                        int ordinal = zzc2.ordinal();
                        if (ordinal == 1) {
                            zzgevVar = zzgev.zza;
                        } else if (ordinal == 2) {
                            zzgevVar = zzgev.zzc;
                        } else if (ordinal == 3) {
                            zzgevVar = zzgev.zzd;
                        } else if (ordinal != 4) {
                            int zza2 = zzc2.zza();
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                        } else {
                            zzgevVar = zzgev.zzb;
                        }
                        zzgeuVar.zzc(zzgevVar);
                        zzgex zzd2 = zzgeuVar.zzd();
                        zzgem zzgemVar = new zzgem(null);
                        zzgemVar.zzc(zzd2);
                        zzgemVar.zza(zzgok.zzb(zze2.zzg().zzE(), zzfxgVar));
                        zzgemVar.zzb(((zzgdz) zzgebVar).zzf());
                        return zzgemVar.zzd();
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzgqy | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
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
