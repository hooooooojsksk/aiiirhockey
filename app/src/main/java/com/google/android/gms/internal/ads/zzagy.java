package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzagy {
    private zzabb zzb;
    private zzzx zzc;
    private zzagt zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzagr zza = new zzagr();
    private zzagv zzj = new zzagv();

    protected abstract long zza(zzen zzenVar);

    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzagv();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) throws IOException;

    public final int zze(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzb);
        int i = zzew.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzzvVar)) {
                long zzf = zzzvVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzaf zzafVar = this.zzj.zza;
                    this.zzi = zzafVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzafVar);
                        this.zzm = true;
                    }
                    zzagt zzagtVar = this.zzj.zzb;
                    if (zzagtVar != null) {
                        this.zzd = zzagtVar;
                    } else if (zzzvVar.zzd() == -1) {
                        this.zzd = new zzagx(null);
                    } else {
                        zzags zzb = this.zza.zzb();
                        this.zzd = new zzagm(this, this.zzf, zzzvVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzzvVar.zzf();
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzzk) zzzvVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd = this.zzd.zzd(zzzvVar);
            if (zzd >= 0) {
                zzaauVar.zza = zzd;
                return 1;
            }
            if (zzd < -1) {
                zzi(-(zzd + 2));
            }
            if (!this.zzl) {
                zzaax zze = this.zzd.zze();
                zzdl.zzb(zze);
                this.zzc.zzN(zze);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzzvVar)) {
                this.zzk = 0L;
                zzen zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j2 = this.zzg;
                    if (j2 + zza2 >= this.zze) {
                        long zzf2 = zzf(j2);
                        zzaaz.zzb(this.zzb, zza, zza.zzd());
                        this.zzb.zzs(zzf2, 1, zza.zzd(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    public final void zzh(zzzx zzzxVar, zzabb zzabbVar) {
        this.zzc = zzzxVar;
        this.zzb = zzabbVar;
        zzb(true);
    }

    public void zzi(long j) {
        this.zzg = j;
    }

    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzagt zzagtVar = this.zzd;
            int i = zzew.zza;
            zzagtVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
