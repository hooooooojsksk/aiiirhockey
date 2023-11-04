package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzhf implements zzjp {
    private final zzwt zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzhf() {
        zzwt zzwtVar = new zzwt(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzwtVar;
        this.zzb = zzew.zzv(50000L);
        this.zzc = zzew.zzv(50000L);
        this.zzd = zzew.zzv(2500L);
        this.zze = zzew.zzv(5000L);
        this.zzg = 13107200;
        this.zzf = zzew.zzv(0L);
    }

    private static void zzj(int i, int i2, String str, String str2) {
        zzdl.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zze(zzkn[] zzknVarArr, zzur zzurVar, zzwe[] zzweVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzknVarArr.length;
            if (i < 2) {
                if (zzweVarArr[i] != null) {
                    i2 += zzknVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final boolean zzg(long j, long j2, float f) {
        int zza = this.zza.zza();
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int i2 = this.zzg;
        long j3 = this.zzb;
        if (i > 0) {
            j3 = Math.min(zzew.zzs(j3, f), this.zzc);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = zza < i2;
            this.zzh = z;
            if (!z && j2 < 500000) {
                zzee.zze("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || zza >= i2) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long zzu = zzew.zzu(j, f);
        long j3 = z ? this.zze : this.zzd;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzu >= j3 || this.zza.zza() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final zzwt zzi() {
        return this.zza;
    }
}
