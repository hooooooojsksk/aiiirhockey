package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfya extends zzgcu {
    public zzfya() {
        super(zzghu.class, new zzfxy(zzfvo.class));
    }

    public static /* bridge */ /* synthetic */ zzgcs zzg(int i, int i2, int i3) {
        zzghw zzc = zzghx.zzc();
        zzc.zza(i);
        zzghz zzc2 = zzgia.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgia) zzc2.zzal());
        return new zzgcs((zzghx) zzc.zzal(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzfxz(this, zzghx.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzghu.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghu zzghuVar = (zzghu) zzgrwVar;
        zzgog.zzb(zzghuVar.zza(), 0);
        zzgog.zza(zzghuVar.zzg().zzd());
        if (zzghuVar.zzf().zza() != 12 && zzghuVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
