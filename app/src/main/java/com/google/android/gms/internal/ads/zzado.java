package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzado {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzadl
    };

    /* JADX WARN: Removed duplicated region for block: B:97:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzbq zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzadm r13, com.google.android.gms.internal.ads.zzacp r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zza(byte[], int, com.google.android.gms.internal.ads.zzadm, com.google.android.gms.internal.ads.zzacp):com.google.android.gms.internal.ads.zzbq");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzen zzenVar, int i) {
        byte[] zzH = zzenVar.zzH();
        int zzc = zzenVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzH[i2] & UByte.MAX_VALUE) == 255 && zzH[i3] == 0) {
                System.arraycopy(zzH, i2 + 2, zzH, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x026c, code lost:
        if (r9 == 67) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x04f5 A[Catch: all -> 0x051a, TRY_LEAVE, TryCatch #1 {all -> 0x051a, blocks: (B:472:0x04f5, B:373:0x0217, B:389:0x026e, B:391:0x0280, B:398:0x02c5, B:395:0x02a2, B:397:0x02bb, B:410:0x0307, B:419:0x034e, B:422:0x0383, B:425:0x0394, B:426:0x039c, B:428:0x03a2, B:430:0x03a9, B:431:0x03ad, B:438:0x03cf, B:442:0x03fa, B:444:0x0404, B:445:0x0437, B:446:0x0443, B:448:0x0449, B:450:0x0450, B:451:0x0454, B:455:0x0469, B:464:0x0494, B:466:0x04be, B:467:0x04cd, B:470:0x04e4), top: B:484:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzadp zzf(int r35, com.google.android.gms.internal.ads.zzen r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzadm r39) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zzf(int, com.google.android.gms.internal.ads.zzen, boolean, int, com.google.android.gms.internal.ads.zzadm):com.google.android.gms.internal.ads.zzadp");
    }

    private static zzfqk zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfqk.zzp("");
        }
        zzfqh zzi = zzfqk.zzi();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzi.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfqk zzi2 = zzi.zzi();
        return zzi2.isEmpty() ? zzfqk.zzp("") : zzi2;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0087, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzk(com.google.android.gms.internal.ads.zzen r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzc()
        L8:
            int r3 = r21.zza()     // Catch: java.lang.Throwable -> Lb0
            r4 = 1
            r5 = r23
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r21.zze()     // Catch: java.lang.Throwable -> Lb0
            long r8 = r21.zzs()     // Catch: java.lang.Throwable -> Lb0
            int r10 = r21.zzo()     // Catch: java.lang.Throwable -> Lb0
            goto L2c
        L22:
            int r7 = r21.zzm()     // Catch: java.lang.Throwable -> Lb0
            int r8 = r21.zzm()     // Catch: java.lang.Throwable -> Lb0
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 == 0) goto L37
            goto L3b
        L37:
            r1.zzF(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r24 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.zzF(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L73
            goto L74
        L73:
            r4 = 0
        L74:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8b
            goto L8c
        L8a:
            r3 = 0
        L8b:
            r4 = 0
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L99
            r1.zzF(r2)
            return r6
        L99:
            int r3 = r21.zza()     // Catch: java.lang.Throwable -> Lb0
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La6
            r1.zzF(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.zzG(r3)     // Catch: java.lang.Throwable -> Lb0
            goto L8
        Lac:
            r1.zzF(r2)
            return r4
        Lb0:
            r0 = move-exception
            r1.zzF(r2)
            goto Lb6
        Lb5:
            throw r0
        Lb6:
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zzk(com.google.android.gms.internal.ads.zzen, int, int, boolean):boolean");
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzew.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzfnh.zzc;
                }
                return zzfnh.zzb;
            }
            return zzfnh.zzd;
        }
        return zzfnh.zzf;
    }
}
