package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public class zzfpe extends zzfpc implements List {
    final /* synthetic */ zzfpf zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpe(zzfpf zzfpfVar, Object obj, @CheckForNull List list, zzfpc zzfpcVar) {
        super(zzfpfVar, obj, list, zzfpcVar);
        this.zzf = zzfpfVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfpf.zzd(this.zzf);
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (addAll) {
            zzfpf.zzf(this.zzf, this.zzb.size() - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfpd(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfpf.zze(this.zzf);
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        zzfpf zzfpfVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i, i2);
        zzfpc zzfpcVar = this.zzc;
        if (zzfpcVar == null) {
            zzfpcVar = this;
        }
        return zzfpfVar.zzk(obj, subList, zzfpcVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfpd(this, i);
    }
}
