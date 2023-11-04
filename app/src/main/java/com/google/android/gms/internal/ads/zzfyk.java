package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfyk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzb2 = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfyg
        }, zzfyf.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzfyh
        }, zzb2, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzfyi
        }, zzfxx.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzfyj
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) {
                zzfyd zzfydVar;
                int i = zzfyk.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    zzghu zze2 = zzghu.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zze2.zza() == 0) {
                        zzfyc zzfycVar = new zzfyc(null);
                        zzfycVar.zzb(zze2.zzg().zzd());
                        zzfycVar.zza(zze2.zzf().zza());
                        zzfycVar.zzc(16);
                        zzgme zzc2 = ((zzgdz) zzgebVar).zzc();
                        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                        int ordinal = zzc2.ordinal();
                        if (ordinal == 1) {
                            zzfydVar = zzfyd.zza;
                        } else {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    zzfydVar = zzfyd.zzc;
                                } else if (ordinal != 4) {
                                    int zza2 = zzc2.zza();
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                                }
                            }
                            zzfydVar = zzfyd.zzb;
                        }
                        zzfycVar.zzd(zzfydVar);
                        zzfyf zze3 = zzfycVar.zze();
                        zzfxv zzfxvVar = new zzfxv(null);
                        zzfxvVar.zzc(zze3);
                        zzfxvVar.zzb(zzgok.zzb(zze2.zzg().zzE(), zzfxgVar));
                        zzfxvVar.zza(((zzgdz) zzgebVar).zzf());
                        return zzfxvVar.zzd();
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzgqy unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
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
