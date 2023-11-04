package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzzr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzaf zza(byte[] bArr, String str, String str2, zzx zzxVar) {
        zzem zzemVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzemVar = new zzem(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            zzemVar = new zzem(copyOf, length);
            if (copyOf[0] == 31) {
                zzem zzemVar2 = new zzem(copyOf, length);
                while (zzemVar2.zza() >= 16) {
                    zzemVar2.zzl(2);
                    zzemVar.zzf(zzemVar2.zzd(14), 14);
                }
            }
            zzemVar.zzi(copyOf, copyOf.length);
        }
        zzemVar.zzl(60);
        int i3 = zzb[zzemVar.zzd(6)];
        int i4 = zzc[zzemVar.zzd(4)];
        int zzd2 = zzemVar.zzd(5);
        int i5 = zzd2 < 29 ? (zzd[zzd2] * 1000) / 2 : -1;
        zzemVar.zzl(10);
        int i6 = i3 + (zzemVar.zzd(2) > 0 ? 1 : 0);
        zzad zzadVar = new zzad();
        zzadVar.zzH(str);
        zzadVar.zzS("audio/vnd.dts");
        zzadVar.zzv(i5);
        zzadVar.zzw(i6);
        zzadVar.zzT(i4);
        zzadVar.zzB(null);
        zzadVar.zzK(str2);
        return zzadVar.zzY();
    }
}
