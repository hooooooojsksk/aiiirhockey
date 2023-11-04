package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzafg implements zzafe {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzafg(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzafg zza(long j, long j2, zzaan zzaanVar, zzen zzenVar) {
        int zzn;
        int i = zzaanVar.zzg;
        int i2 = zzaanVar.zzd;
        int zze = zzenVar.zze();
        if ((zze & 1) != 1 || (zzn = zzenVar.zzn()) == 0) {
            return null;
        }
        int i3 = zze & 6;
        long zzw = zzew.zzw(zzn, i * 1000000, i2);
        if (i3 != 6) {
            return new zzafg(j2, zzaanVar.zzc, zzw, -1L, null);
        }
        long zzs = zzenVar.zzs();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = zzenVar.zzk();
        }
        if (j != -1) {
            long j3 = j2 + zzs;
            if (j != j3) {
                zzee.zze("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new zzafg(j2, zzaanVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzc(long j) {
        double d;
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzdl.zzb(this.zzf);
        double d2 = j2;
        long j3 = this.zzd;
        Double.isNaN(d2);
        double d3 = j3;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int zzd = zzew.zzd(jArr, (long) d4, true, true);
        long zzd2 = zzd(zzd);
        long j4 = jArr[zzd];
        int i = zzd + 1;
        long zzd3 = zzd(i);
        long j5 = zzd == 99 ? 256L : jArr[i];
        if (j4 == j5) {
            d = 0.0d;
        } else {
            double d5 = j4;
            Double.isNaN(d5);
            double d6 = j5 - j4;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = zzd3 - zzd2;
        Double.isNaN(d7);
        return zzd2 + Math.round(d * d7);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long[] jArr;
        if (!zzh()) {
            zzaay zzaayVar = new zzaay(0L, this.zza + this.zzb);
            return new zzaav(zzaayVar, zzaayVar);
        }
        long zzr = zzew.zzr(j, 0L, this.zzc);
        double d = zzr;
        long j2 = this.zzc;
        Double.isNaN(d);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                double d5 = ((long[]) zzdl.zzb(this.zzf))[i];
                double d6 = i == 99 ? 256.0d : jArr[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.zzd;
        Double.isNaN(d8);
        zzaay zzaayVar2 = new zzaay(zzr, this.zza + zzew.zzr(Math.round((d4 / 256.0d) * d8), this.zzb, this.zzd - 1));
        return new zzaav(zzaayVar2, zzaayVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return this.zzf != null;
    }
}
