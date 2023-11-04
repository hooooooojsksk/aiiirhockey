package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrb extends zzfse {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object zza = zzfrf.zza(zza(), key);
            if (zzfnp.zza(zza, entry.getValue())) {
                return zza != null || zza().containsKey(key);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return zza().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    abstract Map zza();

    @Override // com.google.android.gms.internal.ads.zzfse, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return zzfsf.zzd(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzfsf.zze(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfse, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzfpj.zza(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                double d = size;
                Double.isNaN(d);
                i = (int) Math.ceil(d / 0.75d);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return zza().keySet().retainAll(hashSet);
        }
    }
}
