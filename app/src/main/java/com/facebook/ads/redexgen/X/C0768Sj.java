package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sj */
/* loaded from: assets/audience_network.dex */
public class C0768Sj extends K1 {
    public final WeakReference<QA> A00;

    public C0768Sj(QA qa) {
        this.A00 = new WeakReference<>(qa);
    }

    public C0768Sj(WeakReference<QA> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        QA viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
