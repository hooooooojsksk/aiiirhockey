package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Gh */
/* loaded from: assets/audience_network.dex */
public class C0462Gh extends IOException {
    public final int A00;
    public final C0458Gb A01;

    public C0462Gh(IOException iOException, C0458Gb c0458Gb, int i) {
        super(iOException);
        this.A01 = c0458Gb;
        this.A00 = i;
    }

    public C0462Gh(String str, C0458Gb c0458Gb, int i) {
        super(str);
        this.A01 = c0458Gb;
        this.A00 = i;
    }

    public C0462Gh(String str, IOException iOException, C0458Gb c0458Gb, int i) {
        super(str, iOException);
        this.A01 = c0458Gb;
        this.A00 = i;
    }
}
