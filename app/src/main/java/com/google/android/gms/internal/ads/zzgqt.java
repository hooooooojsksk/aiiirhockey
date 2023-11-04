package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgqt extends AbstractList {
    private final List zza;
    private final zzgqs zzb;

    public zzgqt(List list, zzgqs zzgqsVar) {
        this.zza = list;
        this.zzb = zzgqsVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzaxc zzb = zzaxc.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb == null ? zzaxc.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
