package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzajb {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzen zzenVar, int i, int i2) {
        zzenVar.zzF(i);
        if (zzenVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzenVar.zze();
        if ((8388608 & zze) == 0 && ((zze >> 8) & 8191) == i2 && (zze & 32) != 0 && zzenVar.zzk() >= 7 && zzenVar.zza() >= 7 && (zzenVar.zzk() & 16) == 16) {
            byte[] bArr = new byte[6];
            zzenVar.zzB(bArr, 0, 6);
            long j = bArr[3] & 255;
            return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
