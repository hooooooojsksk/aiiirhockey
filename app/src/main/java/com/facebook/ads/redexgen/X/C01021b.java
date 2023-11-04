package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1b */
/* loaded from: assets/audience_network.dex */
public final class C01021b implements Serializable {
    public static final long serialVersionUID = 42;
    @Nullable
    public final String A00;
    @Nullable
    public final String A01;
    public final String A02;
    public final String A03;

    public C01021b(C01011a c01011a) {
        String str;
        String str2;
        String str3;
        String str4;
        str = c01011a.A02;
        this.A02 = str;
        str2 = c01011a.A03;
        this.A03 = str2;
        str3 = c01011a.A01;
        this.A01 = str3;
        str4 = c01011a.A00;
        this.A00 = str4;
    }

    @Nullable
    public final String A00() {
        return this.A00;
    }

    @Nullable
    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }
}
