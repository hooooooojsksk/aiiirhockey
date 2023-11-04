package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes.dex */
public final class o {
    public static final o b = new o(0);
    public final int a;

    public o(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o.class == obj.getClass() && this.a == ((o) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
