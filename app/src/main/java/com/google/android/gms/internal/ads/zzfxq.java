package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfxq extends zzgcu {
    public zzfxq() {
        super(zzghf.class, new zzfxo(zzfvo.class));
    }

    public static /* bridge */ /* synthetic */ zzgcs zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzghn zzc = zzgho.zzc();
        zzghq zzc2 = zzghr.zzc();
        zzc2.zza(16);
        zzc.zzb((zzghr) zzc2.zzal());
        zzc.zza(i);
        zzgkb zzc3 = zzgkc.zzc();
        zzgke zzc4 = zzgkf.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzgkf) zzc4.zzal());
        zzc3.zza(32);
        zzghh zza = zzghi.zza();
        zza.zza((zzgho) zzc.zzal());
        zza.zzb((zzgkc) zzc3.zzal());
        return new zzgcs((zzghi) zza.zzal(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzfxp(this, zzghi.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzghf.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghf zzghfVar = (zzghf) zzgrwVar;
        zzgog.zzb(zzghfVar.zza(), 0);
        new zzfxt();
        zzfxt.zzh(zzghfVar.zzf());
        new zzgfo();
        zzgfo.zzm(zzghfVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final int zzf() {
        return 2;
    }
}
