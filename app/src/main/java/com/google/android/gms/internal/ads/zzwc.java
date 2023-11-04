package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzwc extends zzwh {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfrs zzc = zzfrs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzvi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwc.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    private static final zzfrs zzd = zzfrs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzvj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwc.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzvq zzg;
    private zzvv zzh;
    private zzk zzi;
    private final zzux zzj;

    @Deprecated
    public zzwc() {
        zzvq zzvqVar = zzvq.zzD;
        throw null;
    }

    public static int zza(zzaf zzafVar, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzafVar.zzd)) {
            String zzf = zzf(str);
            String zzf2 = zzf(zzafVar.zzd);
            if (zzf2 == null || zzf == null) {
                return (z && zzf2 == null) ? 1 : 0;
            } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
                return 3;
            } else {
                return zzew.zzai(zzf2, "-")[0].equals(zzew.zzai(zzf, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    public static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0053, code lost:
        if (r1 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0089, code lost:
        if (r8.zzh.zzd(r8.zzi, r9) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzwc r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzvq r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzP     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = 1
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwc.zzk(com.google.android.gms.internal.ads.zzwc, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    public static boolean zzm(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzs(zzur zzurVar, zzcu zzcuVar, Map map) {
        for (int i = 0; i < zzurVar.zzc; i++) {
            if (((zzcr) zzcuVar.zzB.get(zzurVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    public final void zzt() {
        boolean z;
        zzvv zzvvVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzP && !this.zzf && zzew.zza >= 32 && (zzvvVar = this.zzh) != null && zzvvVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzr();
        }
    }

    private static final Pair zzu(int i, zzwg zzwgVar, int[][][] iArr, zzvx zzvxVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzwg zzwgVar2 = zzwgVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzwgVar2.zzc(i2)) {
                zzur zzd2 = zzwgVar2.zzd(i2);
                for (int i3 = 0; i3 < zzd2.zzc; i3++) {
                    zzcp zzb2 = zzd2.zzb(i3);
                    List zza = zzvxVar.zza(i2, zzb2, iArr[i2][i3]);
                    int i4 = zzb2.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (true) {
                        int i7 = zzb2.zzb;
                        if (i6 <= 0) {
                            zzvy zzvyVar = (zzvy) zza.get(i6);
                            int zzb3 = zzvyVar.zzb();
                            if (!zArr[i6] && zzb3 != 0) {
                                if (zzb3 == i5) {
                                    randomAccess = zzfqk.zzp(zzvyVar);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(zzvyVar);
                                    int i8 = i6 + 1;
                                    while (true) {
                                        int i9 = zzb2.zzb;
                                        if (i8 > 0) {
                                            break;
                                        }
                                        zzvy zzvyVar2 = (zzvy) zza.get(i8);
                                        if (zzvyVar2.zzb() == 2 && zzvyVar.zzc(zzvyVar2)) {
                                            arrayList2.add(zzvyVar2);
                                            zArr[i8] = true;
                                        }
                                        i8++;
                                    }
                                    randomAccess = arrayList2;
                                }
                                arrayList.add(randomAccess);
                            }
                            i6++;
                            i5 = 1;
                        }
                    }
                }
            }
            i2++;
            zzwgVar2 = zzwgVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((zzvy) list.get(i10)).zzc;
        }
        zzvy zzvyVar3 = (zzvy) list.get(0);
        return Pair.create(new zzwd(zzvyVar3.zzb, iArr2, 0), Integer.valueOf(zzvyVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    protected final Pair zzb(zzwg zzwgVar, int[][][] iArr, final int[] iArr2, zzss zzssVar, zzcn zzcnVar) throws zzhj {
        final zzvq zzvqVar;
        int i;
        final boolean z;
        int[] iArr3;
        int length;
        zzwe zza;
        zzvv zzvvVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzvqVar = this.zzg;
            if (zzvqVar.zzP && zzew.zza >= 32 && (zzvvVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzdl.zzb(myLooper);
                zzvvVar.zzb(this, myLooper);
            }
        }
        int i2 = 2;
        zzwd[] zzwdVarArr = new zzwd[2];
        Pair zzu = zzu(2, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzvx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r17, com.google.android.gms.internal.ads.zzcp r18, int[] r19) {
                /*
                    Method dump skipped, instructions count: 191
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zza(int, com.google.android.gms.internal.ads.zzcp, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfpz.zzj().zzc((zzwb) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                }), (zzwb) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzwb) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                }), (zzwb) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                }).zza();
            }
        });
        if (zzu != null) {
            zzwdVarArr[((Integer) zzu.second).intValue()] = (zzwd) zzu.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            } else if (zzwgVar.zzc(i3) == 2 && zzwgVar.zzd(i3).zzc > 0) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        Pair zzu2 = zzu(1, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // com.google.android.gms.internal.ads.zzvx
            public final List zza(int i4, zzcp zzcpVar, int[] iArr5) {
                final zzwc zzwcVar = zzwc.this;
                zzvq zzvqVar2 = zzvqVar;
                boolean z2 = z;
                zzfnv zzfnvVar = new zzfnv() { // from class: com.google.android.gms.internal.ads.zzvb
                    @Override // com.google.android.gms.internal.ads.zzfnv
                    public final boolean zza(Object obj) {
                        return zzwc.zzk(zzwc.this, (zzaf) obj);
                    }
                };
                zzfqh zzi = zzfqk.zzi();
                int i5 = 0;
                while (true) {
                    int i6 = zzcpVar.zzb;
                    if (i5 <= 0) {
                        zzi.zzf(new zzvk(i4, zzcpVar, i5, zzvqVar2, iArr5[i5], z2, zzfnvVar));
                        i5++;
                    } else {
                        return zzi.zzi();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzvk) Collections.max((List) obj)).compareTo((zzvk) Collections.max((List) obj2));
            }
        });
        if (zzu2 != null) {
            zzwdVarArr[((Integer) zzu2.second).intValue()] = (zzwd) zzu2.first;
        }
        final String str = zzu2 == null ? null : ((zzwd) zzu2.first).zza.zzb(((zzwd) zzu2.first).zzb[0]).zzd;
        int i4 = 3;
        Pair zzu3 = zzu(3, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzvg
            @Override // com.google.android.gms.internal.ads.zzvx
            public final List zza(int i5, zzcp zzcpVar, int[] iArr5) {
                zzvq zzvqVar2 = zzvq.this;
                String str2 = str;
                int i6 = zzwc.zzb;
                zzfqh zzi = zzfqk.zzi();
                int i7 = 0;
                while (true) {
                    int i8 = zzcpVar.zzb;
                    if (i7 <= 0) {
                        zzi.zzf(new zzvw(i5, zzcpVar, i7, zzvqVar2, iArr5[i7], str2));
                        i7++;
                    } else {
                        return zzi.zzi();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzvw) ((List) obj).get(0)).compareTo((zzvw) ((List) obj2).get(0));
            }
        });
        if (zzu3 != null) {
            zzwdVarArr[((Integer) zzu3.second).intValue()] = (zzwd) zzu3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int zzc2 = zzwgVar.zzc(i5);
            if (zzc2 != i2 && zzc2 != i && zzc2 != i4) {
                zzur zzd2 = zzwgVar.zzd(i5);
                int[][] iArr5 = iArr4[i5];
                int i6 = 0;
                zzcp zzcpVar = null;
                int i7 = 0;
                zzvl zzvlVar = null;
                while (i6 < zzd2.zzc) {
                    zzcp zzb2 = zzd2.zzb(i6);
                    int[] iArr6 = iArr5[i6];
                    zzvl zzvlVar2 = zzvlVar;
                    int i8 = 0;
                    while (true) {
                        int i9 = zzb2.zzb;
                        if (i8 <= 0) {
                            if (zzm(iArr6[i8], zzvqVar.zzQ)) {
                                zzvl zzvlVar3 = new zzvl(zzb2.zzb(i8), iArr6[i8]);
                                if (zzvlVar2 == null || zzvlVar3.compareTo(zzvlVar2) > 0) {
                                    i7 = i8;
                                    zzvlVar2 = zzvlVar3;
                                    zzcpVar = zzb2;
                                }
                            }
                            i8++;
                        }
                    }
                    i6++;
                    zzvlVar = zzvlVar2;
                }
                zzwdVarArr[i5] = zzcpVar == null ? null : new zzwd(zzcpVar, new int[]{i7}, 0);
            }
            i5++;
            iArr4 = iArr;
            i2 = 2;
            i = 1;
            i4 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzs(zzwgVar.zzd(i10), zzvqVar, hashMap);
        }
        zzs(zzwgVar.zze(), zzvqVar, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzcr) hashMap.get(Integer.valueOf(zzwgVar.zzc(i11)))) != null) {
                throw null;
            }
        }
        int[] iArr7 = null;
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            zzur zzd3 = zzwgVar.zzd(i12);
            if (zzvqVar.zzg(i12, zzd3)) {
                zzwdVarArr[i12] = (zzvqVar.zze(i12, zzd3) == null || iArr7.length == 0) ? null : new zzwd(zzd3.zzb(0), iArr7, 0);
            }
            i12++;
            iArr7 = null;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int zzc3 = zzwgVar.zzc(i14);
            if (zzvqVar.zzf(i14) || zzvqVar.zzC.contains(Integer.valueOf(zzc3))) {
                zzwdVarArr[i14] = null;
            }
            i14++;
        }
        zzux zzuxVar = this.zzj;
        zzws zzp = zzp();
        zzfqk zzf = zzuy.zzf(zzwdVarArr);
        int i16 = 2;
        zzwe[] zzweVarArr = new zzwe[2];
        int i17 = 0;
        while (i17 < i16) {
            zzwd zzwdVar = zzwdVarArr[i17];
            if (zzwdVar != null && (length = (iArr3 = zzwdVar.zzb).length) != 0) {
                if (length == 1) {
                    zza = new zzwf(zzwdVar.zza, iArr3[0], 0, 0, null);
                } else {
                    zza = zzuxVar.zza(zzwdVar.zza, iArr3, 0, zzp, (zzfqk) zzf.get(i17));
                }
                zzweVarArr[i17] = zza;
            }
            i17++;
            i16 = 2;
        }
        zzkp[] zzkpVarArr = new zzkp[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            zzkpVarArr[i18] = (zzvqVar.zzf(i18) || zzvqVar.zzC.contains(Integer.valueOf(zzwgVar.zzc(i18))) || (zzwgVar.zzc(i18) != -2 && zzweVarArr[i18] == null)) ? null : zzkp.zza;
        }
        boolean z2 = zzvqVar.zzR;
        return Pair.create(zzkpVarArr, zzweVarArr);
    }

    public final zzvq zzc() {
        zzvq zzvqVar;
        synchronized (this.zze) {
            zzvqVar = this.zzg;
        }
        return zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzh() {
        zzvv zzvvVar;
        synchronized (this.zze) {
            if (zzew.zza >= 32 && (zzvvVar = this.zzh) != null) {
                zzvvVar.zzc();
            }
        }
        super.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzi(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzt();
        }
    }

    public final void zzj(zzvo zzvoVar) {
        boolean z;
        zzvq zzvqVar = new zzvq(zzvoVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzvqVar);
            this.zzg = zzvqVar;
        }
        if (z) {
            if (zzvqVar.zzP && this.zza == null) {
                zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zzl() {
        return true;
    }

    public zzwc(Context context) {
        zzux zzuxVar = new zzux();
        zzvq zzd2 = zzvq.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzuxVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzew.zzY(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzew.zza >= 32) {
            this.zzh = zzvv.zza(context);
        }
        if (this.zzg.zzP && context == null) {
            zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
