package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfqo extends zzfqd {
    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfqo() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfqd, com.google.android.gms.internal.ads.zzfqe
    public final /* bridge */ /* synthetic */ zzfqe zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfqo zzg(Iterable iterable) {
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zzf(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public zzfqo(int i) {
        super(i);
        this.zzd = new Object[zzfqp.zzh(i)];
    }

    public final zzfqp zzh() {
        zzfqp zzs;
        boolean zzt;
        int i = this.zzb;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.zza[0];
                obj.getClass();
                return new zzfsg(obj);
            }
            if (this.zzd == null || zzfqp.zzh(i) != this.zzd.length) {
                zzs = zzfqp.zzs(this.zzb, this.zza);
                this.zzb = zzs.size();
            } else {
                int i2 = this.zzb;
                Object[] objArr = this.zza;
                zzt = zzfqp.zzt(i2, objArr.length);
                if (zzt) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.zze;
                Object[] objArr2 = this.zzd;
                zzs = new zzfrz(objArr, i3, objArr2, objArr2.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzs;
        }
        return zzfrz.zza;
    }

    public final zzfqo zzf(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfqp.zzh(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (zzh <= length) {
                objArr.getClass();
                int hashCode = obj.hashCode();
                int zza = zzfqc.zza(hashCode);
                while (true) {
                    Object[] objArr2 = this.zzd;
                    int i = zza & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
