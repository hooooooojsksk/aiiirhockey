package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaan {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        boolean zzm;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        zzm = zzaao.zzm(i);
        if (!zzm || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i2;
        strArr = zzaao.zza;
        this.zzb = strArr[3 - i3];
        iArr = zzaao.zzb;
        int i8 = iArr[i5];
        this.zzd = i8;
        if (i2 == 2) {
            i8 /= 2;
            this.zzd = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.zzd = i8;
        }
        int i9 = (i >>> 9) & 1;
        zzl = zzaao.zzl(i2, i3);
        this.zzg = zzl;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = zzaao.zzc;
                i7 = iArr6[i4 - 1];
            } else {
                iArr5 = zzaao.zzd;
                i7 = iArr5[i4 - 1];
            }
            this.zzf = i7;
            this.zzc = (((i7 * 12) / i8) + i9) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = zzaao.zze;
                    i6 = iArr4[i4 - 1];
                } else {
                    iArr3 = zzaao.zzf;
                    i6 = iArr3[i4 - 1];
                }
                this.zzf = i6;
                this.zzc = ((i6 * 144) / i8) + i9;
            } else {
                iArr2 = zzaao.zzg;
                int i10 = iArr2[i4 - 1];
                this.zzf = i10;
                this.zzc = (((i3 == 1 ? 72 : 144) * i10) / i8) + i9;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
