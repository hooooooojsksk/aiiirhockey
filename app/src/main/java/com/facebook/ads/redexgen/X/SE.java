package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class SE implements N9 {
    public final WeakReference<AbstractC02928x> A00;

    public SE(AbstractC02928x abstractC02928x) {
        this.A00 = new WeakReference<>(abstractC02928x);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ABA(boolean z) {
        AbstractC02928x cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A03();
        }
    }
}
