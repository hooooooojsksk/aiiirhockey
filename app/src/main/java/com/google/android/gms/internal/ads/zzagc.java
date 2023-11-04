package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzagc implements zzzu, zzaax {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzafz
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzagc.zza;
            return new zzzu[]{new zzagc(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzen zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final ArrayDeque zzf;
    private final zzage zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzen zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzzx zzr;
    private zzagb[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzaef zzx;

    public zzagc() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzagj zzagjVar, long j) {
        int zza2 = zzagjVar.zza(j);
        return zza2 == -1 ? zzagjVar.zzb(j) : zza2;
    }

    private static long zzj(zzagj zzagjVar, long j, long j2) {
        int zzi = zzi(zzagjVar, j);
        return zzi == -1 ? j2 : Math.min(zzagjVar.zzc[zzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzbu {
        zzbq zzbqVar;
        zzbq zzbqVar2;
        long j2;
        List list;
        int i;
        int i2;
        zzbq zzbqVar3;
        long j3;
        int i3;
        while (!this.zzf.isEmpty() && ((zzafh) this.zzf.peek()).zza == j) {
            zzafh zzafhVar = (zzafh) this.zzf.pop();
            if (zzafhVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i4 = this.zzw;
                zzaaj zzaajVar = new zzaaj();
                zzafi zzb = zzafhVar.zzb(1969517665);
                if (zzb != null) {
                    Pair zza2 = zzafr.zza(zzb);
                    zzbq zzbqVar4 = (zzbq) zza2.first;
                    zzbq zzbqVar5 = (zzbq) zza2.second;
                    if (zzbqVar4 != null) {
                        zzaajVar.zzb(zzbqVar4);
                    }
                    zzbqVar = zzbqVar5;
                    zzbqVar2 = zzbqVar4;
                } else {
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                zzafh zza3 = zzafhVar.zza(1835365473);
                zzbq zzb2 = zza3 != null ? zzafr.zzb(zza3) : null;
                List zzc = zzafr.zzc(zzafhVar, zzaajVar, -9223372036854775807L, null, false, i4 == 1, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzaga
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        zzagg zzaggVar = (zzagg) obj;
                        zzaab zzaabVar = zzagc.zza;
                        return zzaggVar;
                    }
                });
                int size = zzc.size();
                long j4 = -9223372036854775807L;
                zzbq zzbqVar6 = zzbqVar;
                int i5 = -1;
                int i6 = 0;
                long j5 = -9223372036854775807L;
                while (true) {
                    j2 = 0;
                    if (i6 >= size) {
                        break;
                    }
                    zzagj zzagjVar = (zzagj) zzc.get(i6);
                    if (zzagjVar.zzb == 0) {
                        list = zzc;
                        i = size;
                        j3 = j4;
                        zzbqVar3 = zzbqVar6;
                    } else {
                        zzagg zzaggVar = zzagjVar.zza;
                        list = zzc;
                        i = size;
                        long j6 = zzaggVar.zze;
                        if (j6 == j4) {
                            j6 = zzagjVar.zzh;
                        }
                        long max = Math.max(j5, j6);
                        zzagb zzagbVar = new zzagb(zzaggVar, zzagjVar, this.zzr.zzv(i6, zzaggVar.zzb));
                        if ("audio/true-hd".equals(zzaggVar.zzf.zzm)) {
                            i2 = zzagjVar.zze * 16;
                        } else {
                            i2 = zzagjVar.zze + 30;
                        }
                        zzad zzb3 = zzaggVar.zzf.zzb();
                        zzb3.zzL(i2);
                        if (zzaggVar.zzb == 2 && j6 > 0 && (i3 = zzagjVar.zzb) > 1) {
                            zzb3.zzE(i3 / (((float) j6) / 1000000.0f));
                        }
                        int i7 = zzaggVar.zzb;
                        int i8 = zzafy.zzb;
                        if (i7 == 1 && zzaajVar.zza()) {
                            zzb3.zzC(zzaajVar.zza);
                            zzb3.zzD(zzaajVar.zzb);
                        }
                        int i9 = zzaggVar.zzb;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar6;
                        zzbqVarArr[1] = this.zzh.isEmpty() ? null : new zzbq(this.zzh);
                        zzbqVar3 = zzbqVar6;
                        zzbq zzbqVar7 = new zzbq(-9223372036854775807L, new zzbp[0]);
                        if (i9 == 1) {
                            if (zzbqVar2 != null) {
                                zzbqVar7 = zzbqVar2;
                            }
                        } else if (i9 == 2 && zzb2 != null) {
                            for (int i10 = 0; i10 < zzb2.zza(); i10++) {
                                zzbp zzb4 = zzb2.zzb(i10);
                                if (zzb4 instanceof zzaec) {
                                    zzaec zzaecVar = (zzaec) zzb4;
                                    if ("com.android.capture.fps".equals(zzaecVar.zza)) {
                                        zzbqVar7 = new zzbq(-9223372036854775807L, zzaecVar);
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                }
                            }
                        }
                        j3 = -9223372036854775807L;
                        for (int i11 = 0; i11 < 2; i11++) {
                            zzbqVar7 = zzbqVar7.zzd(zzbqVarArr[i11]);
                        }
                        if (zzbqVar7.zza() > 0) {
                            zzb3.zzM(zzbqVar7);
                        }
                        zzagbVar.zzc.zzk(zzb3.zzY());
                        if (zzaggVar.zzb == 2 && i5 == -1) {
                            i5 = arrayList.size();
                        }
                        arrayList.add(zzagbVar);
                        j5 = max;
                    }
                    i6++;
                    j4 = j3;
                    zzbqVar6 = zzbqVar3;
                    zzc = list;
                    size = i;
                }
                this.zzu = i5;
                this.zzv = j5;
                zzagb[] zzagbVarArr = (zzagb[]) arrayList.toArray(new zzagb[0]);
                this.zzs = zzagbVarArr;
                int length = zzagbVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < zzagbVarArr.length; i12++) {
                    jArr[i12] = new long[zzagbVarArr[i12].zzb.zzb];
                    jArr2[i12] = zzagbVarArr[i12].zzb.zzf[0];
                }
                int i13 = 0;
                while (i13 < zzagbVarArr.length) {
                    long j7 = LongCompanionObject.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < zzagbVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j8 = jArr2[i15];
                            if (j8 <= j7) {
                                i14 = i15;
                                j7 = j8;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j2;
                    zzagj zzagjVar2 = zzagbVarArr[i14].zzb;
                    j2 += zzagjVar2.zzd[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = zzagjVar2.zzf[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzC();
                this.zzr.zzN(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzafh) this.zzf.peek()).zzc(zzafhVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzr = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        zzagb[] zzagbVarArr;
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzagb zzagbVar : this.zzs) {
            zzagj zzagjVar = zzagbVar.zzb;
            int zza2 = zzagjVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzagjVar.zzb(j2);
            }
            zzagbVar.zze = zza2;
            zzabc zzabcVar = zzagbVar.zzd;
            if (zzabcVar != null) {
                zzabcVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzagf.zzb(zzzvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzagb[] zzagbVarArr = this.zzs;
        if (zzagbVarArr.length == 0) {
            zzaay zzaayVar = zzaay.zza;
            return new zzaav(zzaayVar, zzaayVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzagj zzagjVar = zzagbVarArr[i].zzb;
            int zzi = zzi(zzagjVar, j);
            if (zzi == -1) {
                zzaay zzaayVar2 = zzaay.zza;
                return new zzaav(zzaayVar2, zzaayVar2);
            }
            long j5 = zzagjVar.zzf[zzi];
            j2 = zzagjVar.zzc[zzi];
            if (j5 >= j || zzi >= zzagjVar.zzb - 1 || (zzb = zzagjVar.zzb(j)) == -1 || zzb == zzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzagjVar.zzf[zzb];
                j4 = zzagjVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = LongCompanionObject.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzagb[] zzagbVarArr2 = this.zzs;
            if (i2 >= zzagbVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzagj zzagjVar2 = zzagbVarArr2[i2].zzb;
                long zzj = zzj(zzagjVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzagjVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzaay zzaayVar3 = new zzaay(j, j2);
        return j3 == -9223372036854775807L ? new zzaav(zzaayVar3, zzaayVar3) : new zzaav(zzaayVar3, new zzaay(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }

    public zzagc(int i) {
        this.zzi = 0;
        this.zzg = new zzage();
        this.zzh = new ArrayList();
        this.zze = new zzen(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzen(zzaar.zza);
        this.zzc = new zzen(4);
        this.zzd = new zzen();
        this.zzn = -1;
        this.zzr = zzzx.zza;
        this.zzs = new zzagb[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:465:0x037d, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:305:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0085 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r33, com.google.android.gms.internal.ads.zzaau r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }
}
