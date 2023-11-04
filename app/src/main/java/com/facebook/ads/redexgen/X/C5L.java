package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5L */
/* loaded from: assets/audience_network.dex */
public final class C5L implements BidderTokenProviderApi {
    public final C6D A00 = new C6D();

    public final C6D A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C5M.A07(context));
    }
}
