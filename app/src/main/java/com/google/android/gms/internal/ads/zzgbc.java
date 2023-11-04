package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgbc extends zzgdy {
    private static final byte[] zza = new byte[0];

    public zzgbc() {
        super(zzgjm.class, zzgjp.class, new zzgba(zzfvv.class));
    }

    public static /* bridge */ /* synthetic */ zzgcs zzh(int i, int i2, int i3, zzfwh zzfwhVar, byte[] bArr, int i4) {
        zzgme zzgmeVar;
        zzgjf zza2 = zzgjg.zza();
        zzgjr zza3 = zzgjs.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgpe.zzv(bArr));
        zzgjs zzgjsVar = (zzgjs) zza3.zzal();
        zzglc zza4 = zzgld.zza();
        zza4.zzb(zzfwhVar.zzb());
        zza4.zzc(zzgpe.zzv(zzfwhVar.zzc()));
        int zzd = zzfwhVar.zzd() - 1;
        if (zzd == 0) {
            zzgmeVar = zzgme.TINK;
        } else if (zzd == 1) {
            zzgmeVar = zzgme.LEGACY;
        } else if (zzd != 2) {
            zzgmeVar = zzgme.CRUNCHY;
        } else {
            zzgmeVar = zzgme.RAW;
        }
        zza4.zza(zzgmeVar);
        zzgjc zza5 = zzgjd.zza();
        zza5.zza((zzgld) zza4.zzal());
        zzgji zzc = zzgjj.zzc();
        zzc.zzb(zzgjsVar);
        zzc.zza((zzgjd) zza5.zzal());
        zzc.zzc(i3);
        zza2.zza((zzgjj) zzc.zzal());
        return new zzgcs((zzgjg) zza2.zzal(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzgbb(this, zzgjg.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgjm.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjm zzgjmVar = (zzgjm) zzgrwVar;
        if (zzgjmVar.zzg().zzD()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgog.zzb(zzgjmVar.zza(), 0);
        zzgbk.zza(zzgjmVar.zzf().zzc());
    }
}
