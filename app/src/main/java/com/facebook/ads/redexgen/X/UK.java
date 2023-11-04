package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class UK implements InterfaceC1024bC<IQ, IV> {
    public UH A00;

    public UK(UH uh) {
        this.A00 = uh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1024bC
    public final void A5L(C1021b9<IQ, IV> c1021b9, InterfaceC1010ay interfaceC1010ay) {
        int i = IO.A00[interfaceC1010ay.A81(c1021b9).ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.A00.A02(c1021b9, interfaceC1010ay);
    }
}
