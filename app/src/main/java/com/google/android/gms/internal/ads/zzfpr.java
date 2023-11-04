package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzfpr extends AbstractSet {
    final /* synthetic */ zzfpu zza;

    public zzfpr(zzfpu zzfpuVar) {
        this.zza = zzfpuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfpu zzfpuVar = this.zza;
        Map zzj = zzfpuVar.zzj();
        if (zzj != null) {
            return zzj.keySet().iterator();
        }
        return new zzfpm(zzfpuVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object zzr;
        Object obj2;
        Map zzj = this.zza.zzj();
        if (zzj == null) {
            zzr = this.zza.zzr(obj);
            obj2 = zzfpu.zzd;
            return zzr != obj2;
        }
        return zzj.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
