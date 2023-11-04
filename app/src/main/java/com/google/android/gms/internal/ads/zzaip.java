package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaip implements zzzf {
    private final zzeu zza;
    private final zzen zzb = new zzen();
    private final int zzc;

    public zzaip(int i, zzeu zzeuVar, int i2) {
        this.zzc = i;
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzze zza(zzzv zzzvVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzf = zzzvVar.zzf();
        int min = (int) Math.min(112800L, zzzvVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min, false);
        zzen zzenVar = this.zzb;
        int zzd = zzenVar.zzd();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (zzenVar.zza() >= 188 && (zza2 = (zza = zzajb.zza(zzenVar.zzH(), zzenVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzajb.zzb(zzenVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j4 == -9223372036854775807L) {
                        return zzze.zzd(zzb2, zzf);
                    }
                    j2 = zzf + j5;
                } else if (100000 + zzb2 > j) {
                    j2 = zzf + zza;
                } else {
                    j5 = zza;
                    j4 = zzb2;
                }
                return zzze.zze(j2);
            }
            zzenVar.zzF(zza2);
            j3 = zza2;
        }
        return j4 != -9223372036854775807L ? zzze.zzf(j4, zzf + j3) : zzze.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb() {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
    }
}
