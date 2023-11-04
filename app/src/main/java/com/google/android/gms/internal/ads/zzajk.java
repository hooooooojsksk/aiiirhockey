package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzajk {
    public static Pair zza(zzzv zzzvVar) throws IOException {
        zzzvVar.zzj();
        zzajj zzd = zzd(1684108385, zzzvVar, new zzen(8));
        ((zzzk) zzzvVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzzvVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaji zzb(zzzv zzzvVar) throws IOException {
        byte[] bArr;
        zzen zzenVar = new zzen(16);
        zzajj zzd = zzd(1718449184, zzzvVar, zzenVar);
        zzdl.zzf(zzd.zzb >= 16);
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzm(zzenVar.zzH(), 0, 16, false);
        zzenVar.zzF(0);
        int zzi = zzenVar.zzi();
        int zzi2 = zzenVar.zzi();
        int zzh = zzenVar.zzh();
        int zzh2 = zzenVar.zzh();
        int zzi3 = zzenVar.zzi();
        int zzi4 = zzenVar.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzzkVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzew.zzf;
        }
        byte[] bArr2 = bArr;
        zzzkVar.zzo((int) (zzzvVar.zze() - zzzvVar.zzf()), false);
        return new zzaji(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzzv zzzvVar) throws IOException {
        zzen zzenVar = new zzen(8);
        int i = zzajj.zza(zzzvVar, zzenVar).zza;
        if (i == 1380533830 || i == 1380333108) {
            ((zzzk) zzzvVar).zzm(zzenVar.zzH(), 0, 4, false);
            zzenVar.zzF(0);
            int zze = zzenVar.zze();
            if (zze != 1463899717) {
                zzee.zzb("WavHeaderReader", "Unsupported form type: " + zze);
                return false;
            }
            return true;
        }
        return false;
    }

    private static zzajj zzd(int i, zzzv zzzvVar, zzen zzenVar) throws IOException {
        zzajj zza = zzajj.zza(zzzvVar, zzenVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzee.zze("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j > 2147483647L) {
                int i3 = zza.zza;
                throw zzbu.zzc("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            ((zzzk) zzzvVar).zzo((int) j, false);
            zza = zzajj.zza(zzzvVar, zzenVar);
        }
    }
}
