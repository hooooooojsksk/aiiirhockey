package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class g1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int h = 0;
    public final int a;
    public List<g1<K, V>.e> b;
    public Map<K, V> c;
    public boolean d;
    public volatile g1<K, V>.g e;
    public Map<K, V> f;
    public volatile g1<K, V>.c g;

    /* loaded from: classes.dex */
    public class a<FieldDescriptorType> extends g1<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g1
        public void d() {
            if (!this.d) {
                for (int i = 0; i < this.b.size(); i++) {
                    Map.Entry<FieldDescriptorType, Object> a = a(i);
                    if (((u.b) a.getKey()).b()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : b()) {
                    if (((u.b) entry.getKey()).b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.d();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Iterator<Map.Entry<K, V>> {
        public int a;
        public Iterator<Map.Entry<K, V>> b;

        public b() {
            g1.this = r1;
            this.a = r1.b.size();
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.b == null) {
                this.b = g1.this.f.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.a;
            return (i > 0 && i <= g1.this.b.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (b().hasNext()) {
                return b().next();
            }
            List<g1<K, V>.e> list = g1.this.b;
            int i = this.a - 1;
            this.a = i;
            return list.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public class c extends g1<K, V>.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(r2, null);
            g1.this = r2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.g1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static final Iterator<Object> a = new a();
        public static final Iterable<Object> b = new b();

        /* loaded from: classes.dex */
        public class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes.dex */
        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.a;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<g1<K, V>.e> {
        public final K a;
        public V b;

        public e(K k, V v) {
            g1.this = r1;
            this.a = k;
            this.b = v;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.a.compareTo(((e) obj).a);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.a;
                Object key = entry.getKey();
                if (k == null) {
                    equals = key == null;
                } else {
                    equals = k.equals(key);
                }
                if (equals) {
                    V v = this.b;
                    Object value = entry.getValue();
                    if (v == null) {
                        equals2 = value == null;
                    } else {
                        equals2 = v.equals(value);
                    }
                    if (equals2) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.a;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            g1 g1Var = g1.this;
            int i = g1.h;
            g1Var.a();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public String toString() {
            return this.a + "=" + this.b;
        }
    }

    /* loaded from: classes.dex */
    public class f implements Iterator<Map.Entry<K, V>> {
        public int a = -1;
        public boolean b;
        public Iterator<Map.Entry<K, V>> c;

        public f() {
            g1.this = r1;
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.c == null) {
                this.c = g1.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a + 1 >= g1.this.b.size()) {
                return !g1.this.c.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            if (i < g1.this.b.size()) {
                return g1.this.b.get(this.a);
            }
            return b().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.b) {
                this.b = false;
                g1 g1Var = g1.this;
                int i = g1.h;
                g1Var.a();
                if (this.a < g1.this.b.size()) {
                    g1 g1Var2 = g1.this;
                    int i2 = this.a;
                    this.a = i2 - 1;
                    g1Var2.c(i2);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
            g1.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            g1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = g1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                g1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g1.this.size();
        }

        public /* synthetic */ g(g1 g1Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ g1(int i, a aVar) {
        this(i);
    }

    public static <FieldDescriptorType extends u.b<FieldDescriptorType>> g1<FieldDescriptorType, Object> b(int i) {
        return new a(i);
    }

    public final V c(int i) {
        a();
        V v = this.b.remove(i).b;
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = c().entrySet().iterator();
            List<g1<K, V>.e> list = this.b;
            Map.Entry<K, V> next = it.next();
            list.add(new e(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        a();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((g1<K, V>) comparable) >= 0 || this.c.containsKey(comparable);
    }

    public void d() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.d) {
            return;
        }
        if (this.c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.c);
        }
        this.c = unmodifiableMap;
        if (this.f.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f);
        }
        this.f = unmodifiableMap2;
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new g();
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return super.equals(obj);
        }
        g1 g1Var = (g1) obj;
        int size = size();
        if (size != g1Var.size()) {
            return false;
        }
        int size2 = this.b.size();
        if (size2 != g1Var.b.size()) {
            return entrySet().equals(g1Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!a(i).equals(g1Var.a(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.c.equals(g1Var.c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((g1<K, V>) comparable);
        if (a2 >= 0) {
            return this.b.get(a2).b;
        }
        return this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int a2 = a((g1<K, V>) comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b.size() + this.c.size();
    }

    public g1(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public Map.Entry<K, V> a(int i) {
        return this.b.get(i);
    }

    public Iterable<Map.Entry<K, V>> b() {
        if (this.c.isEmpty()) {
            return (Iterable<Map.Entry<K, V>>) d.b;
        }
        return this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public V put(K k, V v) {
        a();
        int a2 = a((g1<K, V>) k);
        if (a2 >= 0) {
            g1<K, V>.e eVar = this.b.get(a2);
            g1.this.a();
            V v2 = eVar.b;
            eVar.b = v;
            return v2;
        }
        a();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(a2 + 1);
        if (i >= this.a) {
            return c().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            g1<K, V>.e remove = this.b.remove(i2 - 1);
            c().put(remove.a, remove.b);
        }
        this.b.add(i, new e(k, v));
        return null;
    }

    public final SortedMap<K, V> c() {
        a();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public final int a(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.b.get(size).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.b.get(i2).a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final void a() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }
}
