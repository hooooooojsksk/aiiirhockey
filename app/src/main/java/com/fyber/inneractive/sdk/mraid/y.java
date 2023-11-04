package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes.dex */
public class y extends u {
    public final int a;
    public final int b;

    public y(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.u
    public String a() {
        return "screenSize: { width: " + this.a + ", height: " + this.b + " }";
    }
}
