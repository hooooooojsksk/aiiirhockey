package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgfo extends zzgcu {
    private static final zzgdr zza = zzgdr.zzb(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgfl
        @Override // com.google.android.gms.internal.ads.zzgdp
        public final Object zza(zzfvx zzfvxVar) {
            return new zzggi((zzgfk) zzfvxVar);
        }
    }, zzgfk.class, zzgfd.class);

    public zzgfo() {
        super(zzgjz.class, new zzgfm(zzfws.class));
    }

    public static void zzh(boolean z) throws GeneralSecurityException {
        zzfxf.zzo(new zzgfo(), true);
        zzgfz.zza();
        zzgde.zza().zze(zza);
    }

    public static final void zzm(zzgjz zzgjzVar) throws GeneralSecurityException {
        zzgog.zzb(zzgjzVar.zza(), 0);
        if (zzgjzVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzo(zzgjzVar.zzg());
    }

    public static /* bridge */ /* synthetic */ zzgcs zzn(int i, int i2, int i3, int i4) {
        zzgkb zzc = zzgkc.zzc();
        zzgke zzc2 = zzgkf.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzgkf) zzc2.zzal());
        zzc.zza(i);
        return new zzgcs((zzgkc) zzc.zzal(), i4);
    }

    public static void zzo(zzgkf zzgkfVar) throws GeneralSecurityException {
        if (zzgkfVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int zzg = zzgkfVar.zzg() - 2;
        if (zzg == 1) {
            if (zzgkfVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 2) {
            if (zzgkfVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 3) {
            if (zzgkfVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 4) {
            if (zzgkfVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 5) {
            if (zzgkfVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzgfn(this, zzgkc.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgjz.zzf(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzm((zzgjz) zzgrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final int zzf() {
        return 2;
    }
}
