package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzair {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    public zzair(int i) {
    }

    private final int zze(zzzv zzzvVar) {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
        this.zzc = true;
        zzzvVar.zzj();
        return 0;
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzzvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzzvVar.zzd();
            int min = (int) Math.min(112800L, zzd);
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
            int zzd2 = zzenVar.zzd();
            int i2 = zzd2 - 188;
            while (true) {
                if (i2 < zzc) {
                    break;
                }
                byte[] zzH = zzenVar.zzH();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < zzc || i5 >= zzd2 || zzH[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long zzb = zzajb.zzb(zzenVar, i2, i);
                            if (zzb != -9223372036854775807L) {
                                j = zzb;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzzvVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzzvVar);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                zzee.zze("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzzvVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzzvVar.zzd());
            if (zzzvVar.zzf() != 0) {
                zzaauVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzzvVar.zzj();
            ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzen zzenVar2 = this.zzb;
            int zzc2 = zzenVar2.zzc();
            int zzd3 = zzenVar2.zzd();
            while (true) {
                if (zzc2 >= zzd3) {
                    break;
                }
                if (zzenVar2.zzH()[zzc2] == 71) {
                    long zzb3 = zzajb.zzb(zzenVar2, zzc2, i);
                    if (zzb3 != -9223372036854775807L) {
                        j = zzb3;
                        break;
                    }
                }
                zzc2++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
