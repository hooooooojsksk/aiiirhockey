package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzags {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzen zzg = new zzen(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzzv zzzvVar, boolean z) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzzy.zzc(zzzvVar, this.zzg.zzH(), 0, 27, z) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() != 0) {
                if (z) {
                    return false;
                }
                throw zzbu.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzk();
            this.zzb = this.zzg.zzp();
            this.zzg.zzq();
            this.zzg.zzq();
            this.zzg.zzq();
            int zzk = this.zzg.zzk();
            this.zzc = zzk;
            this.zzd = zzk + 27;
            this.zzg.zzC(zzk);
            if (zzzy.zzc(zzzvVar, this.zzg.zzH(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzk();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzzv zzzvVar, long j) throws IOException {
        zzdl.zzd(zzzvVar.zzf() == zzzvVar.zze());
        this.zzg.zzC(4);
        while (true) {
            if ((j == -1 || zzzvVar.zzf() + 4 < j) && zzzy.zzc(zzzvVar, this.zzg.zzH(), 0, 4, true)) {
                this.zzg.zzF(0);
                if (this.zzg.zzs() != 1332176723) {
                    ((zzzk) zzzvVar).zzo(1, false);
                } else {
                    zzzvVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (j != -1 && zzzvVar.zzf() >= j) {
                break;
            }
        } while (zzzvVar.zzc(1) != -1);
        return false;
    }
}
