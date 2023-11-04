package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgs extends zzcn {
    private final int zzc;
    private final zzum zzd;

    public zzgs(boolean z, zzum zzumVar, byte[] bArr) {
        this.zzd = zzumVar;
        this.zzc = zzumVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzd.zzd(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
                return -1;
            }
            return zzs(zzp) + zza;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzckVar, z);
        zzckVar.zzd += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzckVar.zzc;
            Objects.requireNonNull(obj);
            zzckVar.zzc = Pair.create(zzv, obj);
        }
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzcmVar, j);
        Object zzv = zzv(zzr);
        if (!zzcm.zza.equals(zzcmVar.zzc)) {
            zzv = Pair.create(zzv, zzcmVar.zzc);
        }
        zzcmVar.zzc = zzv;
        zzcmVar.zzo += zzs;
        zzcmVar.zzp += zzs;
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzg(boolean z) {
        if (this.zzc == 0) {
            return -1;
        }
        int zza = z ? this.zzd.zza() : 0;
        while (zzu(zza).zzo()) {
            zza = zzw(zza, z);
            if (zza == -1) {
                return -1;
            }
        }
        return zzt(zza) + zzu(zza).zzg(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i == 0) {
            return -1;
        }
        int zzb = z ? this.zzd.zzb() : i - 1;
        while (zzu(zzb).zzo()) {
            zzb = zzx(zzb, z);
            if (zzb == -1) {
                return -1;
            }
        }
        return zzt(zzb) + zzu(zzb).zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzj(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i - zzt, i2 == 2 ? 0 : i2, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzk(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzn(Object obj, zzck zzckVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzckVar);
        zzckVar.zzd += zzt;
        zzckVar.zzc = obj;
        return zzckVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzcn zzu(int i);

    protected abstract Object zzv(int i);
}
