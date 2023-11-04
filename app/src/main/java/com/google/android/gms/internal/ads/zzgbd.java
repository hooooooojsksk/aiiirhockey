package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgbd extends zzgds {
    public zzgbd(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    public final /* bridge */ /* synthetic */ Object zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjp zzgjpVar = (zzgjp) zzgrwVar;
        zzgjj zzc = zzgjpVar.zzc();
        zzgjs zzf = zzc.zzf();
        int zzc2 = zzgbk.zzc(zzf.zzg());
        byte[] zzE = zzgjpVar.zzh().zzE();
        byte[] zzE2 = zzgjpVar.zzi().zzE();
        ECParameterSpec zzh = zzgne.zzh(zzc2);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, zzE), new BigInteger(1, zzE2));
        zzgcj.zzb(eCPoint, zzh.getCurve());
        return new zzgna((ECPublicKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, zzh)), zzf.zze().zzE(), zzgbk.zzb(zzf.zzh()), zzgbk.zzd(zzc.zzi()), new zzgbl(zzc.zza().zze()));
    }
}
