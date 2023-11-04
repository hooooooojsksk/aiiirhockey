package com.fyber.inneractive.sdk.network;

/* loaded from: classes.dex */
public class p0 extends Exception {
    public int a;

    public p0(int i, String str) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return String.valueOf(this.a);
    }
}
