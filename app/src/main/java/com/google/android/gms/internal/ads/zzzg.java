package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzzg {
    protected final zzza zza;
    protected final zzzf zzb;
    protected zzzc zzc;
    private final int zzd;

    public zzzg(zzzd zzzdVar, zzzf zzzfVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzzfVar;
        this.zzd = i;
        this.zza = new zzza(zzzdVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzzv zzzvVar, long j, zzaau zzaauVar) {
        if (j == zzzvVar.zzf()) {
            return 0;
        }
        zzaauVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzzv zzzvVar, long j) throws IOException {
        long zzf = j - zzzvVar.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzzk) zzzvVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzzc zzzcVar = this.zzc;
            zzdl.zzb(zzzcVar);
            j = zzzcVar.zzf;
            j2 = zzzcVar.zzg;
            j3 = zzzcVar.zzh;
            if (j2 - j > this.zzd) {
                if (zzg(zzzvVar, j3)) {
                    zzzvVar.zzj();
                    zzzf zzzfVar = this.zzb;
                    j4 = zzzcVar.zzb;
                    zzze zza = zzzfVar.zza(zzzvVar, j4);
                    i = zza.zzb;
                    if (i == -3) {
                        zzc(false, j3);
                        return zzf(zzzvVar, j3, zzaauVar);
                    } else if (i == -2) {
                        j10 = zza.zzc;
                        j11 = zza.zzd;
                        zzzc.zzh(zzzcVar, j10, j11);
                    } else if (i == -1) {
                        j8 = zza.zzc;
                        j9 = zza.zzd;
                        zzzc.zzg(zzzcVar, j8, j9);
                    } else {
                        j5 = zza.zzd;
                        zzg(zzzvVar, j5);
                        j6 = zza.zzd;
                        zzc(true, j6);
                        j7 = zza.zzd;
                        return zzf(zzzvVar, j7, zzaauVar);
                    }
                } else {
                    return zzf(zzzvVar, j3, zzaauVar);
                }
            } else {
                zzc(false, j);
                return zzf(zzzvVar, j, zzaauVar);
            }
        }
    }

    public final zzaax zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzzc zzzcVar = this.zzc;
        if (zzzcVar != null) {
            j6 = zzzcVar.zza;
            if (j6 == j) {
                return;
            }
        }
        long zzf = this.zza.zzf(j);
        zzza zzzaVar = this.zza;
        j2 = zzzaVar.zzc;
        j3 = zzzaVar.zzd;
        j4 = zzzaVar.zze;
        j5 = zzzaVar.zzf;
        this.zzc = new zzzc(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
