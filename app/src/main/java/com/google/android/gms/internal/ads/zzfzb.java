package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfzb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzb2 = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfyx
        }, zzfyw.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzfyy
        }, zzb2, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzfyz
        }, zzfyo.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzfza
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) {
                zzfyu zzfyuVar;
                int i = zzfzb.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    zzgid zze2 = zzgid.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zze2.zza() == 0) {
                        zzfyt zzfytVar = new zzfyt(null);
                        zzfytVar.zzb(zze2.zzf().zzd());
                        zzfytVar.zza(12);
                        zzfytVar.zzc(16);
                        zzgme zzc2 = ((zzgdz) zzgebVar).zzc();
                        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                        int ordinal = zzc2.ordinal();
                        if (ordinal == 1) {
                            zzfyuVar = zzfyu.zza;
                        } else {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    zzfyuVar = zzfyu.zzc;
                                } else if (ordinal != 4) {
                                    int zza2 = zzc2.zza();
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                                }
                            }
                            zzfyuVar = zzfyu.zzb;
                        }
                        zzfytVar.zzd(zzfyuVar);
                        zzfyw zze3 = zzfytVar.zze();
                        zzfym zzfymVar = new zzfym(null);
                        zzfymVar.zzc(zze3);
                        zzfymVar.zzb(zzgok.zzb(zze2.zzf().zzE(), zzfxgVar));
                        zzfymVar.zza(((zzgdz) zzgebVar).zzf());
                        return zzfymVar.zzd();
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzgqy unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
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
