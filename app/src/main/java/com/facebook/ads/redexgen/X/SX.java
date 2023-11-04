package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class SX implements N9 {
    public final WeakReference<C9D> A00;

    public SX(C9D c9d) {
        this.A00 = new WeakReference<>(c9d);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ABA(boolean z) {
        C9D cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}
