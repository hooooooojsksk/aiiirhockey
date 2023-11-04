package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes.dex */
public final class m {
    public static final m d = new m(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public m(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(this.b);
    }
}
