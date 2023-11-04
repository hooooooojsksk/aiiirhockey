package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class XG implements C7Q {
    public final C7N A00;

    public XG(C7N c7n) {
        this.A00 = c7n;
    }

    @Override // com.facebook.ads.redexgen.X.C7Q
    public final Map<String, String> A4W() {
        return C8J.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7Q
    public final Map<String, String> A5k() {
        return AnonymousClass81.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C7Q
    @Nullable
    public final String A6x() {
        return AnonymousClass81.A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7Q
    public final String A6z() {
        return C02265y.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C7Q
    public final boolean A8k() {
        return KM.A00().A03();
    }
}
