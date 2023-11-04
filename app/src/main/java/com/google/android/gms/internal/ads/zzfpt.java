package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfpt extends AbstractCollection {
    final /* synthetic */ zzfpu zza;

    public zzfpt(zzfpu zzfpuVar) {
        this.zza = zzfpuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfpu zzfpuVar = this.zza;
        Map zzj = zzfpuVar.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new zzfpo(zzfpuVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
