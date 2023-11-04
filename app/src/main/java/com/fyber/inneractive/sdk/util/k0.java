package com.fyber.inneractive.sdk.util;

/* loaded from: classes.dex */
public class k0 {
    public float a;
    public float b;
    public boolean c = false;

    public k0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static k0 a() {
        return new k0(-1.0f, -1.0f);
    }

    public String toString() {
        return "PointLocation{x=" + this.a + ", y=" + this.b + '}';
    }
}
