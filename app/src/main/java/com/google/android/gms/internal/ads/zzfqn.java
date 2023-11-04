package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzfqn implements Map, Serializable {
    @CheckForNull
    private transient zzfqp zza;
    @CheckForNull
    private transient zzfqp zzb;
    @CheckForNull
    private transient zzfqf zzc;

    public static zzfqn zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfqm zzfqmVar = new zzfqm(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfqmVar.zzb(entrySet);
        return zzfqmVar.zzc();
    }

    public static zzfqn zzd() {
        return zzfry.zza;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfrf.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfsf.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfpj.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzfqf zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfqf values() {
        zzfqf zzfqfVar = this.zzc;
        if (zzfqfVar == null) {
            zzfqf zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfqfVar;
    }

    abstract zzfqp zze();

    abstract zzfqp zzf();

    @Override // java.util.Map
    /* renamed from: zzg */
    public final zzfqp entrySet() {
        zzfqp zzfqpVar = this.zza;
        if (zzfqpVar == null) {
            zzfqp zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzfqpVar;
    }

    @Override // java.util.Map
    /* renamed from: zzh */
    public final zzfqp keySet() {
        zzfqp zzfqpVar = this.zzb;
        if (zzfqpVar == null) {
            zzfqp zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzfqpVar;
    }
}
