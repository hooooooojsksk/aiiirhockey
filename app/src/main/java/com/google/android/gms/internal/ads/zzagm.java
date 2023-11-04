package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzagm implements zzagt {
    private final zzags zza;
    private final long zzb;
    private final long zzc;
    private final zzagy zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzagm(zzagy zzagyVar, long j, long j2, long j3, long j4, boolean z) {
        zzdl.zzd(j >= 0 && j2 > j);
        this.zzd = zzagyVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzags();
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final /* bridge */ /* synthetic */ zzaax zze() {
        if (this.zzf != 0) {
            return new zzagl(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final void zzg(long j) {
        this.zzh = zzew.zzr(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzagt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzzv r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagm.zzd(com.google.android.gms.internal.ads.zzzv):long");
    }
}
