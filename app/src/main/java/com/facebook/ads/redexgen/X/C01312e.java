package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.2e */
/* loaded from: assets/audience_network.dex */
public final class C01312e<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC01362j A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    public C01312e(AbstractC01362j abstractC01362j, int i) {
        this.A04 = abstractC01362j;
        this.A03 = i;
        this.A01 = abstractC01362j.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t = (T) this.A04.A07(this.A00, this.A03);
            this.A00++;
            this.A02 = true;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2e != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A00--;
            this.A01--;
            this.A02 = false;
            this.A04.A0E(this.A00);
            return;
        }
        throw new IllegalStateException();
    }
}
