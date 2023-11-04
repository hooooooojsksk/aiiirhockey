package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzajl implements zzaax {
    private final zzaji zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzajl(zzaji zzajiVar, int i, long j, long j2) {
        this.zza = zzajiVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzajiVar.zzd;
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzew.zzw(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long zzr = zzew.zzr((this.zza.zzc * j) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j2 = this.zzc + (this.zza.zzd * zzr);
        long zza = zza(zzr);
        zzaay zzaayVar = new zzaay(zza, j2);
        if (zza >= j || zzr == this.zzd - 1) {
            return new zzaav(zzaayVar, zzaayVar);
        }
        long j3 = zzr + 1;
        return new zzaav(zzaayVar, new zzaay(zza(j3), this.zzc + (this.zza.zzd * j3)));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
