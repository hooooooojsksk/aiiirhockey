package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class F7 extends AbstractC0938Ze {
    public final /* synthetic */ int A00;
    public final /* synthetic */ F6 A01;
    public final /* synthetic */ C0950Zq A02;
    public final /* synthetic */ C0427Eu A03;
    public final /* synthetic */ C0887Xc A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F7(F6 f6, boolean z, C0887Xc c0887Xc, C0427Eu c0427Eu, C0950Zq c0950Zq, int i) {
        super(z);
        this.A01 = f6;
        this.A04 = c0887Xc;
        this.A03 = c0427Eu;
        this.A02 = c0950Zq;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0938Ze
    public final void A00() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A01.A01;
        anonymousClass14.ACT(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0938Ze
    public final void A01(boolean z) {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        F6.A0D = null;
        if (z) {
            this.A04.A00().AEm(this.A03.A0m(), this.A02.A0f());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A01.A01;
            anonymousClass14.ACQ(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
