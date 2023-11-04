package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Et */
/* loaded from: assets/audience_network.dex */
public final class C0426Et extends AbstractC0934Za {
    @Nullable
    public View A00;
    public C0402Dv A01;

    public C0426Et(C0402Dv c0402Dv, C01161p c01161p) {
        super(c0402Dv, c01161p);
        this.A01 = c0402Dv;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0L() {
        if (this.A00 != null) {
            this.A01.A0E().A3o();
            this.A06.A0E(this.A00);
            return;
        }
        this.A01.A0E().A3p();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0N(InterfaceC00880n interfaceC00880n, C8A c8a, AnonymousClass88 anonymousClass88, C01171q c01171q) {
        this.A01.A0E().A3i();
        C0970aA c0970aA = (C0970aA) interfaceC00880n;
        C0937Zd c0937Zd = new C0937Zd(this, c01171q, c0970aA);
        A0E().postDelayed(c0937Zd, c8a.A05().A05());
        c0970aA.A0I(this.A01, this.A08, this.A07.A07, new C0936Zc(this, c0937Zd), c01171q);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0Q(String str) {
        this.A01.A0E().A3n(str != null);
        super.A0Q(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0T(boolean z) {
        super.A0T(z);
        this.A00 = null;
    }
}
