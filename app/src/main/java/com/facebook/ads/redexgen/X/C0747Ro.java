package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ro */
/* loaded from: assets/audience_network.dex */
public class C0747Ro implements N9 {
    public final /* synthetic */ AnonymousClass87 A00;

    public C0747Ro(AnonymousClass87 anonymousClass87) {
        this.A00 = anonymousClass87;
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ABA(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z);
        this.A00.A05();
    }
}
