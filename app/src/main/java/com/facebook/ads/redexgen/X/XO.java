package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: assets/audience_network.dex */
public class XO extends K1 {
    public final /* synthetic */ C0886Xb A00;

    public XO(C0886Xb c0886Xb) {
        this.A00 = c0886Xb;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
