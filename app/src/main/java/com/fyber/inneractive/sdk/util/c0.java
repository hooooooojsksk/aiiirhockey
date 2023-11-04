package com.fyber.inneractive.sdk.util;

/* loaded from: classes.dex */
public class c0 {
    public transient a[] a;
    public transient int b;
    public int c;

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public Object b;
        public a c;

        public a(int i, int i2, Object obj, a aVar) {
            this.a = i;
            this.b = obj;
            this.c = aVar;
        }
    }

    public c0() {
        this(20, 0.75f);
    }

    public c0(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        } else if (f > 0.0f) {
            i = i == 0 ? 1 : i;
            this.a = new a[i];
            this.c = (int) (i * f);
        } else {
            throw new IllegalArgumentException("Illegal Load: " + f);
        }
    }
}
