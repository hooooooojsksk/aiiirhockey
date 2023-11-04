package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ya */
/* loaded from: assets/audience_network.dex */
public class C0911Ya implements InterfaceC02004y {
    public final /* synthetic */ E9 A00;

    public C0911Ya(E9 e9) {
        this.A00 = e9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02004y
    public final void ADd(AbstractC01934r abstractC01934r, C4U c4u, C4U c4u2) {
        this.A00.A1o(abstractC01934r, c4u, c4u2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02004y
    public final void ADf(AbstractC01934r abstractC01934r, @NonNull C4U c4u, @Nullable C4U c4u2) {
        this.A00.A0r.A0c(abstractC01934r);
        this.A00.A1p(abstractC01934r, c4u, c4u2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02004y
    public final void ADh(AbstractC01934r abstractC01934r, @NonNull C4U c4u, @NonNull C4U c4u2) {
        abstractC01934r.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC01934r, abstractC01934r, c4u, c4u2)) {
                this.A00.A1N();
            }
        } else if (!this.A00.A05.A0G(abstractC01934r, c4u, c4u2)) {
        } else {
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02004y
    public final void AFi(AbstractC01934r abstractC01934r) {
        this.A00.A06.A1D(abstractC01934r.A0H, this.A00.A0r);
    }
}
