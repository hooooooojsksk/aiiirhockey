package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class U2 implements InterfaceC0522Ir {
    public WeakReference<C0799Tp> A00;

    public U2(C0799Tp c0799Tp) {
        this.A00 = new WeakReference<>(c0799Tp);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Ir
    public final void ABx(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z, false);
        }
    }
}
