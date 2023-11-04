package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfsg extends zzfqp {
    final transient Object zza;

    public zzfsg(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfqs(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, com.google.android.gms.internal.ads.zzfqf
    public final zzfqk zzd() {
        return zzfqk.zzp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, com.google.android.gms.internal.ads.zzfqf
    public final zzfsj zze() {
        return new zzfqs(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final boolean zzf() {
        throw null;
    }
}
