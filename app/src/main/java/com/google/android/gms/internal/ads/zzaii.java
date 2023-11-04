package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaii {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    public static long zzc(zzen zzenVar) {
        int zzc = zzenVar.zzc();
        if (zzenVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzenVar.zzB(bArr, 0, 9);
        zzenVar.zzF(zzc);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j = bArr[0];
            long j2 = bArr[2];
            return ((bArr[3] & 255) << 5) | (((j & 56) >> 3) << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzzv zzzvVar) {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
        this.zzc = true;
        zzzvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzzvVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzzvVar.zzf() != j2) {
                zzaauVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzzvVar.zzj();
            ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min, false);
            zzen zzenVar = this.zzb;
            int zzc = zzenVar.zzc();
            int zzd2 = zzenVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzenVar.zzH(), zzd2) == 442) {
                    zzenVar.zzF(zzd2 + 4);
                    long zzc2 = zzc(zzenVar);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzzvVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzzvVar);
                return 0;
            }
            long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb;
            if (zzb < 0) {
                zzee.zze("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzzvVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zzzvVar.zzd());
            if (zzzvVar.zzf() != 0) {
                zzaauVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzzvVar.zzj();
            ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzen zzenVar2 = this.zzb;
            int zzc3 = zzenVar2.zzc();
            int zzd3 = zzenVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzenVar2.zzH(), zzc3) == 442) {
                    zzenVar2.zzF(zzc3 + 4);
                    long zzc4 = zzc(zzenVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
