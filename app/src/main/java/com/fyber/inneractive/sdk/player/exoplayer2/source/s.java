package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {
    public static final s d = new s(new r[0]);
    public final int a;
    public final r[] b;
    public int c;

    public s(r... rVarArr) {
        this.b = rVarArr;
        this.a = rVarArr.length;
    }

    public int a(r rVar) {
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] == rVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && Arrays.equals(this.b, sVar.b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
