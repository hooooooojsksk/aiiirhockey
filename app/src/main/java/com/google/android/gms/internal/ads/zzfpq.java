package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
abstract class zzfpq implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfpu zze;

    public /* synthetic */ zzfpq(zzfpu zzfpuVar, zzfpm zzfpmVar) {
        int i;
        this.zze = zzfpuVar;
        i = zzfpuVar.zzf;
        this.zzb = i;
        this.zzc = zzfpuVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfnu.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfpu zzfpuVar = this.zze;
        int i = this.zzd;
        Object[] objArr = zzfpuVar.zzb;
        objArr.getClass();
        zzfpuVar.remove(objArr[i]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
