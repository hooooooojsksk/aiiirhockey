package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgfz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzb2 = zzgek.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgfv
        }, zzgfu.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzgfw
        }, zzb2, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzgfx
        }, zzgfk.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzgfy
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) {
                zzgfr zzgfrVar;
                zzgfs zzgfsVar;
                int i = zzgfz.zza;
                if (((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        zzgjz zzf2 = zzgjz.zzf(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                        if (zzf2.zza() == 0) {
                            zzgfq zzgfqVar = new zzgfq(null);
                            zzgfqVar.zzb(zzf2.zzh().zzd());
                            zzgfqVar.zzc(zzf2.zzg().zza());
                            int zzg = zzf2.zzg().zzg();
                            zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                            int i2 = zzg - 2;
                            if (i2 == 1) {
                                zzgfrVar = zzgfr.zza;
                            } else if (i2 == 2) {
                                zzgfrVar = zzgfr.zzd;
                            } else if (i2 == 3) {
                                zzgfrVar = zzgfr.zzc;
                            } else if (i2 == 4) {
                                zzgfrVar = zzgfr.zze;
                            } else if (i2 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + zzgjw.zza(zzg));
                            } else {
                                zzgfrVar = zzgfr.zzb;
                            }
                            zzgfqVar.zza(zzgfrVar);
                            zzgme zzc2 = ((zzgdz) zzgebVar).zzc();
                            int ordinal = zzc2.ordinal();
                            if (ordinal == 1) {
                                zzgfsVar = zzgfs.zza;
                            } else if (ordinal == 2) {
                                zzgfsVar = zzgfs.zzc;
                            } else if (ordinal == 3) {
                                zzgfsVar = zzgfs.zzd;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                            } else {
                                zzgfsVar = zzgfs.zzb;
                            }
                            zzgfqVar.zzd(zzgfsVar);
                            zzgfu zze2 = zzgfqVar.zze();
                            zzgfi zzgfiVar = new zzgfi(null);
                            zzgfiVar.zzc(zze2);
                            zzgfiVar.zzb(zzgok.zzb(zzf2.zzh().zzE(), zzfxgVar));
                            zzgfiVar.zza(((zzgdz) zzgebVar).zzf());
                            return zzgfiVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgqy | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
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
