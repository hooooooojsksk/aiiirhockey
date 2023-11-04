package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaik {
    private final zzahn zza;
    private final zzeu zzb;
    private final zzem zzc = new zzem(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaik(zzahn zzahnVar, zzeu zzeuVar) {
        this.zza = zzahnVar;
        this.zzb = zzeuVar;
    }

    public final void zza(zzen zzenVar) throws zzbu {
        long j;
        zzenVar.zzB(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzenVar.zzB(this.zzc.zza, 0, this.zzc.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzl(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzl(4);
                this.zzc.zzl(1);
                this.zzc.zzl(1);
                long zzd4 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb((this.zzc.zzd(15) << 15) | (this.zzc.zzd(3) << 30) | zzd4);
                this.zzf = true;
            }
            j = this.zzb.zzb((zzd << 30) | zzd2 | zzd3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzenVar);
        this.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
