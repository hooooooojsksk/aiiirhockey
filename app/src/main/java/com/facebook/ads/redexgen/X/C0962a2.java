package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.a2 */
/* loaded from: assets/audience_network.dex */
public class C0962a2 implements InterfaceC02135l {
    public final /* synthetic */ F6 A00;

    public C0962a2(F6 f6) {
        this.A00 = f6;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAD() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACQ(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAE() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACT(this.A00, AdError.CACHE_ERROR);
    }
}
