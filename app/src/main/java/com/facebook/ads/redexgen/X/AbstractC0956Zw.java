package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.Zw */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0956Zw implements InterfaceC00880n {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0G();

    public abstract C1B A0H();

    public abstract boolean A0I();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final AdPlacementType A7L() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
