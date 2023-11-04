package com.google.android.gms.internal.drive;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzmp<K, V> implements Comparable<zzmp>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzmi zzvk;
    private final Comparable zzvn;

    public zzmp(zzmi zzmiVar, Map.Entry<K, V> entry) {
        this(zzmiVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzmp(zzmi zzmiVar, K k, V v) {
        this.zzvk = zzmiVar;
        this.zzvn = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzvk.zzeu();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.zzvn, entry.getKey()) && equals(this.value, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzvn;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.value;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzvn);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzvn;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzmp zzmpVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzmpVar.getKey());
    }
}
