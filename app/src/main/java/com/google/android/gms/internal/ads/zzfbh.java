package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfbh {
    private final long zza;
    private long zzc;
    private final zzfbg zzb = new zzfbg();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfbh() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfbg zzd() {
        zzfbg clone = this.zzb.clone();
        zzfbg zzfbgVar = this.zzb;
        zzfbgVar.zza = false;
        zzfbgVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
