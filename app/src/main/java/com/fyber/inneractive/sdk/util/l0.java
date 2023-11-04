package com.fyber.inneractive.sdk.util;

/* loaded from: classes.dex */
public class l0 {
    public int a;
    public int b;

    public l0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a == l0Var.a && this.b == l0Var.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }
}
