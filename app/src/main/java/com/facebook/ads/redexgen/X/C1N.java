package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.1N */
/* loaded from: assets/audience_network.dex */
public final class C1N implements Serializable {
    public static final long serialVersionUID = -2102939945352398575L;
    public long A00;
    public final List<String> A01;

    public C1N(List<String> screenshots, long j) {
        this.A01 = screenshots;
        this.A00 = j;
    }

    public final long A00() {
        return this.A00;
    }

    public final List<String> A01() {
        return Collections.unmodifiableList(this.A01);
    }
}
