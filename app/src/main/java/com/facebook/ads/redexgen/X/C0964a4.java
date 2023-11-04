package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.a4 */
/* loaded from: assets/audience_network.dex */
public class C0964a4 implements InterfaceC02135l {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ boolean A01;

    public C0964a4(F6 f6, boolean z) {
        this.A00 = f6;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAD() {
        C0887Xc c0887Xc;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C0887Xc c0887Xc2;
        C1B c1b;
        c0887Xc = this.A00.A04;
        if (!IK.A1L(c0887Xc) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.ACQ(this.A00);
            return;
        }
        F6 f6 = this.A00;
        c0887Xc2 = f6.A04;
        c1b = this.A00.A03;
        f6.A06 = ON.A01(c0887Xc2, (C0427Eu) c1b, 0, new C0965a5(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02135l
    public final void AAE() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACT(this.A00, AdError.CACHE_ERROR);
    }
}
