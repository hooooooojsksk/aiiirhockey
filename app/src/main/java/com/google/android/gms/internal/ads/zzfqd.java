package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzfqd extends zzfqe {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    public zzfqd(int i) {
        this.zza = new Object[i];
    }

    private final void zzf(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zze(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    public /* bridge */ /* synthetic */ zzfqe zzb(Object obj) {
        throw null;
    }

    public final zzfqe zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(this.zzb + collection.size());
            if (collection instanceof zzfqf) {
                this.zzb = ((zzfqf) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i) {
        zzfrr.zzb(objArr, 2);
        zzf(this.zzb + 2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzfqd zza(Object obj) {
        Objects.requireNonNull(obj);
        zzf(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
