package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzagf {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzzv zzzvVar) throws IOException {
        return zzc(zzzvVar, true, false);
    }

    public static boolean zzb(zzzv zzzvVar, boolean z) throws IOException {
        return zzc(zzzvVar, false, false);
    }

    private static boolean zzc(zzzv zzzvVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long zzd = zzzvVar.zzd();
        long j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j2 = -1;
        if (zzd != -1 && zzd <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = zzd;
        }
        zzen zzenVar = new zzen(64);
        int i = (int) j;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < i) {
            zzenVar.zzC(8);
            if (!zzzvVar.zzm(zzenVar.zzH(), 0, 8, true)) {
                break;
            }
            long zzs = zzenVar.zzs();
            int zze = zzenVar.zze();
            int i3 = 16;
            if (zzs == 1) {
                zzzvVar.zzh(zzenVar.zzH(), 8, 8);
                zzenVar.zzE(16);
                zzs = zzenVar.zzr();
            } else {
                if (zzs == 0) {
                    long zzd2 = zzzvVar.zzd();
                    if (zzd2 != j2) {
                        zzs = 8 + (zzd2 - zzzvVar.zze());
                    }
                }
                i3 = 8;
            }
            long j3 = i3;
            if (zzs < j3) {
                return false;
            }
            i2 += i3;
            if (zze == 1836019574) {
                i += (int) zzs;
                if (zzd != -1 && i > zzd) {
                    i = (int) zzd;
                }
                j2 = -1;
            } else if (zze == 1836019558 || zze == 1836475768) {
                z3 = true;
                break;
            } else {
                long j4 = zzd;
                long j5 = zzs;
                if ((i2 + zzs) - j3 >= i) {
                    break;
                }
                int i4 = (int) (j5 - j3);
                i2 += i4;
                if (zze == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    zzenVar.zzC(i4);
                    zzzvVar.zzh(zzenVar.zzH(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 == 1) {
                            zzenVar.zzG(4);
                        } else {
                            int zze2 = zzenVar.zze();
                            if ((zze2 >>> 8) != 3368816) {
                                if (zze2 == 1751476579) {
                                    zze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != zze2) {
                                    }
                                }
                                continue;
                            }
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i4 != 0) {
                    zzzvVar.zzg(i4);
                }
                j2 = -1;
                zzd = j4;
            }
        }
        z3 = false;
        return z4 && z == z3;
    }
}
