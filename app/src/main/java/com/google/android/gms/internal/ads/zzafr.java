package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzafr {
    private static final byte[] zza = zzew.zzab("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzafi r13) {
        /*
            com.google.android.gms.internal.ads.zzen r13 = r13.zza
            r0 = 8
            r13.zzF(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            int r4 = r13.zza()
            if (r4 < r0) goto Ldf
            int r4 = r13.zzc()
            int r5 = r13.zze()
            int r6 = r13.zze()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L75
            r13.zzF(r4)
            int r2 = r4 + r5
            r13.zzG(r0)
            zzd(r13)
        L2c:
            int r6 = r13.zzc()
            if (r6 >= r2) goto L73
            int r6 = r13.zzc()
            int r7 = r13.zze()
            int r8 = r13.zze()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L6e
            r13.zzF(r6)
            int r6 = r6 + r7
            r13.zzG(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4f:
            int r7 = r13.zzc()
            if (r7 >= r6) goto L5f
            com.google.android.gms.internal.ads.zzbp r7 = com.google.android.gms.internal.ads.zzafy.zza(r13)
            if (r7 == 0) goto L4f
            r2.add(r7)
            goto L4f
        L5f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L66
            goto L73
        L66:
            com.google.android.gms.internal.ads.zzbq r6 = new com.google.android.gms.internal.ads.zzbq
            r6.<init>(r2)
            r2 = r6
            goto Ld9
        L6e:
            int r6 = r6 + r7
            r13.zzF(r6)
            goto L2c
        L73:
            r2 = r1
            goto Ld9
        L75:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto Ld9
            r13.zzF(r4)
            int r3 = r4 + r5
            r6 = 12
            r13.zzG(r6)
        L84:
            int r7 = r13.zzc()
            if (r7 >= r3) goto Ld8
            int r7 = r13.zzc()
            int r8 = r13.zze()
            int r9 = r13.zze()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto Ld3
            r3 = 14
            if (r8 >= r3) goto La0
            goto Ld8
        La0:
            r3 = 5
            r13.zzG(r3)
            int r3 = r13.zzk()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto Lb1
            r6 = 13
            if (r3 == r6) goto Lb5
            goto Ld8
        Lb1:
            if (r3 != r6) goto Lb5
            r7 = 1131413504(0x43700000, float:240.0)
        Lb5:
            r3 = 1
            r13.zzG(r3)
            int r6 = r13.zzk()
            com.google.android.gms.internal.ads.zzbq r8 = new com.google.android.gms.internal.ads.zzbq
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.zzbp[] r3 = new com.google.android.gms.internal.ads.zzbp[r3]
            r11 = 0
            com.google.android.gms.internal.ads.zzaei r12 = new com.google.android.gms.internal.ads.zzaei
            r12.<init>(r7, r6)
            r3[r11] = r12
            r8.<init>(r9, r3)
            r3 = r8
            goto Ld9
        Ld3:
            int r7 = r7 + r8
            r13.zzF(r7)
            goto L84
        Ld8:
            r3 = r1
        Ld9:
            int r4 = r4 + r5
            r13.zzF(r4)
            goto La
        Ldf:
            android.util.Pair r13 = android.util.Pair.create(r2, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zza(com.google.android.gms.internal.ads.zzafi):android.util.Pair");
    }

    public static zzbq zzb(zzafh zzafhVar) {
        zzaec zzaecVar;
        zzafi zzb = zzafhVar.zzb(1751411826);
        zzafi zzb2 = zzafhVar.zzb(1801812339);
        zzafi zzb3 = zzafhVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzen zzenVar = zzb2.zza;
        zzenVar.zzF(12);
        int zze = zzenVar.zze();
        String[] strArr = new String[zze];
        for (int i = 0; i < zze; i++) {
            int zze2 = zzenVar.zze();
            zzenVar.zzG(4);
            strArr[i] = zzenVar.zzx(zze2 - 8, zzfnh.zzc);
        }
        zzen zzenVar2 = zzb3.zza;
        zzenVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzenVar2.zza() > 8) {
            int zzc = zzenVar2.zzc();
            int zze3 = zzenVar2.zze();
            int zze4 = zzenVar2.zze() - 1;
            if (zze4 < 0 || zze4 >= zze) {
                zzee.zze("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            } else {
                String str = strArr[zze4];
                int i2 = zzc + zze3;
                int i3 = zzafy.zzb;
                while (true) {
                    int zzc2 = zzenVar2.zzc();
                    if (zzc2 >= i2) {
                        zzaecVar = null;
                        break;
                    }
                    int zze5 = zzenVar2.zze();
                    if (zzenVar2.zze() != 1684108385) {
                        zzenVar2.zzF(zzc2 + zze5);
                    } else {
                        int zze6 = zzenVar2.zze();
                        int zze7 = zzenVar2.zze();
                        int i4 = zze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzenVar2.zzB(bArr, 0, i4);
                        zzaecVar = new zzaec(str, bArr, zze7, zze6);
                        break;
                    }
                }
                if (zzaecVar != null) {
                    arrayList.add(zzaecVar);
                }
            }
            zzenVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1031:0x0782, code lost:
        if (r25 == null) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x00b8, code lost:
        if (r7 == 0) goto L650;
     */
    /* JADX WARN: Removed duplicated region for block: B:1055:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:1116:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:1155:0x0ad4 A[LOOP:13: B:1155:0x0ad4->B:1159:0x0ade, LOOP_START, PHI: r23 
      PHI: (r23v8 int) = (r23v7 int), (r23v9 int) binds: [B:1154:0x0ad2, B:1159:0x0ade] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:1175:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:1179:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:1180:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:1185:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:1187:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:1278:0x0e2e  */
    /* JADX WARN: Removed duplicated region for block: B:1286:0x0e3b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1305:0x0acb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzafh r56, com.google.android.gms.internal.ads.zzaaj r57, long r58, com.google.android.gms.internal.ads.zzx r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfnj r63) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instructions count: 3653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzc(com.google.android.gms.internal.ads.zzafh, com.google.android.gms.internal.ads.zzaaj, long, com.google.android.gms.internal.ads.zzx, boolean, boolean, com.google.android.gms.internal.ads.zzfnj):java.util.List");
    }

    public static void zzd(zzen zzenVar) {
        int zzc = zzenVar.zzc();
        zzenVar.zzG(4);
        if (zzenVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzenVar.zzF(zzc);
    }

    private static int zze(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzen zzenVar) {
        int zzk = zzenVar.zzk();
        int i = zzk & 127;
        while ((zzk & 128) == 128) {
            zzk = zzenVar.zzk();
            i = (i << 7) | (zzk & 127);
        }
        return i;
    }

    private static int zzg(zzen zzenVar) {
        zzenVar.zzF(16);
        return zzenVar.zze();
    }

    private static Pair zzh(zzafh zzafhVar) {
        zzafi zzb = zzafhVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzen zzenVar = zzb.zza;
        zzenVar.zzF(8);
        int zze = zzafj.zze(zzenVar.zze());
        int zzn = zzenVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i = 0; i < zzn; i++) {
            jArr[i] = zze == 1 ? zzenVar.zzt() : zzenVar.zzs();
            jArr2[i] = zze == 1 ? zzenVar.zzr() : zzenVar.zze();
            if (zzenVar.zzy() == 1) {
                zzenVar.zzG(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzen zzenVar) {
        zzenVar.zzF(8);
        int zze = zzafj.zze(zzenVar.zze());
        zzenVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzenVar.zzs();
        zzenVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzenVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    private static Pair zzj(zzen zzenVar, int i, int i2) throws zzbu {
        Integer num;
        zzagh zzaghVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzc = zzenVar.zzc();
        while (zzc - i < i2) {
            zzenVar.zzF(zzc);
            int zze = zzenVar.zze();
            zzzy.zzb(zze > 0, "childAtomSize must be positive");
            if (zzenVar.zze() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zze) {
                    zzenVar.zzF(i5);
                    int zze2 = zzenVar.zze();
                    int zze3 = zzenVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzenVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzenVar.zzG(4);
                        str = zzenVar.zzx(4, zzfnh.zzc);
                    } else if (zze3 == 1935894633) {
                        i6 = i5;
                        i7 = zze2;
                    }
                    i5 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzzy.zzb(num2 != null, "frma atom is mandatory");
                    zzzy.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzaghVar = null;
                            break;
                        }
                        zzenVar.zzF(i8);
                        int zze4 = zzenVar.zze();
                        if (zzenVar.zze() == 1952804451) {
                            int zze5 = zzafj.zze(zzenVar.zze());
                            zzenVar.zzG(1);
                            if (zze5 == 0) {
                                zzenVar.zzG(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzk = zzenVar.zzk();
                                int i9 = zzk & 240;
                                i3 = zzk & 15;
                                i4 = i9 >> 4;
                            }
                            boolean z = zzenVar.zzk() == 1;
                            int zzk2 = zzenVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzenVar.zzB(bArr2, 0, 16);
                            if (z && zzk2 == 0) {
                                int zzk3 = zzenVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzenVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaghVar = new zzagh(z, str, zzk2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zze4;
                        }
                    }
                    zzzy.zzb(zzaghVar != null, "tenc atom is mandatory");
                    int i10 = zzew.zza;
                    create = Pair.create(num, zzaghVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static zzafl zzk(zzen zzenVar, int i) {
        zzenVar.zzF(i + 12);
        zzenVar.zzG(1);
        zzf(zzenVar);
        zzenVar.zzG(2);
        int zzk = zzenVar.zzk();
        if ((zzk & 128) != 0) {
            zzenVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzenVar.zzG(zzenVar.zzk());
        }
        if ((zzk & 32) != 0) {
            zzenVar.zzG(2);
        }
        zzenVar.zzG(1);
        zzf(zzenVar);
        String zzd = zzbt.zzd(zzenVar.zzk());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzafl(zzd, null, -1L, -1L);
        }
        zzenVar.zzG(4);
        long zzs = zzenVar.zzs();
        long zzs2 = zzenVar.zzs();
        zzenVar.zzG(1);
        int zzf = zzf(zzenVar);
        byte[] bArr = new byte[zzf];
        zzenVar.zzB(bArr, 0, zzf);
        return new zzafl(zzd, bArr, zzs2 <= 0 ? -1L : zzs2, zzs > 0 ? zzs : -1L);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:291:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzen r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, com.google.android.gms.internal.ads.zzx r30, com.google.android.gms.internal.ads.zzafn r31, int r32) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzm(com.google.android.gms.internal.ads.zzen, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzx, com.google.android.gms.internal.ads.zzafn, int):void");
    }

    private static void zzn(zzen zzenVar, int i, int i2, int i3, zzafn zzafnVar) {
        zzenVar.zzF(i2 + 16);
        zzenVar.zzv((char) 0);
        String zzv = zzenVar.zzv((char) 0);
        if (zzv != null) {
            zzad zzadVar = new zzad();
            zzadVar.zzG(i3);
            zzadVar.zzS(zzv);
            zzafnVar.zzb = zzadVar.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[zzew.zzf(4, 0, i)] && jArr[zzew.zzf(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}
