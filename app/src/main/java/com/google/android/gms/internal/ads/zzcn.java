package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzcn {
    public static final zzcn zza = new zzci();
    private static final String zzc = zzew.zzP(0);
    private static final String zzd = zzew.zzP(1);
    private static final String zze = zzew.zzP(2);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzch
    };

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcn) {
            zzcn zzcnVar = (zzcn) obj;
            if (zzcnVar.zzc() == zzc() && zzcnVar.zzb() == zzb()) {
                zzcm zzcmVar = new zzcm();
                zzck zzckVar = new zzck();
                zzcm zzcmVar2 = new zzcm();
                zzck zzckVar2 = new zzck();
                for (int i = 0; i < zzc(); i++) {
                    if (!zze(i, zzcmVar, 0L).equals(zzcnVar.zze(i, zzcmVar2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < zzb(); i2++) {
                    if (!zzd(i2, zzckVar, true).equals(zzcnVar.zzd(i2, zzckVar2, true))) {
                        return false;
                    }
                }
                int zzg = zzg(true);
                if (zzg == zzcnVar.zzg(true) && (zzh = zzh(true)) == zzcnVar.zzh(true)) {
                    while (zzg != zzh) {
                        int zzj = zzj(zzg, 0, true);
                        if (zzj != zzcnVar.zzj(zzg, 0, true)) {
                            return false;
                        }
                        zzg = zzj;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zzcm zzcmVar = new zzcm();
        zzck zzckVar = new zzck();
        int zzc2 = zzc() + 217;
        for (int i = 0; i < zzc(); i++) {
            zzc2 = (zzc2 * 31) + zze(i, zzcmVar, 0L).hashCode();
        }
        int zzb2 = (zzc2 * 31) + zzb();
        for (int i2 = 0; i2 < zzb(); i2++) {
            zzb2 = (zzb2 * 31) + zzd(i2, zzckVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzck zzd(int i, zzck zzckVar, boolean z);

    public abstract zzcm zze(int i, zzcm zzcmVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzck zzckVar, zzcm zzcmVar, int i2, boolean z) {
        int i3 = zzd(i, zzckVar, false).zzd;
        if (zze(i3, zzcmVar, 0L).zzp == i) {
            int zzj = zzj(i3, i2, z);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzcmVar, 0L).zzo;
        }
        return i + 1;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == zzh(z) ? zzg(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzcm zzcmVar, zzck zzckVar, int i, long j) {
        Pair zzm = zzm(zzcmVar, zzckVar, i, j, 0L);
        Objects.requireNonNull(zzm);
        return zzm;
    }

    public final Pair zzm(zzcm zzcmVar, zzck zzckVar, int i, long j, long j2) {
        zzdl.zza(i, 0, zzc());
        zze(i, zzcmVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzcmVar.zzm;
            j = 0;
        }
        int i2 = zzcmVar.zzo;
        zzd(i2, zzckVar, false);
        while (i2 < zzcmVar.zzp) {
            long j4 = zzckVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzckVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzckVar, true);
        long j6 = zzckVar.zzf;
        long j7 = zzckVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzckVar.zzc;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzck zzn(Object obj, zzck zzckVar) {
        return zzd(zza(obj), zzckVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
