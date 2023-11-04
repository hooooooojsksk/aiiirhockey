package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Rn */
/* loaded from: assets/audience_network.dex */
public class C0746Rn extends K1 {
    public final /* synthetic */ AnonymousClass87 A00;

    public C0746Rn(AnonymousClass87 anonymousClass87) {
        this.A00 = anonymousClass87;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        AbstractC0638Ni abstractC0638Ni;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0638Ni abstractC0638Ni2;
        abstractC0638Ni = this.A00.A00;
        if (abstractC0638Ni != null) {
            abstractC0638Ni2 = this.A00.A00;
            abstractC0638Ni2.A0a();
        }
        AbstractC0586Li abstractC0586Li = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0586Li.setToolbarActionMode(closeButtonStyle);
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
