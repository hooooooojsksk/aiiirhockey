package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzzj implements zzaax {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzzj(long j, long j2, int i, int i2, boolean z) {
        long zzb;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            zzb = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzb = zzb(j, j2, i);
        }
        this.zzf = zzb;
    }

    private static long zzb(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public final long zza(long j) {
        return zzb(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long j2 = this.zzd;
        if (j2 != -1) {
            long j3 = this.zzc;
            long j4 = (((this.zze * j) / 8000000) / j3) * j3;
            if (j2 != -1) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.zzb + Math.max(j4, 0L);
            long zza = zza(max);
            zzaay zzaayVar = new zzaay(zza, max);
            if (this.zzd != -1 && zza < j) {
                long j5 = max + this.zzc;
                if (j5 < this.zza) {
                    return new zzaav(zzaayVar, new zzaay(zza(j5), j5));
                }
            }
            return new zzaav(zzaayVar, zzaayVar);
        }
        zzaay zzaayVar2 = new zzaay(0L, this.zzb);
        return new zzaav(zzaayVar2, zzaayVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
