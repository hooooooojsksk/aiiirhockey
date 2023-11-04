package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2j */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01362j<K, V> {
    public static String[] A03 = {"cnftN0nKJ399Diaxmn3tb8gwwrPO2aP4", "GD6Q0W3wC2KuP8ibvS2RtWU8XnqZN0Aj", "FY51T4e3CIDMofRfjaJn97HmoXO", "oFsWTCKeXQMPzJkbzzVFh0WI6lr", "sX7ClejzrEImqIfblQB7OY3eSnYyqYGK", "70PxY4sPYcKp4dj9du2NwnU3Lx25y2ig", "AJxY89BB1aRneGLKwVE9Pufkgncldx4M", "HDwbCIFP6XJ1qJgKvPjZQVX8jvQoDt8b"};
    public C01322f A00;
    public C01332g A01;
    public C01352i A02;

    public abstract int A04();

    public abstract int A05(Object obj);

    public abstract int A06(Object obj);

    public abstract Object A07(int i, int i2);

    public abstract V A08(int i, V v);

    public abstract Map<K, V> A0A();

    public abstract void A0D();

    public abstract void A0E(int i);

    public abstract void A0F(K k, V v);

    public static <K, V> boolean A00(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean A01(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <K, V> boolean A02(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <T> boolean A03(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set<T> set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2j != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.ads.redexgen.X.2i] */
    public final Collection<V> A09() {
        if (this.A02 == null) {
            this.A02 = new Collection<V>() { // from class: com.facebook.ads.redexgen.X.2i
                public static String[] A01 = {"WaXEENy4Qqf0iZa9rE7K5Tc", "CdcJslr1GuWzD3hgs8KQ2mZhu", "VqX8APEjT5Wjv2WgYqLWWETF9QEoqL89", "1lDdPMX0zjCtSNVsVcyG9UOAfTksMFfY", "Q30AX00aPMLh2Hp2SxjAPSj4hvT3yuLk", "DGZ9hWDjpXQG3w", "JKstht1TU3rAhNk0s2YNIFhF9tCkCvUD", "xnB3F8eRzgUElZJXVWbAPi1tu19rGp71"};

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    int A04 = AbstractC01362j.this.A04();
                    boolean z = false;
                    int i = 0;
                    while (i < A04) {
                        if (collection.contains(AbstractC01362j.this.A07(i, 1))) {
                            AbstractC01362j.this.A0E(i);
                            i--;
                            A04--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    int A04 = AbstractC01362j.this.A04();
                    boolean z = false;
                    int i = 0;
                    while (i < A04) {
                        if (!collection.contains(AbstractC01362j.this.A07(i, 1))) {
                            AbstractC01362j.this.A0E(i);
                            i--;
                            A04--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean add(V object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean addAll(Collection<? extends V> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final void clear() {
                    AbstractC01362j.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC01362j.this.A06(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC01362j.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new C01312e(AbstractC01362j.this, 1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    int A06 = AbstractC01362j.this.A06(obj);
                    if (A06 >= 0) {
                        AbstractC01362j.this.A0E(A06);
                        return true;
                    } else if (A01[6].charAt(4) != 'M') {
                        String[] strArr = A01;
                        strArr[1] = "JaPNh4sPI8rJ5EjhCFrDgKQsA";
                        strArr[5] = "wvLzjGRSTCxgOw";
                        return false;
                    } else {
                        throw new RuntimeException();
                    }
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final int size() {
                    return AbstractC01362j.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final Object[] toArray() {
                    return AbstractC01362j.this.A0G(1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2i != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    return (T[]) AbstractC01362j.this.A0H(array, 1);
                }
            };
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2j != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.ads.redexgen.X.2f] */
    public final Set<Map.Entry<K, V>> A0B() {
        if (this.A00 == null) {
            this.A00 = new Set<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2f
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                    int A04 = AbstractC01362j.this.A04();
                    for (Map.Entry<K, V> entry : collection) {
                        AbstractC01362j.this.A0F(entry.getKey(), entry.getValue());
                    }
                    return A04 != AbstractC01362j.this.A04();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                /* renamed from: A00 */
                public final boolean add(Map.Entry<K, V> object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC01362j.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        int index = AbstractC01362j.this.A05(entry.getKey());
                        if (index < 0) {
                            return false;
                        }
                        Object foundVal = AbstractC01362j.this.A07(index, 1);
                        return C01292c.A04(foundVal, entry.getValue());
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC01362j.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i = 0;
                    for (int A04 = AbstractC01362j.this.A04() - 1; A04 >= 0; A04--) {
                        int i2 = 0;
                        Object A07 = AbstractC01362j.this.A07(A04, 0);
                        Object A072 = AbstractC01362j.this.A07(A04, 1);
                        int result = A07 == null ? 0 : A07.hashCode();
                        if (A072 != null) {
                            i2 = A072.hashCode();
                        }
                        i += i2 ^ result;
                    }
                    return i;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC01362j.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return new C01342h(AbstractC01362j.this);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC01362j.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        C01322f c01322f = this.A00;
        if (A03[1].charAt(12) != 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "9ju5liavVqCXLI9PRLJCuH215nhDnaAN";
        strArr[6] = "X1eenRL1zYDBvWo2ZsNSENOyPnB3gIiL";
        return c01322f;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2j != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.ads.redexgen.X.2g] */
    public final Set<K> A0C() {
        if (this.A01 == null) {
            this.A01 = new Set<K>() { // from class: com.facebook.ads.redexgen.X.2g
                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean add(K object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends K> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC01362j.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC01362j.this.A05(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    return AbstractC01362j.A00(AbstractC01362j.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC01362j.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i = 0;
                    int result = AbstractC01362j.this.A04();
                    for (int i2 = result - 1; i2 >= 0; i2--) {
                        int i3 = 0;
                        Object A07 = AbstractC01362j.this.A07(i2, 0);
                        if (A07 != null) {
                            i3 = A07.hashCode();
                        }
                        i += i3;
                    }
                    return i;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC01362j.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<K> iterator() {
                    return new C01312e(AbstractC01362j.this, 0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    int A05 = AbstractC01362j.this.A05(obj);
                    if (A05 >= 0) {
                        AbstractC01362j.this.A0E(A05);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    return AbstractC01362j.A01(AbstractC01362j.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    return AbstractC01362j.A02(AbstractC01362j.this.A0A(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC01362j.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    return AbstractC01362j.this.A0G(0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    return (T[]) AbstractC01362j.this.A0H(array, 0);
                }
            };
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2j != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Object[] A0G(int i) {
        int A04 = A04();
        Object[] objArr = new Object[A04];
        for (int i2 = 0; i2 < A04; i2++) {
            objArr[i2] = A07(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2j != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] A0H(T[] array, int i) {
        int A04 = A04();
        int N = array.length;
        if (N < A04) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), A04));
        }
        for (int i2 = 0; i2 < A04; i2++) {
            array[i2] = A07(i2, i);
        }
        int N2 = array.length;
        if (N2 > A04) {
            array[A04] = null;
        }
        return array;
    }
}
