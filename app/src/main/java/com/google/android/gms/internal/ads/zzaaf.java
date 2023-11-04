package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaaf implements zzaax {
    private final zzaah zza;
    private final long zzb;

    public zzaaf(zzaah zzaahVar, long j) {
        this.zza = zzaahVar;
        this.zzb = j;
    }

    private final zzaay zza(long j, long j2) {
        return new zzaay((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzdl.zzb(this.zza.zzk);
        zzaah zzaahVar = this.zza;
        zzaag zzaagVar = zzaahVar.zzk;
        long[] jArr = zzaagVar.zza;
        long[] jArr2 = zzaagVar.zzb;
        int zzd = zzew.zzd(jArr, zzaahVar.zzb(j), true, false);
        zzaay zza = zza(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zza.zzb == j || zzd == jArr.length - 1) {
            return new zzaav(zza, zza);
        }
        int i = zzd + 1;
        return new zzaav(zza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
