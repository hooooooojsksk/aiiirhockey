package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzzh {
    public static void zza(long j, zzen zzenVar, zzabb[] zzabbVarArr) {
        int i;
        while (true) {
            if (zzenVar.zza() <= 1) {
                return;
            }
            int zzc = zzc(zzenVar);
            int zzc2 = zzc(zzenVar);
            int zzc3 = zzenVar.zzc() + zzc2;
            if (zzc2 == -1 || zzc2 > zzenVar.zza()) {
                zzee.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzc3 = zzenVar.zzd();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzk = zzenVar.zzk();
                int zzo = zzenVar.zzo();
                if (zzo == 49) {
                    i = zzenVar.zze();
                    zzo = 49;
                } else {
                    i = 0;
                }
                int zzk2 = zzenVar.zzk();
                if (zzo == 47) {
                    zzenVar.zzG(1);
                    zzo = 47;
                }
                boolean z = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                if (zzo == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzenVar, zzabbVarArr);
                }
            }
            zzenVar.zzF(zzc3);
        }
    }

    public static void zzb(long j, zzen zzenVar, zzabb[] zzabbVarArr) {
        int zzk = zzenVar.zzk();
        if ((zzk & 64) != 0) {
            int i = zzk & 31;
            zzenVar.zzG(1);
            int zzc = zzenVar.zzc();
            for (zzabb zzabbVar : zzabbVarArr) {
                int i2 = i * 3;
                zzenVar.zzF(zzc);
                zzabbVar.zzq(zzenVar, i2);
                if (j != -9223372036854775807L) {
                    zzabbVar.zzs(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzen zzenVar) {
        int i = 0;
        while (zzenVar.zza() != 0) {
            int zzk = zzenVar.zzk();
            i += zzk;
            if (zzk != 255) {
                return i;
            }
        }
        return -1;
    }
}
