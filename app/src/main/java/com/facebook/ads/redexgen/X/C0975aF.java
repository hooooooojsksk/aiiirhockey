package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.aF */
/* loaded from: assets/audience_network.dex */
public class C0975aF implements InterfaceC02135l {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0970aA A01;
    public final /* synthetic */ C0970aA A02;
    public final /* synthetic */ C8B A03;

    public C0975aF(C0970aA c0970aA, int i, C8B c8b, C0970aA c0970aA2) {
        this.A01 = c0970aA;
        this.A00 = i;
        this.A03 = c8b;
        this.A02 = c0970aA2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAD() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAE() {
        InterfaceC00960v interfaceC00960v;
        interfaceC00960v = this.A01.A00;
        interfaceC00960v.ABP(this.A02, JA.A00(AdErrorType.NO_FILL));
    }
}
