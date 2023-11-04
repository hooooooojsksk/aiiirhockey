package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgth {
    private static final zzgth zza = new zzgth(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgth() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgth(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgth zzc() {
        return zza;
    }

    public static zzgth zze(zzgth zzgthVar, zzgth zzgthVar2) {
        int i = zzgthVar.zzb + zzgthVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgthVar.zzc, i);
        System.arraycopy(zzgthVar2.zzc, 0, copyOf, zzgthVar.zzb, zzgthVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgthVar.zzd, i);
        System.arraycopy(zzgthVar2.zzd, 0, copyOf2, zzgthVar.zzb, zzgthVar2.zzb);
        return new zzgth(i, copyOf, copyOf2, true);
    }

    public static zzgth zzf() {
        return new zzgth(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgth)) {
            zzgth zzgthVar = (zzgth) obj;
            int i = this.zzb;
            if (i == zzgthVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgthVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgthVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    public final int zza() {
        int zzF;
        int zzE;
        int i;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzgpt.zzE(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int i8 = zzgpt.zzf;
                        int zzd = ((zzgpe) this.zzd[i4]).zzd();
                        i = zzgpt.zzE(i6 << 3) + zzgpt.zzE(zzd) + zzd;
                    } else if (i7 == 3) {
                        int zzD = zzgpt.zzD(i6);
                        zzF = ((zzgth) this.zzd[i4]).zza();
                        zzE = zzD + zzD;
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        i = zzgpt.zzE(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzgqy.zza());
                    }
                    i3 += i;
                } else {
                    int i9 = i6 << 3;
                    zzF = zzgpt.zzF(((Long) this.zzd[i4]).longValue());
                    zzE = zzgpt.zzE(i9);
                }
                i = zzE + zzF;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = zzgpt.zzf;
                int zzd = ((zzgpe) this.zzd[i3]).zzd();
                int zzE = zzgpt.zzE(zzd) + zzd;
                int zzE2 = zzgpt.zzE(16);
                int zzE3 = zzgpt.zzE(this.zzc[i3] >>> 3);
                int zzE4 = zzgpt.zzE(8);
                i2 += zzE4 + zzE4 + zzE2 + zzE3 + zzgpt.zzE(24) + zzE;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final zzgth zzd(zzgth zzgthVar) {
        if (zzgthVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgthVar.zzb;
        zzl(i);
        System.arraycopy(zzgthVar.zzc, 0, this.zzc, this.zzb, zzgthVar.zzb);
        System.arraycopy(zzgthVar.zzd, 0, this.zzd, this.zzb, zzgthVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        this.zzf = false;
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgry.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgpu zzgpuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgpuVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgpuVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgpuVar.zzd(i4, (zzgpe) obj);
                } else if (i3 == 3) {
                    zzgpuVar.zzE(i4);
                    ((zzgth) obj).zzk(zzgpuVar);
                    zzgpuVar.zzh(i4);
                } else if (i3 == 5) {
                    zzgpuVar.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzgqy.zza());
                }
            }
        }
    }
}
