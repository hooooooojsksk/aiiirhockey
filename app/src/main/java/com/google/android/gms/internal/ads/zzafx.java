package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzafx implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzaft
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzafx.zza;
            return new zzzu[]{new zzafx(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_DISCONNECT, airhockey.P_NATION, 124, airhockey.J_ONREWARDED, -115, -12};
    private static final zzaf zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzzx zzD;
    private zzabb[] zzE;
    private zzabb[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzen zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final byte[] zzi;
    private final zzen zzj;
    private final zzacs zzk;
    private final zzen zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzen zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzafw zzy;
    private int zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS("application/x-emsg");
        zzc = zzadVar.zzY();
    }

    public zzafx() {
        this(0, null);
    }

    private static int zze(int i) throws zzbu {
        if (i >= 0) {
            return i;
        }
        throw zzbu.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzx zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzafi r5 = (com.google.android.gms.internal.ads.zzafi) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzen r5 = r5.zza
            byte[] r5 = r5.zzH()
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            r6.<init>(r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L99
        L33:
            r6.zzF(r1)
            int r8 = r6.zze()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.zze()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.zze()
            int r7 = com.google.android.gms.internal.ads.zzafj.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzee.zze(r7, r6)
            goto L31
        L6c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzr()
            long r12 = r6.zzr()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L84
            int r8 = r6.zzn()
            int r8 = r8 * 16
            r6.zzG(r8)
        L84:
            int r8 = r6.zzn()
            int r10 = r6.zza()
            if (r8 == r10) goto L8f
            goto L31
        L8f:
            byte[] r10 = new byte[r8]
            r6.zzB(r10, r1, r8)
            com.google.android.gms.internal.ads.zzagd r6 = new com.google.android.gms.internal.ads.zzagd
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zzagd.zza(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzee.zze(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzw r7 = new com.google.android.gms.internal.ads.zzw
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzx r14 = new com.google.android.gms.internal.ads.zzx
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zzf(java.util.List):com.google.android.gms.internal.ads.zzx");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzen zzenVar, int i, zzagi zzagiVar) throws zzbu {
        zzenVar.zzF(i + 8);
        int zze = zzenVar.zze() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zze & 1) != 0) {
            throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzn = zzenVar.zzn();
        if (zzn == 0) {
            Arrays.fill(zzagiVar.zzl, 0, zzagiVar.zze, false);
            return;
        }
        int i2 = zzagiVar.zze;
        if (zzn != i2) {
            throw zzbu.zza("Senc sample count " + zzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzagiVar.zzl, 0, zzn, z);
        zzagiVar.zza(zzenVar.zza());
        zzen zzenVar2 = zzagiVar.zzn;
        zzenVar.zzB(zzenVar2.zzH(), 0, zzenVar2.zzd());
        zzagiVar.zzn.zzF(0);
        zzagiVar.zzo = false;
    }

    private final void zzi(long j) throws zzbu {
        zzafx zzafxVar;
        SparseArray sparseArray;
        zzafh zzafhVar;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        byte[] bArr3;
        int i7;
        boolean z;
        int i8;
        zzafh zzafhVar2;
        byte[] bArr4;
        zzagi zzagiVar;
        List list;
        int i9;
        int i10;
        int i11;
        zzafh zzafhVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzafs zzafsVar;
        long j2;
        zzafx zzafxVar2 = this;
        while (!zzafxVar2.zzm.isEmpty() && ((zzafh) zzafxVar2.zzm.peek()).zza == j) {
            zzafh zzafhVar4 = (zzafh) zzafxVar2.zzm.pop();
            int i21 = zzafhVar4.zzd;
            int i22 = 12;
            int i23 = 8;
            if (i21 == 1836019574) {
                zzx zzf = zzf(zzafhVar4.zzb);
                zzafh zza2 = zzafhVar4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    zzafi zzafiVar = (zzafi) zza2.zzb.get(i24);
                    int i25 = zzafiVar.zzd;
                    if (i25 == 1953654136) {
                        zzen zzenVar = zzafiVar.zza;
                        zzenVar.zzF(i22);
                        Pair create = Pair.create(Integer.valueOf(zzenVar.zze()), new zzafs(zzenVar.zze() - 1, zzenVar.zze(), zzenVar.zze(), zzenVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzafs) create.second);
                    } else if (i25 == 1835362404) {
                        zzen zzenVar2 = zzafiVar.zza;
                        zzenVar2.zzF(8);
                        j3 = zzafj.zze(zzenVar2.zze()) == 0 ? zzenVar2.zzs() : zzenVar2.zzt();
                    }
                    i24++;
                    i22 = 12;
                }
                List zzc2 = zzafr.zzc(zzafhVar4, new zzaaj(), j3, zzf, false, false, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzafu
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        return (zzagg) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzafxVar2.zze.size() == 0) {
                    for (int i26 = 0; i26 < size2; i26++) {
                        zzagj zzagjVar = (zzagj) zzc2.get(i26);
                        zzagg zzaggVar = zzagjVar.zza;
                        zzafxVar2.zze.put(zzaggVar.zza, new zzafw(zzafxVar2.zzD.zzv(i26, zzaggVar.zzb), zzagjVar, zzj(sparseArray2, zzaggVar.zza)));
                        zzafxVar2.zzw = Math.max(zzafxVar2.zzw, zzaggVar.zze);
                    }
                    zzafxVar2.zzD.zzC();
                } else {
                    zzdl.zzf(zzafxVar2.zze.size() == size2);
                    for (int i27 = 0; i27 < size2; i27++) {
                        zzagj zzagjVar2 = (zzagj) zzc2.get(i27);
                        zzagg zzaggVar2 = zzagjVar2.zza;
                        ((zzafw) zzafxVar2.zze.get(zzaggVar2.zza)).zzh(zzagjVar2, zzj(sparseArray2, zzaggVar2.zza));
                    }
                }
            } else {
                if (i21 == 1836019558) {
                    SparseArray sparseArray3 = zzafxVar2.zze;
                    byte[] bArr5 = zzafxVar2.zzi;
                    int size3 = zzafhVar4.zzc.size();
                    int i28 = 0;
                    while (i28 < size3) {
                        zzafh zzafhVar5 = (zzafh) zzafhVar4.zzc.get(i28);
                        if (zzafhVar5.zzd == 1953653094) {
                            zzafi zzb2 = zzafhVar5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzen zzenVar3 = zzb2.zza;
                            zzenVar3.zzF(i23);
                            int zze = zzenVar3.zze() & ViewCompat.MEASURED_SIZE_MASK;
                            zzafw zzafwVar = (zzafw) sparseArray3.get(zzenVar3.zze());
                            if (zzafwVar == null) {
                                zzafwVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzenVar3.zzt();
                                    zzagi zzagiVar2 = zzafwVar.zzb;
                                    zzagiVar2.zzb = zzt;
                                    zzagiVar2.zzc = zzt;
                                }
                                zzafs zzafsVar2 = zzafwVar.zze;
                                int zze2 = (zze & 2) != 0 ? zzenVar3.zze() - 1 : zzafsVar2.zza;
                                if ((zze & 8) != 0) {
                                    i3 = zzenVar3.zze();
                                } else {
                                    i3 = zzafsVar2.zzb;
                                }
                                if ((zze & 16) != 0) {
                                    i4 = zzenVar3.zze();
                                } else {
                                    i4 = zzafsVar2.zzc;
                                }
                                if ((zze & 32) != 0) {
                                    i5 = zzenVar3.zze();
                                } else {
                                    i5 = zzafsVar2.zzd;
                                }
                                zzafwVar.zzb.zza = new zzafs(zze2, i3, i4, i5);
                            }
                            if (zzafwVar != null) {
                                zzagi zzagiVar3 = zzafwVar.zzb;
                                long j4 = zzagiVar3.zzp;
                                boolean z3 = zzagiVar3.zzq;
                                zzafwVar.zzi();
                                zzafwVar.zzl = true;
                                zzafi zzb3 = zzafhVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzen zzenVar4 = zzb3.zza;
                                    zzenVar4.zzF(i23);
                                    zzagiVar3.zzp = zzafj.zze(zzenVar4.zze()) == 1 ? zzenVar4.zzt() : zzenVar4.zzs();
                                    zzagiVar3.zzq = true;
                                } else {
                                    zzagiVar3.zzp = j4;
                                    zzagiVar3.zzq = z3;
                                }
                                List list2 = zzafhVar5.zzb;
                                int size4 = list2.size();
                                int i29 = 0;
                                int i30 = 0;
                                int i31 = 0;
                                while (true) {
                                    i6 = 1953658222;
                                    if (i29 >= size4) {
                                        break;
                                    }
                                    zzafi zzafiVar2 = (zzafi) list2.get(i29);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzafiVar2.zzd == 1953658222) {
                                        zzen zzenVar5 = zzafiVar2.zza;
                                        zzenVar5.zzF(12);
                                        int zzn = zzenVar5.zzn();
                                        if (zzn > 0) {
                                            i31 += zzn;
                                            i30++;
                                        }
                                    }
                                    i29++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzafwVar.zzh = 0;
                                zzafwVar.zzg = 0;
                                zzafwVar.zzf = 0;
                                zzagi zzagiVar4 = zzafwVar.zzb;
                                zzagiVar4.zzd = i30;
                                zzagiVar4.zze = i31;
                                if (zzagiVar4.zzg.length < i30) {
                                    zzagiVar4.zzf = new long[i30];
                                    zzagiVar4.zzg = new int[i30];
                                }
                                if (zzagiVar4.zzh.length < i31) {
                                    int i32 = (i31 * 125) / 100;
                                    zzagiVar4.zzh = new int[i32];
                                    zzagiVar4.zzi = new long[i32];
                                    zzagiVar4.zzj = new boolean[i32];
                                    zzagiVar4.zzl = new boolean[i32];
                                }
                                int i33 = 0;
                                int i34 = 0;
                                int i35 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i33 >= size4) {
                                        break;
                                    }
                                    zzafi zzafiVar3 = (zzafi) list2.get(i33);
                                    if (zzafiVar3.zzd == i6) {
                                        int i36 = i34 + 1;
                                        zzen zzenVar6 = zzafiVar3.zza;
                                        zzenVar6.zzF(8);
                                        int zze3 = zzenVar6.zze() & ViewCompat.MEASURED_SIZE_MASK;
                                        list = list2;
                                        zzagg zzaggVar3 = zzafwVar.zzd.zza;
                                        i9 = size3;
                                        zzagi zzagiVar5 = zzafwVar.zzb;
                                        i11 = size4;
                                        zzafs zzafsVar3 = zzagiVar5.zza;
                                        int i37 = zzew.zza;
                                        zzagiVar5.zzg[i34] = zzenVar6.zzn();
                                        long[] jArr = zzagiVar5.zzf;
                                        zzafhVar2 = zzafhVar4;
                                        bArr4 = bArr5;
                                        long j6 = zzagiVar5.zzb;
                                        jArr[i34] = j6;
                                        if ((zze3 & 1) != 0) {
                                            i8 = i33;
                                            jArr[i34] = j6 + zzenVar6.zze();
                                        } else {
                                            i8 = i33;
                                        }
                                        boolean z4 = (zze3 & 4) != 0;
                                        int i38 = zzafsVar3.zzd;
                                        if (z4) {
                                            i38 = zzenVar6.zze();
                                        }
                                        int i39 = zze3 & 256;
                                        int i40 = zze3 & 512;
                                        int i41 = zze3 & 1024;
                                        int i42 = zze3 & 2048;
                                        int i43 = i38;
                                        long[] jArr2 = zzaggVar3.zzh;
                                        if (jArr2 != null) {
                                            i10 = i28;
                                            zzafhVar3 = zzafhVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzew.zzH(zzaggVar3.zzi))[0];
                                            }
                                        } else {
                                            i10 = i28;
                                            zzafhVar3 = zzafhVar5;
                                        }
                                        int[] iArr = zzagiVar5.zzh;
                                        long[] jArr3 = zzagiVar5.zzi;
                                        boolean[] zArr = zzagiVar5.zzj;
                                        zzagiVar = zzagiVar3;
                                        int i44 = zzagiVar5.zzg[i34] + i35;
                                        long j7 = zzaggVar3.zzc;
                                        long j8 = zzagiVar5.zzp;
                                        int i45 = i35;
                                        while (i45 < i44) {
                                            if (i39 != 0) {
                                                i12 = i39;
                                                i13 = zzenVar6.zze();
                                            } else {
                                                i12 = i39;
                                                i13 = zzafsVar3.zzb;
                                            }
                                            zze(i13);
                                            if (i40 != 0) {
                                                i14 = i40;
                                                i15 = zzenVar6.zze();
                                            } else {
                                                i14 = i40;
                                                i15 = zzafsVar3.zzc;
                                            }
                                            zze(i15);
                                            if (i41 != 0) {
                                                z2 = z4;
                                                i16 = zzenVar6.zze();
                                            } else {
                                                z2 = z4;
                                                if (i45 == 0) {
                                                    if (z4) {
                                                        i16 = i43;
                                                        i45 = 0;
                                                    } else {
                                                        i45 = 0;
                                                    }
                                                }
                                                i16 = zzafsVar3.zzd;
                                            }
                                            if (i42 != 0) {
                                                i17 = i44;
                                                i18 = i41;
                                                i19 = i42;
                                                i20 = zzenVar6.zze();
                                            } else {
                                                i17 = i44;
                                                i18 = i41;
                                                i19 = i42;
                                                i20 = 0;
                                            }
                                            long zzw = zzew.zzw((i20 + j8) - j5, 1000000L, j7);
                                            jArr3[i45] = zzw;
                                            if (zzagiVar5.zzq) {
                                                zzafsVar = zzafsVar3;
                                                j2 = j7;
                                            } else {
                                                zzafsVar = zzafsVar3;
                                                j2 = j7;
                                                jArr3[i45] = zzw + zzafwVar.zzd.zzh;
                                            }
                                            iArr[i45] = i15;
                                            zArr[i45] = 1 == (((i16 >> 16) & 1) ^ 1);
                                            j8 += i13;
                                            i45++;
                                            zzafsVar3 = zzafsVar;
                                            j7 = j2;
                                            i39 = i12;
                                            i40 = i14;
                                            z4 = z2;
                                            i44 = i17;
                                            i41 = i18;
                                            i42 = i19;
                                        }
                                        zzagiVar5.zzp = j8;
                                        i34 = i36;
                                        i35 = i44;
                                    } else {
                                        i8 = i33;
                                        zzafhVar2 = zzafhVar4;
                                        bArr4 = bArr5;
                                        zzagiVar = zzagiVar3;
                                        list = list2;
                                        i9 = size3;
                                        i10 = i28;
                                        i11 = size4;
                                        zzafhVar3 = zzafhVar5;
                                    }
                                    i33 = i8 + 1;
                                    list2 = list;
                                    size3 = i9;
                                    size4 = i11;
                                    zzafhVar4 = zzafhVar2;
                                    bArr5 = bArr4;
                                    i28 = i10;
                                    zzafhVar5 = zzafhVar3;
                                    zzagiVar3 = zzagiVar;
                                    i6 = 1953658222;
                                }
                                zzafhVar = zzafhVar4;
                                byte[] bArr6 = bArr5;
                                zzagi zzagiVar6 = zzagiVar3;
                                i = size3;
                                i2 = i28;
                                zzafh zzafhVar6 = zzafhVar5;
                                zzagg zzaggVar4 = zzafwVar.zzd.zza;
                                zzafs zzafsVar4 = zzagiVar6.zza;
                                Objects.requireNonNull(zzafsVar4);
                                zzagh zza3 = zzaggVar4.zza(zzafsVar4.zza);
                                zzafi zzb4 = zzafhVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzen zzenVar7 = zzb4.zza;
                                    int i46 = zza3.zzd;
                                    zzenVar7.zzF(8);
                                    if ((zzenVar7.zze() & 1) == 1) {
                                        zzenVar7.zzG(8);
                                    }
                                    int zzk = zzenVar7.zzk();
                                    int zzn2 = zzenVar7.zzn();
                                    int i47 = zzagiVar6.zze;
                                    if (zzn2 > i47) {
                                        throw zzbu.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i47, null);
                                    }
                                    if (zzk != 0) {
                                        boolean z5 = zzk > i46;
                                        i7 = zzk * zzn2;
                                        z = false;
                                        Arrays.fill(zzagiVar6.zzl, 0, zzn2, z5);
                                    } else {
                                        boolean[] zArr2 = zzagiVar6.zzl;
                                        i7 = 0;
                                        for (int i48 = 0; i48 < zzn2; i48++) {
                                            int zzk2 = zzenVar7.zzk();
                                            i7 += zzk2;
                                            zArr2[i48] = zzk2 > i46;
                                        }
                                        z = false;
                                    }
                                    Arrays.fill(zzagiVar6.zzl, zzn2, zzagiVar6.zze, z);
                                    if (i7 > 0) {
                                        zzagiVar6.zza(i7);
                                    }
                                }
                                zzafi zzb5 = zzafhVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzen zzenVar8 = zzb5.zza;
                                    zzenVar8.zzF(8);
                                    int zze4 = zzenVar8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzenVar8.zzG(8);
                                    }
                                    int zzn3 = zzenVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbu.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzagiVar6.zzc += zzafj.zze(zze4) == 0 ? zzenVar8.zzs() : zzenVar8.zzt();
                                }
                                zzafi zzb6 = zzafhVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzagiVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzen zzenVar9 = null;
                                zzen zzenVar10 = null;
                                for (int i49 = 0; i49 < zzafhVar6.zzb.size(); i49++) {
                                    zzafi zzafiVar4 = (zzafi) zzafhVar6.zzb.get(i49);
                                    zzen zzenVar11 = zzafiVar4.zza;
                                    int i50 = zzafiVar4.zzd;
                                    if (i50 == 1935828848) {
                                        zzenVar11.zzF(12);
                                        if (zzenVar11.zze() == 1936025959) {
                                            zzenVar9 = zzenVar11;
                                        }
                                    } else if (i50 == 1936158820) {
                                        zzenVar11.zzF(12);
                                        if (zzenVar11.zze() == 1936025959) {
                                            zzenVar10 = zzenVar11;
                                        }
                                    }
                                }
                                if (zzenVar9 != null && zzenVar10 != null) {
                                    zzenVar9.zzF(8);
                                    int zze5 = zzafj.zze(zzenVar9.zze());
                                    zzenVar9.zzG(4);
                                    if (zze5 == 1) {
                                        zzenVar9.zzG(4);
                                    }
                                    if (zzenVar9.zze() == 1) {
                                        zzenVar10.zzF(8);
                                        int zze6 = zzafj.zze(zzenVar10.zze());
                                        zzenVar10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzenVar10.zzs() == 0) {
                                                throw zzbu.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzenVar10.zzG(4);
                                        }
                                        if (zzenVar10.zzs() == 1) {
                                            zzenVar10.zzG(1);
                                            int zzk3 = zzenVar10.zzk();
                                            int i51 = (zzk3 & 240) >> 4;
                                            int i52 = zzk3 & 15;
                                            if (zzenVar10.zzk() == 1) {
                                                int zzk4 = zzenVar10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzenVar10.zzB(bArr7, 0, 16);
                                                if (zzk4 == 0) {
                                                    int zzk5 = zzenVar10.zzk();
                                                    byte[] bArr8 = new byte[zzk5];
                                                    zzenVar10.zzB(bArr8, 0, zzk5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzagiVar6.zzk = true;
                                                zzagiVar6.zzm = new zzagh(true, str, zzk4, bArr7, i51, i52, bArr3);
                                            }
                                        } else {
                                            throw zzbu.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbu.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzafhVar6.zzb.size();
                                int i53 = 0;
                                while (i53 < size5) {
                                    zzafi zzafiVar5 = (zzafi) zzafhVar6.zzb.get(i53);
                                    if (zzafiVar5.zzd == 1970628964) {
                                        zzen zzenVar12 = zzafiVar5.zza;
                                        zzenVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzenVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzenVar12, 16, zzagiVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i53++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i;
                                zzafhVar4 = zzafhVar;
                                i23 = 8;
                                i28 = i2 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzafhVar = zzafhVar4;
                        i = size3;
                        i2 = i28;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i;
                        zzafhVar4 = zzafhVar;
                        i23 = 8;
                        i28 = i2 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx zzf2 = zzf(zzafhVar4.zzb);
                    zzafxVar = this;
                    if (zzf2 != null) {
                        int size6 = zzafxVar.zze.size();
                        for (int i54 = 0; i54 < size6; i54++) {
                            zzafw zzafwVar2 = (zzafw) zzafxVar.zze.valueAt(i54);
                            zzagg zzaggVar5 = zzafwVar2.zzd.zza;
                            zzafs zzafsVar5 = zzafwVar2.zzb.zza;
                            int i55 = zzew.zza;
                            zzagh zza4 = zzaggVar5.zza(zzafsVar5.zza);
                            zzx zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzad zzb8 = zzafwVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzafwVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzafxVar.zzv != -9223372036854775807L) {
                        int size7 = zzafxVar.zze.size();
                        for (int i56 = 0; i56 < size7; i56++) {
                            zzafw zzafwVar3 = (zzafw) zzafxVar.zze.valueAt(i56);
                            long j9 = zzafxVar.zzv;
                            int i57 = zzafwVar3.zzf;
                            while (true) {
                                zzagi zzagiVar7 = zzafwVar3.zzb;
                                if (i57 < zzagiVar7.zze && zzagiVar7.zzi[i57] < j9) {
                                    if (zzagiVar7.zzj[i57]) {
                                        zzafwVar3.zzi = i57;
                                    }
                                    i57++;
                                }
                            }
                        }
                        zzafxVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzafxVar = zzafxVar2;
                    if (!zzafxVar.zzm.isEmpty()) {
                        ((zzafh) zzafxVar.zzm.peek()).zzc(zzafhVar4);
                    }
                }
                zzafxVar2 = zzafxVar;
            }
        }
        zzg();
    }

    private static final zzafs zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzafs) sparseArray.valueAt(0);
        }
        zzafs zzafsVar = (zzafs) sparseArray.get(i);
        Objects.requireNonNull(zzafsVar);
        return zzafsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x0099, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x009c, code lost:
        if (r33.zzo != 3) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x009e, code lost:
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x00a8, code lost:
        if (r2.zzf >= r2.zzi) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x00aa, code lost:
        ((com.google.android.gms.internal.ads.zzzk) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x00b3, code lost:
        if (r1 != null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x00b6, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x00bc, code lost:
        if (r1 == 0) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x00be, code lost:
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x00c9, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x00cb, code lost:
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x00d8, code lost:
        if (r2.zzk() != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x00da, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x00dc, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x00de, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x00e7, code lost:
        if (r2.zzd.zza.zzg != 1) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x00e9, code lost:
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzzk) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0103, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0105, code lost:
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzyy.zzb(r33.zzz, r33.zzj);
        r2.zza.zzq(r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0122, code lost:
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x012a, code lost:
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0134, code lost:
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0140, code lost:
        if (r6 != 0) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0142, code lost:
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0146, code lost:
        if (r3 >= r4) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0148, code lost:
        r33.zzA += r5.zze(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0153, code lost:
        r13 = r33.zzg.zzH();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0169, code lost:
        if (r33.zzA >= r33.zzz) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x016b, code lost:
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x016f, code lost:
        if (r12 != 0) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0171, code lost:
        ((com.google.android.gms.internal.ads.zzzk) r1).zzn(r13, r6, r14, r9);
        r33.zzg.zzF(r9);
        r12 = r33.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0182, code lost:
        if (r12 <= 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0184, code lost:
        r33.zzB = r12 - 1;
        r33.zzf.zzF(r9);
        r5.zzq(r33.zzf, 4);
        r5.zzq(r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x019b, code lost:
        if (r33.zzF.length <= 0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x019d, code lost:
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzaar.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x01ab, code lost:
        if ("video/avc".equals(r12) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x01af, code lost:
        if ((r17 & 31) == r4) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x01b2, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x01b8, code lost:
        if ("video/hevc".equals(r12) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01bf, code lost:
        if (((r17 & 126) >> r8) != 39) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x01c2, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x01c3, code lost:
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x01d7, code lost:
        throw com.google.android.gms.internal.ads.zzbu.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x01da, code lost:
        if (r33.zzC == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x01dc, code lost:
        r33.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzzk) r1).zzn(r33.zzh.zzH(), 0, r33.zzB, false);
        r5.zzq(r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzaar.zzb(r8.zzH(), r8.zzd());
        r33.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzE(r8);
        com.google.android.gms.internal.ads.zzzh.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0221, code lost:
        r4 = r5.zze(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0227, code lost:
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0233, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0237, code lost:
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x023f, code lost:
        if (r1 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0241, code lost:
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0246, code lost:
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0248, code lost:
        r5.zzs(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x025b, code lost:
        if (r33.zzn.isEmpty() != false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x025d, code lost:
        r1 = (com.google.android.gms.internal.ads.zzafv) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0270, code lost:
        if (r1.zzb == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0272, code lost:
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0273, code lost:
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0277, code lost:
        if (r8 >= r6) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0279, code lost:
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0291, code lost:
        if (r2.zzk() != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0293, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0295, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:?, code lost:
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r34, com.google.android.gms.internal.ads.zzaau r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzD = zzzxVar;
        zzg();
        zzabb[] zzabbVarArr = new zzabb[2];
        this.zzE = zzabbVarArr;
        int i = 0;
        zzabb[] zzabbVarArr2 = (zzabb[]) zzew.zzaf(zzabbVarArr, 0);
        this.zzE = zzabbVarArr2;
        for (zzabb zzabbVar : zzabbVarArr2) {
            zzabbVar.zzk(zzc);
        }
        this.zzF = new zzabb[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzabb zzv = this.zzD.zzv(i2, 3);
            zzv.zzk((zzaf) this.zzd.get(i));
            this.zzF[i] = zzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzafw) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzagf.zza(zzzvVar);
    }

    public zzafx(int i, zzeu zzeuVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzacs();
        this.zzl = new zzen(16);
        this.zzf = new zzen(zzaar.zza);
        this.zzg = new zzen(5);
        this.zzh = new zzen();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzen(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzzx.zza;
        this.zzE = new zzabb[0];
        this.zzF = new zzabb[0];
    }
}
