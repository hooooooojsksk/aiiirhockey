package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Rp */
/* loaded from: assets/audience_network.dex */
public class C0748Rp implements C5D {
    public final /* synthetic */ AnonymousClass87 A00;

    public C0748Rp(AnonymousClass87 anonymousClass87) {
        this.A00 = anonymousClass87;
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final boolean A8b() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
