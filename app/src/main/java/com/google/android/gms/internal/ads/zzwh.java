package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzwh extends zzwk {
    private zzwg zza;

    protected abstract Pair zzb(zzwg zzwgVar, int[][][] iArr, int[] iArr2, zzss zzssVar, zzcn zzcnVar) throws zzhj;

    @Override // com.google.android.gms.internal.ads.zzwk
    public final zzwl zzn(zzko[] zzkoVarArr, zzur zzurVar, zzss zzssVar, zzcn zzcnVar) throws zzhj {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpVarArr = new zzcp[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzurVar.zzc;
            zzcpVarArr[i] = new zzcp[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzkoVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzurVar.zzc) {
            zzcp zzb = zzurVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzko zzkoVar = zzkoVarArr[i7];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = zzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    i11 = Math.max(i11, zzkoVar.zzO(zzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (i11 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i11;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                int i13 = zzb.zzb;
                iArr = new int[1];
            } else {
                zzko zzkoVar2 = zzkoVarArr[i8];
                int i14 = zzb.zzb;
                int[] iArr5 = new int[1];
                int i15 = 0;
                while (true) {
                    int i16 = zzb.zzb;
                    if (i15 > 0) {
                        break;
                    }
                    iArr5[i15] = zzkoVar2.zzO(zzb.zzb(i15));
                    i15++;
                }
                iArr = iArr5;
            }
            int i17 = iArr2[i8];
            zzcpVarArr[i8][i17] = zzb;
            iArr3[i8][i17] = iArr;
            iArr2[i8] = i17 + 1;
            i5++;
            i3 = 2;
        }
        zzur[] zzurVarArr = new zzur[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i18 = 0;
        while (i18 < i3) {
            int i19 = iArr2[i18];
            zzurVarArr[i18] = new zzur((zzcp[]) zzew.zzaf(zzcpVarArr[i18], i19));
            iArr3[i18] = (int[][]) zzew.zzaf(iArr3[i18], i19);
            strArr[i18] = zzkoVarArr[i18].zzK();
            iArr6[i18] = zzkoVarArr[i18].zzb();
            i18++;
            i3 = 2;
        }
        zzwg zzwgVar = new zzwg(strArr, iArr6, zzurVarArr, iArr4, iArr3, new zzur((zzcp[]) zzew.zzaf(zzcpVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzwgVar, iArr3, iArr4, zzssVar, zzcnVar);
        zzwi[] zzwiVarArr = (zzwi[]) zzb2.second;
        List[] listArr = new List[zzwiVarArr.length];
        for (int i20 = 0; i20 < zzwiVarArr.length; i20++) {
            zzwi zzwiVar = zzwiVarArr[i20];
            listArr[i20] = zzwiVar != null ? zzfqk.zzp(zzwiVar) : zzfqk.zzo();
        }
        zzfqh zzfqhVar = new zzfqh();
        for (int i21 = 0; i21 < 2; i21++) {
            zzur zzd = zzwgVar.zzd(i21);
            List list = listArr[i21];
            for (int i22 = 0; i22 < zzd.zzc; i22++) {
                zzcp zzb3 = zzd.zzb(i22);
                boolean z4 = zzwgVar.zza(i21, i22, false) != 0;
                int i23 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i24 = 0;
                while (true) {
                    int i25 = zzb3.zzb;
                    if (i24 <= 0) {
                        iArr7[i24] = zzwgVar.zzb(i21, i22, i24) & 7;
                        int i26 = 0;
                        while (true) {
                            if (i26 >= list.size()) {
                                z = false;
                                break;
                            }
                            zzwi zzwiVar2 = (zzwi) list.get(i26);
                            if (zzwiVar2.zze().equals(zzb3) && zzwiVar2.zzb(i24) != -1) {
                                z = true;
                                break;
                            }
                            i26++;
                        }
                        zArr[i24] = z;
                        i24++;
                    }
                }
                zzfqhVar.zzf(new zzcx(zzb3, z4, iArr7, zArr));
            }
        }
        zzur zze = zzwgVar.zze();
        for (int i27 = 0; i27 < zze.zzc; i27++) {
            zzcp zzb4 = zze.zzb(i27);
            int i28 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i29 = zzb4.zzb;
            zzfqhVar.zzf(new zzcx(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzwl((zzkp[]) zzb2.first, (zzwe[]) zzb2.second, new zzcy(zzfqhVar.zzi()), zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzo(Object obj) {
        this.zza = (zzwg) obj;
    }
}
