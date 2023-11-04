package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9F */
/* loaded from: assets/audience_network.dex */
public final class C9F extends Exception {
    public final int A00;
    public final int A01;

    public C9F(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static C9F A00(IOException iOException) {
        return new C9F(0, null, iOException, -1);
    }

    public static C9F A01(Exception exc, int i) {
        return new C9F(1, null, exc, i);
    }

    public static C9F A02(RuntimeException runtimeException) {
        return new C9F(2, null, runtimeException, -1);
    }
}
