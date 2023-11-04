package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzftl extends zzftk {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzftl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zza(zzfto zzftoVar) {
        return this.zzb.decrementAndGet(zzftoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final void zzb(zzfto zzftoVar, @CheckForNull Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.zza;
        while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, zzftoVar, null, set2) && atomicReferenceFieldUpdater.get(zzftoVar) == null) {
        }
    }
}
