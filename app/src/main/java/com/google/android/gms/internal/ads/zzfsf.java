package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfsf {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfnv zzfnvVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfsc) {
                zzfsc zzfscVar = (zzfsc) sortedSet;
                return new zzfsd((SortedSet) zzfscVar.zza, zzfny.zza(zzfscVar.zzb, zzfnvVar));
            }
            Objects.requireNonNull(sortedSet);
            Objects.requireNonNull(zzfnvVar);
            return new zzfsd(sortedSet, zzfnvVar);
        } else if (set instanceof zzfsc) {
            zzfsc zzfscVar2 = (zzfsc) set;
            return new zzfsc(zzfscVar2.zza, zzfny.zza(zzfscVar2.zzb, zzfnvVar));
        } else {
            Objects.requireNonNull(set);
            Objects.requireNonNull(zzfnvVar);
            return new zzfsc(set, zzfnvVar);
        }
    }

    public static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static boolean zzd(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfrp) {
            collection = ((zzfrp) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
