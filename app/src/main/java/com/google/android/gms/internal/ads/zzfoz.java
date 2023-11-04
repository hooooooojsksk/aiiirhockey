package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public class zzfoz extends zzfos implements SortedMap {
    @CheckForNull
    SortedSet zzd;
    final /* synthetic */ zzfpf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoz(zzfpf zzfpfVar, SortedMap sortedMap) {
        super(zzfpfVar, sortedMap);
        this.zze = zzfpfVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfoz(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfoz(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfoz(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfpa(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfos, com.google.android.gms.internal.ads.zzfre, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zze = zze();
            this.zzd = zze;
            return zze;
        }
        return sortedSet;
    }
}
