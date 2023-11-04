package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* loaded from: assets/audience_network.dex */
public class XE implements C7R {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ XD A01;

    public XE(XD xd, AdvertisingId advertisingId) {
        this.A01 = xd;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C7R
    public final boolean A8n() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C7R
    public final String getId() {
        return this.A00.getId();
    }
}
