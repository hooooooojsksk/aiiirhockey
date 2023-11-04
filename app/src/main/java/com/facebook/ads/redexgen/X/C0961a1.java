package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.a1 */
/* loaded from: assets/audience_network.dex */
public class C0961a1 implements InterfaceC01121l {
    public final /* synthetic */ F6 A00;

    public C0961a1(F6 f6) {
        this.A00 = f6;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01121l
    public final void ABz(AdError adError) {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACT(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01121l
    public final void AC0() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACQ(this.A00);
    }
}
