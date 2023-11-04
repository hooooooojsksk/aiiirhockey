package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzfqk extends zzfqf implements List, RandomAccess {
    private static final zzfsk zza = new zzfqi(zzfrt.zza, 0);

    public static zzfqh zzi() {
        return new zzfqh(4);
    }

    public static zzfqk zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    public static zzfqk zzk(Object[] objArr, int i) {
        if (i == 0) {
            return zzfrt.zza;
        }
        return new zzfrt(objArr, i);
    }

    public static zzfqk zzm(Collection collection) {
        if (collection instanceof zzfqf) {
            zzfqk zzd = ((zzfqf) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzk(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfrr.zzb(array2, length);
        return zzk(array2, length);
    }

    public static zzfqk zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfrt.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfrr.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfqk zzo() {
        return zzfrt.zza;
    }

    public static zzfqk zzp(Object obj) {
        Object[] objArr = {obj};
        zzfrr.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfqk zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfrr.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfqk zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfrr.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfqk zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfrr.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfqk zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfrr.zzb(objArr, 6);
        return zzk(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfnp.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfnp.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfqf
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    @Deprecated
    public final zzfqk zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final zzfsj zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfqk subList(int i, int i2) {
        zzfnu.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new zzfqj(this, i, i3);
        }
        return zzfrt.zza;
    }

    @Override // java.util.List
    /* renamed from: zzu */
    public final zzfsk listIterator(int i) {
        zzfnu.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzfqi(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfqk zzl(Iterable iterable) {
        Objects.requireNonNull(iterable);
        return zzm(iterable);
    }
}
