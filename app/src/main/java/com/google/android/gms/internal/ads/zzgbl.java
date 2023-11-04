package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgbl implements zzgmy {
    private final String zza;
    private final int zzb;
    private zzgid zzc;
    private zzghf zzd;
    private int zze;
    private zzgip zzf;

    public zzgbl(zzgld zzgldVar) throws GeneralSecurityException {
        String zzg = zzgldVar.zzg();
        this.zza = zzg;
        if (zzg.equals(zzfxi.zzb)) {
            try {
                zzgig zze = zzgig.zze(zzgldVar.zzf(), zzgpy.zza());
                this.zzc = (zzgid) zzfxf.zzd(zzgldVar);
                this.zzb = zze.zza();
            } catch (zzgqy e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (zzg.equals(zzfxi.zza)) {
            try {
                zzghi zzd = zzghi.zzd(zzgldVar.zzf(), zzgpy.zza());
                this.zzd = (zzghf) zzfxf.zzd(zzgldVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
            } catch (zzgqy e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (zzg.equals(zzgax.zza)) {
            try {
                zzgis zze2 = zzgis.zze(zzgldVar.zzf(), zzgpy.zza());
                this.zzf = (zzgip) zzfxf.zzd(zzgldVar);
                this.zzb = zze2.zza();
            } catch (zzgqy e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzg)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmy
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy
    public final zzgch zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzfxi.zzb)) {
            zzgic zzc = zzgid.zzc();
            zzc.zzaj(this.zzc);
            zzc.zza(zzgpe.zzw(bArr, 0, this.zzb));
            return new zzgch((zzfvo) zzfxf.zzi(this.zza, (zzgid) zzc.zzal(), zzfvo.class));
        } else if (this.zza.equals(zzfxi.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzghk zzc2 = zzghl.zzc();
            zzc2.zzaj(this.zzd.zzf());
            zzc2.zza(zzgpe.zzv(copyOfRange));
            zzgjy zzc3 = zzgjz.zzc();
            zzc3.zzaj(this.zzd.zzg());
            zzc3.zza(zzgpe.zzv(copyOfRange2));
            zzghe zzc4 = zzghf.zzc();
            zzc4.zzc(this.zzd.zza());
            zzc4.zza((zzghl) zzc2.zzal());
            zzc4.zzb((zzgjz) zzc3.zzal());
            return new zzgch((zzfvo) zzfxf.zzi(this.zza, (zzghf) zzc4.zzal(), zzfvo.class));
        } else if (this.zza.equals(zzgax.zza)) {
            zzgio zzc5 = zzgip.zzc();
            zzc5.zzaj(this.zzf);
            zzc5.zza(zzgpe.zzw(bArr, 0, this.zzb));
            return new zzgch((zzfvu) zzfxf.zzi(this.zza, (zzgip) zzc5.zzal(), zzfvu.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
